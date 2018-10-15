package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.web.bind.annotation.*;

import answers.Question1;
import components.Answer;
import components.Test;
import components.Tests;
import components.TimedAnswer;

@RestController
public class Question1Controller {
	
	ExecutorService executorService = Executors.newFixedThreadPool(1);


	@RequestMapping(path="/runq1", method=RequestMethod.POST)
	public Answer[] question1(@RequestBody Tests<int[]> tests) {
		
		List<Answer> answers = new ArrayList<Answer>();
		
		for (Test<int[]> test : tests.getTests()) {
			
			final Test<int[]> currentTest = test;
			
			try {
		
				Future<TimedAnswer> future = executorService.submit(() -> {
						long startTime = System.nanoTime();
						Integer answer = Question1.bestMergedPortfolio(currentTest.getInput());
						long endTime = System.nanoTime();
						return new TimedAnswer(answer, endTime-startTime);
					});
				
				TimedAnswer answer = future.get(3, TimeUnit.SECONDS);
				boolean correct = answer.getReturnValue() == test.getOutput();
				if (answers.stream().noneMatch(ans -> ans.getTestNumber() == test.getTestNumber())) {
					answers.add(
							new Answer("Java", tests.getQuestionNumber(), test.getTestNumber(), correct, answer.getDuration())
					);
				}
			
			} catch (TimeoutException e) {
				System.out.println("A Question 1 test timed out. Tests must complete within three seconds.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		Answer[] response = new Answer[answers.size()];
		return answers.toArray(response);
	}
	
}

package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import helpers.Allocations;
import org.springframework.web.bind.annotation.*;

import answers.Question5;
import components.Answer;
import components.Test;
import components.Tests;
import components.TimedAnswer;

@RestController
public class Question5Controller {
	
	ExecutorService executorService = Executors.newSingleThreadExecutor();

	@RequestMapping(path="/runq5", method=RequestMethod.POST)
	public Answer[] question5(@RequestBody Tests<Allocations> tests) {
		
		List<Answer> answers = new ArrayList<Answer>();
		
		for (Test<Allocations> test : tests.getTests()) {
			
			final Test<Allocations> currentTest = test;
			
			try {
		
				Future<TimedAnswer> future = executorService.submit(() -> {
						long startTime = System.nanoTime();
						Allocations input = currentTest.getInput();
						Integer answer = Question5.shareExchange(input.getAllowedAllocations(), input.getTotalValue());
						long endTime = System.nanoTime();
						return new TimedAnswer(answer, endTime-startTime);
					});
				
				TimedAnswer answer = future.get(3, TimeUnit.SECONDS);
				boolean correct = answer.getReturnValue() == test.getOutput();
				answers.add(
					new Answer("Java", tests.getQuestionNumber(), test.getTestNumber(), correct, answer.getDuration())
				);
			
			} catch (TimeoutException e) {
				System.out.println("A Question 5 test timed out. Tests must complete within three seconds.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		Answer[] response = new Answer[answers.size()];
		return answers.toArray(response);
	}
	
}

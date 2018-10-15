package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import helpers.Machines;
import org.springframework.web.bind.annotation.*;

import answers.Question4;
import components.Answer;
import components.Test;
import components.Tests;
import components.TimedAnswer;

@RestController
public class Question4Controller {
	
	ExecutorService executorService = Executors.newSingleThreadExecutor();

	@RequestMapping(path="/runq4", method=RequestMethod.POST)
	public Answer[] question4(@RequestBody Tests<Machines> tests) {
		
		List<Answer> answers = new ArrayList<Answer>();
		
		for (Test<Machines> test : tests.getTests()) {
			
			final Test<Machines> currentTest = test;
			
			try {
		
				Future<TimedAnswer> future = executorService.submit(() -> {
						long startTime = System.nanoTime();
						Integer answer = Question4.selectionFailedTradedesks(currentTest.getInput().getRows(), currentTest.getInput().getNumberMachines());
						long endTime = System.nanoTime();
						return new TimedAnswer(answer, endTime-startTime);
					});
				
				TimedAnswer answer = future.get(3, TimeUnit.SECONDS);
				boolean correct = answer.getReturnValue() == test.getOutput();
				answers.add(
					new Answer("Java", tests.getQuestionNumber(), test.getTestNumber(), correct, answer.getDuration())
				);
			
			} catch (TimeoutException e) {
				System.out.println("A Question 4 test timed out. Tests must complete within three seconds.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		Answer[] response = new Answer[answers.size()];
		return answers.toArray(response);
	}

}

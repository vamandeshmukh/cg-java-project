package com.cg.demo.concdemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Callable solves problem of Runnable using Future object 
// Callable -> 

//https://stackoverflow.com/questions/17262327/threadpoolexecutor-differences-between-submit-and-execute-methods

public class CallableDemo implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int total = 0;
		for (int i = 1; i < 10; i++) {
			total = total + i;
		}
		return total;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableDemo mt1 = new CallableDemo();

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<Integer> future = executorService.submit(mt1);
		Integer total = future.get();

		System.out.println(total);
		executorService.shutdown();
	}
}

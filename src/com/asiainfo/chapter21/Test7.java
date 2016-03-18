package com.asiainfo.chapter21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 从任务中产生返回值
 * 
 * @author zhangzw8
 * @date 2016年3月18日 下午2:02:26
 */
public class Test7 implements Callable<String> {
	/*
	 * Callable和Runnable类似，它只有一个抽象方法call()，该方法具有返回值。通过ExecutorService调用submit()方法后，会自动调用Callable实现类的call()方法，submit()方法返回Future，通过Future的get()方法获取call()方法的返回值
	 * */
	private int id;

	public Test7() {
	}

	private Test7(int id) {
		super();
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		Thread.currentThread().sleep(2000);
		return "hello " + id;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<String> future = executorService.submit(new Test7(1));
		executorService.shutdown();
//		System.out.println(future.isDone());//调不调都行
//		String result = future.get(1000, TimeUnit.MILLISECONDS);//如果在指定时间内没有返回结果，那么会抛java.util.concurrent.TimeoutException
		String result = future.get();
		System.out.println(result);
	}

}

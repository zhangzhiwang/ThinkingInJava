package com.asiainfo.chapter11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * p237练习27
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月30日 上午9:06:10
 */
public class Exercise_27 {
	private Queue<Command> cq = new LinkedList<Command>();;

	public static void main(String[] args) {
		Exercise_27 e = new Exercise_27();
		for (int i = 1; i <= 3; i++) {
			e.add(new Command(String.valueOf(i)));
		}
		new Consumer().consume(e.cq);
	}

	public Command add(Command command) {
		cq.offer(command);
		return command;
	}
}

class Command {
	private String name;

	public Command(String name) {
		super();
		this.name = name;
	}

	public Command() {
		super();
	}

	public void operation() {
		System.out.println(name);
	}
}

class Consumer {
	public void consume(Queue<Command> queue) {
		System.out.println("start:queue.size = " + queue.size());
		for (int i = 0; i < queue.size();) {//i不用变化，因为queue.size递减
			queue.poll().operation();
		}
		System.out.println("final:queue.size = " + queue.size());
	}
}
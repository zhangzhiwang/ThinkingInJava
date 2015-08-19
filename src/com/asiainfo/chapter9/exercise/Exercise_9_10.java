package com.asiainfo.chapter9.exercise;

/**
 * p174练习9、10
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午4:52:31
 */
public class Exercise_9_10 {
	public void tune(Playable p) {
		p.play();
	}
	
	public static void main(String[] args) {
		Playable[] ins = {
				new Wind(),
				new Stringed()
		};
		
		for (Playable i : ins) {
			new Exercise_9_10().tune(i);
		}
	}
}

abstract class Instrument {
//	public abstract void play();

	public abstract void adjust();
}

interface Playable {
	void play();
}

class Wind extends Instrument implements Playable {
	@Override
	public void play() {
		System.out.println("Wind.play()");
	}
	
	@Override
	public void adjust() {
		System.out.println("Wind.adjust()");
	}
}

class Stringed extends Instrument implements Playable {
	@Override
	public void play() {
		System.out.println("Stringed.play()");
	}
	
	@Override
	public void adjust() {
		System.out.println("Stringed.adjust()");
	}
}
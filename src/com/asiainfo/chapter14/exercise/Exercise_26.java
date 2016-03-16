package com.asiainfo.chapter14.exercise;

/**
 * p351练习26
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月16日 下午8:30:05
 */
public class Exercise_26 {
	public static void main(String[] args) {
		Instrument i1 = new Wind();
		i1.prepareInstrument();
		
		Instrument i2 = new Stringed();
		i2.prepareInstrument();
	}
}

interface Instrument {
	void prepareInstrument();
}

class Wind implements Instrument {
	@Override
	public void prepareInstrument() {
		clearSplitValve();
	}

	public void clearSplitValve() {
		System.out.println("clearSplitValve");
	}
}

class Stringed implements Instrument {
	@Override
	public void prepareInstrument() {
		System.out.println("Stringed prepared");
	}
	
	public void met1() {
		System.out.println("met1");
	}
}
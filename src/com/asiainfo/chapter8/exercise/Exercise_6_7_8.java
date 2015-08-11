package com.asiainfo.chapter8.exercise;

/**
 * p155练习6
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月10日
 */
public class Exercise_6_7_8 {
	public static void main(String[] args) {
		Instrument[] instruments = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new C()};
//		new Exercise_6().printAll(instruments);
		
		// 针对练习8
		Instrument[] instruments2 = new Instrument[3];
		for (int i = 0; i < instruments2.length; i++) {
			instruments2[i] = func1();
			System.out.println(instruments2[i]);
		}
	}

	public void printAll(Instrument[] instruments) {
		for (Instrument i : instruments) {
			System.out.println(i);
		}
	}
	
	public static Instrument func1() {// 针对练习8
		switch ((int)(Math.random() * 3)) {
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
			default :
				return null;
		}
	}
}

class Instrument {
	public void play() {
		System.out.println("Instrument.play");
	}

	@Override
	public String toString() {
		return "Instrument";
	}

	public void adjust() {
		System.out.println("Instrument.adjust");
	}
}

class Wind extends Instrument {
	@Override
	public void play() {
		System.out.println("Wind.play");
	}

	@Override
	public String toString() {
		return "Wind";
	}
}

class Percussion extends Instrument {
	@Override
	public void play() {
		System.out.println("Percussion.play");
	}

	@Override
	public String toString() {
		return "Percussion";
	}
}

class Stringed extends Instrument {
	public void play() {
		System.out.println("Stringed.play");
	}

	@Override
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public void play() {
		System.out.println("Brass.play");
	}

	public void adjust() {
		System.out.println("Brass.adjust");
	}
}

class Woodwind extends Wind {
	public void play() {
		System.out.println("Woodwind.play");
	}

	@Override
	public String toString() {
		return "Woodwind";
	}
}

class C extends Instrument{
	@Override
	public String toString() {
		return "C";
	}
}
package com.asiainfo.chapter15.exercise;

import java.util.Iterator;

/**
 * p361练习8
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午7:51:59
 */
public class Exercise_8 {
	public static void main(String[] args) {
		for (StoryCharacters sc : new StoryGenerator()) {
			System.out.println(sc);
		}
	}
}

class StoryGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
	private StoryCharacters[] sc = new StoryCharacters[] { new JackyChen(), new JetLi(), new ZidanZhen(), new Bad1(), new Bad2(), new Bad3() };
	private int num = sc.length;

	@Override
	public StoryCharacters next() {
		return sc[(int) (Math.random() * 6)];
	}

	@Override
	public Iterator<StoryCharacters> iterator() {
		return new Iterator<StoryCharacters>() {
			@Override
			public boolean hasNext() {
				return num > 0;
			}

			@Override
			public StoryCharacters next() {
				num--;
				return StoryGenerator.this.next();
			}

			@Override
			public void remove() {
			}
		};
	}
}

class StoryCharacters {
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class GoodGuys extends StoryCharacters {
}

class BadGuys extends StoryCharacters {
}

class JackyChen extends GoodGuys {
}

class JetLi extends GoodGuys {
}

class ZidanZhen extends GoodGuys {
}

class Bad1 extends BadGuys {
}

class Bad2 extends BadGuys {
}

class Bad3 extends BadGuys {
}
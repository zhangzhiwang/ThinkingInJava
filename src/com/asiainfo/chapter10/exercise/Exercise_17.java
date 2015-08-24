package com.asiainfo.chapter10.exercise;

import sun.security.smartcardio.SunPCSC.Factory;

/**
 * p201练习17
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午3:42:37
 */
public class Exercise_17 {
	public static void func1(GameFactory factory) {
		Game game = factory.getGame();
		System.out.println(game.play());
	}
	
	public static void main(String[] args) {
		func1(Coin.factory);
		func1(Dice.factory);
	}
}

interface Game {
	int play();
}

class Coin implements Game {
	public static GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Coin();
		}
	};
	
	@Override
	public int play() {
		return (int) (Math.random() * 2);
	}
}

class Dice implements Game {
	public static GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Dice();
		}
	};
	
	@Override
	public int play() {
		return (int) ((Math.random() * 6) + 1);
	}
}

interface GameFactory {
	Game getGame();
}
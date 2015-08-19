package com.asiainfo.chapter9;

/**
 * p188练习19
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午4:30:48
 */
public class Exercise_19 {
	public static void func1(GameFactory factory) {
		Game game = factory.getGame();
		System.out.println(game.play());
	}

	public static void main(String[] args) {
		func1(new CoinFactory());
		func1(new DiceFactory());
	}
}

interface Game {
	int play();
}

class Coin implements Game {
	@Override
	public int play() {
		return (int) (Math.random() * 2);
	}
}

class Dice implements Game {
	@Override
	public int play() {
		return (int) ((Math.random() * 6) + 1);
	}
}

interface GameFactory {
	Game getGame();
}

class CoinFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new Coin();
	}
}

class DiceFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new Dice();
	}
}
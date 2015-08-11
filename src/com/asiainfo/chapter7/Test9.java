package com.asiainfo.chapter7;

/**
 * 结合使用组合和继承
 * 
 * @author zhangzhiwang 2015年8月8日
 */
public class Test9 {
	public static void main(String[] args) {
		PlaceSetting p = new PlaceSetting();
	}
}

class Tool {
	public Tool() {
		System.out.println("Tool");
	}
}

class Plate extends Tool {
	public Plate() {
		System.out.println("Plate");
	}
}

class Fork extends Tool {
	public Fork() {
		System.out.println("Fork");
	}
}

class Custom {
	public Custom() {
		System.out.println("Custom");
	}
}

class PlaceSetting extends Custom {
	private Plate p;
	private Fork f;

	public PlaceSetting() {
		p = new Plate();
		f = new Fork();
		System.out.println("PlaceSetting");
	}
}
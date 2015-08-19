package com.asiainfo.chapter9;

/**
 * 测试
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午3:16:57
 */
public class Test11 {
	public static void main(String[] args) {
		Human[] hs = {
//				new Human()// 接口不能实例化
				new American(),
				new Chinese(),
				new USABoy(),
				new USAGirl()
		};
		new Test11().func1(hs);
	}

	public void func1(Human[] hs) {
		for (Human h : hs) {
			doSth(h);
		}
	}

	public void doSth(Human h) {
		h.who();
	}
}

interface Human {
	void who();
}

class American implements Human {
	@Override
	public void who() {
		System.out.println(this);
	}

	public String toString() {
		return "American";
	}
}

class Chinese implements Human {
	@Override
	public void who() {
		System.out.println(this);
	}

	public String toString() {
		return "Chinese";
	}
}

class USABoy extends American {
	@Override
	public String toString() {
		return "USABoy";
	}
}

class USAGirl extends American {
	@Override
	public String toString() {
		return "USAGirl";
	}
}
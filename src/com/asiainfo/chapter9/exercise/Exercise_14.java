package com.asiainfo.chapter9.exercise;

/**
 * p181练习14
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午3:12:19
 */
public class Exercise_14 {
	public static void f1(M m) {}
	public static void f2(N m) {}
	public static void f3(O m) {}
	public static void f4(P m) {}
	public static void f5(R m) {}
	
	public static void main(String[] args) {
		S s = new S();
		f1(s);
		f2(s);
		f3(s);
		f4(s);
		f5(s);
	}
}

interface M {
	void func1();

	void func2();
}

interface N {
	void func3();

	void func4();
}

interface O {
	void func5();

	void func6();
}

interface P extends M, N, O {
	void func7();
}

class R {
	public void func8() {}
}

class S extends R implements P {

	@Override
	public void func1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func7() {
		// TODO Auto-generated method stub
		
	}
	
}
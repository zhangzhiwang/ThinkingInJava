package com.asiainfo.chapter10;

/**
 * 匿名内部类原理
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午11:24:12
 */
public class Test15 {

	public G getG() {
		return new G1();
	}

	public class G1 extends G {
		@Override
		public void func1() {
			System.out.println("G1.func1()");
		}
	}
	
	public static void main(String[] args) {
		Test15 t = new Test15();
		G g = t.getG();
		g.func1();
	}
}

class G {
	public void func1() {
		System.out.println("G.func1()");
	}
}
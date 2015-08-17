package com.asiainfo;

/**
 * 
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午4:50:49
 */
public class Exercise_8 {
	public static void main(String[] args) {
		FastFood f = new SandWich();
		f.rushOrder();
		f.gobble();
	}
}

interface FastFood {
	void rushOrder();

	void gobble();
}

class SandWich implements FastFood {
	@Override
	public void rushOrder() {
		System.out.println("SandWich.rushOrder()");
	}

	@Override
	public void gobble() {
		System.out.println("SandWich.gobble()");
	}
}
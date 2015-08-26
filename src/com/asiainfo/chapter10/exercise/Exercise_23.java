package com.asiainfo.chapter10.exercise;

/**
 * p205练习23
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 上午10:59:14
 */
public class Exercise_23 {
	public static void main(String[] args) {
		AA[] aas = new AA[3];
		for (int i = 0; i < aas.length ; i ++) {
			aas[i] = new AA();
		}
		
		BB bb = new BB();
		
		for (AA aa : aas) {
			bb.addU(aa.getU());
		}
		
		bb.run();
		bb.setNull(0);
	}
}

interface U {
	void func1();
	void func2();
	void func3();
}

class AA {
	public U getU() {
		return new U() {
			@Override
			public void func1() {
				System.out.println("AA.U.func1");
			}
			@Override
			public void func2() {
				System.out.println("AA.U.func2");
			}
			@Override
			public void func3() {
				System.out.println("AA.U.func3");
			}
			
		};
	}
}

class BB {
	static int num = 0;
	U[] us = new U[3];
	
	public void addU(U u) {
		us[num++] = u;// 本代码只作为练习代码而非实际项目代码，固此处不考虑数组越界等情况
	}
	
	public void setNull(int i) {
		us[i] = null; 
	}
	
	public void run() {
		for (U u : us) {
			u.func1();
			u.func2();
			u.func3();
		}
	}
}
package com.asiainfo.chapter14;

/**
 * 向下转型
 * 
 * @author zhangzw8
 * @date 2016年3月11日 上午9:03:22
 */
public class Test12 extends L {
	public static void main(String[] args) {
		L l = new L();
		Test12 t = (Test12) l;
		L1 l1 = (L1) l;
//		Test11 t11 = (L)l;//Type mismatch: cannot convert from L to Test11  编译期会检查向下转型是否合理
	}
}

class L1 extends L {}
package com.asiainfo.chapter3;

import static com.asiainfo.chapter3.Print.*;

/**
 * 一元加号可以提升小类型的操作数为int 
 * @author zhangzhiwang
 * 2015年7月8日
 */
public class Test6 {
	public static void main(String[] args) {
		byte b = 1;
//		byte a = +b;   //编译不通过，因为b已经提升为int类型
		int i = +b;
	}
}

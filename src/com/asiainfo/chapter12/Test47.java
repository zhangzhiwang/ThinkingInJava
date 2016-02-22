package com.asiainfo.chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 将受检异常转换成运行时异常
 * 
 * @author zhangzw8
 * @date 2016年2月18日 下午3:01:28
 */
public class Test47 {
	public static void main(String[] args) {
		// func1();
		try {
			func1();
		} catch (Exception e) {
			try {
				throw e.getCause();
			} catch (FileNotFoundException f) {
				System.out.println(e.getMessage());
			} catch (IOException i) {
				System.out.println(i.getMessage());
			} catch (Throwable t) {
				System.out.println("Throwable:" + t.getMessage());
			}
		}
	}

	public static void func1() {
		try {
			InputStream in = new FileInputStream(new File(""));
			in.close();
		} catch (FileNotFoundException e) {// 还没准备好处理FileNotFoundException，但是又不想抛出来（或者说放在异常声明里），可以把受检异常转换成运行时异常抛出来
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}

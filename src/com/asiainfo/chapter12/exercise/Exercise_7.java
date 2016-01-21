package com.asiainfo.chapter12.exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * p256练习7
 * 
 * @author zhangzw8
 * @date 2016年1月21日 上午9:30:50
 */
public class Exercise_7 {
	private static final Logger LOGGER = Logger.getLogger("Exercise_7");

	public static void main(String[] args) {
		try {
			int[] ins = new int[0];
			int i = ins[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			LOGGER.severe("日志记录：" + sw.toString());
		}
	}
}

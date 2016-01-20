package com.asiainfo.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * 异常日志记录
 * 
 * @author zhangzw8
 * @date 2016年1月20日 下午1:33:56
 */
public class Test16 {
	private static final Logger LOGGER = Logger.getLogger("Test16");

	public static void printE(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		LOGGER.severe(sw.toString());
	}

	public static void main(String[] args) {
		try {
			String str = null;
			str.length();
		} catch (Exception e) {
			printE(e);
		}
	}
}

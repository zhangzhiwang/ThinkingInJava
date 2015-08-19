package com.asiainfo.chapter9.exercise;

import com.asiainfo.chapter9.*;

/**
 * p178练习11
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午6:02:40
 */
public class Exercise_11 {
	public static void main(String[] args) {
		Apply.doSth(new StringUtil(), "1234");
	}
}

interface C {
	public String name();

	public Object process(Object o);
}

class StringUtil implements C {
	@Override
	public String name() {
		return "StringUtil";
	}

	@Override
	public String process(Object o) {
		StringBuilder s = new StringBuilder((String) o);
		for (int i = 0; i < s.length() - 1; i += 2) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i + 1);
			s.setCharAt(i, c2);
			s.setCharAt(i + 1, c1);
		}
		return s.toString();
	}
}

class Apply {
	public static void doSth(C c, Object o) {
		System.out.println(c.name());
		System.out.println(c.process(o));
	}
}
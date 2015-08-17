package com.asiainfo;

/**
 * p178练习11
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午6:02:40
 */
public class Exercise_11 {
	public static void main(String[] args) {
		Apply.process(new StringUtil(), "1234");
		Apply.process(new StringUtil(), "abcde");
	}
}

interface Processor {
	String name();

	Object process(Object input);
}

class StringUtil implements Processor {
	@Override
	public String name() {
		return getClass().getSimpleName();
	}

	public String process(Object str) {
		return exchange((String) str);
	}

	public static String exchange(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);

		for (int i = 0; i < stringBuilder.length() - 1; i += 2) {
			char c1 = stringBuilder.charAt(i);
			char c2 = stringBuilder.charAt(i + 1);
			stringBuilder.setCharAt(i, c2);
			stringBuilder.setCharAt(i + 1, c1);
		}
		return stringBuilder.toString();
	}
}

class Apply {
	public static void process(Processor p, Object o) {
		System.out.println("up : " + p.name());
		System.out.println(p.process(o));
	}
}
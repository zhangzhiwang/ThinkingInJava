package com.asiainfo.chapter13;

/**
 * String的拼接操作与StringBuilder的append()的效率比较——用javap -c查看
 * 
 * @author zhangzw8
 * @date 2016年2月2日 下午1:44:10
 */
public class Test4 {
	public String met1() {
		return "a" + "b" + "c" + "d" + "e";
	}

	public String met2() {
		StringBuilder sb = new StringBuilder();
		sb.append("a").append("b").append("c").append("d").append("e");
		return sb.toString();
	}
}

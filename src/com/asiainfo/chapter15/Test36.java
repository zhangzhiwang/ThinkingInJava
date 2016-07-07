package com.asiainfo.chapter15;

import java.util.EnumSet;

/**
 * EnumSet
 * 
 * @author zhangzw8
 * @date 2016年7月6日 上午9:42:28
 */
public class Test36 {
	public static void main(String[] args) {
		EnumSet<Color> es = EnumSet.range(Color.RED, Color.GREEN);// 创建一个最初包含由两个指定端点所定义范围内的所有元素的枚举 set。返回的 set 将包含端点本身，这两个端点可能相同，但顺序不能颠倒。
		System.out.println(es);
	}
}

enum Color {
	RED, BLUE, WHITE, GREEN, BLACK, PURPLE, PINK, YELLOW
}
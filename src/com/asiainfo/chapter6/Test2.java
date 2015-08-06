package com.asiainfo.chapter6;

import java.util.ArrayList;// import关键字倒包可以简化代码

//import java.util.*;// 导入java.util包下面的所有类
/**
 * import关键字
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月6日
 */
public class Test2 {
	public static void main(String[] args) {
		java.util.ArrayList list = new java.util.ArrayList();// 不倒包就要写出累的全名称，以免名称冲突
		ArrayList l = new ArrayList();
	}
}

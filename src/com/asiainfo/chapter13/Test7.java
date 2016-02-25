package com.asiainfo.chapter13;

/**
 * String的常用方法
 * 
 * @author zhangzw8
 * @date 2016年2月24日 下午12:13:38
 */
public class Test7 {
	public static void main(String[] args) {
		// 常用构造器
		String s1 = new String();
		String s2 = new String("hello");
		StringBuilder sb = new StringBuilder();
		sb.append(1);
		String s3 = new String(sb);
		System.out.println(s3);
		String s4 = new String(new StringBuffer().append(2));
		System.out.println(s4);
		char[] cs = new char[3];
		cs[0] = 'a';
		cs[1] = 'b';
		cs[2] = 'c';
		String s5 = new String(cs);
		System.out.println(s5);
		byte[] bs = new byte[3];
		bs[0] = 1;
		bs[1] = 2;
		bs[2] = 3;
		String s6 = new String(bs);
		System.out.println(s6);//打印结果为什么会是乱码？
		System.out.println("----------------");
		
		//常用方法
		String s7 = "abc";
		System.out.println(s7.length());//计算字符串字符个数，数组统计元素个数用的是其属性length
		String s8 = "中国";
		System.out.println(s8.length());
		int[] is = new int[3];
		System.out.println(is.length);
		
		System.out.println(s7.charAt(0));
		char[] cs1 = new char[5];
		cs1[0] = 'd';
		cs1[1] = 'e';
		cs1[2] = 'f';
		System.out.println(cs1);
		s7.getChars(1, 2, cs1, 1);//将字符从此字符串复制到目标字符数组（替换目标数组指定位置之后的元素，而不是原有位置上的元素往后移）
		System.out.println(cs1);
		
		char[] cs3 = s7.toCharArray();//将此字符串转换为一个新的字符数组，区分charAt(int index);
		System.out.println(cs3);
		
		System.out.println(s7.equals("ABC"));
		System.out.println(s7.equalsIgnoreCase("ABC"));
		
		//compareTo()方法的详细解释可参考jdk的api，也可以看一下该方法的源码
		String s9 = "ab";
		String s10 = "aaaa";
		System.out.println(s9.compareTo(s10));
		
		System.out.println(s9.contains(""));
		
		System.out.println(s9.contentEquals("ac"));//http://www.coderanch.com/t/602244/java/java/difference-equals-contentEquals-String-class
		StringBuilder sb1 = new StringBuilder("ab");
		System.out.println(s9.equals(sb1));// false，为什么看String的equals()方法源码，所以不能简单地理解String的equals()方法只比较内容，只有在被比较对象是String类型时才会去比较内容（一句话：String的equals()方法只能和另一个String比较内容，否则返回false），而contentEquals()方法可以与所有CharSequence的实现类比较内容，比较范围更广
		System.out.println(s9.contentEquals(sb1));
		System.out.println("------------------------");
		
		String s11 = "aBcdef";
		String s12 = "qDefef";
		System.out.println(s11.regionMatches(true, 3, s12, 1, 3));//可详见jdk api
	}
}

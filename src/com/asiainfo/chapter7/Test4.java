package com.asiainfo.chapter7;

/**
 * is-a/has-a
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class Test4 {
	public static void main(String[] args) {
		String s = "IS--A基于类继承或接口实现，IS-A是表达这句话的一种方式：“这个东西是那个东西的一种”。例如：野马是一种马。（是一个）HAS-A关系是基于用法（即引用）而不是继承。换句话说，如果类A中的代码具有对类B实例的引用，则“类A HAS-A类B”。例如：马有缰绳。（有一个）“is-a”代表的是类之间的继承关系，比如PC机是计算机，工作站也是计算机。PC机和工作站是两种不同类型的计算机，但都继承了计算机的共同特性。因此在用Java语言实现时，应该将PC机和工作站定义成两种类，均继承计算机类。“has -a”代表的是对象和它的成员的从属关系。同一种类的对象，通过它们的属性的不同值来区别。比如一台PC机的操作系统是Windows，另一台PC机的操作系统是Linux。操作系统是PC机的一个成员变量，根据这一成员变量的不同值，可以区分不同的PC机对象。";
		String from = "http://blog.sina.com.cn/s/blog_6f6a95180100nf55.html";
		System.out.println(s);
		System.out.println("from:" + from);
	}
}

package com.asiainfo.chapter14;

/**
 * instanceof
 * 
 * @author zhangzw8
 * @date 2016年3月11日 上午11:41:36
 */
public class Test14 {
	public static void main(String[] args) {
		Test14 t = new Test14();
//		System.out.println(t instanceof L);//编译报错，因为在编译期编译器明显知道对象t不属于L类型。在没有明显其他信息来得之t是哪种类型的时候，可以用instanceof来做判断以防止类型转换错误或其他类型错误的发生
		System.out.println(t instanceof Test14);
		
		L l = new L();
		System.out.println(l instanceof Test12);//编译期不知道对象l是否属于L的哪个子类，得在运行期来判断，而上面Test14和L没有任何继承关系，所以上面编译会报错
		
		met1(new Test12());
	}
	
	public static void met1(L l) {
		if (l instanceof L1) {
			System.out.println("L1");
		} else if (l instanceof Test12) {
			System.out.println("Test12");
		} else {
			System.out.println("hello");
		}
	}
}

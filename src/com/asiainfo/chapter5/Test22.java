package com.asiainfo.chapter5;

/**
 * ��main�������ݲ��������ڷ������õĵط���������
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��5��
 */
public class Test22 {
	public static void main(String[] args) {
		Other.main(new String[] { "hello", "world" });
	}
}

class Other {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
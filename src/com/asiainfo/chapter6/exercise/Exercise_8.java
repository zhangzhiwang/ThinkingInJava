//package com.asiainfo.chapter6.exercise;
//
///**
// * p123��ϰ8��������ĿҪ��Exercise_8Ӧ��Connection���ڲ�ͬ�İ���Ϊ�˷���������Դ�Ҫ��
// * 
// * @author zhangzw8@asiainfo.com\n 2015��8��7��
// */
//public class Exercise_8 {
//	public static void main(String[] args) {
//		Connection c = ConnManager.getConn();
//		while (c != null) {
//			System.out.println(c);
//			c = ConnManager.getConn();
//		}
//	}
//}
//
//class Connection {
//	private static int count = 0;
//	private int id = count++;
//
//	Connection() {
//	}
//
//	public String toString() {
//		return "Connection" + id;
//	}
//}
//
//class ConnManager {
//	private static Connection[] conn = new Connection[10];
//	private static int counter = 0;
//
//	static {
//		for (int i = 0; i < conn.length; i++) {
//			conn[i] = new Connection();
//		}
//	}
//
//	public static Connection getConn() {
//		if (counter < conn.length) {
//			return conn[counter++];
//		}
//		return null;
//	}
// }
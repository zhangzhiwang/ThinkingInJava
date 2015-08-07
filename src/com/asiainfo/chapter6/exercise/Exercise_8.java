//package com.asiainfo.chapter6.exercise;
//
///**
// * p123练习8（根据题目要求，Exercise_8应与Connection放在不同的包，为了方便这里忽略此要求）
// * 
// * @author zhangzw8@asiainfo.com\n 2015年8月7日
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
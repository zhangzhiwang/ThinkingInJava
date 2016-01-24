package com.asiainfo.chapter12;

/**
 * 遇上continue/break/return，finally照样执行
 * 
 * @author zhangzw8
 * @date 2016年1月24日 上午10:05:35
 */
public class Test31 {
	private static boolean flag = true;
	private static int count = 1;

	public static void main(String[] args) {
		// 1、continue
		while (flag) {
			try {
				System.out.println(count);
				if (count == 3) {
					continue;
				}
				System.out.println("hello" + count);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("finally" + count);
				count++;
				if (count == 5) {
					flag = false;
				}
			}
		}
		System.out.println("world");
		
		//2、break
//		while (flag) {
//			try {
//				System.out.println(count);
//				if (count == 3) {
//					break;
//				}
//				System.out.println("hello" + count);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				System.out.println("finally" + count);
//				count++;
//			}
//		}
//		System.out.println("world");
		
		//3、return
//		while (flag) {
//			try {
//				System.out.println(count);
//				if (count == 3) {
//					return;
//				}
//				System.out.println("hello" + count);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				System.out.println("finally" + count);
//				count++;
//			}
//		}
//		System.out.println("world");
	}
}

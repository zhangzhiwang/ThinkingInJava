package com.asiainfo.chapter12;

/**
 * 验证p265 12.8.1上面一句话
 * 
 * @author zhangzw8
 * @date 2016年1月23日 上午11:03:30
 */
public class Test27 {
	private static int count = 1;

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			try {
				System.out.println("第" + count + "次连接数据库（共三次）...");
				throw new RuntimeException("数据库连接失败！");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (count++ == 3) {
					flag = false;
					System.out.println("第三次数据库连接失败，请进行相关检查，程序退出！");
				} else {
					System.out.println("等待重连...");
				}
			}
		}
	}
}

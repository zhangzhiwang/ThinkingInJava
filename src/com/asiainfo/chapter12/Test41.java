package com.asiainfo.chapter12;

/**
 * 需要打开/关闭连接的情况下异常捕获方法
 * 
 * @author zhangzw8
 * @date 2016年1月31日 下午12:10:10
 */
public class Test41 {
	// 需明确一点：再连接打开之前抛异常，这个连接无需关闭；在打开连接之后无论是否抛异常此连接都需关闭
	public Test41() throws Exception {
		System.out.println("初始化Test41并打开一个数据库连接");
		throw new RuntimeException("Connection refused!数据库连接打开失败！");
	}

	public void dispose() {
		System.out.println("关闭数据库连接");
	}

	public static void main(String[] args) {
		try {
			Test41 t = new Test41();
			try {
				System.out.println("数据库打开成功，开始访问数据库");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				t.dispose();//只要连接一打开，无论后面逻辑是否执行顺利最终此连接必须被关闭
			}
		} catch (Exception e) {
			e.printStackTrace();// 如果连接打开失败了就说明还没有打开，所以不用关闭
		}

	}
}

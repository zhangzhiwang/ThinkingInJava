package com.asiainfo.chapter12;

/**
 * 对于打开和关闭连接的情况用不用嵌套try语句取决于打开连接的时候会不会出问题，而且关闭连接的时候要按照打开的逆向顺序去关闭
 * 
 * @author zhangzw8
 * @date 2016年1月31日 下午12:26:47
 */
public class Test43 {
	public static void main(String[] args) throws Exception {
		Connection1 c1 = new Connection1();// 再打开Connection1的时候不会抛出异常，所以在此行代码的外侧无需try
		try {
			System.out.println("一些逻辑代码");
			Connection2 c2 = new Connection2();
			try {// 注意：需要清理的对象创建完成之后一定要立即进入try/catch/finally块，否则c2会有得不到清理的风险
				Connection2 c22 = new Connection2();
				try {
					System.out.println("some codes...");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					c22.colseConnection2();
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			} finally {
				c2.colseConnection2();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			c1.closeConnection1();//可以看到，关闭的顺序和创建的顺序正好相反
		}
	}
}

class Connection1 {
	public Connection1() {
		System.out.println("打开Connection1");
	}

	public void closeConnection1() {
		System.out.println("关闭Connection1");
	}
}

class Connection2 {
	public Connection2() throws H {
		System.out.println("打开Connection2");
	}

	public void colseConnection2() {
		System.out.println("关闭Connection2");
	}
}
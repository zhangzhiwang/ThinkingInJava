package com.asiainfo.chapter6.exercise;

/**
 * 练习8的第二个版本，来自The_Thinking_in_Java_Annotated_Solution_Guide，测试时需注释掉Exercise_8代码（因为有类重名）
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class E08_ConnectionManager2 {
	public static void main(String args[]) {
		Connection[] ca = new Connection[10];
		// Use up all the connections
		for (int i = 0; i < 10; i++){
			ca[i] = ConnectionManager.getConnection();
			System.out.println("-" + ca[i]);
		}
		// Should produce "null" since there are no
		// more connections:
		System.out.println(ConnectionManager.getConnection());
		// Return connections, then get them out:
		for (int i = 0; i < 5; i++) {
			ca[i].checkIn();
			Connection c = ConnectionManager.getConnection();
			System.out.println(c);
			c.doSomething();
			c.checkIn();
		}
	}
}

class Connection {
	private static int counter = 0;
	private int id = counter++;

	Connection() {
	}

	public String toString() {
		return "Connection " + id;
	}

	public void doSomething() {
	}

	public void checkIn() {
		ConnectionManager.checkIn(this);
	}
}

class ConnectionManager {
	private static Connection[] pool = new Connection[10];
	static {
		for (int i = 0; i < pool.length; i++) {
			pool[i] = new Connection();
			System.out.println(pool[i]);
		}
	}

	// Produce the first available connection:
	public static Connection getConnection() {
		for (int i = 0; i < pool.length; i++) {
			if (pool[i] != null) {
				Connection c = pool[i];
				pool[i] = null; // Indicates "in use"
				return c;
			}
		}
		return null; // None left
	}

	public static void checkIn(Connection c) {
		for (int i = 0; i < pool.length; i++)
			if (pool[i] == null) {
				pool[i] = c; // Check it back in
				return;
			}
	}
}
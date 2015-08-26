package com.asiainfo.chapter10;

/**
 * 回调机制——If you call me, I will call back
 * <p>
 * 参考：http://blog.csdn.net/xiaanming/article/details/8703708/
 * </p>
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月25日 下午4:14:55
 */
public class Test42 {
	public static void main(String[] args) {
		AA aa = new AA(new BB());
		System.out.println("AA:" + aa.theAnswer);
		aa.ask();
		System.out.println("AA:Now I know the answer because BB told me that "
				+ aa.theAnswer);
		System.out.println("----------------------------");
		CC cc = new CC(new BB());
		System.out.println("CC:" + cc.theAnswer);
		cc.ask();
		System.out.println("CC:Now I know the answer because BB told me that "
				+ cc.theAnswer);
	}
}

interface Callback1 {
	void answer(String str);
}

class AA implements Callback1 {
	private BB bb;
	public String theAnswer = "I don't know the answer,I'd better ask someone.";

	public AA(BB bb) {
		this.bb = bb;
	}

	public void ask() {
		bb.askMe(this, "1 + 1 = ?");
	}

	@Override
	public void answer(String str) {
		theAnswer = str;
	}

	@Override
	public String toString() {
		return "AA";
	}
}

class CC implements Callback1 {
	private BB bb;
	public String theAnswer = "I don't know the answer.";

	public CC(BB bb) {
		this.bb = bb;
	}

	public void ask() {
		bb.askMe(this, "0 + 2 = ?");
	}

	@Override
	public void answer(String str) {
		theAnswer = str;
	}
	
	@Override
	public String toString() {
		return "CC";
	}
}

class BB {
	public void askMe(Callback1 c, String question) {
		System.out.println("\tBB:I receive the question:" + question);
		System.out.println("\tBB:Let me think...");
		System.out.println("\tBB:Oh,the answer is 2.");
		System.out.println("\tBB:I'll tell " + c.toString() + " the answer.");
		c.answer("the answer is 2");
	}
}
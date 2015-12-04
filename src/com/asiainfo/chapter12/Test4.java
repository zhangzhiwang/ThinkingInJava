package com.asiainfo.chapter12;

/**
 * Throwable的printStackTrace()方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月4日 下午1:44:17
 */
public class Test4 extends Exception {
	public static void main(String[] args) {
		try {
			throw new Test4();
		} catch (Test4 test4) {
			test4.printStackTrace();
		}
	}
}
/*
 * 以下内容摘自java api 1.6
 * 
 * printStackTrace
public void printStackTrace()将此 throwable 及其追踪输出至标准错误流。此方法将此 Throwable 对象的堆栈跟踪输出至错误输出流，作为字段 System.err 的值。输出的第一行包含此对象的 toString() 方法的结果。剩余行表示以前由方法 fillInStackTrace() 记录的数据。此信息的格式取决于实现，但以下示例是最常见的： 
 java.lang.NullPointerException
         at MyClass.mash(MyClass.java:9)
         at MyClass.crunch(MyClass.java:6)
         at MyClass.main(MyClass.java:3)
 本示例通过运行以下程序生成： 
 class MyClass {
     public static void main(String[] args) {
         crunch(null);
     }
     static void crunch(int[] a) {
         mash(a);
     }
     static void mash(int[] b) {
         System.out.println(b[0]);
     }
 }
 对于带初始化非空 cause 的 throwable 的追踪，通常应该包括 cause 的追踪。此信息的格式取决于实现，但以下示例是最常见的： 
 HighLevelException: MidLevelException: LowLevelException
         at Junk.a(Junk.java:13)
         at Junk.main(Junk.java:4)
 Caused by: MidLevelException: LowLevelException
         at Junk.c(Junk.java:23)
         at Junk.b(Junk.java:17)
         at Junk.a(Junk.java:11)
         ... 1 more
 Caused by: LowLevelException
         at Junk.e(Junk.java:30)
         at Junk.d(Junk.java:27)
         at Junk.c(Junk.java:21)
         ... 3 more
 注意，存在包含字符 "..." 的行。这些行指示此异常的椎栈跟踪的其余部分匹配来自异常（由 "enclosing" 异常引起）的堆栈跟踪底部的指定数量的帧。这种简便方法可以大大缩短通常情况下的输出长度，这里抛出了包装的异常，其方法与捕获“作为 cause 的异常”的方法相同。上述示例通过运行以下程序生成： 
 public class Junk {
     public static void main(String args[]) { 
         try {
             a();
         } catch(HighLevelException e) {
             e.printStackTrace();
         }
     }
     static void a() throws HighLevelException {
         try {
             b();
         } catch(MidLevelException e) {
             throw new HighLevelException(e);
         }
     }
     static void b() throws MidLevelException {
         c();
     }   
     static void c() throws MidLevelException {
         try {
             d();
         } catch(LowLevelException e) {
             throw new MidLevelException(e);
         }
     }
     static void d() throws LowLevelException { 
        e();
     }
     static void e() throws LowLevelException {
         throw new LowLevelException();
     }
 }

 class HighLevelException extends Exception {
     HighLevelException(Throwable cause) { super(cause); }
 }

 class MidLevelException extends Exception {
     MidLevelException(Throwable cause)  { super(cause); }
 }
 
 class LowLevelException extends Exception {
 }

 * 
 */
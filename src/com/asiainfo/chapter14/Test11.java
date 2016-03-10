package com.asiainfo.chapter14;

/**
 * cast()方法
 * 
 * @author zhangzw8
 * @date 2016年3月10日 下午2:02:35
 */
public class Test11 {
	public static void main(String[] args) {
		M m = new M1();
		Class<M1> c = M1.class;
		M1 m1 = c.cast(m);//将参数对象转换为该Class所表示类的对象，等同于下面的代码：
		M1 mm1 = (M1) m;
	}
}

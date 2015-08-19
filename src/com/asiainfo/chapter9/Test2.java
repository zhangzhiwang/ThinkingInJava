package com.asiainfo.chapter9;

/**
 * 适配器模式——接收已有的接口，返回需要的接口
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 上午10:08:22
 */
public class Test2 {
	public static void main(String[] args) {
		C[] cs = { new C1(), new C2(), new DAdapter(new D1()) };
		for (int i = 0; i < cs.length; i++) {
			if (i == 0) {
				Apply.doSth(cs[i], new C1());
			} else if (i == 1) {
				Apply.doSth(cs[i], new C2());
			} else {
				Apply.doSth(cs[i], new D1());
			}
		}
	}
}

interface C {
	public String name();

	public Object process(Object o);
}

class C1 implements C {
	@Override
	public String name() {
		return "C1";
	}

	@Override
	public C1 process(Object o) {
		return (C1) o;
	}

}

class C2 implements C {
	@Override
	public String name() {
		return "C2";
	}

	@Override
	public C2 process(Object o) {
		return (C2) o;
	}
}

class Apply {
	public static void doSth(C c, Object o) {
		System.out.println(c.name());
		System.out.println(c.process(o));
	}
}

class D {
	public String name() {
		return getClass().getSimpleName();
	}

	public Object process(Object o) {
		return o;
	}
}

class D1 extends D {
	@Override
	public String name() {
		return "D1";
	}

	@Override
	public D1 process(Object o) {
		return (D1) o;
	}
}

class D2 extends D {
	@Override
	public String name() {
		return "D2";
	}

	@Override
	public D2 process(Object o) {
		return (D2) o;
	}
}

class DAdapter implements C {
	private D d;

	public DAdapter(D d) {
		this.d = d;
	}

	@Override
	public String name() {
		return d.name();
	}

	@Override
	public D process(Object o) {
		return (D) d.process(o);
	};
}
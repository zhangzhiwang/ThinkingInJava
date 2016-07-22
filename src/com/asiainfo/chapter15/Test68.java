package com.asiainfo.chapter15;

/**
 * 子类的泛型边界不能是（或包括）父类的泛型边界的父类
 *
 * @author zhiwangzhang
 * @date 2016年7月14日 下午10:20:33
 */
public class Test68<T extends G1> {

}

class G {}

class G1 extends G {}

interface H {}

interface H1 extends H {}

class I implements H1 {}

//class Test68_1<T extends G> extends Test68<T> {}//子类的泛型边界不能是（或包括）父类的泛型边界的父类

//class Test68_1<T extends G & H> extends Test68<T>{}//子类的泛型边界不能是（或包括）父类的泛型边界的父类

class Test68_1<T extends I & H & H1> {}

class Test68_2<T extends G1 & H> extends Test68<T> {}

class Test68_3<T extends G & H> {}

//class Test68_3_1<T extends G> extends Test68_3<T> {}//子类的泛型边界不能比父类的泛型边界小
package com.asiainfo.chapter10.exercise.package2;

import com.asiainfo.chapter10.exercise.package1.A;

public class B {
	protected class Inner implements A {
		public Inner() {// You cannot access the synthesized default constructor
						// from ProtectedInnerClass because it has the same
						// protected access as the defining class.
		}

		@Override
		public void func1() {
			System.out.println("B.Inner.func1()");
		}
	}
}

package com.youjin.anonymous;

public class InnerEx6 {
	Object iv = new Object() {
		void method() {
		}
	};
	static Object cv = new Object() {
		void method() {
		}
	};

	void myMethod() {
		Object iv = new Object() {
			void method() {
			}
		};
	}
}

package com.example.aop;

import example.com.sample.test.SpringApplicationContext;

public class AOPTest {

	public static void main(String[] args) {
		BusinessLogic bl = (BusinessLogic)SpringApplicationContext.getBeanInstance("businessLogic");
		bl.methodA();
		bl.methodB();
		bl.methodC();
		bl.methodD();
	}

}

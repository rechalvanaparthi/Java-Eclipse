package com.pack2;

import com.pack1.Calc;

public class CalcTest2 extends Calc {
	public static void main(String[] args) {
		CalcTest2 c = new CalcTest2();
		
		System.out.println(c.z);
		c.findSum(10,20);
		
		System.out.println(c.i);
		c.findSub(10,20);
		
		
	}
	
}

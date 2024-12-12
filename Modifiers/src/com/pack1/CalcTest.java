package com.pack1;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		System.out.println(c.x);
		c.findSquare(10);
		System.out.println("      ");
		//c.findCube(10);   ----->Private Scope we can't access
		
		System.out.println(c.z);
		c.findSum(10, 20);
		System.out.println("      ");
		
		System.out.println(c.i);
		c.findSub(10, 20);
		
		
	}
}

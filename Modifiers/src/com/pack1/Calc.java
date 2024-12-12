package com.pack1;

public class Calc{
	//default Scope
	int x = 10;
	
	//Default Scope- if we don't have modifiers explicitly then they are called as default scope
	 void findSquare(int num) {
		System.out.println(num * num);
	}
	
	 
	//private scope
		private int y= 20;
		
	//private scope
	private void findCube(int num) {
		System.out.println(num*num*num);
	}
	
	
	//public scope
	public int z = 30;
	
	public void findSum(int x, int y) {
		System.out.println(x+y);
	}
	
	
	//protected scope
	protected int i = 111;
	
	protected void findSub(int x,int y) {
		System.out.println(x-y);
	}
}

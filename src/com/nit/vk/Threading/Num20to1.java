package com.nit.vk.Threading;

public class Num20to1 extends Thread {
	@Override
	public void run() {
		 for (int i=20; i>=1; i--)
	       {
	         System.out.println("run"+i);
	       }
	}	
}

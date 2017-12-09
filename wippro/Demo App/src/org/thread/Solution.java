package org.thread;

public class Solution {

	public static void main(String[] args) {
	System.out.println("Main class thread");
	NewClass np=new NewClass();
	np.start();
	
	for(int i=0;i<5;i++){
		System.out.println("Main :"+i);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	System.out.println("Child thread exiting");


	}

}

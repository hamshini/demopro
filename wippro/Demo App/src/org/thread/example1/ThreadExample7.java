package org.thread.example1;

public class ThreadExample7 {

	public static void main(String[] args) throws InterruptedException
	{
		CallMe c1=new CallMe();
		NewThread ob1=new NewThread(c1,"One","Hello World");
		NewThread ob2=new NewThread(c1,"Two","Say");
		NewThread ob3=new NewThread(c1,"Three","Hi..");
		NewThread ob4=new NewThread(c1,"Four","Good Bye");
		try{
		System.out.println("Waiting for End");
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
			{
				System.out.println("Main Thread Interrupted");
			}
		}


}

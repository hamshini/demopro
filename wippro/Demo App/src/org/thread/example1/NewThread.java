package org.thread.example1;

public class NewThread implements Runnable{
	Thread t;
	CallMe ca;
	String msg;
	public NewThread(CallMe c,String n,String m)
	{
	msg=m;
	this.ca=c;
	t=new Thread(this,n);
	t.start();
	}
	public void run()
	{
		try{
			Thread.sleep(1000);
			synchronized(ca){
			ca.call(msg);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted");
		}
	}

}

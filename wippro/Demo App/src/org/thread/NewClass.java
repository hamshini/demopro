package org.thread;

public class NewClass extends Thread {
public void run(){
	System.out.println("NewApp class thread");
	for(int i=0;i<5;i++){
		System.out.println("child :"+i);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	System.out.println("Child thread exiting");
}
	public NewClass() {
		super();
	
	}

	public NewClass(String arg0) {
		super(arg0);
	
	}
	

}

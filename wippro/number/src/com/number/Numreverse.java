package com.number;

public class Numreverse {
	int num=1234;
	void reversing()
	{
		int rev=0;
		while(num>0)
		{
			int a=num%10;
			rev=(rev*10)+a;
			num=num/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numreverse ob3=new Numreverse();
		ob3.reversing();
	}

}

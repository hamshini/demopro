package com.number;
public class digitsum {
	int num=1234;
	void splitting()
	{
		while(num>0)
		{
			int a=num%10;
			System.out.println(a);
			
			num=num/10;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digitsum ob=new digitsum();
		ob.splitting();

	}

}

package com.number;

public class evensum {
	int num=1234;
	int sum=0;
	void evensumdisp()
	{
		while(num>0)
		{
			int a=num%10;
			if(a%2==0)
			{
				sum+=a;
			}
			
			num=num/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evensum ob2=new evensum();
		ob2.evensumdisp();

	}

}

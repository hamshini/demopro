package com.number;

public class cumulativesum {
	int num=1234;
	
	void cumsum()
	{
		int sum=0;
		while(num>0)
		{
			int a=num%10;
			sum+=a;
			num=num/10;
		}
		int sum1=0;
		if(sum>9)
		{
			while(sum>0)
			{
				int b=sum%10;
				sum1+=b;
				sum=sum/10;
			}
			
			System.out.println(sum1);
		}
		else
		{
			System.out.println(sum);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cumulativesum ob4=new cumulativesum();
		ob4.cumsum();
	}

}

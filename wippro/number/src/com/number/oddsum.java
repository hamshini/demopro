package com.number;

public class oddsum {
	int num=1234;
	int sum=0;
	void oddsumdisp()
	{
		while(num>0)
		{
			int a=num%10;
			if(a%2!=0)
			{
				sum+=a;
			}
			
			num=num/10;
		}
		System.out.println(sum);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddsum ob2=new oddsum();
		ob2.oddsumdisp();
	}

}

import java.util.Scanner;
public class Number_1 {
	void split(int num)
	{
		while(num>0)
		{
			int num1=num%10;
			System.out.print(num1+" ");
			num=num/10;
		}
	}
	int sum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int num1=num%10;
			sum=sum+num1;
			num=num/10;	
		}
		System.out.println();
		return sum;
	}
	int even_sum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int num1=num%10;
			if(num1%2==0)
			{
				sum=sum+num1;
			}
			num=num/10;	
		}
		return sum;
	}
	int odd_sum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int num1=num%10;
			if(num1%2!=0)
			{
				sum=sum+num1;
			}
			num=num/10;	
		}
		return sum;
	}
	int[] occurance(int num,int n)
	{	
		int num1=0;
		int count[]={1,1,1,1};
		int a[]=new int[n];
		int i=0;
		while(num>0)
		{
			num1=num%10;
			a[i]=num1;
			i++;
			num=num/10;
		}
		
			for(i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						count[i]=count[i]+1;
					}
				}
			}
		
		return count;
	}
	int cumulative_sum(int num)
	{
		int sum=0,sum1=0;
		while(num>0)
		{
			int num1=num%10;
			sum=sum+num1;
			num=num/10;	
		}
		if(sum>9)
		{
			while(sum>0)
			{
				int re=sum%10;
				sum1=sum1+re;
				sum=sum/10;
			}
		}
		else
		{
			sum1=sum;
		}
		return sum1;
	}
	int reverse(int num)
	{
		int output=0;
		while(num>0)
		{
			int num1=num%10;
			output=output*10+num1;
			num=num/10;	
		}
		System.out.println(output);
		return output;
	}
	int cyclic_sum(int num,int n)
	{
		int num1=0,sum=0,sum1=0;
		int a[]=new int[n];
		int i=0;
		while(num>0)
		{
			num1=num%10;
			a[i]=num1;
			i++;
			num=num/10;
		}
		for(i=n-1;i>=0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				sum=sum+a[i];
				sum=sum+a[j];
			}
		}
		return sum;
	}
	int[] duplicate(int num,int n)
	{
		int num1=0,count=1;
		int a[]=new int[n];
		int b[]=new int[n];
		int i=0;
		while(num>0)
		{
			num1=num%10;
			a[i]=num1;
			i++;
			num=num/10;
		}
			for(i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						count=count+1;
					}
				}
			}
			for(i=0;i<n;i++)
			{
				if(count==1)
				{
					b[i]=a[i];
				}
			}
		
		return b;
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int n=obj.nextInt();
		Number_1 obj1=new Number_1();
		obj1.split(num);
		int a=obj1.sum(num);
		System.out.println("the total sum is:"+a);
		int c=obj1.even_sum(num);
		System.out.println("the even sum is:"+c);
		int d=obj1.odd_sum(num);
		System.out.println("the odd sum is:"+d);
		int f[]=obj1.occurance(num,n);
		System.out.println("the occurance of digits are:");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);

		}
		int b=obj1.cumulative_sum(num);
		System.out.println("the cumulative sum is:"+b);
		obj1.reverse(num);
		int e=obj1.cyclic_sum(num,n);
		System.out.println("the cyclic sum is:"+e);
		int g[]=obj1.duplicate(num,n);
		System.out.println("the non-duplicate elements are:");
		for(int i=0;i<g.length;i++)
		{
			System.out.println(g[i]);

		}
	}
}
import java.util.Scanner;
public class String_program {
	String reverse_str(String str)
	{
		StringBuffer a=new StringBuffer(str);
		String b=a.reverse().toString();
		return b;
		
	}
	int occurance_char(String str,String d)
	{
		//System.out.println("");
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char f=str.charAt(i);
			String g=String.valueOf(f);
			if(g.equals(d))
			{
				count=count+1;
			}
		}
		return count;
	}
	int[] occurance(String str,int n)
	{
		int count[]=new int[n];
		for(int i=0;i<str.length();i++)
		{
			count[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count[i]=count[i]+1;
				}
			}
			System.out.println(str.charAt(i)+"-"+count[i]);
		}
		return count;
	}
	StringBuffer duplicate(String str)
	{
		String str1=null;
		StringBuffer sb=new StringBuffer(str);
		//int r=str.length();
		//System.out.println(r);
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					sb.deleteCharAt(i);
				}
			}
		}
		return sb;
	}
	private String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	String dup_char(String str,String d,int n)
	{
		String str5=null;
		StringBuffer sb=new StringBuffer(str);
		//int arr1[]=new int[n];
		//for(int i=1;i<=str.length();i++)
		//{
			//System.out.println(sb);
			int ar=str.indexOf(d);
			int ar1=str.lastIndexOf(d);
			int ar2=str.indexOf(d,n/2);
			str5=sb.deleteCharAt(ar).deleteCharAt(ar1-1).deleteCharAt(ar2-1).toString();
			//System.out.println(ar);
		
		//}
		return str5;
	}
	StringBuffer upperLower(String str)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char str2=str.charAt(i);
			String str3=String.valueOf(str2);
			int ascii=Integer.parseInt(str3);
			if((ascii>=65)&&(ascii<=96))
			{
				str3.toLowerCase();
				sb.append(str3);
			}
			{
				str3.toUpperCase();
				sb.append(str3);
			}
		}
		return sb;
	}
	public static void main(String args[])
	{
		System.out.println("enter the character to be searched");
		Scanner obj2=new Scanner(System.in);
		String d=obj2.next();
		//System.out.println("enter the array length");
		//int n=;
		String str="Wipro's Talent Transformation-2017!";
		int n=str.length();
		String_program obj1=new String_program();
		String c=obj1.reverse_str(str);
		System.out.println(c);
		int e=obj1.occurance_char(str, d);
		System.out.println(e);
		int arr[]=obj1.occurance(str, n);
		for(int i=0;i<str.length();i++)
		{
			System.out.println(arr[i]);
		}
		/*String str3=obj1.duplicate(str).toString();
		System.out.println(str3);*/
		String str4=obj1.dup_char(str,d,n);
		System.out.println(str4);
		String str3=obj1.upperLower(str).toString();
		System.out.println(str3);
		
	}
}

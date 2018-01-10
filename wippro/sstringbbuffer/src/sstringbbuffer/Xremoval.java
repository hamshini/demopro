package sstringbbuffer;

public class Xremoval {

	public static void main(String[] args) {
		String a="xhix";
		int n=a.length();
		//System.out.println(a.substring(n-1));
		if( ( (a.substring(0,1)).equals('x')) || ( (a.substring(n-1)).equals('x')) ){
			System.out.println(a.substring(2,n-2));
		}
		else{
			System.out.println("1");
		}
	}

}

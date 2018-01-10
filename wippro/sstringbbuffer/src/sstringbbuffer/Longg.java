package sstringbbuffer;

public class Longg {

	  void Prb(String a,String b){
		  int n=a.length();
		  int n1=b.length();
		  if(n>n1){
			  System.out.println(b+a+b);
		  }
		  else{
			  System.out.println(a+b+a);
		  }
	  }
	public static void main(String[] args) {
		
		  Longg a=new Longg();
		  a.Prb("hi", "hello");
	}

}

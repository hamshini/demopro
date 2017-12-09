package org.exception;

public class Solution {
public static double divide(int v1,int v2) throws OwnException {
	if(v2==0)
		throw new OwnException("Value2 is 0");
	return(v1/v2);
}
	public static void main(String[] args) {
	try{
		Solution.divide(12, 0);
		System.out.println("End");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	finally{
		System.out.println("Pgm Ends");
	}
	}

}

package org.dummy;
import java.util.Arrays;
import java.util.Scanner;

public class MedianFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n size");;
		int n = in.nextInt();
		System.out.println("Enter m size");
		int m = in.nextInt();
		float median;
		int j=n;
		int a[] = new int[n];
		int b[] = new int[m];
		int temp[] = new int[n + m];
		System.out.println("Enter first array elements");
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			temp[i]=a[i];
		}
		System.out.println("Enter second array elements");
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
			temp[j]=b[i];
			j++;
		}
		if (n == m) {
			median = (a[n-1] + b[0]);
			median=median/2;
			
		} else {
			Arrays.sort(temp);
			for(int i=0;i<(n+m);i++){
			System.out.println(temp[i]);
			}
			median=(temp[0]+temp[n+m-1]/2);
		}
		System.out.println("Median="+median);
		
	
	 /*
		 * String str = bf.readLine(); float age = Float.valueOf(bf.readLine());
		 * System.out.println(str + 4);
		 * 
		 * System.out.println(age + 3); long accountNumber = 12000000077777889l;
		 * float houseRentAllowance = 5.0f; double travelAllowance = 10.3d;
		 * boolean status = true; int white = 0x3fff; short black = (short)
		 * ~white; double providentFund = houseRentAllowance;
		 */
		/*
		 * void show() {
		 * 
		 * System.out.println(" function"); }
		 * 
		 * void getGreeting(String user) {
		 * 
		 * System.out.println("Congtratz..." + user); }
		 * 
		 * double calculateNetSalary(double basicSalary, float travelAllowance,
		 * float dearnessAllowance, float houseRentAllowance, float providentFund) {
		 * double netPay = basicSalary + (basicSalary * (travelAllowance / 100)) +
		 * (basicSalary * (dearnessAllowance / 100)) + (basicSalary *
		 * (houseRentAllowance / 100)) - (basicSalary * (providentFund / 100));
		 * return netPay; }
		 */
	 
	}
	

}

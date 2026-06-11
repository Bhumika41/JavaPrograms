package test;

import java.util.Scanner;

public class Arrayrotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("k:");
		int k=sc.nextInt();
		k=k%n;
		 System.out.println("After rotation:");
	        for(int i=n-k;i<n;i++){
	            System.out.print(arr[i]+" ");
	        }
	        for(int i=0;i<n-k;i++){
	            System.out.print(arr[i]+" ");
	        }
	}
}

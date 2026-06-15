package sortingalgorithm;

import java.util.Scanner;

public class Insertionsort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elments:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current) {
				arr[j+1]=arr[j];
				j--;
			}		
			arr[j+1]=current;
		}
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}}

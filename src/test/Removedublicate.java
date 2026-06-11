package test;

import java.util.Scanner;

public class Removedublicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Without duplicates:");
        for(int i = 0; i < n; i++) {
            if(i == 0 || arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
package com.techdsa.array;

import java.util.Scanner;

// Left Rotate Array by D Place 
public class LeftRotateByDPlace {

	public static void main(String[] args) {
		
		int[] arr= {2,1,4,5,7,8,9,1};
		System.out.println("Before Rotate !!");
		for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnetr D Place : ");
		int D=sc.nextInt();
		if(D>arr.length) {
			System.out.println("Array length is "+arr.length);
			System.exit(0);
		}
		for(int i=0;i<D/2;i++) {
			int temp=arr[i];
			arr[i]=arr[D-i-1];
			arr[D-i-1]=temp;
		}
		System.out.println("After Rotate !!");
		
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}

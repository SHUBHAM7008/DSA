package com.techdsa.array;
//For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order
public class SquareAndSort {

	public static void main(String[] args) {
		
		int[] arr= {-6,-2,2,3,6,7};
		int[] ans=new int[arr.length];
		int left=0;
		int right=arr.length-1;
		int i=ans.length-1;
		while(left<right) {
			if(Math.abs(arr[left])==Math.abs(arr[right])) {
				ans[i]=arr[left]*arr[left];
				i--;
				ans[i]=arr[left]*arr[left];
				left++;
				right--;
			}
			else if(Math.abs(arr[left])>Math.abs(arr[right])) {
				ans[i]=arr[left]*arr[left];
				left++;
			}else if(Math.abs(arr[left])<Math.abs(arr[right])) {
				ans[i]=arr[right]*arr[right];
				right--;
			}
			i--;
		}
		
		printarr(ans);
	}
	
	public static void printarr(int[] arr) {
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
   
}

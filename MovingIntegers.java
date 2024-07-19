package com.techdsa.array;

//In an array 'a' move all even integers at the beginning followed by all odd integers
//Order doesn't matter
public class MovingIntegers {

	public static void main(String ar[]) {
		int[] a= {1,2,3,4,5,6,7,8};
		int left=0;
		int right=a.length-1;
		while(left<right) {
			if(a[left]%2==1 && a[right]%2==0) {
				swap(a,left,right);
				left++;
				right--;
			}else if(a[left]%2==0) {
				left++;
			}else if(a[right]%2==1){
				right--;
			}
		}
		
		printarr(a);
	}

	private static void printarr(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
		
	}

	private static void swap(int[] a, int left, int right) {
		a[left]=a[left]+a[right];
		a[right]=a[left]-a[right];
		a[left]=a[left]-a[right];
		
	}
}

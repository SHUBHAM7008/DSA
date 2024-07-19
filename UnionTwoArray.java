package com.techdsa.array;

import java.util.*;

// Union of Two Sorted Array !!!
public class UnionTwoArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,65,66};
		int[] arr2= {1,2,5,8,9,10,11,30,66};
		int[] unionArr=new int[arr1.length+arr2.length];
		int Unionindex=0;
		for(int i=0;i<arr1.length;i++) {
			unionArr[Unionindex]=arr1[i];
			Unionindex++;
		}
		for(int i=0;i<arr2.length;i++) {
			if(!isContains(arr1,arr2[i])) {
			  unionArr[Unionindex]=arr2[i];
			  Unionindex++;
			}
		}
		
		display(unionArr,Unionindex);
		
//		Using Collections Framework 
//		List<Integer> union=new ArrayList<>(Arrays.asList());
//		for(int i:arr1) {
//			union.add(i);
//		}
//		for(int i:arr2) {
//			if(!(union.contains(i)))
//			  union.add(i);
//		}
//		Collections.sort(union);
//		System.out.print(union);
//        
	}

	private static void display(int[] unionArr,int Unionindex) {
		for(int i=0;i<Unionindex;i++) {
			System.out.print(unionArr[i]+" ");
		}
	}

	private static boolean isContains(int[] arr1, int Ele) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==Ele) {
				return true;
			}
		}
		return false;
	}

}

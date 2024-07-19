package com.techdsa.array;

// Majority element by Moore's Voting Algorithm 
//int[] arr= {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5};
// OUPUT :: 5
public class MajorityElement {
    public static void main(String ar[]) {

    	int[] arr= {2,2,1,3,2,4,2};
//    	Output :: 2
    	 int element=0,count=0;
//    	 Step 1 : Moore Voting Algo Apply 
    	 for(int i=0;i<arr.length;i++) {
    		 if(count==0) {
    			 element=arr[i];
    		 }else {
    			 if(element==arr[i]) {
    				 count++;
    			 }else {
    				 count--;
    			 }
    		 }
    	 }
    	 
//    	 Step 2 : Verify 
    	 count=0;
    	 for(int i=0;i<arr.length;i++) {
    		 if(element==arr[i])
    			 count++;
    	 }
    	 if(count>arr.length/2)
    	   System.out.print(element);
    	 else
    		 System.out.print("No one !!");
    }
}

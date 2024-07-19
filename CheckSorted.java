package com.techdsa.array;

// Find out Array is sorted or Not 
public class CheckSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr= {1,1,1,1,1};
          boolean Ascen=false;
          boolean Dscen=false;
          
          for(int i=0;i<arr.length-1;i++) {
        	  if(arr[i]<arr[i+1]) {
        		  Ascen=true;
        	  }
        	  else if(arr[i]>arr[i+1]) {
        		  Dscen=true;
        	  }
          }
          if(Ascen && Dscen) {
        	  System.out.println("No");
          }else {
        	  System.out.print("Yes");
          }
	}

}

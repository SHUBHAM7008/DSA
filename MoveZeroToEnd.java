package com.techdsa.array;

//Moving Zero To End  
public class MoveZeroToEnd {
  public static void main(String ar[]) {
	  int[] arr= {0,0,0,1,0,2,0,3,0,5,5,0};
	  int arrlen=arr.length;
	 
	  for(int i=0;i<arrlen;i++) {
		  if(arr[i]==0) {
			  for(int j=i;j<arrlen-1;j++) {
				  arr[j]=arr[j+1];
			  }
			  arrlen-=1;
			  arr[arrlen]=0;
			  i--;
		  }
	  }
	  for(int i=0;i<arr.length;i++)
		  System.out.print(arr[i]+" ");
	  
	  
  }
}

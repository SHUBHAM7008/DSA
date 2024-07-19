package com.techdsa.array;

// Remove Duplicate Element from Array 
public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,2,5,4,4,2,8};
		boolean duplicate=false;
		int noElements=arr.length;
		for(int i=0;i<noElements;i++) {
			duplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					duplicate=true;
					int k=i;
					while(k<noElements-1) {
						arr[k]=arr[k+1];
						k++;
					}
					noElements--;
					i--;
				}
				
			}
			
		}
		for(int l=0;l<noElements;l++) {
			System.out.print(arr[l]);
		}
		System.out.println();
		
	}

}

package day9;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,33,9,6,7,55,66,35,42,77}; //unsorted
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		int temp = 0;
		for(int i=0;i<arr.length;i++){ //entire array values
		    for(int j=i+1;j<arr.length;j++){ 
		    	//all subsequent position for index i

		        //if(arr[j]<arr[i]){ //Ascending
		    	if(arr[j]>arr[i]) { //Descending
		         temp = arr[i];
		         arr[i] = arr[j];
		         arr[j] = temp;
		        }

		    }
		}

		System.out.println("After Sorting: "+Arrays.toString(arr));
		
		
	}

}

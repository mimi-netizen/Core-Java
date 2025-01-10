package day9;

public class LinearSearchInArray {

	public static void main(String[] args) {
		
		int a[] = {10,22,9,55,88,33,11,34,99,11}; //Hardcoded
		int num = 888;
		boolean status = false; 
		//false - Number is not found in the Array
		//true - Number is found in the Array
		
		//Normal for loop
		/*
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num) { //comparision
				System.out.println("Number is found in the Array");
				status = true;
				break;
			}
		}
		
	*/
		//Enhanced For loop
		for(int x:a) {
			if(x==num) { //comparision
				System.out.println("Number is found in the Array");
				status = true;
				break;
			}
		}
		
		if(status==false)
			System.out.println("Number is Not found in the Array");
		
	}

}

package day8;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		// 1 D Array
		
		//Approach1
		int a[] = new int[5]; // Declaration and specify the length of the Array
		//int []a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		int length = a.length;
		System.out.println("Length of Array a is : "+length);
		
		/*
		//Normal for loop
		for(int i=0;i<a.length;i++) {   //a.length = 5
			System.out.println(a[i]);
		} */
		
		/*
		//Enhanced For loop - For each loop
		for(int x:a) {		// more efficient code	
			System.out.println(x);
		}
		
		*/
		
		
		//Approach 2
		
		int b[] = {40,22,43,66,31,52,88,666,3332,88888};  //10 elements
		// declaring and assigning the values
		
		//System.out.println("Lenghth of Array b is : "+b.length);
		
		//Enhanced For loop - For each loop
				for(int x:b) {		// more efficient code	
					System.out.println(x);
				}
		
	}

}

package day8;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//Approach 1
		
		int a[][] = new int[3][2]; 
		//int [][]a = new int[3][2];
		//int []a[] = new int[3][2];
		
		//declaration the 2D array with length - rows -3, columns: 2
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		
		/*
		//Normal For loop
				for(int i=0;i<a.length;i++) { // rows the array
					for(int j=0;j<a[i].length;j++) { //columns of the array
						
						System.out.print(a[i][j]+" ");
					}
					System.out.println(); //print new line
				}
				*/
		
		
		//Find the length of the array
		
		//System.out.println(a.length); // row length
		//System.out.println(a[2].length); // column length

		//Approach 2
		int b[][] = { {1,2,3,4,5},
				      {6,7,8,9,10},
				      {11,22,33,44,55}     
				}; //declaring statements
		
		
		// Retrieving the values for the 2D array
		/*
		//Normal For loop
		for(int i=0;i<b.length;i++) { // rows the array
			for(int j=0;j<b[i].length;j++) { //columns of the array
				
				System.out.print(b[i][j]+" ");
			}
			System.out.println(); //print new line
		} */
		
		//Enhanced for loop - for each loop
		
		for(int x[]:b) { // rows of the arrays
			for(int y:x) { // columns of the arrays
				
				System.out.print(y+" ");
			}
			System.out.println(); //print new line
		}
		
		
		
	}

}

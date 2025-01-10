package day6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");

        int N = sc.nextInt();

        if(N%2==1 )
        {
            System.out.println("Weird");
        }
        else
        {
            if (N >= 2 && N <= 5 ) {
                System.out.println("Not Weird");
            } 
            else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } 
            else if (N > 20) {
                System.out.println("Not Weird");
            }
            else
            	System.out.println("Test");
        }
        sc.close();
	}

}

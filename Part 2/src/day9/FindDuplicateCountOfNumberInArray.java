package day9;

public class FindDuplicateCountOfNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {22,33,11,10,50,60,20,10,15,10,15};
		int num = 10;
		int count = 0;
		
		for(int x:a) {
			
			if(num == x) { //comparision
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
	}

}

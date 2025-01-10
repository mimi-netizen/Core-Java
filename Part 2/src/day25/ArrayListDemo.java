package day25;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration or creating object
		ArrayList arrList = new ArrayList(); //Different data types
		
		//List list = new ArrayList(); //Different data types
		
		//ArrayList<Integer> myList = new ArrayList<>(); //Integer values only
		
		//List<Integer> myList = new ArrayList<>();
		
		//Adding the data into the ArrayList
		arrList.add(100);
		arrList.add("Swaroop");
		arrList.add(234.567);
		arrList.add(true);
		arrList.add(100);
		arrList.add(100);
		arrList.add(null);
		arrList.add(null);
		arrList.add(500);
		
		//Size of the ArrayList
		int size = arrList.size();
		System.out.println(size);
		
		//Print the values in the ArrayList
		System.out.println(arrList);
		
		//Removing the elements - ArrayList
		arrList.remove(5);
		System.out.println(arrList);
		
		//Insert element at specific index
		arrList.add(3, "SwaroopNadella");
		System.out.println(arrList);
		
		//Modify at specific Index in ArrayList
		arrList.set(4, "Test");
		System.out.println(arrList);
		
		//Retrieve the value at specific index
		System.out.println(arrList.get(3));
		
		//Retrieve all elements from Arraylist with Index
		
		//1 - for loop
		/*for(int i=0;i<=arrList.size()-1;i++) {
			System.out.println(arrList.get(i));
		}*/
		
		//2 - for each loop / Enhanced for loop
		/*for(Object x:arrList) {
			System.out.println(x);
		}*/
		
		//3 - Using Iterator - Java Collections
		Iterator it = arrList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Checking ArrayList is Empty or not
		System.out.println(arrList.isEmpty());
		
		//Remove some elements from the Arraylist
		//[100, Swaroop, 234.567, SwaroopNadella, Test, 100, null, null, 500]
		ArrayList list2 = new ArrayList();
		list2.add("SwaroopNadella");
		list2.add(null);
		list2.add(500);
		
		arrList.removeAll(list2);
		System.out.println(arrList);
		
		//Remove all the elements from the ArrayList
		arrList.clear();
		System.out.println(arrList);
		System.out.println(arrList.isEmpty());
				
		
	}

}

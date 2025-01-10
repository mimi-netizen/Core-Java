package day26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashMap hm = new HashMap();
		//Map m = new HashMap();
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//Adding values into the HashMap - Key, Value pairs
		
		map.put(101, "Swaroop");		
		map.put(102, "Ram");
		map.put(103, "Kumar");
		map.put(104, "Swaroop");
		
		System.out.println(map);
		
		map.put(101, "Krishna");
		System.out.println(map);
		
		//Size of the hashMap
		System.out.println(map.size());
		
		//Remove one key value pair
		map.remove(104);
		System.out.println(map);
		
		//Retrieve value of an Given key
		System.out.println(map.get(102));
		
		//Retrieve all the keys and values from the HashMap
		System.out.println(map.keySet()); //all Keys
		System.out.println(map.values()); //all values
		System.out.println(map.entrySet()); //Both key and values
		
		//Retrieving data from the Hash Map
		//Using the for each loop
		/*for(Integer k:map.keySet()) {
			System.out.println(k+"   "+map.get(k));
		}*/
		
		//Using Iterator
		Iterator<Entry<Integer, String>> it  = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//Clear all the values in the HashMap
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
		
	}

}

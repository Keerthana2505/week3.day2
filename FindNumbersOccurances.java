//Assignment - 2
package week3.day2.Assignment;

import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		int[] list = {2,3,5,6,3,2,1,4,2,1,6,-1};

		//Create TreeMap
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();

		//For loop -> each number -> add to the map
		for (int t : list) {
			int key = t;

			//If it is exist -> update it with + 1
			if(tmap.containsKey(key)) {	
				int val = tmap.get(key);
				tmap.put(t, val+1);
			}

			//Else -> new entry with 1 as value
			else{
				tmap.put(t, 1);
			}
		}
		System.out.println(tmap.entrySet());

	}

}

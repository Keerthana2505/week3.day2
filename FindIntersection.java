package week3.day2.Assignment;

import java.util.Map;
import java.util.TreeMap;

public class FindIntersection {

	public static void main(String[] args) {

		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};

		// Create a map
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();

		// Loop through the arr1 and store it in the map.
		for (int i =0; i< arr1.length; i++)
		{
			map.put(arr1[i],map.getOrDefault(arr1[i], 0)+1);
		}

		// check if map contains the key as arr2.
		// If exists, print arr2.
		for (int i =0; i< arr2.length; i++)
		{
			if(map.containsKey(arr2[i]))
			{
				System.out.println(arr2[i]);
			}
		}

	}

}

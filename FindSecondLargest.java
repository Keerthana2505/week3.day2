package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindSecondLargest {

	public static void main(String[] args) {
		//Create List
		int[] num = {3,2,11,4,6,7};
		List<Integer> l = new ArrayList<Integer>();

		//Add elements in list
		for (int i = 0; i < num.length; i++) {
			l.add(num[i]);
		}

		//sort List in ascending order
		Collections.sort(l);
		System.out.println(l);

		//Pick the 2nd element from the last and print it
		int size = l.size();
		System.out.println("Second Large Number "+l.get(size-2));

	}

}

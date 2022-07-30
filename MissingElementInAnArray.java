package week3.day2.Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};

		//sorting the array
		Arrays.sort(arr);

		Set<Integer> me = new LinkedHashSet<Integer>();

		for(Integer val :arr) {
			me.add(val);
		}

		for(int i = 1; i < me.size(); i++) {
			if(!me.contains(i))
				System.out.println("Missing Element: "+i);
		}

	}

}

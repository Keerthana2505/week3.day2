package week3.day2.Assignment;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicate {

	public static void main(String[] args) {
		String txt = "abbaba";

		//Change string to char array
		char[] charArray = txt.toCharArray();

		//Create HashMap
		Map<Character,Integer> hm = new HashMap<Character,Integer>();

		//For loop -> each number -> add to the map
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (hm.containsKey(ch)) {
				int val = hm.get(ch);
				hm.put(ch, val+1);
				int maxval = hm.get(ch);
				
				//Keep comparing the occurance with other values -> max value -> character
				if (maxval > val) {
					System.out.println("Most Duplicate Character: "+charArray[i]);
					break;
				}
			}else {
				hm.put(ch, 1);
			}
		}

	}

}

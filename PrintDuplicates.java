package week3.day2.Assignment;
//Assignment - 1
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		//Create List
		List<Integer> l = new ArrayList<Integer>();
		l.add(14);
		l.add(12);
		l.add(13);
		l.add(11);
		l.add(15);
		l.add(14);
		l.add(18);
		l.add(16);
		l.add(17);
		l.add(19);
		l.add(18);
		l.add(17);
		l.add(20);

		//sort List
		Collections.sort(l);

		//Create HashSet
		Set<Integer> hs = new HashSet<Integer>();

		for(Integer value : l) {
			if(hs.add(value)==false) {
				System.out.println("Duplicate Value is: "+value);
			}
		}
	}

}

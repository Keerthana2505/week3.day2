package week3.day2.Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {


	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		//Convert text to string Array
		String[] str = text.split(" ");

		//Create List	
		Set<String> dup = new LinkedHashSet<String>();

		//Add elements to set
		for(int i=0; i < str.length; i++) {
			dup.add(str[i]);
		}

		for(String s : dup) {
			System.out.print(s+ " ");
		}

	}

}

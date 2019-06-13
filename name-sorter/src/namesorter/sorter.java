package namesorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sorter {
	
	public static ArrayList<String> sortLast(ArrayList<String> data2Sort) {
		System.out.println("Before:");
		for (String item : data2Sort) { 		      
		      System.out.println(item); 		
		 }
		
		Collections.sort(data2Sort, new Comparator<String>() {
			@Override
			public int compare(String name1, String name2) {
				String lastName1 = name1.substring(name1.lastIndexOf(" ")+1);
				String lastName2 = name2.substring(name2.lastIndexOf(" ")+1);
				if (lastName1.compareTo(lastName2) > 0) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		System.out.println("\nAfter:");
		for (String item : data2Sort) {
		      System.out.println(item); 		
		 }
		return data2Sort;
	}

}

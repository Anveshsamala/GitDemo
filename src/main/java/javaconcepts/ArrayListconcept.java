package javaconcepts;

import java.util.*;

public class ArrayListconcept {

	public static void main(String[] args) {
		//arraylist concept
		List<String> al=new ArrayList<String>();
		al.add("udemy");
		al.add("course");
		al.add("monocept");
		al.add("pvt ltd");
		//i want to print one value
		System.out.println(al.get(3));
		
		
		//print all the values using for loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("@@##%%$$^^&&**");
		//print all the values in foreach loop
		for(String val:al) {
			System.out.println(val);
		}
		
		System.out.println("@@##%%$$^^&&**");
		//i have a Array 
		String[] names= {"anvesh", "Rahul", "Raju", "srinivas","Priyanka", "Swapna", "Rudvik"};
		//then i want to convert this array to list
		List<String> arli=Arrays.asList(names);
		
		for(String value:arli) {
			if(value.contains("srinivas")){
			System.out.println(value);
			}
		}
		
	}

}

package com.selenium;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream1 {
	// @Test
	public static void withoutStream() {
		ArrayList<String> aa = new ArrayList<String>();
		aa.add("Anvesh");
		aa.add("Rahul");
		aa.add("Raju");
		aa.add("Srinivas");
		aa.add("Advith");
		aa.add("Swapna");
		aa.add("Anirudh");
		aa.add("Rudvik");
		aa.add("Priya");
		int count = 0;
		for (int i = 0; i < aa.size(); i++) {
			if (aa.get(i).startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	// @Test
	public static void withStream() {
		ArrayList<String> aa = new ArrayList<String>();
		aa.add("Anvesh");
		aa.add("Rahul");
		aa.add("Raju");
		aa.add("Srinivas");
		aa.add("Advith");
		aa.add("Swapna");
		aa.add("Anirudh");
		aa.add("Rudvik");
		aa.add("Priya");

		long n = aa.stream().filter(s -> s.startsWith("A")).count();
		// System.out.println(n);

		// i will place all the Strings in singe stream to print all the results starts
		// with A
		long l = Stream.of("Anvesh", "Rahul", "Raju", "Srinivas", "Advith").filter(s -> s.startsWith("A")).count();
		// System.out.println(l);
		// display strting length >4
		aa.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		// display string length > 4 and in that display first value
		aa.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

//	@Test
	public static void withStream1() {
		// I want String ends with "A" and it's convert to uppercase using Map(here we
		// are manipulation the data) then print that strings
		Stream.of("Abhijith", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("");
		// convert String array to List array then print String starts with "A" and next
		// print in sorted order and uppercase
		String[] aaa = { "Abhijith", "Don", "Alekhya", "Adam", "Rama" };
		List<String> names = Arrays.asList(aaa);
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}

	// @Test
	public static void steamMap() {
		ArrayList<String> xxx = new ArrayList<String>();
		xxx.add("Anvesh");
		xxx.add("Rahul");
		xxx.add("Raju");
		xxx.add("Srinivas");
		xxx.add("Advith");
		xxx.add("Swapna");
		xxx.add("Anirudh");
		xxx.add("Rudvik");
		xxx.add("Priya");

		String[] aaa = { "Abhijith", "Don", "Alekhya", "Adam", "Rama" };
		List<String> yyy = Arrays.asList(aaa);

		// here i have 2 different string now i want to concat to single String using
		// Stream
		Stream<String> combinedstream = Stream.concat(xxx.stream(), yyy.stream());
		// i want to print all the combined strings in a sorted order
		combinedstream.sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));// at a time we cannot
																								// perform this and
																								// below step in output
																								// at a time
		boolean flag = combinedstream.anyMatch(s -> s.equalsIgnoreCase("Anvesh"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	// @Test
	public static void streamCollect() {
		// converting Stream to List using collect(Collectors.toList())
		List<String> ls = Stream.of("Abhijith", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		// i want to print first String
		System.out.println(ls.get(0));
	}

	// @Test
	public static void stream2() {
//		int[] nums= {3,2,2,7,5,1,9,7};
//		List<int[]> values= Arrays.asList(nums);

		// remove duplicate values and print remaining values in sorted order
		List<Integer> valuez = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		// valuez.stream().distinct().forEach(s->System.out.println(s));
		valuez.stream().sorted().distinct().forEach(s -> System.out.println(s));
	}

	@Test
	public static void stream3() {
		List<Integer> valuez = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		// display repeated values using map
		Map<Integer, Long> mp = valuez.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(s -> s.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(mp);
		System.out.println("    ");
		List<Integer> valuer = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		valuer.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() > 1).forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}

}

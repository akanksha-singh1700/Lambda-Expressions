package com.engineering.track.lambdasPractice.streamAPIPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperations {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
	            "Reflection", "Collection", "Stream",
	            "Structure", "Sorting", "State"
	        );
		
		// forEach: Print each name
		System.out.println("forEach");
		names.stream().forEach(System.out::println);
		
		// collect: Collect names starting with 'S' into a list
		List<String> nameStartsWithS = names.stream().filter(s-> s.startsWith("S")).collect(Collectors.toList());
		System.out.println("\ncollect (names starting with 'S'):");
		nameStartsWithS.forEach(System.out::println);
		
		 // reduce: Concatenate all names into a single string
		String allNames= names.stream().reduce("", (partialString , element)-> partialString + " " + element);
		 System.out.println("\nreduce (concatenated names):");
	        System.out.println(allNames.trim());
	        
		// count: Count the number of names
		long number= names.stream().count();
		System.out.println("\ncount:");
        System.out.println(number);
		
		// findFirst: Find the first name
		Optional<String> firstName = names.stream().findFirst();
		firstName.ifPresent(System.out::println);
		
		// allMatch: Check if all names start with 'S'
		boolean allMatching = names.stream().allMatch(s->s.startsWith("S"));
		System.out.println("\nallMatch (all start with 'S'):");
        System.out.println(allMatching);
        
		// anyMatch: Check if any name starts with 'S'
        boolean anymatching = names.stream().anyMatch(s->s.startsWith("S"));
        System.out.println("\nanyMatch (any start with 'S'):");
        System.out.println(anymatching);
    }


	}



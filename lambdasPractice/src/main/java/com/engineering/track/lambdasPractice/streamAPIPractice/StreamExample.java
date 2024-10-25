package com.engineering.track.lambdasPractice.streamAPIPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// A stream is not a data structure , it takes input from the collections, arrays or i/o operations
// streams don't change the original data structure. they only provide result as per the pipelined methods
// Each intermediate operation is lazily executed and returns a stream as a result, hence they can be pipelined
// The terminal operations mark the end of the stream and return results.
public class StreamExample {

	public static void main(String[] args) {
		
// Intermediate operations
		
		List<List<String>> listOfLists= Arrays.asList(
				Arrays.asList("Reflection", "Collection", "Stream"), 
				Arrays.asList("Structure","State", "Flow"),	
				Arrays.asList("Sorting", "Mappping", "Reduction", "Stream")
				);
		
		// Create a set to hold intermediate results
		Set<String> intermediateResult =new HashSet<>();
		
		// Stream pipeline demonstrating various intermediate operations
		List<String> result = listOfLists.stream()
				.flatMap(List::stream)
				// flatten the list of lists into a single stream
				
				.filter(s->s.startsWith("S"))
				//filter elements starting with S
				
				.map(String::toUpperCase)
				// transform each element to uppercase
				
				.distinct()
				//remove duplicate elements
				
				.sorted()
				//sort elements
				
				.peek(s-> intermediateResult.add(s))
				//Perform an action (add to set) on each element
				
				.collect(Collectors.toList());
				// Collect the final result into a list
		
		System.out.println("Intermediate Results:");
		intermediateResult.forEach(System.out::println);
		
		System.out.println("End Result");
		
		result.forEach(System.out::println);
		
		
	}

}

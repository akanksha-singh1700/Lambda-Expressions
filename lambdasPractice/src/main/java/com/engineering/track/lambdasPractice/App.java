package com.engineering.track.lambdasPractice;
import java.util.ArrayList;
import java.util.Collections;

import com.engineering.track.lambdasPractice.NumericTest;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       NumericTest isFactor = (n,d)->(n%d==0);
       
       if(isFactor.test(6, 2))
    	   System.out.println("2 is a factor of 6");
       
       // Sorting using lambda expressions
       // Replacing comparator with lambda expression
       
       ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(340);
        arr.add(78);
        arr.add(8);
        arr.add(45);
        System.out.println("Elements of arraylist before sorting " + arr);
        
        Collections.sort(arr, (o1,o2)-> (o1<o2)?-1:(o1>o2)?1:0);
       
        System.out.println("Elements of arraylist after sorting " + arr);
    }
}

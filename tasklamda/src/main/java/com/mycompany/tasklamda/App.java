package com.mycompany.tasklamda;
import java.util.*;


public class App 
{
    static   OptionalDouble average(List<Integer> primes) {
    	OptionalDouble avg =primes.stream() //
	    .mapToInt(i -> i) //
	    .average(); //
	    //.ifPresent(avg -> System.out.println("Average found is " + avg));
    	return avg;
    }

	public static void main( String[] args )
    {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		System.out.println(App.average(primes));
	}
}

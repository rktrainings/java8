/**
 * 
 */
package com.rktrainings.java8.streamfilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collections;

/**
 * @author RavikumarPothannagar
 *
 */
public class FindDuplicateElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        // 3, 4, 9
        List<Integer> list = Arrays.asList(5, 3, 9, 2, 4, 1, 1, 3, 2, 7, 2, 9, 2, 9, 4);
        
        System.out.println("Find Duplicates using Filter & Set.add():");
        Set<Integer> result1 = findDuplicateBySetAdd(list);
        result1.forEach(System.out::println);
        
        System.out.println("Find Duplicates using Map & Collectors.groupingBy():");
        Set<Integer> result2 = findDuplicateByGrouping(list);
        result2.forEach(System.out::println);
        
        System.out.println("Find Duplicates using Collections.frequency:");
        Set<Integer> result3 = findDuplicateByFrequency(list);
        result3.forEach(System.out::println);

    }

    public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

        Set<T> items = new HashSet<>();
     // Set.add() returns false if the element was already in the set.
        return list.stream()
                .filter(n -> !items.add(n)) 
                .collect(Collectors.toSet());

    }
    
    public static <T> Set<T> findDuplicateByGrouping(List<T> list) {

        return list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()))    // create a map {1=1, 2=1, 3=2, 4=2, 5=1, 7=1, 9=2}
                .entrySet().stream()                 // Map -> Stream
                .filter(m -> m.getValue() > 1)       // if map value > 1, duplicate element
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

    }
    
    public static <T> Set<T> findDuplicateByFrequency(List<T> list) {
        return list.stream().filter(i -> Collections.frequency(list, i) >1)
                .collect(Collectors.toSet());
    }

}

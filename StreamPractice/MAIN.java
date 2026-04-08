package StreamPractice;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.List;

public class MAIN {


    public static void main(String[]args){

        List<Integer> list=new ArrayList<>();
        for(int i=1; i<=10; i++)list.add(i);

        // sort a list

//        When .toList() is called:
//        Stream starts consuming elements from list
//        Passes them to sorted()
//        sorted():
//        stores all elements
//        sorts them
//        Sorted elements are passed to toList()
//        Final list is created
        List<Integer>sorted=list.stream().sorted().toList();

//        filter() and map() process elements one-by-one in a streaming (pipeline) fashion

        List<Integer>even=list.stream().filter(x->x%2==0).toList();
        List<Integer>square=list.stream().map(x->x*x).toList();
        for(int i=0; i<sorted.size(); i++) {
            System.out.println("Printing Sorted Element " + sorted.get(i));
        }
        for(int i=0; i<square.size(); i++){
            System.out.println("Printing Square Element "+square.get(i));
        }
        System.out.println();
        for(int i=0; i<even.size(); i++){
            System.out.println("Printing Even Element "+even.get(i));
        }

        // sum(),min(), max(),count()

//        Step-by-step:
//        list.stream()
//        Creates a stream of Integer
//        mapToInt(Integer::intValue)
//        Converts each Integer → primitive int
//        Now it becomes an IntStream
//                .sum()
//        Terminal operation
//        Iterates through elements and adds them

        int sum=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Printing Sum of all the Elements "+sum);
        int max=list.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("Printing Max Element "+max);
        int min=list.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println("Printing Min Element "+ min);
        List<Integer>distinctElement=list.stream().distinct().toList();

        // onlu distinct element
        for(int i=0; i<distinctElement.size(); i++){
            System.out.println("Printing Distinct Element "+distinctElement.get(i));
        }


    }
}

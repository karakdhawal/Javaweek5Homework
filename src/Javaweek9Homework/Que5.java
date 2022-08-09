package Javaweek9Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/*
Write a Java program to iterate through all elements in an array list using
Iterator.

 */
//import java.util.ArrayList;
//import java.util.ListIterator;

public class Que5 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList(Arrays.asList("Deep", "Dhawal", "Nayan", "Gaurang"));
        System.out.println("ArrayList: "+ list);
        System.out.print("array list using Iterator: ");
        ListIterator<String> ite = list.listIterator();
        while (ite.hasNext()){
            System.out.print(ite.next()+ ", ");
        }
    }


}

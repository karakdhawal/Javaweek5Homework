package Javaweek9Homework;

/*Write a Java program to retrieve an element (at a specified index) from a given
array list
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Que6 {

    public static void main(String[] args) {
        String [] names = {"Deep", "Dhawal", "Nayan", "Gaurang"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println(list);
        //list.get(2);
        System.out.println(list.get(1));


    }

}

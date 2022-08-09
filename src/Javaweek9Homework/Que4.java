package Javaweek9Homework;

/* Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Que4 {

    public static void main(String[] args) {
        List<String> colours = new ArrayList<String>();
            colours.add("white");
            colours.add("black");
            colours.add("yellow");
            colours.add("blue");
            for (String a: colours ){
                System.out.println(a);
            }

        //System.out.println(colours);
//        for (int i=0; i<colours.size(); i++ ) {
//            System.out.println(colours.get(i));
//
//        }

    }

}

package Javaweek9Homework;

/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names */

import java.util.ArrayList;
import java.util.Arrays;

public class Que7 {

    public static void main(String[] args) {
        String[] tubenames = {"piccadilly", "circle", "jubilee", "district"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(tubenames));
        System.out.println(list);

        if (list.isEmpty()){
            System.out.println("The ArrayList is Empty");
        } else {
            System.out.println("The ArrayList is not Empty");
        }


    }

}

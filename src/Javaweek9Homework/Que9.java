package Javaweek9Homework;

/* 9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map. */

import java.util.HashMap;

public class Que9 {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Dhawal", 1);
        people.put("Deep", 2);
        people.put("Dhrupesh", 3);
        people.put("Nayan", 4);
        people.put("Vishal", 5);
      //  System.out.println("HashMap : " +people);
        for (String a : people.keySet()) {
            System.out.println("key : "+ a + "" + " value : " + people.get(a));

        //for (String a : people.values()){
//            System.out.println(a);
        }

    }

}

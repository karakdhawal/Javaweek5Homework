package Javaweek9Homework;

/*10.Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name. */

import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.Map;

public class Que10 {

    public static void main(String[] args) {

        HashMap<String, String > zone1 = new HashMap<>();

        zone1.put("Greenpark", "Victoria/Piccadilly/Jubilee Line");
        zone1.put("Aldgate", "Metropolitan/Circle/Hammersmith & City Line");
        zone1.put("Oxford Circus", "Bakerloo/Victoria/Circle Line");
        zone1.put("Holborn", "Circle/Piccadilly Line");
        zone1.put("Leicester Square", "Bakerloo/Piccadilly Line");

        String key = "Oxford Circus";
        System.out.println("train stopping at "+ key + " are : ");
        for(Map.Entry<String, String> station : zone1.entrySet()){
            if (station.getKey() == key){
                System.out.println(station.getValue());
            }
        }


    }


}

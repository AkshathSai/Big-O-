package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {

    static String[] nemo = new String[]{"nemo"};

    static String[] largeArray = new String[10000];

    public static void main(String[] args) {

        //Simulating 10000 inputs
        Arrays.fill(largeArray,"nemo");

        Interf interf = (array) -> {

            LocalTime t0 = LocalTime.now();

            for (int i=0; i<array.length; i++) {
                System.out.println("Running!");
                if (array[i].equals("nemo")) {
                    System.out.println("Found Nemo!");
                    break;
                }
            }

            LocalTime t1 = LocalTime.now();

            System.out.println("Call to find nemo took " + Duration.between(t0, t1).getNano());
        };

        //interf.findNemo(nemo); //O(n)
        interf.findNemo(largeArray); //O(n)
    }


}
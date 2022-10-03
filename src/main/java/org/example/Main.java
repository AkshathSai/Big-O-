package org.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class Main {

    static String[] nemo = new String[]{"nemo"};

    public static void main(String[] args) {

        Interf interf = (array) -> {

            LocalTime t0 = LocalTime.now();

            for (int i=0; i<array.length; i++) {
                if (array[i].equals("nemo")) {
                    System.out.println("Found Nemo!");
                }
            }

            LocalTime t1 = LocalTime.now();

            System.out.println("Call to find nemo took " + Duration.between(t0, t1).getNano());
        };

        interf.findNemo(nemo);

    }


}
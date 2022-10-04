package org.example;

import org.example.functionalinterface.FindNemoInterface;
import org.example.functionalinterface.ProcessBoxesInterface;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {

    static String[] nemo = new String[]{"nemo"};
    static String[] largeArray = new String[10000];

    /** Worst case if 'nemo' is in the last
     *  Best case if 'nemo' is the first in the list O(1)
     */
    static String[] everyone = new String[]{"dory", "bruce", "marlin", "squirt", "hank",
                                            "grill", "nemo", "bloat", "nigel", "darla"};
    static Object[] boxes = new Object[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {

        //Simulating 10000 inputs
        Arrays.fill(largeArray,"nemo");

        FindNemoInterface findNemoInterface = array -> {

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

        /**If we just had nemo array the Big O would be O(1)
         * If we had the largeArray the Big O would be O(10000)
         */
        //interf.findNemo(nemo); //O(n)
        findNemoInterface.findNemo(everyone); //O(n)
        //interf.findNemo(largeArray); //O(n)


        ProcessBoxesInterface processBoxesInterface = boxes -> {
            System.out.println(boxes[0]);
            System.out.println(boxes[1]);
        };

        processBoxesInterface.logFirstTwoBoxes(boxes); //O(2) This function in total is running O(2)
    }


}
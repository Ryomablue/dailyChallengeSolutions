

import org.junit.Test;

import org.junit.runner.JUnitCore;

import org.junit.runner.Result;

import org.junit.runner.notification.Failure;

 

import static org.junit.Assert.*;

import java.util.Map;

import java.util.Map.Entry;

import java.util.HashMap;

 

public class Solution {


    public static int findUniqueDeliveryId(int[] deliveryIds) {

        Map<Integer, Integer> idsThatRepeat = new HashMap<>();

       

        // find the one unique ID in the array

        for (int deliveryId : deliveryIds){

            if (idsThatRepeat.containsKey(deliveryId)){

                idsThatRepeat.put(deliveryId, idsThatRepeat.get(deliveryId) + 1);

            } else {

                idsThatRepeat.put(deliveryId,1);

            }

        }

       

        for(Map.Entry<Integer, Integer> entry : idsThatRepeat.entrySet()) {

            if (entry.getValue() == 1){

                return entry.getKey();

            }

        }

       

        return 0;

    }

public class Solution2 {


    public static int findUniqueDeliveryId(int[] deliveryIds) {

        Map<Integer, Integer> idsThatRepeat = new HashMap<>();

        int uniqueDeliveryId = 0;

       

        // find the one unique ID in the array

        for (int deliveryId: deliveryIds) {

            uniqueDeliveryId ^= deliveryId;

        }

       

        return uniqueDeliveryId;

    }

    // tests

 

    @Test

    public void oneDroneTest() {

        final int expected = 1;

        final int actual = findUniqueDeliveryId(new int[] {1});

        assertEquals(expected, actual);

    }

 

    @Test

    public void uniqueIdComesFirstTest() {

        final int expected = 1;

        final int actual = findUniqueDeliveryId(new int[] {1, 2, 2});

        assertEquals(expected, actual);

    }

 

    @Test

    public void uniqueIdComesLastTest() {

        final int expected = 1;

        final int actual = findUniqueDeliveryId(new int[] {3, 3, 2, 2, 1});

        assertEquals(expected, actual);

    }

 

    @Test

    public void uniqueIdInTheMiddleTest() {

        final int expected = 1;

        final int actual = findUniqueDeliveryId(new int[] {3, 2, 1, 2, 3});

        assertEquals(expected, actual);

    }

 

    @Test

    public void manyDronesTest() {

        final int expected = 8;

        final int actual = findUniqueDeliveryId(new int[] {2, 5, 4, 8, 6, 3, 1, 4, 2, 3, 6, 5, 1});

        assertEquals(expected, actual);

    }

 

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(Solution.class);

        for (Failure failure : result.getFailures()) {

            System.out.println(failure.toString());

        }

        if (result.wasSuccessful()) {

            System.out.println("All tests passed.");

        }

    }

}

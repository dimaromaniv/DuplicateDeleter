package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] occurrences = new Integer[array.length];
        // create a loop which will check for occurr in array

        for (int i = 0; i < array.length; i++) {
            occurrences[i] = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    occurrences[i]++;
                }
            }
        }
        // create a loop which will set new size of array where we will put our result
        Integer newSize = 0;
        for (Integer occurr : occurrences) {
            if (occurr >= maxNumberOfDuplications) {
                newSize++;
            }
        }

        // iterate over original array and check is element is equel to occur ia array ,and than push tham to array result
        Integer[] result = new Integer[array.length - newSize];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (occurrences[i] < maxNumberOfDuplications) {
                result[newIndex] = array[i];
                newIndex++;
            }
        }
        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
       Integer [] occurrences = new Integer[array.length];

       for (int i = 0 ; i < array.length ; i++) {
           occurrences[i] = 0 ;
           for (int j = 0 ; j < array.length ; j++) {
               if (array[i].equals(array[j])) {
                   occurrences[i]++;
               }
           }
       }

       int newSize = 0 ;
       for (Integer occurr : occurrences) {
           if (occurr != exactNumberOfDuplications) {
               newSize++;
           }
       }
       Integer [] result = new Integer[newSize];
       int newIndex = 0;

       for (int i = 0 ; i < array.length; i++) {
           if (occurrences[i] != exactNumberOfDuplications) {
               result[newIndex] = array[i];
               newIndex++;
           }
       }
       return result;
    }
}

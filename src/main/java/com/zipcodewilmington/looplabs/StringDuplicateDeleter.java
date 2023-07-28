package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int[] occurrences = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            occurrences[i] = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    occurrences[i]++;
                }
            }
        }
        int newSize = 0;
        for (Integer occurr : occurrences) {
            if (occurr >= maxNumberOfDuplications) {
                newSize++;
            }
        }

        String[] result = new String[array.length - newSize];
        int indexNew = 0;
        for (int i = 0; i < array.length; i++) {
            if (occurrences[i] < maxNumberOfDuplications) {
                result[indexNew] = array[i];
                indexNew++;
            }
        }


        return result;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] occurrances = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            occurrances[i] = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    occurrances[i]++;
                }
            }
        }
        int newSize = 0;
        for (Integer occur : occurrances) {
            if (occur != exactNumberOfDuplications) {
                newSize++;
            }
        }

        String[] result = new String[newSize];
        int index = 0 ;

        for (int i = 0 ; i < array.length ; i ++) {
            if (occurrances[i] != exactNumberOfDuplications) {
                result[index] = array[i];
                index++;
            }
        }
        return  result;
    }
}

package com.company;

public class BubbleSort {
    public void bubbleSortAngka(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) // Looping through the array length
        {
            System.out.println("Iterasi :  " + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                System.out.println("Comparing " + array[j - 1] + " and " + array[j]);
                if (array[j - 1] > array[j]) {

                    // swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println(array[j] + " is greater than " + array[j - 1]);
                    System.out.println("Swapping Elements: New Array After Swap");
                    printArrayAngka(array);
                }

            }
        }

    }

    public void bubbleSortHuruf(String[] array){
        int n = array.length;
        String temp;
        for (int i = 0; i < n; i++) // Looping through the array length
        {
            System.out.println("Iterasi :  " + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                System.out.println("Comparing " + array[j - 1] + " and " + array[j]);
                if (array[j - 1].compareTo(array[j]) > 0) {

                    // swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println(array[j] + " is greater than " + array[j - 1]);
                    System.out.println("Swapping Elements: New Array After Swap");
                    printArrayHuruf(array);
                }

            }
        }
    }

    public void printArrayAngka(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

    }

    public void printArrayHuruf(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

    }
}

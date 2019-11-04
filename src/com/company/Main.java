package com.company;

public class Main {

    public static void main(String[] args) {
        BubbleSort test = new BubbleSort();
//
//        int[] array = {5, 6, 9, 2, 3, 1};
//        System.out.println("Array Sebelum di sort");
//        test.printArray(array);
//
//        test.bubbleSortAngka(array);
//        System.out.println("Array sesudah di sort");
//        test.printArray(array);

        String[] nama = {"b", "c", "d", "a"};
        System.out.println("Array sebelum di sort : ");
        test.printArrayHuruf(nama);

        test.bubbleSortHuruf(nama);
        System.out.println("Array sesudah di sort : ");
        test.printArrayHuruf(nama);



    }
}

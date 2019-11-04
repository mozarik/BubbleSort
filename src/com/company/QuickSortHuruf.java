package com.company;
/**
 * A simple example that uses QuickSort on a Sring Array in Java
 */
public class QuickSortHuruf {
    public static int partition(String[] stringArray, int idx1, int idx2) {
        String pivotValue = stringArray[idx1];
        while (idx1 < idx2) {
            String value1;
            String value2;
            while ((value1 = stringArray[idx1]).compareTo( pivotValue ) < 0) {
                System.out.println("\npivot : " +stringArray[idx1]);
                idx1 = idx1 + 1;
                System.out.println("indeks pivot + 1: " + stringArray[idx1]);
                printArray(stringArray);
            }
            while ((value2 = stringArray[idx2]).compareTo( pivotValue ) > 0) {
                System.out.println("\npivot : " +stringArray[idx2]);
                idx2 = idx2 - 1;
                System.out.println("indeks pivot - 1: " + stringArray[idx2]);
                printArray(stringArray);
            }
            stringArray[idx1] = value2;
            System.out.println("\npivot: " +stringArray[idx1]); //HAPUS
            System.out.println("pivot menggantikan elemen yang dibandingkan yaitu "+stringArray[idx2]);
            System.out.println("hasilnya ada variable yang sama:");
            printArray(stringArray);

            stringArray[idx2] = value1;
            System.out.println("\nkarena sama , posisi pivot yang sebelum nya ada di kanan digantikan oleh elemen perbandingan:" +stringArray[idx2]);
            System.out.println("hasilnya:");
            printArray(stringArray);
        }
        return idx1;
    }
    public static void QuicksortString(String[] stringArray, int idx1, int idx2) {
        if (idx1 >= idx2) {
            // we are done
            return;
        }
        int pivotIndex = partition(stringArray, idx1, idx2);
        QuicksortString(stringArray, idx1, pivotIndex);
        QuicksortString(stringArray, pivotIndex+1, idx2);
    }
    public static void QuicksortString(String[] stringArray) {
        QuicksortString(stringArray, 0, stringArray.length - 1);
    }
    static void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+", ");
        System.out.println();
    }
    public static void main( String[] args )
    {
        String[] mySampleStringArray = { "Randy", "Dimas", "Alfin", "Wawan", "Babi", "Yey", "Cicak", "Xhontol" };
        QuicksortString( mySampleStringArray );
        printArray(mySampleStringArray);
    }
}
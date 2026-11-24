/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sortingalgorithms_activity;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class SortingAlgorithms {
    // 1. Bubble Sort
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 2. Selection Sort
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 3. Insertion Sort
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Main Method
    public static void main(String[] args) {

        int[] originalArray = {
            64, 25, 12, 22, 11, 90, 34, 5, 78, 43
        };

        // Create separate copies
        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);

        // Display Original Array
        System.out.println("Original Array: "
                + Arrays.toString(originalArray));

        // Bubble Sort
        bubbleSort(bubbleArray);
        System.out.println("\nBubble Sort: "
                + Arrays.toString(bubbleArray));

        // Selection Sort
        selectionSort(selectionArray);
        System.out.println("Selection Sort: "
                + Arrays.toString(selectionArray));

        // Insertion Sort
        insertionSort(insertionArray);
        System.out.println("Insertion Sort: "
                + Arrays.toString(insertionArray));
    }
    
}

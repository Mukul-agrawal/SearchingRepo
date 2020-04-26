package main;

import binary.BinarySearch;
import jump.JumpSearch;
import linear.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int noOfElements = scanner.nextInt();
        int[] array = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print("Array : ");
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the element you want to search : ");
        int search = scanner.nextInt();
        System.out.println("Press 1 for Linear search : ");
        System.out.println("Press 2 for Binary search : ");
        System.out.println("Press 3 for Jump search : ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                LinearSearch linearSearch = new LinearSearch();
                System.out.println("Press 1 for simple linear search : ");
                System.out.println("Press 2 for recursive linear search : ");
                int linearOption = scanner.nextInt();
                switch (linearOption) {
                    case 1:
                        int result = linearSearch.linear(array, search);
                        if (result == -1) {
                            System.out.println("Element not found!");
                        } else
                            System.out.println("Element is found : " + result);
                        break;
                    case 2:
                        result = linearSearch.recursiveLinear(array, search, 0);
                        if (result == -1) {
                            System.out.println("Element not found!");
                        } else
                            System.out.println("Element is found : " + result);
                        break;
                }
                break;
            case 2:
                BinarySearch binarySearch = new BinarySearch();
                Arrays.sort(array);
                int result = binarySearch.recursiveBinary(array, search, 0, array.length - 1);
                if (result == -1) {
                    System.out.println("Element not found!");
                } else
                    System.out.println("Element is found : " + result);
                break;
            case 3:
                JumpSearch jumpSearch = new JumpSearch();
                Arrays.sort(array);
                result = jumpSearch.jumpSearch(array, search);
                if (result == -1) {
                    System.out.println("Element not found!");
                } else
                    System.out.println("Element is found : " + result);
                break;
        }
    }
}

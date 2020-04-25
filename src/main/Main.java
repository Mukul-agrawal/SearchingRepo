package main;

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
    }
}

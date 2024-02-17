import java.io.*;
import java.util.*;

public class Input {

    // Method to get an array input from user
    public static double[] inputArray() {
        Scanner scan = new Scanner(System.in);

        // Entering the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        // Create an array of the specified size
        double[] numbersArray = new double[size];

        // Prompt the user to enter each element of the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbersArray[i] = scan.nextDouble();
        }

        return numbersArray;
    }
}
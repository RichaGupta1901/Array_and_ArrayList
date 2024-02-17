import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Input input = new Input();

		int[] array = input.inputArray();

		int k = findIndexOfNearestNumbers(array);

		System.out.println("The index of the 1st number of the 2 numbers whose difference is least is: ");
		System.out.println(k);
	}

	public static int findIndexOfNearestNumbers(int[] array) {
		int diff = Integer.MAX_VALUE;
		int k = 0;

		for (int j = 0; j < array.length - 1; j++) {
			if (Math.abs(array[j] - array[j + 1]) < diff) {
				diff = Math.abs(array[j] - array[j + 1]);
				k = j;
			}
		}

		return k;
	}

}

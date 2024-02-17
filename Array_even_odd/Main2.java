import java.io.*;
import java.util.*;

public class Main2 {
	public static void main(String[] args) {

		Input input = new Input();

		int index_even = 0;
		int index_odd = 0;

		double[] array = input.inputArray();
		double[] even = new double[array.length];
		double[] odd = new double[array.length];

		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 == 0) {
				even[index_even] = array[j];
				index_even++;
			}

			else {
				odd[index_odd] = array[j];
				index_odd++;
			}
		}

		System.out.println("Even Numbers are:");
		for (int k = 0; k < index_even; k++) {
			System.out.println(" " + even[k]);
		}

		System.out.println("Odd Numbers are:");
		for (int l = 0; l < index_odd; l++) {
			System.out.println(" " + odd[l]);
		}

	}
}

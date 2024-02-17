import java.util.*;

//Array To ArrayList Copy

public class Main {
    public static void main(String[] args) {
        // Convert array to ArrayList (independent copy)
        Double[] array = { 1.2, 2.5, 3.8, 4.1, 5.7 };
        ArrayList<Double> arrayList = new ArrayList<>(array.length);

        // Using a loop to copy elements
        for (Double element : array) {
            arrayList.add(element);
        }

        // Print the ArrayList
        System.out.println("ArrayList: \n" + arrayList);

        // Converting ArrayList to Array
        Double[] array2 = arrayList.toArray(new Double[0]);

        // Displaying the elements of the array
        System.out.println("Array: ");
        for (int i = 0; i < array2.length; i++) {
            Double a = array2[i];
            System.out.print(a + ", ");
        }
    }
}

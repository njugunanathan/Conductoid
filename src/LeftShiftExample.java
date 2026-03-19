import java.util.Arrays;

public class LeftShiftExample {

	    public static void main(String[] args) {
	        // Create an array of integers
	        int[] numbers = {42, 17, 93, 8, 56, 23};

	        // Print the original array
	        System.out.println("Original Array: " + Arrays.toString(numbers));

	        // Sort the array in ascending order
	        Arrays.sort(numbers);

	        // Print the sorted array
	        System.out.println("Sorted Array (Ascending): " + Arrays.toString(numbers));

	        // Sort the array in descending order (using a custom approach)
	        int[] descending = new int[numbers.length];
	        for (int i = 0; i < numbers.length; i++) {
	            descending[i] = numbers[numbers.length - 1 - i];
	        }

	        // Print the sorted array in descending order
	        System.out.println("Sorted Array (Descending): " + Arrays.toString(descending));
	    }
	}


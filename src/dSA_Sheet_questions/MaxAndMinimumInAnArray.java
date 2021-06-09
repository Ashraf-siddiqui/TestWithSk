package dSA_Sheet_questions;

// Find the maximum and minimum element in an array
public class MaxAndMinimumInAnArray {

	public static int Maximum(int[] array) {
		int max = array[0];

		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] > max) {

				max = array[i];
			}

		}

		return max;
	}

	public static int Minimum(int[] array) {

		int min = array[0];

		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] < min) {

				min = array[i];
			}

		}

		return min;

	}

	public static void main(String[] args) {

		int array[] = new int[] { 2, 7, 8, 5, 4, 9 };
		System.out.println("Maximum element---->"+Maximum(array));

		System.out.println("Maximum element---->"+Minimum(array));

	}

}

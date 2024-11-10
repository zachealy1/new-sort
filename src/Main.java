public class Main {
	public static int[] newSort(int[] A) {
		int i = 0;
		int n = A.length;
		int whileLoop = 1;
		while (i < n) {
			whileLoop++;
			if (i == 0) {
				i = i + 1;
			}
			if (A[i] >= A[i - 1]) {
				i = i + 1;
			} else {
				int temp = A[i];
				A[i] = A[i - 1];
				A[i - 1] = temp;
				i = i - 1;
			}
		}
		System.out.println("While loop ran " + whileLoop + " times");
		return A;
	}

	public static String printArray(int[] A) {
		StringBuilder result = new StringBuilder();
		for (int num : A) {
			result.append(num).append(" ");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		int[] arr = {3, 5, 24, 8, 87, 63, 25, 4, 12, 17, 1};
		int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] sortedArr = newSort(arr2);
		for (int num : sortedArr) {
			System.out.print(num + " ");
		}
	}
}
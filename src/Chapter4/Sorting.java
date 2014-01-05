public class Sorting
{
	public static void main(String[] args)
	{
		int[] arrayToSort = {9, 7, 2, 19, 3, 44, 67};

		for (int i = 0;i < arrayToSort.length; i++) {
			System.out.print(arrayToSort[i] + " ");
		}
		System.out.println();

		mergeSort(arrayToSort, 0, arrayToSort.length - 1);

		for (int i = 0;i < arrayToSort.length; i++) {
			System.out.print(arrayToSort[i] + " ");
		}
		System.out.println();

		/*int[] sorted = selectionSort(arrayToSort);
		for (int i = 0;i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();*/
	}

	public static int[] selectionSort(int[] input)
	{
		int n = input.length;
		int[] returnArray = new int[n];
		for (int i = 0; i < n; i++) {
			int minIndex = 0;
			int minimum = Integer.MAX_VALUE;
			for(int j = 0; j < n; j++) {
				if (input[j] < minimum) {
					minimum = input[j];
					minIndex = j;
				}
			}
			returnArray[i] = minimum;
			input[minIndex] = Integer.MAX_VALUE;
		}
		return returnArray;
	}

	public static void mergeSort(int[] input, int low, int high)
	{
		if (low < high) {
			int middle = (low + high) / 2;
			mergeSort(input, low, middle);
			mergeSort(input, middle + 1, high);
			merge(input, low, middle, high);
		}
	}

	public static void merge(int[] input, int low, int middle, int high)
	{
		int left = low;
		int right = middle + 1;
		while (left <= middle && right <= high) {
			if (input[left] > input[right]) {
				int temp = input[right];
				for (int i = right - 1; i >= left; i--) {
					input[i + 1] = input[i];
				}
				input[left] = temp;

				right++;
				middle++;
			}
			left++;
		}
	}

	public static void quickSort(int[] input)
	{
		quickSortHelper(0, input.length - 1, input);
	}

	public static void quickSortHelper(int low, int high, int[] input)
	{
		int i = low;
		int j = high;
		int pivot = input[low + (high - low)/2];
		while (i <= j) {
			while (input[i] < pivot) {
				i++;
			}
			while (input[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}

			if (low < j) {
				quickSortHelper(low, j, input);
			}
			if (high > i) {
				quickSortHelper(i, high, input);
			}
		}
	}
}
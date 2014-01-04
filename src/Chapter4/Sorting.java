public class Sorting
{
	public static void main(String[] args)
	{
		int[] arrayToSort = {1, 7, 2, 19, 3, 44, 67};

		for (int i = 0;i < arrayToSort.length; i++) {
			System.out.print(arrayToSort[i] + " ");
		}
		System.out.println();

		int[] sorted = selectionSort(arrayToSort);
		for (int i = 0;i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();
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
}
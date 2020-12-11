package lab7Strategy;

public class SelectionSort implements Sorting{
	@Override
	public void doSorting(short[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Error! Array is empty!");
		}

		int n = arr.length;
		for (int i = n - 1; i >= 0; i--)
		{
			int maxIndex = 0;
			for (int j = 0; j < i + 1; j++)
			{
				if (arr[j] > arr[maxIndex])
				{
					maxIndex = j;
				}
			}
			short tmp = arr[maxIndex];
			arr[maxIndex] = arr[i];
			arr[i] = tmp;
		}
	}
}

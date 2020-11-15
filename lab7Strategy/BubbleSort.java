package lab7Strategy;

public class BubbleSort implements Sorting{
	@Override
	public void doSorting(short[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
		{
			for (int  j = 1; j < n; j++)
			{
				if (arr[j] < arr[j-1])
				{
					short tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
}

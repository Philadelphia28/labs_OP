package lab7Strategy;

public class InsertionSort implements Sorting{
	@Override
	public void doSorting(short[] arr) {
		int n = arr.length;
	    for (int i = 0;i < n;i ++)
	    {
			int j = i-1;
			short x = arr[i];
			while (j >= 0 && arr[j] > x)
	        {
	            arr[j + 1]=arr[j];
				j-=1;
	        }
			arr[j + 1] = x;
	    }
	}
}
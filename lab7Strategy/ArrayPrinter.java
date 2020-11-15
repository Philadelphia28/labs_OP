package lab7Strategy;

public class ArrayPrinter implements Printer{
	@Override
	public void printArray(short arr[])
	{
		for (short i : arr)
			System.out.print(i + "  ");
		System.out.println();
	}
}

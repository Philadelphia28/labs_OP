package lab7Strategy;

public class Main {

	public static void main(String[] args) {
		try {
			Printer printer = new ArrayPrinter();

			short[] arr1 = new short[]{5, 6, 23, 121, 4, 6};
			System.out.println("Test 1");
			printer.printArray(arr1);
			test(arr1);
			System.out.print('\n');

			short[] arr2 = new short[]{13, 1, 12, 19, 54, 3, 46, 33, 7};
			System.out.println("Test 2");
			printer.printArray(arr2);
			test(arr2);
			System.out.print('\n');

			short[] arr3 = new short[]{};
			System.out.println("Test 3");
			printer.printArray(arr3);
			test(arr3);
			System.out.print('\n');
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void test(short arr[])
	{
		if (arr.length == 0) {
			throw new IllegalArgumentException("Error! Array is empty!");
		}

		DataProcessor dp1 = new DataProcessor(new BubbleSort(), new ArrayPrinter());
		DataProcessor dp2 = new DataProcessor(new InsertionSort(), new ArrayPrinter());
		DataProcessor dp3 = new DataProcessor(new SelectionSort(), new ArrayPrinter());
		
		short[] arr1 = arr.clone();
		short[] arr2 = arr.clone();
		short[] arr3 = arr.clone();
		
		System.out.print("Bubble sort:\n");
		dp1.process(arr1);
		
		System.out.print("Insertion sort:\n");
		dp2.process(arr2);
		
		System.out.print("Selection sort:\n");
		dp3.process(arr3);
	}

}

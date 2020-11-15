package lab7Strategy;

public class DataProcessor {
	private Sorting sorter;
	private Printer printer;
	
	public DataProcessor(Sorting sort, Printer print)
	{
		this.sorter = sort;
		this.printer = print;
	}
	
	public void process(short[] arr)
	{
		sorter.doSorting(arr);
		printer.printArray(arr);
	}
}

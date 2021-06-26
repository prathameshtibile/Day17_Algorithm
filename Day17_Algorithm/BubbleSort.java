package Day17_Algorithm;

public class BubbleSort {
	
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		
		u.print("\n Enter the number of elements you want to insert");
		int n= u.getInt();
		
		u.print("\n Enter Elements :");
		int arr[]= u.readArray(n);
		
		//u.print("hi...............");
//		u.print("Enter Words for an array\n\n");
//		String line = u.getLine();
//		String wordList[]= line.split(" ");
		u.print("\nUnsorted List is \n");
		u.printArray(arr);
		//u.print("hi...............");
		arr=Utility.bubbleSort(arr);
		u.print("\n \nSorted List is \n");
		u.printArray(arr);

	}

}

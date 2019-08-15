package algorithms;

public class BinarySearch extends BinarySort 
{
	/*
	 * Before we even starting searching our tree 
	 * the input must me sorted. First step is to
	 * run the input through the sorting function in the 
	 * BinarySort class to be sure that the data is sorted
	 * 
	 * 
	 * Author: Peter Okello
	 * June 11, 2019
	 */
	
	private int target;
	private int left; 
	private int right;
	private int midpoint;
	
	public BinarySearch(int[] array, int searchElement) 
	{
		left = array.length - (array.length);
		right = array.length;
		target = searchElement;
		midpoint = (right - left) / 2;
		
		
		System.out.println("Before sort");
		printArray(array);
		
		System.out.println("\nleft: " +left +"\n"
				+"right: " +right +"\n"
				+"target: " +target +"\n"
				+"midpoint: " +midpoint+"\n");
		
		cleanse(array);
		
		System.out.println("After sort ");
		printArray(array);

		binarySearch(array);
		
	}

	
	//not correct, have to re-write search algorithm
	void binarySearch(int[] _sortedArray)
	{
		int[] _newArray = _sortedArray;
		int temp;
		
		//if our searching target is less than midpoint re-partition the array
		if(_newArray[target] < _newArray[midpoint])
		{
			left = _newArray[0];
			right = midpoint;
			midpoint = (right - left) / 2;
			System.out.println("Target is less than midpoint"
					+ ", new midpoint = " +_newArray[midpoint]
							+"\n");
			
			System.out.println("\nleft: " +left +"\n"
					+"right: " +right +"\n"
					+"target: " +target +"\n"
					+"midpoint: " +midpoint);
		}
		else if(_newArray[target] > _newArray[midpoint])
		{
			left = midpoint;
			right = _newArray.length - 1;
			midpoint = (right - left) / 2;
			System.out.println("Target is greater than midpoint"
					+ ", new midpoint  = " +_newArray[midpoint]
							+"\n");
			
			System.out.println("\nleft: " +left +"\n"
					+"right: " +right +"\n"
					+"target: " +target +"\n"
					+"midpoint: " +midpoint);
		}
		else 
		{
			System.out.println("Error!" );
		}
		
	}
	
	//sort the input
	int[] cleanse(int[] array)
	{
		int[] _array = array;
		BinarySort binarySort = new BinarySort();
		
		binarySort.sort(_array);
		
		return _array;
	}
	
	void printArray(int[] array)
	{
		int[] _array = array;
		int counter = 0;
		for (int i = 0; i < _array.length  ; i++) 
		{
			
			System.out.println(_array[counter]);
			counter++;
		}
	}
	
	public static void main(String[] args) 
	{
		int[] array = {4,7,2,9,2,78};
		BinarySearch bs  = new BinarySearch(array, 5);
	}

}

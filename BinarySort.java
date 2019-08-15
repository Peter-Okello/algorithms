package algorithms;

public class BinarySort 
{	
	/*
	 * 
	 * The main function of this class 
	 * is to sort an array of integer inputs
	 * from the smallest to the largest
	 * 
	 * Author: Peter Okello
	 * June 11, 2019
	 * 
	 * */
	
	
	
	public BinarySort()
	{
		
	}
	
	public int[] sort(int[] array)
	{
		int _array[] = array;
		int temp;
		int counter = 0;
		//System.out.println("sort ");

		for (int left = 0; left < _array.length - 1; left++) 
		{
			for (int right = array.length - 1; right > left; right--) 
			{
				if(_array[left] > _array[right])
				{
					 temp = _array[left];
					 _array[left] = _array[right];
					 _array[right] = temp;
					 
				}
			}

			//System.out.println(_array[counter]);
			//counter++;
		}
		
		return _array;
		
	}
	

	public static void main(String[] args) 
	{
		int[] arrayInp = {-1,5,3,5,3,2,14,17,0,8}; 
		BinarySort binarySort = new BinarySort();
		binarySort.sort(arrayInp);
	}

}

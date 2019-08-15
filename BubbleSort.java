/**
 * 
 */
package algorithms;

/**
 * @author peterokello
 * 
 * This is an implementation of the bubble sort algorithm that
 * sort an array of random numbers
 *
 */
public class BubbleSort 
{
	int[] numbers_array;
		
	public BubbleSort()
	{
		numbers_array = new int[10];
		
		//initialize all elements in array
				
		numbers_array[0] = random_numbers(-100, 100);
		numbers_array[1] = random_numbers(-100, 100);
		numbers_array[2] = random_numbers(-100, 100);
		numbers_array[3] = random_numbers(-100, 100);
		numbers_array[4] = random_numbers(-100, 100);
		numbers_array[5] = random_numbers(-100, 100);
		numbers_array[6] = random_numbers(-100, 100);
		numbers_array[7] = random_numbers(-100, 100);
		numbers_array[8] = random_numbers(-100, 100);
		numbers_array[9] = random_numbers(-100, 100);

	}
	
	//randomize each number while setting a min & max
	public int  random_numbers(int min, int max)
	{
		int number;
		int range = Math.abs(max - min) + 1;
		number  = (int)(Math.random() * range);
		
		return number;
	}
	
	void printArray()
	{
		System.out.println("Array before sort \n");
		
		for (int i = 0; i < numbers_array.length ; i++) 
		{
			//print every element in  array before sort but after randomizing
			System.out.println(numbers_array[i]);
			
		}
		
		
		System.out.println("\nArray after sort\n");

		//pass array to sort function to sort elements in array
		sort(numbers_array);
		
		for (int i = 0; i < numbers_array.length ; i++) 
		{
			//print every element in  array after sort but after randomizing
			System.out.println(numbers_array[i]);
			
		}
		
		
		
		
		
	}
	
	//sort function which accepts an array type 
	void sort(int[] temp_array)
	{ 
		
		int array_length = temp_array.length;
		int temp_variable;
		
		
		
		for (int i = 0; i < array_length; i++) 
		{
			for (int j = 0; j < array_length -1; j++)
			{
				
				
				if(temp_array[j+1] < temp_array[j])
				{
					temp_variable = temp_array[j];
					temp_array[j] = temp_array[j+1];
					temp_array[j+1] = temp_variable;
				}
		
		}
			}
	}
	
	
	public static void main(String[] args) 
	{
		BubbleSort bs = new BubbleSort();
		bs.printArray();
	}

}

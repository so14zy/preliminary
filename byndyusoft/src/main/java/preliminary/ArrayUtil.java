package preliminary;

public class ArrayUtil
{
	public static int sumTwoMinValues(int[] array)
	{
		if (array == null)
			throw new NullPointerException();
		
		if (array.length < 2)
			throw new IllegalArgumentException("Array length is less than 2");
		
		int min1 = array[0];
		int min2 = array[1];
		
		if (min2 < min1)
		{
			int temp = min2;
			min2 = min1;
			min1 = temp;
		}
		
		for (int i = 2; i < array.length; ++i)
		{
			if (array[i] < min2)
			{
				if (array[i] < min1)
				{
					min2 = min1;
					min1 = array[i];
				}
				else
				{
					min2 = array[i];
				}
			}
			
			
		}
		
		if (min1 > 0 && min2 > 0 && Integer.MAX_VALUE - min1 < min2)
			throw new ArithmeticException("The sum is too large");
		
		if (min1 < 0 && min2 < 0 && Integer.MIN_VALUE - min1 > min2)
			throw new ArithmeticException("The sum is too small");
		
		return min1 + min2;
	}
}

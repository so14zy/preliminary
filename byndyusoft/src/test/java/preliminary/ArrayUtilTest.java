package preliminary;

import java.util.Arrays;

import org.junit.Test;

import org.junit.Assert;

public class ArrayUtilTest
{
	@Test(expected = NullPointerException.class)
	public void givenNullArray_whenSumTwoMinValues_thenThrowNullPointerException()
	{
		int[] array = null;
		
		ArrayUtil.sumTwoMinValues(array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void givenArrayWithLengthLessThanTwo_whenSumTwoMinValues_thenThrowIllegalArgumentException()
	{
		int[] array = {};
		
		ArrayUtil.sumTwoMinValues(array);
	}
	
	@Test
	public void givenOrderedArrayWithLengthEqualsTwo_whenSumTwoMinValues_thenReturnSum()
	{
		int[] array = {10, 20};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
		int expectedSum = array[0] + array[1];
		
		Assert.assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void givenReverseOrderedArrayWithLengthEqualsTwo_whenSumTwoMinValues_thenReturnSum()
	{
		int[] array = {20, 10};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
		int expectedSum = array[0] + array[1];
		
		Assert.assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void givenArrayWithIntegerMinValueAndMaxValueAsMinValues_whenSumTwoMinValues_thenReturnSum()
	{
		int[] array = {Integer.MIN_VALUE, Integer.MAX_VALUE};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
		int expectedSum = array[0] + array[1];
		
		Assert.assertEquals(expectedSum, actualSum);
	}
	
	@Test(expected = ArithmeticException.class)
	public void givenArrayWithIntegerMaxValueAndSomePositiveValueAsMinValues_whenSumTwoMinValues_thenThrowArithmeticException()
	{
		int[] array = {Integer.MAX_VALUE, 2};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
	}
	
	@Test
	public void givenArrayWithIntegerMaxValueAndSomeNegativeValueAsMinValues_whenSumTwoMinValues_thenReturnSum()
	{
		int[] array = {Integer.MAX_VALUE, -2};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
		
		Arrays.sort(array);
		int expectedSum = array[0] + array[1];
		
		Assert.assertEquals(expectedSum, actualSum);
	}

	@Test(expected = ArithmeticException.class)
	public void givenArrayWithIntegerMinValueAndSomeNegativeValueAsMinValues_whenSumTwoMinValues_thenThrowArithmeticException()
	{
		int[] array = {Integer.MIN_VALUE, -2};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
	}
	
	@Test
	public void givenArrayWithIntegerMinValueAndSomePositiveValueAsMinValues_whenSumTwoMinValues_thenReturnSum()
	{
		int[] array = {Integer.MIN_VALUE, 2};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
		int expectedSum = array[0] + array[1];
		
		Assert.assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void givenOrderedArray_whenSumTwoMinValues_thenReturnSum()
	{
		int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
		int expectedSum = array[0] + array[1];
		
		Assert.assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void givenReverseOrderedArray_whenSumTwoMinValues_thenReturnSum()
	{
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
		
		Arrays.sort(array);
		int expectedSum = array[0] + array[1];
		
		Assert.assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void givenArray_whenSumTwoMinValues_thenReturnSum()
	{
		int[] array = {9, -50, -24, 4, 33, 39, 39, 47, -39, 40, 5, 37, 43, -11, 16};
		
		int actualSum = ArrayUtil.sumTwoMinValues(array);
		
		Arrays.sort(array);
		int expectedSum = array[0] + array[1];
		
		Assert.assertEquals(expectedSum, actualSum);
	}
	
}


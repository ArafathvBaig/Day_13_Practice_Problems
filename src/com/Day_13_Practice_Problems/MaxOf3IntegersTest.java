package com.Day_13_Practice_Problems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

class MaxOf3IntegersTest 
{
	@Test
	void given3integersCompareToandGetTheMaximumWhichIsAtPosition1() 
	{
		MaxOf3Integers rv = new MaxOf3Integers();
		Integer a = 30;
		Integer b = 10;
		Integer c = 20;
		int result = rv.maxOfThree(a,b,c);
		Assert.assertEquals(30, result);
	}
	@Test
	void given3integersCompareToandGetTheMaximumWhichIsAtPosition2() 
	{
		MaxOf3Integers rv = new MaxOf3Integers();
		Integer a = 10;
		Integer b = 30;
		Integer c = 20;
		int result = rv.maxOfThree(a,b,c);
		Assert.assertEquals(30, result);
	}
	@Test
	void given3integersCompareToandGetTheMaximumWhichIsAtPosition3() 
	{
		MaxOf3Integers rv = new MaxOf3Integers();
		Integer a = 10;
		Integer b = 20;
		Integer c = 30;
		int result = rv.maxOfThree(a,b,c);
		Assert.assertEquals(30, result);
	}
}
















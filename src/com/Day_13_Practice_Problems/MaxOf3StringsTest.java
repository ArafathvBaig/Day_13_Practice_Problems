package com.Day_13_Practice_Problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MaxOf3StringsTest 
{
	@Test
	void given3StringsCompareToandGetTheMaximumWhichIsAtPosition1() 
	{
		MaxOf3Strings rv = new MaxOf3Strings();
		String a = "Banana";
		String b = "Apple";
		String c = "Peach";
		String result = rv.maxOfThreeStrings(a,b,c);
		Assert.assertEquals(a, result);
	}
	@Test
	void given3StringsCompareToandGetTheMaximumWhichIsAtPosition2() 
	{
		MaxOf3Strings rv = new MaxOf3Strings();
		String a = "Apple";
		String b = "Banana";
		String c = "Peach";
		String result = rv.maxOfThreeStrings(a,b,c);
		Assert.assertEquals(b, result);
	}
	@Test
	void given3StringsCompareToandGetTheMaximumWhichIsAtPosition3() 
	{
		MaxOf3Strings rv = new MaxOf3Strings();
		String a = "Apple";
		String b = "Peach";
		String c = "Banana";
		String result = rv.maxOfThreeStrings(a,b,c);
		Assert.assertEquals(c, result);
	}
}











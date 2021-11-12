package com.Day_13_Practice_Problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MaxOf3FloatsTest 
{
	@Test
	void given3FloatsCompareToandGetTheMaximumWhichIsAtPosition1() 
	{
		MaxOf3Floats rv = new MaxOf3Floats();
		Float a = 32.54321f;
		Float b = 12.54321f;
		Float c = 22.54321f;
		Float result = rv.maxOfThreeFloats(a,b,c);
		Assert.assertEquals(32.54321f, result);
	}
	@Test
	void given3FloatsCompareToandGetTheMaximumWhichIsAtPosition2() 
	{
		MaxOf3Floats rv = new MaxOf3Floats();
		Float a = 12.54321f;
		Float b = 32.54321f;
		Float c = 22.54321f;
		Float result = rv.maxOfThreeFloats(a,b,c);
		Assert.assertEquals(32.54321f, result);
	}
	@Test
	void given3FloatsCompareToandGetTheMaximumWhichIsAtPosition3() 
	{
		MaxOf3Floats rv = new MaxOf3Floats();
		Float a = 12.54321f;
		Float b = 22.54321f;
		Float c = 32.54321f;
		Float result = rv.maxOfThreeFloats(a,b,c);
		Assert.assertEquals(32.54321f, result);
	}

}







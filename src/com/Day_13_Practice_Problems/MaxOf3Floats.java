package com.Day_13_Practice_Problems;

public class MaxOf3Floats 
{
	public float maxOfThreeFloats(float a, float b, float c)
	{
		int d= Float.compare(a, b);
	    
	    if (d==0)
	    {
	    	d= Float.compare(b, c);
	    	 if (d==0)
			    {
			    	return b;
		        }
			    else if(d==1)
			    {
			    	return b;
			    }
			    else 
			    {
			    	return c;
			    }
        }
	    else if(d==1)
	    {
	    	d= Float.compare(a, c);
	    	if (d==0)
		    {
		    	return a;
	        }
		    else if(d==1)
		    {
		    	return a;
		    }
		    else 
		    {
		    	return c;
		    }
	    }
	    else 
	    {
	    	d= Float.compare(b, c);
	    	if (d==0)
		    {
		    	return b;
	        }
		    else if(d==1)
		    {
		    	return b;
		    }
		    else 
		    {
		    	return c;
		    }
	    }
	}
	public static void main(String[] args)
	{
		MaxOf3Floats rv = new MaxOf3Floats();
		Float a = 12.54321f;
		Float b = 22.54321f;
		Float c = 32.54321f;
		Float d = rv.maxOfThreeFloats(a,b,c);
		System.out.println("Maximum of Three is: "+d);
	}
}


















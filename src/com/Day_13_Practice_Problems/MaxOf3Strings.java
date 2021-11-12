package com.Day_13_Practice_Problems;

public class MaxOf3Strings
{
	public String maxOfThreeStrings(String a, String b, String c)
	{
		int d= a.compareTo(b);
	    System.out.println(d);
	    if (d==0)
	    {
	    	d= b.compareTo(c);
	    	System.out.println(d);
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
	    	d= a.compareTo(c);
	    	System.out.println(d);
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
	    	d= b.compareTo(c);
	    	
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
		MaxOf3Strings rv = new MaxOf3Strings();
		String a = "Apple";
		String b = "Peach";
		String c = "Banana";
		String result = rv.maxOfThreeStrings(a,b,c);
		System.out.println("Maximum of Three is: "+result);
	}
}












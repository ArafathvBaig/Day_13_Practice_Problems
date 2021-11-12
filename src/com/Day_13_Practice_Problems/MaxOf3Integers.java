package com.Day_13_Practice_Problems;

public class MaxOf3Integers 
{
	public int maxOfThree(int a,int b,int c)
	{
		 int d= Integer.compare(a, b);
		    
		    if (d==0)
		    {
		    	d= Integer.compare(b, c);
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
		    	d= Integer.compare(a, c);
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
		    	d= Integer.compare(b, c);
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
		MaxOf3Integers rv = new MaxOf3Integers();
		Integer a = 10;
		Integer b = 20;
		Integer c = 30;
		int d = rv.maxOfThree(a,b,c);
		System.out.println("Maximum of Three is: "+d);
	}
}

















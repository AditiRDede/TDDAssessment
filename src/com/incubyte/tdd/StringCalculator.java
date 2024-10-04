package com.incubyte.tdd;

public class StringCalculator
{
	public static void main(String [] args)
	{
		System.out.println("String Calculator");
	}
	// Unit method
	public int add(String numbers)
	{
		int sum=0;
		//input string is empty
		if(numbers.isEmpty() || numbers==null )
		{
			return 0;
		}
		//default delimiter
		String delimiter=",";
		//support to multiple delimiter
		if(numbers.startsWith("//"))
		{
			 delimiter=numbers.substring(2,3);
			 numbers=numbers.substring(4,numbers.length());
		}
	    String [] elements=numbers.split(delimiter);
		for(String number:elements)
		{
			//allow newline between numbers
			String shortlist[]=number.split("\n");
			if(shortlist.length>0)
			{
				for(String no:shortlist)
				{
					sum=sum+Integer.parseInt(no);
				}
			}
			else
			{
				sum=sum+Integer.parseInt(number);
			}
		}// primary for loop of input string
		return sum;
	}//add

}//class

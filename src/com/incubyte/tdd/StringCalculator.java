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
		String delimiter=",";
		String [] elements=numbers.split(delimiter);
		for(String number:elements)
		{
			sum=sum+Integer.parseInt(number);
		}
		return sum;
		}//add

}//class

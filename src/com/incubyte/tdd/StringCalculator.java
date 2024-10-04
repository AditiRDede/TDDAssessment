package com.incubyte.tdd;
import java.util.*;
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
	    ArrayList<Integer> numlist=getNumbersList(elements);
	    //negative num check
	    try
	    {
	    	ArrayList<Integer> negativeNumberList=negativenumCheck(numlist);
	    	if(negativeNumberList.size()>0)
	    	{
	    		throw new IllegalArgumentException("negative numbers not allowed " + negativeNumberList);
	    	}
	    	System.out.println("parsed list of numbers : "+numlist);
	    	//add elements : 
	    	for(Integer number : numlist)
	    	{
	    		sum=sum+number;
	    	}
	     }
	    catch(IllegalArgumentException e)
	    {
	    	System.out.println("Caught exception: " + e.getMessage());
	    }
	    return sum;
	}//add
	public static ArrayList<Integer> getNumbersList(String [] elementsarray)
	{
		ArrayList<Integer> anslist=new ArrayList<Integer>();
		for(String elementstr:elementsarray)
		{
			String shortlist[]=elementstr.split("\n");
			if(shortlist.length>0)
			{
				for(String no:shortlist)
				{
					anslist.add(Integer.parseInt(no));
				}
			}
			else
			{
				anslist.add(Integer.parseInt(elementstr));
			}
		}
		return anslist;
	}//getNumbersList :parsed numbers
	
	public static ArrayList<Integer> negativenumCheck(ArrayList<Integer> list)
	{
		ArrayList<Integer> negativeNumberList=new ArrayList<Integer>();
		for(Integer no : list)
		{
			if(no <0)
			{
				negativeNumberList.add(no);
			}
		}
	    return negativeNumberList;
	}//negativenumbercheck
	
}//class

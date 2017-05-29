package com.java.Blackbelt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CountCharacter 
{
	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the word");
		String word=reader.readLine();
		char c=0;
		
		System.out.println("Enter the word to find the occurance : ");
		char ch=(char)System.in.read();
		
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			c=word.charAt(i);
			count++;
		}
		if(c==ch)
		{
			System.out.println(ch+" is appearing "+count+" times");
		}
		else
		{
			System.out.println("letter is not present");
		}
 	}
}

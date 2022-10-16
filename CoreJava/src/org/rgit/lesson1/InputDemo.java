package org.rgit.lesson1;

import java.util.Scanner;

public class InputDemo
{

	public static void main(String[] args)
	{
		System.out.println("Enter your area and pincode");
		Scanner obj=new Scanner(System.in);
		
		long num;
		num=obj.nextLong();
		String area;
		area=obj.nextLine();
		System.out.println("my pincode "+num +"   " +"my area is" +area);
	}
}


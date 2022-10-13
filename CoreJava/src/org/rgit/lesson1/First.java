package org.rgit.lesson1;

public class First 
{
	int firstNum=200;
	int secondNum=100;
	void addition()
	{
		int add=firstNum+secondNum;
		System.out.println(add);
	}
	void subtraction()
	{
		int sub=firstNum-secondNum;
		System.out.println(sub);
	}
	void multiplication()
	{
		int multi=firstNum*secondNum;
		System.out.println(multi);
	}
	void division()
	{
		int div=firstNum/secondNum;
		System.out.println(div);
	}
	public static void main(String[] args)
	{
		First object=new First();
	    object.addition();
	    object.subtraction();
	    object.multiplication();
	    object.division();
	}

}

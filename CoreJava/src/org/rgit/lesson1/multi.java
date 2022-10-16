package org.rgit.lesson1;

class Parent_onee
{
	void displ1()
	{
	System.out.println("I am from parent_onr");
}
}
class Parent_two extends Parent_onee
{   
	void displ2()
	{
	System.out.println("I am from parent_two");
	}
}
class Parent_three extends Parent_two
{
	void displ3()
	{
	System.out.println("I am from parent_three");
    }
}
class Parent_four extends Parent_three
{
	void displ4()
	{
	System.out.println("I am from parent_four");
    }
}
public class multi extends Parent_four
{
	public static void main(String[] args)
	{
		multi obj=new multi();
		obj.displ1();
		obj.displ2();
		obj.displ3();
		obj.displ4();
	}

}

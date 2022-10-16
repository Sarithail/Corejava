package org.rgit.lesson1;

class Parent_one
{
	void disp()
	{
		System.out.println("this is parent_one");
	}
}
class Child1 extends Parent_one
{
	void disp()
	{
		System.out.println("this is child one");
	}
}
class Child2 extends Parent_one
{
	void disp()
	{
		System.out.println("this is child two");
	}
}
class Child3 extends Parent_one
{
	void disp()
	{
		System.out.println("this is child three");
	}
}
public class Hierar extends Parent_one
{
  public static void main(String[] args)
{
	Hierar obj=new Hierar();
	obj.disp();
	Child1 obj2=new Child1();
	obj2.disp();
	Child2 obj3=new Child2();
	obj3.disp();
	Child3 obj4=new Child3();
	obj4.disp();
}
}

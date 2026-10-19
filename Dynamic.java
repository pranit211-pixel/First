import java.util.*;
import java.lang.System;

abstract class Shape
{
	double val1,val2;
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		val1=s.nextDouble();
		
		System.out.println("Enter second number");
		val2=s.nextDouble();
	}
	abstract void compute_area();
}


class Triangle extends Shape
{
	void compute_area()
	{
		double area;
		area = 0.5*val1*val2;
		System.out.println("Area of Triangle : "+area);
	}
} 


class Rectangle extends Shape
{
	void compute_area()
	{
		double area;
		area = val1*val2;
		System.out.println("Area of Rectangle : "+area);
	}
} 


public class Dynamic
{
	public static void main(String[] args)
	{
		Shape h;
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		
		
		h=t;
		h.input();
		h.compute_area();
		
		h=r;
		h.input();
		h.compute_area();
	}
}










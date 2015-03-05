package chapter4.constructortest;

import java.util.Random;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("wang", 3000);
		staff[1] = new Employee( 3500);
		staff[2] = new Employee();
		
		for(Employee e: staff)
		{
			System.out.println("name=" + e.getName() 
					+",id=" + e.getId() 
					+",salary=" + e.getSalary());
		}
	}

}

class Employee
{
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	static
	{
		Random generator = new Random();
		nextId = generator.nextInt(1000);
	}
	
	{
		id = nextId;
		nextId ++;
	}
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public Employee(double s)
	{
		this("Employee #"+ nextId, s);
	}
	
	public Employee()
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
}

package chapter5.equals;

import java.util.*;

public class Employee {

	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name    = n;
		salary  = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month , day);
		hireDay = calendar.getTime();
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent /100;
		salary += raise;
	}
	
	public boolean equals(Object otherObject)
	{
		if (this == otherObject) return true;
		
		if (otherObject == null) return false;
		
		if (this.getClass() != otherObject.getClass()) return false;
		
		Employee other = (Employee) otherObject;
		
		return Objects.equals(this.name, other.name) && 
				this.salary == other.salary &&  
				Objects.equals(this.hireDay, other.hireDay);
		
	}
	
	public int hashCode()
	{
		return Objects.hash(name, salary, hireDay);
		
	}
	
	public String toString()
	{
		return this.getClass().getName() + 
				"[name=" + name + 
				",salary=" + salary +
				",hireDay=" + hireDay +
				"]";
				
	}
	
	
}

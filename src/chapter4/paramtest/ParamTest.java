package chapter4.paramtest;

public class ParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestTripleValue:");
		double percent = 10;
		System.out.println("Before: percent:" + percent);
		tripleValue(percent);
		System.out.println("After: percent:" + percent);
		
		System.out.println("TestTripleSalary:");
		Employee harry = new Employee("Harry", 50000);
		System.out.println("Before: salary=" + harry.getSalary());
		//Employee potter= new Employee("potter", 100000);
		tripleSalary(harry);
		System.out.println("After: salary=" + harry.getSalary());
		
		Employee x = new Employee("x", 500000);
		Employee y = new Employee("y", 1000000);
		System.out.println("Before: x=" + x.getName());
		System.out.println("Before: y=" + y.getName());
		swap(x, y);
		System.out.println("After: x=" + x.getName());
		System.out.println("After: y=" + y.getName());
		
	}
	
	public static void tripleValue(double x)
	{
		x = 3 * x;
		System.out.println("End of method:x=" + x);
	}
	
	public static void tripleSalary(Employee x)
	{
		x.raiseSalary(300);
		System.out.println("End of method: salary=" + x.getSalary());
	}
	
	public static void swap(Employee x, Employee y)
	{
		Employee tmp = x;
		x = y ;
		y = tmp;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());
	}
	
	

}


class Employee{
	private String name;
	private double salary;
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	
}
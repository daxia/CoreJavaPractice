package chapter5.arraylist;

import java.util.ArrayList;

import chapter5.equals.Employee;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> staff = new ArrayList<Employee>();
		staff.add(new Employee("wang", 56000, 2012, 1, 1));
		staff.add(new Employee("sheng", 56000, 2012, 1, 1));
		staff.add(new Employee("zhong", 56000, 2012, 1, 1));
		
		for(Employee employee: staff)
		{
			employee.raiseSalary(10);
		}
		
		for(Employee employee : staff)
		{
			System.out.println("name=" + employee.getName() + 
					",salary=" + employee.getSalary() + 
					",hireDay=" + employee.getHireDay());
		}
	}

}

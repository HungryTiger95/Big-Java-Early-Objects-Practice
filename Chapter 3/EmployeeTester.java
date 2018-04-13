
public class EmployeeTester
{
	public static void main (String[] args)
	{
		Employee mayo = new Employee("Mayuresh", 50000);
		Employee other = new Employee("Other", 65000);
		
		System.out.println("Employee Name: " + mayo.getName());
		System.out.println("Employee Salary: " + mayo.getSalary());
		System.out.println("Employee Name: " + other.getName());
		System.out.println("Employee Salary: " + other.getSalary());
		
		other.raiseSalary(15);
		mayo.raiseSalary(10);
		
		System.out.println("Employee Salary after 10% Raise: " + mayo.getSalary());
		System.out.println("Employee Salary after 15% Raise: " + other.getSalary());
	}
}

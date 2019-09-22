package exercise_9;

public class EmployeeDemo
{
	public static void main (String[] args)
	{
		Employee worker = new Employee();
		worker.setName("Bob");
		worker.setSalary(23000);
		
		Manager manager = new Manager("Marketing");
		manager.setName("Ashley");
		manager.setSalary(54000);
		
		Executive exec = new Executive("Advertising");
		exec.setName("Diya");
		exec.setSalary(115000);
		
		System.out.println(worker.toString());
		System.out.println(manager.toString());
		System.out.println(exec.toString());
	}
}

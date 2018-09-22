package exercise_8;

public class PersonDemo
{
	public static void main(String[] args)
	{
		Person man = new Person();
		man.setName("Michael");
		man.setBirthYear(1995);
		
		Student boy = new Student("Chemistry");
		boy.setName("Marcus");
		boy.setBirthYear(2004);
		
		Instructor teacher = new Instructor(45000);
		teacher.setName("Johnson");
		teacher.setBirthYear(1969);
		
		System.out.println(man.toString());
		System.out.println(boy.toString());
		System.out.println(teacher.toString());
	}

}

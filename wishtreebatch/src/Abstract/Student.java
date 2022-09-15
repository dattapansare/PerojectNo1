package Abstract;

public class Student {

	int id;
	String name;

	 Student (int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display()

	{

		System.out.println(id+"");
		System.out.println( name+"");

	}

	public static void main(String[] args) {

		Student s= new Student(101,"sachine");
		Student s1= new Student(100,"rahul");
		s.display();
		s1.display();
	
	}

}

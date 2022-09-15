package Abstract;

public class Astraction_Implementation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.display();
		p.m1();
		
		System.out.println("--------------------------------------");
		
		Child c = new Child();
		c.display();
		c.m1();

	}

}

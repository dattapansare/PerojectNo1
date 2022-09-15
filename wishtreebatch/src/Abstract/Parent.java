package Abstract;

public abstract class Parent {
	void display() {
		System.out.println("this is concrete method of parent class");

	}

	abstract void m1();
}

class Child extends Parent {

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("this is override method of parent");

	}

}

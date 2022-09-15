package Abstract;

public class Hospital {

	public void show() {
		System.out.println("HOSPITAL IS PARENT CLASS");
	}
}

class Patient extends Hospital {

	public void show() {
		System.out.println("PATIENT  IS CHILD  CLASS");
	}

}
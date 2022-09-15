package Homework;

public class Bank {

	int customerId;
	String customerName;
	long customerAcNo;
	static String branch = "BARAMATI";
	
	// question - what is by default access modifier or access specifier of the constructor in java?
	//answer- by default access modifier of the constructor is PACKAGE-PRIVATE.

    public Bank() {

	}

	public Bank(int customerId, String customerName, long customerAcNo) {
		

		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAcNo = customerAcNo;
	}

	public void branchaddress() {
		String branchaddress = "NEAR HIGHWAY";
		System.out.println("branchaddress is:" + branchaddress);
	}

	public static void bankName() {
		String bankname = "SBI";

		System.out.println("name of bank  is :" + bankname);
	}

	@Override
	public String toString() {
		return "Bank [customerId=" + customerId + ", customerName=" + customerName + ", customerAcNo=" + customerAcNo
				+ "]";
	}

}

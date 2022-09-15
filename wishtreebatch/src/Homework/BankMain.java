package Homework;

public class BankMain {

	public static void main(String[] args) {
		Bank b = new Bank(101, "ramesh", 000005565656443);
		System.out.println(b);

		b.branchaddress();
		Bank.bankName();
		System.out.println("branch of the company is:" + Bank.branch);

	}
}
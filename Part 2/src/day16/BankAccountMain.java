package day16;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount(); //new object
		
		acc.setAccountNum(1000100);
		int num = acc.getAccountNum();
		System.out.println(num);
		
		acc.setName("Swaroop");
		String name = acc.getName();
		System.out.println(name);
		
		acc.setBalance(1100.55);
		acc.setBalance(100.44);
		double bal = acc.getBalance();
		System.out.println(bal);
		
	}

}

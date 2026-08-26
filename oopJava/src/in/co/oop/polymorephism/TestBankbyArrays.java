package in.co.oop.polymorephism;

public class TestBankbyArrays {

	public static void main(String[] args) {

		Bank[] banks = new Bank[3];
		banks[0] = new ICICIbank();
		banks[1] = new HDFCbank();
		banks[2] = new AxisBank();

		HomeLoanEnquery(banks); //abstract method
		
		// using by array ForEach loop
		// bank 0 =b1
		// bank 1 =b2
		// bank 2 =b3
		/*for (Bank bank : banks) {
			System.out.println(bank.getName());
			System.out.println(bank.IntRate());
			System.out.println("------------------");
		}*/
	}
	     private static void HomeLoanEnquery(Bank[] banks) {
	    	 for(int i=0;i<banks.length; i++) {
	    		 System.out.println(banks[i].getName());
	    		 System.out.println(banks[i].IntRate());
	    		 
	    	 }
	     }
	
}

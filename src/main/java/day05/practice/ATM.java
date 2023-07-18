package day05.practice;

public interface ATM {
	

		abstract boolean deposit(String account, double amount);
			
		    abstract boolean withdraw(String account,double amount) throws Exception;
		    abstract double getBalance();
			
		

}

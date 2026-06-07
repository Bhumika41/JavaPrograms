package exceptionhandling;

class Insufficient extends Exception{
	public Insufficient(String msg){
		super(msg);
	}
}

class Bankaccount{
	double balance=5000;

	void withdraw(double amount)throws Insufficient{
		if(balance<amount){
			throw new Insufficient("Insufficient balance");
		}

		balance=balance-amount;
		System.out.println("withdraw successful");
	}
}

public class Customexception{
	public static void main(String[] args){

		Bankaccount acc=new Bankaccount();

		try{
			acc.withdraw(5500);
		}
		catch(Insufficient e){
			e.printStackTrace();
		}
	}
}
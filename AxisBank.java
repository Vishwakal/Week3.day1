package Assigment3;

public class AxisBank extends BankInfo{

	public int deposit1(int b) {
		
		return b;
		
	}
	public int deposit(int a) {
		return a;
		
	}

	public static void main(String[] args) {
		
	AxisBank AB =new AxisBank();
	int b =	AB.deposit1(1000);
	int a =	AB.deposit(2000);
	System.out.println("Desposit 1 value :" +b);
	System.out.println("Desposit 2 vlaue :" +a);
	}

}

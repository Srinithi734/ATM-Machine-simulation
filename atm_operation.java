package atm_machine;

public class atm_operation implements operation{
	atm ATM=new atm();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available balanve:"+ATM.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdraw_amount) {
		// TODO Auto-generated method stub
		if(ATM.getBalance()>withdraw_amount) {
			System.out.println(withdraw_amount+" has successfully withdrawed!!!");
			ATM.setBalance(ATM.getBalance()-withdraw_amount);
			viewBalance();
		}
		
		else{
			System.out.println("Amoutn cant be withdrawed");
		}
		
	}

	@Override
	public void depositAmount(double deposit_amount) {
		// TODO Auto-generated method stub
		System.out.println(deposit_amount+" has successfully deposited!!!");
		ATM.setBalance(ATM.getBalance()+deposit_amount);
		viewBalance();
		
	}

}

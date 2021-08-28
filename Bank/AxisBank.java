package Bank;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("monthly deposit");
	}
	
		public static void main(String[] args) {
			System.out.println("**********Before override*********");
			BankInfo Banobj = new BankInfo();
			Banobj.deposit();
			
			System.out.println("**********After override*********");
			
			AxisBank Axobj = new AxisBank();
			Axobj.fixed();
			Axobj.saving();
			Axobj.deposit();
		}

	}
			


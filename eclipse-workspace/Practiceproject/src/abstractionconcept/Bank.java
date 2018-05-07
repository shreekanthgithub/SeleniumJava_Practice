package abstractionconcept;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		USBank usb=new USBank();
		usb.creditcard();
		usb.debitcard();
		usb.webbanking();
		usb.mobileanking();
		
		Parentbank b=new USBank();
		b.creditcard();
		b.debitcard();
		

	}

}

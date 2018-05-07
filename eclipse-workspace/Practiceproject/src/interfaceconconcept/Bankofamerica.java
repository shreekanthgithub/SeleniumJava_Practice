package interfaceconconcept;

public class Bankofamerica implements Bank{

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		
		System.out.println("Bank calss - Creditcard");
		
	}

	@Override
	public void debitcard() {
		// TODO Auto-generated method stub
		
		System.out.println("Bank class- Creditcard");
		System.out.println("Bank loacation is ..."+banklocation);
		
	}
	
	public void loan() {
		
		System.out.println("Bankofmaerica class- Loan method");
	}
	
  public void intrest() {
	
	int i=10;
		
		System.out.println("Bankofmaerica class- intrest method ..."+i);
	}

}

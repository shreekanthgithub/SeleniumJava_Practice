package abstractionconcept;

public abstract class Parentbank { //  abstraction class- no implementation for abstract methods 
	
	public abstract void webbanking();
	
	public abstract void mobileanking();  //  abstraction methods - No body
	
	public void creditcard() {  // Non abstraction methods- will have body
		
		System.out.println("Parent bank class--> creditcard");
	}
	
     public void debitcard() {
		
		System.out.println("Parent bank class--> debitcard");
	}
}

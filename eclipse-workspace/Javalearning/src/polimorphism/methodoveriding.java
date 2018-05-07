package polimorphism;

public class methodoveriding extends poliexamples{
	
	public void add() {
		
		int a=32;
		int b=32;
		int c=a+b;
		System.out.println("C value is "+c);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		methodoveriding m=new methodoveriding();
		m.add();

	}

}

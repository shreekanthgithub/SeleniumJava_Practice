package polimorphism;

public class poliexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		poliexamples obj=new poliexamples();
		obj.add(100, 200);
		obj.add(100.5, 200.10);
		obj.add(100.20, 100);
		obj.add(100, 50.5);
		obj.add(100, 100, 100);
	}
	
	public void add(int a,int b) {
		
		int c=a+b;
		System.out.println("C value is "+c);
		
	}
	
	public void add(int a,int b,int d) {
		
		int c=a+b+d;
		System.out.println("C value is "+c);
		
	}
	public void add(double a,int b) {
		
		double c=a+b;
		System.out.println("C value is "+c);
		
	}
	public void add(int a,double b) {
		
		double c=a+b;
		System.out.println("C value is "+c);
		
	}
	
	public void add(double a,double b) {
		
		double c=a+b;
		System.out.println("C value is "+c);
		
	}

}

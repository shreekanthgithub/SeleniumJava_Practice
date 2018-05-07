package samplepackage;

public class MethodOverloading {
	
	//MethoOverloading - method name os name with different set of arguements or input parameters 
	
	static int i=2;
	static int j=3;
	static int k=5;
	static String name="Perla";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		System.out.println("Main method");
		
		MethodOverloading obj=new MethodOverloading();
		obj.Sum(i);
		obj.Sum(name);
		obj.Sum(i, j);
		obj.Sum(k, name);
	}
	
	public void Sum(int i) {
		
		System.out.println("i value is "+i);
	}

    public void Sum(String name) {
		
		System.out.println("My surname is "+name);
	}
    public void Sum(int i, int j) {
		
		System.out.println("i value is "+(i+j));
	}
    
    public void Sum(int k, String name) {
		
  		System.out.println("k value is "+k);
  		System.out.println("My surname is "+name);
  	}
}

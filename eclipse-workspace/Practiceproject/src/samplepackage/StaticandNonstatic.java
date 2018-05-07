package samplepackage;

public class StaticandNonstatic {
	
	int age=29;
	
	static String name ="Srikanth Perla";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(); // direct method calling 
		StaticandNonstatic.sum();
		StaticandNonstatic obj=new StaticandNonstatic();
		obj.Nonstaticmethod();
		System.out.println(" my name is "+name);
		System.out.println(" my age is "+obj.age);
	    }
	
	 public static void sum() {
		
		System.out.println("Sum method ");
	   }
	
	 public void Nonstaticmethod() {
		
		 System.out.println("Nonstaticmethod");
		
		
	}

}

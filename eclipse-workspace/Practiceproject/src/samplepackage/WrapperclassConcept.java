package samplepackage;

public class WrapperclassConcept {
	
	//By using WrapperclassConcept we can achieve data conversions 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String -int conversion
		
		String S="100";
		System.out.println(S+20);
		
		int i=Integer.parseInt(S);
		System.out.println(i+20);
		
		//String -double conversion
		
		double d=Double.parseDouble(S);
		System.out.println(d+10);
		
		//String -boolean conversion
		
		String a="true";
		System.out.println(a);
		boolean b=Boolean.parseBoolean(a);
		System.out.println(b);
		
		//Int -String conversion  ..using value of x function can achieve 
		
		int x=10;
	   System.out.println(x+10);
	   
	   String value=String.valueOf(x);
	   System.out.println(value+10);

	}

}

package samplepackage;

import javax.print.DocFlavor.STRING;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringpractice();
		stringpractice2();
		int a, b,c,d;
		a=10;
		b=12;
		c=13;
		d=a+b+c;
		
		double db=30.123;
		
		String az="Selenium";
		String ab="Learning";
	
		System.out.println(a+b+c);
		System.out.println(a+b+c+az+ab);
		System.out.println(az+ab+d);
		System.out.println(az+ab+a+b+c);
		System.out.println(az+ab+(a+b+c));
		
		
		System.out.println(az+ab+db);
		System.out.println(az+ab+(db)+" "+a);
		System.out.println(az+ab+(db+a));
	}
	
	public static void stringpractice() {
		
		String name="Srikanth";
		
		char[] fullname= {'S', 'H', 'R', 'E', 'E'};
		
		String myname= new String(fullname);
		System.out.println("My fullname is "+myname);
		System.out.println("My first name is "+name);
		
	}
	
	public static void stringpractice2() { 
		
		String Fname="Srikanth";
		String Lname="Perla";
		String Fullname="Srikanth kumar Perla";
		
		Boolean myfullname=Fname.equals(Lname);
		Boolean result= Lname.contains("erla");
		
		String []splitexample=Fullname.split("kumar");
		
		System.out.println("String char index is"+Lname.charAt(0));
		System.out.println("String split result is"+splitexample[0]);
		System.out.println("String split result is"+splitexample[1]);
		
		System.out.println("String contains result is"+result);
		
		System.out.println("String comparision result is "+myfullname);
		
	}

}

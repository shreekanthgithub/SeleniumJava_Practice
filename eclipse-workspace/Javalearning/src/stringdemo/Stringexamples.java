package stringdemo;

public class Stringexamples {

	public static void main(String[] args) {
		
		String Fname="Srikanth";
		
		String Lname="Perla";
		
		String Fullname= Fname+Lname;
		
		System.out.println("My fullname is"+Fullname);
		
		
		String name="Selenium Webdriver";
		boolean status=name.startsWith("Selenium");
        System.out.println("Status is"+status);
        
        String name2=" Webdriver";
		boolean status2=name.endsWith("webdriver");
        System.out.println("Status2 is"+status2);
	}

}

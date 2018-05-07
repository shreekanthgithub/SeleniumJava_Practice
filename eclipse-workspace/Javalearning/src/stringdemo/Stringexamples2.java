package stringdemo;

public class Stringexamples2 {
	
	public static void main(String[] args) {
	
	String actuals="Welcome to Selenium webdriver learning";
	
	String Expected="welcome to Selenium webdriver learning";
	
	boolean status=actuals.equals(Expected);
	
	System.out.println(status);
	

}
}
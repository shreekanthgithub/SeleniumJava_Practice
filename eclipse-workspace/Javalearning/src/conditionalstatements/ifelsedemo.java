package conditionalstatements;

public class ifelsedemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser= "IE";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Test case excueted on Chrome browser");	
			
		 }
		  else if (browser.equalsIgnoreCase("Firefox")) {
			
			System.out.println("Test case excueted on Firefox browser");
		}
		
          else if (browser.equalsIgnoreCase("IE")) {
			
			System.out.println("Test case excueted on IE browser");
		}
          else {
	
	   System.out.println("Please specify the browser name");
}
		
	}
}
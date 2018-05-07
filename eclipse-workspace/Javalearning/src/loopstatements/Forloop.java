package loopstatements;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i=35;
		
		whileexample();
		dowhileexample();
		
		for(int i=35;i<40;i++) {
			
			System.out.println("marks are"+i);
		}
			
	}
	
	public static void whileexample() {
		int count=50;
	   while(count<60) {
		
		System.out.println("Count is "+count);
		
		count++;
	   }	
		
	}
	   
	   public static void dowhileexample() {
			int number=50;
			
			do{
				System.out.println("numbers are"+number);
				
				 number++;
			}
			
		   while(number<60);{
			
			  
			
		}

	}
}	

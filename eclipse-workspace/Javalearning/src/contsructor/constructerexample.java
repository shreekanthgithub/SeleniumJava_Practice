package contsructor;

public class constructerexample {
	
     constructerexample(){
    	 
		System.out.println("Default constructer value");
	}
		constructerexample(int a) {
			
			System.out.println("Parameterized constructer value"+a);
	}
	
	public static void main(String[] args) {

		constructerexample ce1= new constructerexample();
		constructerexample ce2= new constructerexample(100);
}
	
	}

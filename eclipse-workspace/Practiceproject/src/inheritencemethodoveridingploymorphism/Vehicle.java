package inheritencemethodoveridingploymorphism;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vehicle v= new Vehicle();
		
		// Eccord- child calss object creation to access child class methods & parent class methods 
		
		Eccord e= new Eccord();
		e.strat();  // Start & key --- Car parent class method but these method will overide with child calss 
		e.key();
		e.wheels();
		e.fuel();
		
		//Car- Prent calss- it will parent class methods 
		
		Car c =new Car();
		
		c.key();
		c.strat();
		
		// Assigning child class value to parent class - it will show child class method out put 
		Car c1=new Eccord();
		c1.key();
		c1.strat();
	}
}


package samplepackage;

import javax.naming.spi.DirStateFactory.Result;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Results();
		SwitchCase();
		int x=2;
		int y=3;
		
		if(x==2 || y==4) {
			System.out.println(" X and Y are eual");
			
			
		}else
		  System.out.println("X and Y are NOT eual");
	
		int a=100;
		int b=200;
		int c=300;
		
		if(a>c & c>b) {
			System.out.println("B is greater than A");
			
		}else if(b>c){
			
			System.out.println("C is greater than B");
			
		}else
			System.out.println("A is greater than B");
	}
	
	public static void Results() {
		
		int marks = 52;
		
		if(marks==35) {
			System.out.println("I just passed exam");
		}
		else if(marks>65) {
			System.out.println("I  passed exam");
		}
		
		else if(marks>35 && marks<45) {
			System.out.println("second class");
		}
		else if(marks>45 && marks<55) {
			System.out.println("First class");
		}
		else{
			System.out.println("I failed exam");
		}
	}
	
	public static void SwitchCase() {
		
		int m=2;
		String day="Saturday";
		switch(m){
		case 1:
			System.out.println("Sunday");
		break;

	    case 2:
		System.out.println("Monday");
	    break;
	
	    case 3:
		System.out.println("Tuesday");
	    break;

	    case 4:
		System.out.println("Wednesday");
	    break;
	}
		switch (day) {
		case "monday":
			System.out.println("monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "wednesday":
			System.out.println("wednesday");
			break;
		default:
			System.out.println("Saturday");
			break;
		}
	}
}

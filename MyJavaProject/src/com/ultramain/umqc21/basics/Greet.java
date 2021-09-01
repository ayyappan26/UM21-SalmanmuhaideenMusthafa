package com.ultramain.umqc21.basics;

public class Greet {
		int time;
		public Greet() {
			time=6;
}
public Greet(int time) {
	this.time= time;
}
	
public void greetMessage() {
	this.greetMorning();
	greetEvening();
		
}
public void greetMorning() {
   System.out.println("Good Morning");
   
}
public void greetEvening() {
	System.out.println("Good Evening....");
	
}

}


	



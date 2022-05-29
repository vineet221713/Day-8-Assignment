package com.masai;
class Bird {
	 public void fly() {
		 System.out.println("Bird is flying");
	 }
}
class Parrot extends Bird{
	 @Override
	 public void fly() {
		 System.out.println("I am flying");
	 }
	 
	 public void sing() {
		 System.out.println("i am singing");
	 }

}

public class Main {
	public static void main(String[] args) {
		
		Bird b1 = new Parrot();
		b1.fly();
		((Parrot) b1).sing();
		
	}

}

package day3;

abstract class Animal {
	
	public abstract void animalSound();
	public void sleep() {
		System.out.println("ZZZZZZZZZZ...!!!");
	}
}

class Cat extends Animal {
	
	public void animalsound() {
		System.out.println("The cat says : Meow Meow :) ");
	}
}

public class abstraction {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.animalsound();
		c.sleep();
	}

}

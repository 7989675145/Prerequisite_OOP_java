package roshan;

public class Human {
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	public void speak()
	{
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My height is "+heightInInches);
		System.out.println("My eye color "+eyeColor);
	}
	public void eat() {
		System.out.println("eating");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
	public void walk() {
		System.out.println("walking");
	}
}

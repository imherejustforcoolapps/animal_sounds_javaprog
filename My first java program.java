import.java.utils.Scanner;

class Animal{
	public void makesound();
}

class Dog extends Animal{
	Animal dog = new Animal(){
		void makesound(){
			System.out.println("woof");
		}
	};
}

class Cat extends Animal{
	Animal cat = new Animal(){
		void makesound(){
			System.out.println("meow");
		}
	};
}

public static void main(String[ ] args){	
	Scanner userinput = new Scanner(System.in);
	String usr = userinput.next();

	if (usr == "dog") {
		System.out.println("a dog says " + dog.makesound());
	}
	else if (usr == "cat") {
		System.out.println("a cat says " + cat.makesound());
	}
	else {
		System.out.println("AN ERROR OCCURED");
	}
}
package day04.solved;

//import day04.solved.Animal;
public class Lion extends Animal {  
	public void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
		System.out.println(getAge());
	}

	public Lion() {
		super("erre");
	}
	

	public Lion(String name) {
		super(name);
		System.out.println("Calling Child Constructor");
	}
	


}
package day04.solved;

public class App {

	public static void main(String[] args) {
		
//		Lion simba = new Lion();
//		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
//		simba.roar();
//		
		
		Lion simba1 = new Lion("Simba");
		simba1.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba1.getName();
		simba1.roar();
		Animal a = new Animal("jja");
	}
	
}

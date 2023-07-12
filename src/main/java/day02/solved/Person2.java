package day02.solved;

public class Person2 {

	private String name1; 

	public String getName() { 
		return name1;
	}

	public void setName(String name) {
	name1 = name; 
	}

	public static void main(String[] args) {
		
		
		Person2 person = new Person2();
		person.setName("Jayashree");
		String name = person.getName(); 
		System.out.println(name); 
		
	}

	
}

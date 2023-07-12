package day02.solved;



public class  AddingGetterAndSetter {

private String name; 

public String getName() { 
	return name;
}

public void setName(String name) {
	this.name = name; 
}

public static void main(String[] args) {
	
	
	AddingGetterAndSetter person = new AddingGetterAndSetter();
	person.setName("Jayashree");
	String name = person.getName(); 
	System.out.println(name); 
	
}
}
package day01.practice;

public class Cat {

    private String  speak;
    private String color;

   public Cat() {
	  this.speak = "meow!";
   }

   

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setColor("orange");
       
        Cat cat2 = new Cat();
        cat2.setColor("black");
      
       
        System.out.println("Cat 1:");
        System.out.println("Speaks: " + cat1.speak);
        System.out.println("Color: " + cat1.getColor());

        System.out.println("Cat 2:");
        System.out.println("Speaks: " + cat2.speak);
        System.out.println("Color: " + cat2.getColor());
    }
}

package day01.practice;

public class AccessModifier {
	 public String a = "a";
	    public String b = "b";
	    public String c = "c";
	    public static String d = "d";

	    public static void main(String[] args) {
	        AccessModifier obj = new AccessModifier();  // Create an instance of AccessModifier

	        System.out.println(obj.a);
	        System.out.println(obj.b);
	        System.out.println(obj.c);
	        System.out.println(d);
	    }
}  

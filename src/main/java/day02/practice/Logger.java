package day02.practice;

public class Logger {

	public static void debug(String msg) {
		System.out.println("DEBUG: " + msg);
	}

	public static void info(String msg) {
		System.out.println("INFO: " + msg);
	}

	public static void error(String msg) {
		System.err.println("ERROR: " + msg);
	}

	public static void debug(int number) {
		System.out.println("DEBUG: " + number);
	}

	public static void error(int number) {
		System.err.println("ERROR: " + number);
	}

	public static void info(int number) {
		System.out.println(number);
	}
	
}

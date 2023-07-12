package day02.practice;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger.debug(" debug ");
		Logger.info(" info");
		Logger.error(" error ");
		Logger.debug(2);
		Logger.error(4);
		Logger.info(6);

		System.out.println("User");

		User user = new User();
		user.setName("Jaya");
		user.setEmailId("jaya@freshworks.com");
		user.setId(1675096);
		user.setPassword("23345jksdf@123j4");

		System.out.println(user.toString());
	}

}

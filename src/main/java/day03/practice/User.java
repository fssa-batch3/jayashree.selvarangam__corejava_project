package day03.practice;

public class User {

	private int id;
	private String name;
	private String password;
	private String emailId;
	
	public User() {
	}
	
	public User(int id, String name, String password, String emailId) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", emailId=" + emailId + "]";
	}

}

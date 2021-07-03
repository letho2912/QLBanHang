package Models;

public class UserModel {
	private int id;
	private String fullname;
	private String username;
	private String password;
	private String email;
	private String phone;
	
	
	public UserModel() {
	
	}
	
	public UserModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserModel(String fullname, String username, String password, String email, String phone) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public UserModel(int id, String fullname, String username, String password, String email, String phone) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

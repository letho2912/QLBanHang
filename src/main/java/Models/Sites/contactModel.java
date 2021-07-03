package Models.Sites;

public class contactModel {
	private int id;
	private String fullname;
	private String email;
	private String phone;
	private String content;
	private int status;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public contactModel() {

	}

	public contactModel(int id, String fullname, String email, String phone, String content, int status) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.content = content;
		this.status = status;
	}

	public contactModel(String fullname, String email, String phone, String content) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.content = content;
	}

}

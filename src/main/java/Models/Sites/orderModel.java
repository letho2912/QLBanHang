package Models.Sites;

public class orderModel {

	private String nameProduct;
	private String fullname;
	private String sdt;
	private String diachi;
	private String email;
	private int tinhtrang;
	public orderModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public orderModel(String nameProduct, String fullname, String sdt, String diachi, String email) {
		super();
		this.nameProduct = nameProduct;
		this.fullname = fullname;
		this.sdt = sdt;
		this.diachi = diachi;
		this.email = email;
	}

	public String getnameProduct() {
		return nameProduct;
	}
	public void setnameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(int tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	
}

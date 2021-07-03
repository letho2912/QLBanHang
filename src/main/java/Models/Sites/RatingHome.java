package Models.Sites;

import java.util.Date;

public class RatingHome {

	private String product_id;

	private String noidung;
	private Date ngay;
	private String name;

	

	public RatingHome(String name,String noidung) {
		super();
		this.noidung = noidung;
		this.name = name;
	}

	public RatingHome(String product_id, String noidung, Date ngay, String name) {
		super();
		this.product_id = product_id;
		this.noidung = noidung;
		this.ngay = ngay;
		this.name = name;
	}

	public RatingHome(String noidung, String name, Date ngay) {
		super();
		this.noidung = noidung;
		this.ngay = ngay;
		this.name = name;
	}

	public RatingHome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public Date getNgay() {
		return ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

}

package Models.Sites;

public class detailModel {
	private String name_img;
	private String img;
	private String Product_id;

	public detailModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public detailModel(String name_img, String img, String product_id) {
		super();
		this.name_img = name_img;
		this.img = img;
		Product_id = product_id;
	}

	public String getName_img() {
		return name_img;
	}

	public void setName_img(String name_img) {
		this.name_img = name_img;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}

}

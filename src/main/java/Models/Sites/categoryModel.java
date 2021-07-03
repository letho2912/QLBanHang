package Models.Sites;

public class categoryModel {

	private int id;
	private String Category_id;
	private String nameCategory;
	private String prCategory_id;
	private String name_prCategory;
	private int status;

	public categoryModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public categoryModel(String Category_id, String nameCategory, String prCategory_id) {
		super();
		this.Category_id = Category_id;
		this.nameCategory = nameCategory;
		this.prCategory_id = prCategory_id;
	}

	public categoryModel(String Category_id, String nameCategory, String prCategory_id, String name_prCategory) {
		super();
		this.Category_id = Category_id;
		this.nameCategory = nameCategory;
		this.prCategory_id = prCategory_id;
		this.name_prCategory = name_prCategory;
	}
	

	public categoryModel(String category_id, String nameCategory, String prCategory_id, int status) {
		super();
		Category_id = category_id;
		this.nameCategory = nameCategory;
		this.prCategory_id = prCategory_id;
		this.status = status;
	}

	public categoryModel(int id, String category_id, String nameCategory, String prCategory_id) {
		super();
		this.id = id;
		Category_id = category_id;
		this.nameCategory = nameCategory;
		this.prCategory_id = prCategory_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_prCategory() {
		return name_prCategory;
	}

	public void setName_prCategory(String name_prCategory) {
		this.name_prCategory = name_prCategory;
	}

	public String getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(String Category_id) {
		this.Category_id = Category_id;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public String getPrCategory_id() {
		return prCategory_id;
	}

	public void setPrCategory_id(String prCategory_id) {
		this.prCategory_id = prCategory_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}

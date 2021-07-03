package Models.Sites;

public class menuModel {
	private String prCategory_id;
	private String name_prCategory;

	public String getPrCategory_id() {
		return prCategory_id;
	}

	public void setPrCategory_id(String prCategory_id) {
		this.prCategory_id = prCategory_id;
	}

	public String getName_prCategory() {
		return name_prCategory;
	}

	public void setName_prCategory(String name_prCategory) {
		this.name_prCategory = name_prCategory;
	}

	public menuModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public menuModel(String prCategory_id, String name_prCategory) {
		super();
		this.prCategory_id = prCategory_id;
		this.name_prCategory = name_prCategory;
	}

}

package Models.Sites;

import java.text.NumberFormat;
import java.util.Locale;

public class productModel {

	NumberFormat currentLocale = NumberFormat.getInstance();
	Locale localeEN = new Locale("en", "EN");
	NumberFormat en = NumberFormat.getInstance(localeEN);
	
	private int id;
	private String Product_id;
	private String name_product;
	private String describe;
	private int price;
	private String str1 = en.format(price);
	private int amount;
	private int sale;
	private String str2 = en.format(sale);
	private String color;
	private String size;
	private String img;
	private String producer;
	private int status;
	private String Category_id;
	private String prCategory_id;
	private String nameCategory;
	private int page;
	private int maxPage;
	private int totals;
	private int totalItem;
	
	

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getTotals() {
		return totals;
	}

	public void setTotals(int totals) {
		this.totals = totals;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public String getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(String category_id) {
		Category_id = category_id;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}

	public String getName_product() {
		return name_product;
	}

	public void setName_product(String name_product) {
		this.name_product = name_product;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public productModel() {
		super();
	}

	public productModel(String product_id, String name_product, String describe, int price, int amount,
			int sale, String color, String size, String img, String producer, int status, String category_id,
			String prCategory_id) {
		super();
		this.Product_id = product_id;
		this.name_product = name_product;
		this.describe = describe;
		this.price = price;
		this.amount = amount;
		this.sale = sale;
		this.color = color;
		this.size = size;
		this.img = img;
		this.producer = producer;
		this.status = status;
		Category_id = category_id;
		this.prCategory_id = prCategory_id;
	}

	public productModel(int id, String product_id, String name_product, String describe, int price, String str1,
			int amount, int sale, String str2, String color, String size, String img, String producer, int status,
			String category_id, String prCategory_id) {
		super();
		this.id = id;
		this.Product_id = product_id;
		this.name_product = name_product;
		this.describe = describe;
		this.price = price;
		this.str1 = str1;
		this.amount = amount;
		this.sale = sale;
		this.str2 = str2;
		this.color = color;
		this.size = size;
		this.img = img;
		this.producer = producer;
		this.status = status;
		Category_id = category_id;
		this.prCategory_id = prCategory_id;
	}

	public productModel(String name_product, String describe, int price, int amount, int sale, String color,
			String size, String img, String producer, int status, String category_id, String prCategory_id) {
		super();
		this.name_product = name_product;
		this.describe = describe;
		this.price = price;
		this.amount = amount;
		this.sale = sale;
		this.color = color;
		this.size = size;
		this.img = img;
		this.producer = producer;
		this.status = status;
		Category_id = category_id;
		this.prCategory_id = prCategory_id;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public productModel(String product_id, String name_product) {
		super();
		Product_id = product_id;
		this.name_product = name_product;
	}
	
	/*
	 * [id] ,[Product_id] ,[nameProduct] ,[describe] ,[price] ,[amount] ,[sale]
	 * ,[color] ,[size] ,[img] ,[producer] ,[status] ,[Category_id] ,[prCategory_id]
	 */
	
	
}

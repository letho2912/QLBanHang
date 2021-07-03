package Models.Sites;

import java.util.Date;

public class newModel {
	private int id;
	private String new_id;
	private String title;
	private String content;
	private Date date_sub;
	private String img;
	private int status_new;
	/* Hinh anh chi tiet */
	private String nameImg;
	private String imgNew;

	public String getNameImg() {
		return nameImg;
	}

	public void setNameImg(String nameImg) {
		this.nameImg = nameImg;
	}

	public String getImgNew() {
		return imgNew;
	}

	public void setImgNew(String imgNew) {
		this.imgNew = imgNew;
	}

	public newModel() {

	}

	public newModel(int id, String new_id, String title, String content, Date date_sub, String img, int status_new) {
		super();
		this.id = id;
		this.new_id = new_id;
		this.title = title;
		this.content = content;
		this.date_sub = date_sub;
		this.img = img;
		this.status_new = status_new;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNew_id() {
		return new_id;
	}

	public void setNew_id(String new_id) {
		this.new_id = new_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate_sub() {
		return date_sub;
	}

	public void setDate_sub(Date date_sub) {
		this.date_sub = date_sub;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getStatus_new() {
		return status_new;
	}

	public void setStatus_new(int status_new) {
		this.status_new = status_new;
	}

}

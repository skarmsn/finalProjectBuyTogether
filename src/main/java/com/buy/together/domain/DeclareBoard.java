package com.buy.together.domain;

public class DeclareBoard {

	private int delcare_number;
	private int buytogether_number;
	private int type_number;
	private int declare_category_number;
	private int user_number;
	private String declare_reason;
	private String declare_photo;
	private Boolean declare_status;

	public DeclareBoard() {

	}

	public int getDelcare_number() {
		return delcare_number;
	}

	public void setDelcare_number(int delcare_number) {
		this.delcare_number = delcare_number;
	}

	public int getBuytogether_number() {
		return buytogether_number;
	}

	public void setBuytogether_number(int buytogether_number) {
		this.buytogether_number = buytogether_number;
	}

	public int getType_number() {
		return type_number;
	}

	public void setType_number(int type_number) {
		this.type_number = type_number;
	}

	public int getDeclare_category_number() {
		return declare_category_number;
	}

	public void setDeclare_category_number(int declare_category_number) {
		this.declare_category_number = declare_category_number;
	}

	public int getUser_number() {
		return user_number;
	}

	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}

	public String getDeclare_reason() {
		return declare_reason;
	}

	public void setDeclare_reason(String declare_reason) {
		this.declare_reason = declare_reason;
	}

	public String getDeclare_photo() {
		return declare_photo;
	}

	public void setDeclare_photo(String declare_photo) {
		this.declare_photo = declare_photo;
	}

	public Boolean getDeclare_status() {
		return declare_status;
	}

	public void setDeclare_status(Boolean declare_status) {
		this.declare_status = declare_status;
	}

}

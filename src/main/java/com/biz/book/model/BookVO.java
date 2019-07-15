package com.biz.book.model;

public class BookVO {
	private long b_seq;	//number
	private String b_title;	//nvarchar2(100 char)
	private String b_comp;	//nvarchar2(50 char)
	private String b_auth;	//nvarchar2(50 char)
	private String b_price;	//number
	
	
	
	
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVO(long b_seq, String b_title, String b_comp, String b_auth, String b_price) {
		super();
		this.b_seq = b_seq;
		this.b_title = b_title;
		this.b_comp = b_comp;
		this.b_auth = b_auth;
		this.b_price = b_price;
	}
	public long getB_seq() {
		return b_seq;
	}
	public void setB_seq(long b_seq) {
		this.b_seq = b_seq;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_comp() {
		return b_comp;
	}
	public void setB_comp(String b_comp) {
		this.b_comp = b_comp;
	}
	public String getB_auth() {
		return b_auth;
	}
	public void setB_auth(String b_auth) {
		this.b_auth = b_auth;
	}
	public String getB_price() {
		return b_price;
	}
	public void setB_price(String b_price) {
		this.b_price = b_price;
	}
	@Override
	public String toString() {
		return "BookVO [b_seq=" + b_seq + ", b_title=" + b_title + ", b_comp=" + b_comp + ", b_auth=" + b_auth
				+ ", b_price=" + b_price + "]";
	}
	
	
	
	
}

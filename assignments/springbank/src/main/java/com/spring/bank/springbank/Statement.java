package com.spring.bank.springbank;

import java.util.Date;

public class Statement {
	private Date date;
	private String content;
	
	public Statement( String content) {
		super();
		this.date = new Date();
		this.content = content;
	}
	
	public Statement() {
		// TODO Auto-generated constructor stub
	}
	
	public Statement(Date date, String content) {
		super();
		this.date = date;
		this.content = content;
	}


	public Date getDate() {
		return date;
	}
	
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override
	public String toString() {
		return "Statment [date=" + date + ", content=" + content + "]";
	}
	}

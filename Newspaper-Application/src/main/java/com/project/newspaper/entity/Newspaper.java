package com.project.newspaper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="newspaperdetails")
public class Newspaper implements java.io.Serializable {
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name="abc",strategy="increment")
	@Column(name="ID")
	private int id;
	
	@Column(name="NEWSPAPERNAME")
	private String newspaperName;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="NOOFPAGES")
	private int NoOfPages;
	
	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Newspaper(int id, String newspaperName, double price, String language, int noOfPages) {
		super();
		this.id = id;
		this.newspaperName = newspaperName;
		this.price = price;
		this.language = language;
		NoOfPages = noOfPages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNewspaperName() {
		return newspaperName;
	}

	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNoOfPages() {
		return NoOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		NoOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Newspaper [id=" + id + ", newspaperName=" + newspaperName + ", price=" + price + ", language="
				+ language + ", NoOfPages=" + NoOfPages + "]";
	}

	
	
}
package com.project.dto;

public class NewspaperDto {
private	String newspaperName;
private	double price;
private	String language;
private	String NoOfPages;

	public NewspaperDto() {

		super();
		
	}

	public NewspaperDto(String newspaperName, double price, String language, String noOfPages) {
		super();
		this.newspaperName = newspaperName;
		this.price = price;
		this.language = language;
		NoOfPages = noOfPages;
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

	public String getNoOfPages() {
		return NoOfPages;
	}

	public void setNoOfPages(String noOfPages) {
		NoOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "NewspaperDto [newspaperName=" + newspaperName + ", price=" + price + ", language=" + language
				+ ", NoOfPages=" + NoOfPages + "]";
	}

	
}

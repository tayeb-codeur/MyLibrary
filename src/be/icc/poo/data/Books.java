package be.icc.poo.data;

import java.util.UUID;

public class Books {
	
	String title;
	String author;
	int totalPage;
	int loanPeriod;
	int rentalPrice;
	String language;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public int getLoanPeriod() {
		return loanPeriod;
	}


	public void setLoanPeriod(int loanPeriod) {
		this.loanPeriod = loanPeriod;
	}


	public int getRentalPrice() {
		return rentalPrice;
	}


	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	@Override
	public  String toString() {
		return "Books [title=" + title + ", author=" + author + ", totalPage=" + totalPage + ", loanPeriod="
				+ loanPeriod + ", rentalPrice=" + rentalPrice + ", language=" + language + ", getTitle()=" + getTitle()
				+ ", getAuthor()=" + getAuthor() + ", getTotalPage()=" + getTotalPage() + ", getLoanPeriod()="
				+ getLoanPeriod() + ", getRentalPrice()=" + getRentalPrice() + ", getLanguage()=" + getLanguage() + "]";
	}

	public static void main(String[] args) {
		
		System.out.println(" autor : " + author + ";" );
	
	}

}

package org.book;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.Table;
@Entity
@Table(name="EBook_Details")
@DiscriminatorValue("ebook")

public class Ebook extends Book {
	@Column(name="download_url")
	
	String downloadurl;
	@Column(name="size_in_mb")
	int size_in_mb;
	public Ebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDownloadurl() {
		return downloadurl;
	}
	public void setDownloadurl(String downloadurl) {
		this.downloadurl = downloadurl;
	}
	public int getSize_in_mb() {
		return size_in_mb;
	}
	public void setSize_in_mb(int size_in_mb) {
		this.size_in_mb = size_in_mb;
	}
	
	

}

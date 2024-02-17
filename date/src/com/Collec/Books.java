package com.Collec;

import java.util.Objects;

public class Books {
	
	private int bId;
	private String bName;
	private String Author;
	private float bPrice;
	
	public Books(int bId,String bName,String Author,float bPrice)
	{
		this.bId=bId;
		this.bName=bName;
		this.Author=Author;
		this.bPrice=bPrice;
	}

	/**
	 * @return the bId
	 */
	public int getbId() {
		return bId;
	}

	/**
	 * @param bId the bId to set
	 */
	public void setbId(int bId) {
		this.bId = bId;
	}

	/**
	 * @return the bName
	 */
	public String getbName() {
		return bName;
	}

	/**
	 * @param bName the bName to set
	 */
	public void setbName(String bName) {
		this.bName = bName;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return Author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		Author = author;
	}

	/**
	 * @return the bPrice
	 */
	public float getbPrice() {
		return bPrice;
	}

	/**
	 * @param bPrice the bPrice to set
	 */
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}

	@Override
	public String toString() {
		return "Books [bId=" + bId + ", bName=" + bName + ", Author=" + Author + ", bPrice=" + bPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Author, bId, bName, bPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(Author, other.Author) && bId == other.bId && Objects.equals(bName, other.bName)
				&& Float.floatToIntBits(bPrice) == Float.floatToIntBits(other.bPrice);
	}

}
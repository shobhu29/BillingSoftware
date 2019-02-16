package com.capgemini.takehome.beans;

public class Product {
	
	private int Product_Code;
	private String Product_Name;
	private String Product_Category;
	private double Product_Price;
	private double Line_Total;

	public Product(){
		
	}															// default constructor
	
	public Product(int product_Code, String product_Name, String product_Category, double product_Price) {
		super();
		Product_Code = product_Code;
		Product_Name = product_Name;											// Parameterized constructor
		Product_Category = product_Category;
		Product_Price = product_Price;
		}

																						
	public int getProduct_Code() {
		return Product_Code;
	}																			// Getter and Setter Methods


	public void setProduct_Code(int product_Code) {
		Product_Code = product_Code;
	}


	public String getProduct_Name() {
		return Product_Name;
	}


	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}


	public String getProduct_Category() {
		return Product_Category;
	}


	public void setProduct_Category(String product_Category) {
		Product_Category = product_Category;
	}


	public double getProduct_Price() {
		return Product_Price;
	}


	public void setProduct_Price(double product_Price) {
		Product_Price = product_Price;
	}
	
	public double getLine_Total() {
		return Line_Total;
	}

	public void setLine_Total(double line_Total) {
		Line_Total = line_Total;
	}

	@Override
	public String toString() {																				// String representation of object
		return "Product [Product_Code=" + Product_Code + ", Product_Name=" + Product_Name + ", Product_Category="
				+ Product_Category + ", Product_Price=" + Product_Price + ", Line_Total=" + Line_Total + "]";
	}

	

																				



	
}
	
package com.capgemini.takehome.ui;

import java.util.Scanner;
import com.capgemini.takehome.beans.*;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;
import com.capgemini.takehome.exceptions.*;

public class Client {
	static Scanner sc;
	public static void main(String[] args) throws Exception{
		
		IProductService ps = new ProductService();
		
		sc=new Scanner(System.in);
		int ch=0;
		
		while(true){
			System.out.println("\n________Billing Software Applications________\n");
			
			System.out.println(" 1. Generate Bill by entering Product Code And Quantity");
			System.out.println(" 2. Exit");

			System.out.println("\nEnter Your Choice :\n");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Please Enter Product Code");
				int product_Code = sc.nextInt();
				
				System.out.println("Please Enter Quantity");
				int product_quant = sc.nextInt();
				
				
				try {
					
					if(ps.validateProductCode(product_Code) && ps.validateQuantity(product_quant)){
						Product prod = null;
							
							prod = ps.getProductDetails(product_Code);
							prod.setLine_Total(prod.getProduct_Price() * product_quant);
							System.out.println("Product Details are : \n");
							System.out.println("Product code is: " + prod.getProduct_Code());
							System.out.println("Product Name is: " + prod.getProduct_Name());
							System.out.println("Product Category is: " + prod.getProduct_Category());
							System.out.println("Product price is: " + prod.getProduct_Price());
							System.out.println("Product quantity is: " + product_quant);
							System.out.println("Product LineTotal is: " +  prod.getLine_Total());
					}
					}
						catch (InvalidProductCodeException d){
							
							System.out.println(d.getMessage());
						}
						catch (InvalidQuantityException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
							
						}
				break;
				
				
			case 2:
				System.exit(0);
				
				default: System.out.println("Wrong choice");
			}
		
	}
		
}
}

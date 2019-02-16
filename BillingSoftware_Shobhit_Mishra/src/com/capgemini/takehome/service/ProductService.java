package com.capgemini.takehome.service;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.exceptions.InvalidQuantityException;

public class ProductService implements IProductService {

	IProductDAO dao = new ProductDAO() ;
	Product prod;
	@Override
	public Product getProductDetails(int product_Code) throws InvalidProductCodeException{
			
			prod = dao.getProductDetails(product_Code);		
			return prod;
		}		



	
	public boolean validateQuantity(int product_quant) throws InvalidQuantityException{	// will raise InvalidQuantityException
		
		if (product_quant <= 0){
			throw new InvalidQuantityException(" Invalid quantity");
		}
		return true;
	}
	
	public boolean validateProductCode(int product_Code) throws InvalidProductCodeException{
				
		String pc = String.valueOf(product_Code);
		Pattern pat = Pattern.compile("[1]{1}[0-4]{3}");
		Matcher mat = pat.matcher(pc);
		
		if(!(mat.matches()))
			throw new  InvalidProductCodeException(" Invalid product code"); 
	
		return mat.matches();
	}
	

}

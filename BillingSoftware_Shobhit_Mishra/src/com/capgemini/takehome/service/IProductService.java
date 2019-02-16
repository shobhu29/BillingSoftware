package com.capgemini.takehome.service;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.exceptions.InvalidQuantityException;

public interface IProductService {

	
	
	public Product getProductDetails(int product_Code) throws InvalidProductCodeException;
	public boolean validateQuantity(int product_quant) throws InvalidQuantityException;
	public boolean validateProductCode(int product_Code) throws InvalidProductCodeException;

}

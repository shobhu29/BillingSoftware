package com.capgemini.takehome.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.util.CollectionUtil;
public class ProductDAO implements IProductDAO {
	
	Product product;
	CollectionUtil collectionUtil;	

	@Override
	public Product getProductDetails(int product_Code) throws InvalidProductCodeException {

		product = collectionUtil.getProducts().get(product_Code);
		if(product == null)
			
			throw new InvalidProductCodeException("Invalid Product Code");
		
		return product;

	}

}

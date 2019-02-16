package com.capgemini.takehome.dao;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;

public interface IProductDAO {
	
	Product getProductDetails(int product_Code) throws InvalidProductCodeException ;
	
	
}

package com.capgemini.takehome.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.exceptions.*;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class UnitTesting {
	
	IProductDAO dao;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = com.capgemini.takehome.exceptions.InvalidQuantityException.class)
	public void whentheisquantityisnotvalid() throws InvalidQuantityException {
		int quant = 0;
		IProductService ips = new ProductService();
		boolean result = ips.validateQuantity(quant);
		assertEquals(true, result);	
	}	

	@Test
	public void whentheisquantityisvalid() throws InvalidQuantityException {
		int quant = 3;
		IProductService ips = new ProductService();
		boolean result = ips.validateQuantity(quant);
		assertEquals(true, result);	
	}	
	
	
	@Test(expected = com.capgemini.takehome.exceptions.InvalidProductCodeException.class)
	public void whentheisproductcodeisnotvalid() throws InvalidProductCodeException{
		int product_Code = 1005;
		IProductService ips = new ProductService();
		boolean result = ips.validateProductCode(product_Code);
		assertEquals(false, result);	
	}	
	
	@Test
	public void whentheisproductcodeisvalid() throws InvalidProductCodeException {
		int product_Code = 1001;
		IProductService ips = new ProductService();
		boolean result = ips.validateProductCode(product_Code);
		assertEquals(true, result);	
	}	
	
}

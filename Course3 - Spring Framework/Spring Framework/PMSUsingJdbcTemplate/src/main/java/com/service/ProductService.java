package com.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(product.getPrice()<0) {
			return "Product price must be +ve";
		}else if(productDao.storeProduct(product)>0) {
			return "Product stored";
		}else {
			return "Product didn't store";
		}
	}
	

	public List<Map<String, Object>> findAllRecordsAsMap() {
		return productDao.findAllProductsAsMapObject();
	}
	
	public List<Product> findAllProductAsListOfProducts() {
		return productDao.findAllProductsAsListOfProducts();
	}
}



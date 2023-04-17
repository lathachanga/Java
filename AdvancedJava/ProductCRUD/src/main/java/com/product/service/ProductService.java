package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
   @Autowired
   ProductRepository propRepo;
   
  public List<Product> getProducts() {
	  
	  return propRepo.findAll();
  }
  
  public void addProduct(Product prop) {
	  propRepo.save(prop);
  }
  public ResponseEntity<Product> updateProducts(Product product ,Integer id){
	  
	
	  Product getProd=propRepo.getById(id);
	  getProd.setProductName(product.getProductName());
	  getProd.setProductCost(product.getProductCost());
	  getProd.setProductQty(product.getProductQty());
	  
	  Product updateProd=propRepo.save(getProd);
	  
	return  ResponseEntity.ok().body(updateProd);
	  
	  
  }
}

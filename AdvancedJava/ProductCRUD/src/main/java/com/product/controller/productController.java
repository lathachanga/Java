package com.product.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;

@RestController
public class productController {
      @Autowired
      ProductService propService;
      
      @GetMapping("/products")
      public List<Product> getProducts() {
		return propService.getProducts();
		
	 }
      /* 
       url: localhost:8080/api/add
       method type:post
       required fields:name,price,qty,info
       */
      @PostMapping("/add")
      public void AddProducts(@RequestBody Product prop) {
    	  
		propService.addProduct(prop);
    	  
      }
      
      /*
       URL:localhost:8080/api/product/{id} 
        Method:PUT
        Reqiured Fields:name,price,qty,info
        Access type:public
       */
      
      @PutMapping("update/{id}")
      public ResponseEntity<Product> updateProducts(@RequestBody Product product, @PathVariable Integer id){
    	  
		return propService.updateProducts(product,id);
      }
}

package com.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	@Id
	 private String id;
	 private Integer productId;
	 private String productName;
	 private double productCost;
	 public Product() {
		super();
	 }
	public Product(Integer productId, String productName, double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	public Product(String id, Integer productId, String productName, double productCost) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productId=" + productId + ", productName=" + productName + ", productCost="
				+ productCost + "]";
	}
	 
	 
	  
}

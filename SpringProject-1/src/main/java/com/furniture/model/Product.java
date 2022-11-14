package com.furniture.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.List;




@Entity
public class  Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer productId;
    private String productName;
    public Integer prize;
    private String img;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "categoryId")
    private Category category;



    @JsonIgnore
    @ManyToMany
    private List<Orders> orders;



    private Boolean approved=false;

   
    

	public Product() {
		super();
	}



	public Product(Integer productId, String productName, Integer prize, String img, Boolean approved) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.prize = prize;
		this.img = img;
		this.approved = approved;
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



	public Integer getPrize() {
		return prize;
	}



	public void setPrize(Integer prize) {
		this.prize = prize;
	}



	public String getImg() {
		return img;
	}



	public void setImg(String img) {
		this.img = img;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public List<Orders> getOrders() {
		return orders;
	}



	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}



	public Boolean getApproved() {
		return approved;
	}



	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
    



}
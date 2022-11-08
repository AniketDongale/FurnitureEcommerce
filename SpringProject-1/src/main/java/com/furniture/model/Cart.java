package com.furniture.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    private int cartTotal;

    @ManyToMany
    private Set<Product> products;
    
    public int getCartId() {
		return cartId;
	}


	public void setCartId(int cartId) {
		this.cartId = cartId;
	}


	public int getCartTotal() {
		return cartTotal;
	}


	public void setCartTotal(int cartTotal) {
		this.cartTotal = cartTotal;
	}


	public Set<Product> getProducts() {
        return products;
    }
    

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public  void clearProducts(){
        this.products.clear();
    }

    public void addProducts(Product product) {
        cartTotal=cartTotal+product.getPrize();
        products.add(product);
    }
}
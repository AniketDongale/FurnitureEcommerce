package com.shoping.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;

@Entity
@Table(name= "ProductList",
uniqueConstraints = { @UniqueConstraint(
		                       name ="product_uniqueId",
		                       columnNames = "id")
		            }
)
public class Product {
	
	@Id
	@SequenceGenerator(
			name = "product_sequence",
			sequenceName = "product_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "product_sequence")
     private Long productId;
     
	 @Column(nullable = false,length = 50)
     private String productName;
     
	 @Column(nullable = false)
	 @Min(value =1 ,message = "Product price should be valid")
     private Double productPrice;
     
     @OneToOne(targetEntity =  User.class)
 	 @JoinColumn(name="Owner", nullable=false)
     private User productOwner;
     
     @Enumerated(EnumType.STRING)
 	@Column(length = 20)
 	private EStatus name;

	public Product(Long productId, String productName,
			@Min(value = 1, message = "Product price should be valid") Double productPrice, User productOwner,
			EStatus name) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productOwner = productOwner;
		this.name = name;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public User getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(User productOwner) {
		this.productOwner = productOwner;
	}

	public EStatus getName() {
		return name;
	}

	public void setName(EStatus name) {
		this.name = name;
	}
     
}

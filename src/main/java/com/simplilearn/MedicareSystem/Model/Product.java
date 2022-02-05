package com.simplilearn.MedicareSystem.Model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private Category category;
	private String brand;
	private double price;
	private double units;
	private String description;
	private String imageName;
	
	
	
	public Product() {
	}


	public Product(String name, Category category, String brand, double price, double units, String description,
			String imageName) {
		super();
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.units = units;
		this.description = description;
		this.imageName = imageName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getUnits() {
		return units;
	}


	public void setUnits(double units) {
		this.units = units;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", brand=" + brand + ", price="
				+ price + ", units=" + units + ", description=" + description + ", imageName=" + imageName + "]";
	}
	
	
	
	
	
	
}
package com.simplilearn.MedicareSystem.DTO;

public class ProductDTO {
	
	private Long id;
	private String name;
	private int categoryId;
	private String brand;
	private double price;
	private double units;
	private String description;
	private String imageName;
	
	public ProductDTO() {
	}

	public ProductDTO(String name, int categoryId, String brand, double price, double units, String description,
			String imageName) {
		super();
		this.name = name;
		this.categoryId = categoryId;
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
		return "ProductDTO [id=" + id + ", name=" + name + ", categoryId=" + categoryId + ", brand=" + brand
				+ ", price=" + price + ", units=" + units + ", description=" + description + ", imageName=" + imageName
				+ "]";
	}
	
	
	
	

}

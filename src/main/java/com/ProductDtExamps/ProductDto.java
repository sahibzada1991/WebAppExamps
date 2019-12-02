package com.ProductDtExamps;

public class ProductDto {

	private String Name;
	private String Category;
	private String Description;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "ProductDto [Name=" + Name + ", Category=" + Category + ", Description=" + Description + "]";
	}

}

package ro.shop;

import java.util.Arrays;

public class ShopService 
{
	private Category categories[];
	private Product products[];
	private int productsArraySize;
	private int categoriesArraySize;
	private int productsCount;
	private int categoriesCount;
	
	public ShopService (int productsArraySize, int categoriesArraySize )
	{
		this.productsArraySize=productsArraySize;
		products = new Product[productsArraySize];
		this.categoriesArraySize=categoriesArraySize;
		categories = new Category[categoriesArraySize];
		productsCount=0;
		categoriesCount=0;
	}
	
	public Category[] getCategories() 
	{
		return categories;
	}

	public void setCategories(Category[] categories) 
	{
		this.categories = categories;
	}

	public Product[] getProducts() 
	{
		return products;
	}

	public void setProducts(Product[] products) 
	{
		this.products = products;
	}

	public void addProduct(Product product) 
	{
		if(productsCount==productsArraySize)
		{
			System.out.println("Products array is full");
		}
		else
		{
			products[productsCount]=product;
			productsCount++;
		}
	}
	public void addCategory(Category category)
	{
		if(categoriesCount==categoriesArraySize)
		{
			System.out.println("Category array is full");
		}
		else
		{
			categories[categoriesCount]=category;
			categoriesCount++;
		}
	}
	public void displayAllProducts()
	{
		for(int i=0;i<productsCount;i++)
		{
			products[i].displayProduct();
		}
	}
	public void displayAllCategories()
	{
		for(int i=0;i<categoriesCount;i++)
		{
			categories[i].displayCategory();
		}
	}
	public void displayProductsByCategoryName(String categoryName)
	{
		Product [] productsByCategory = Arrays.stream(products).filter(p->p.getCategory().getName().equals(categoryName)).toArray(Product[]::new);
		if(productsByCategory.length==0)
		{
			System.out.println("There are no products in this category");
		}
		else
		{
			for(int i=0;i<productsByCategory.length;i++)
				productsByCategory[i].displayProduct();
		}
	}
	
	public void searchProductByName(String productName)
	{
		Product searchedProduct = Arrays.stream(products).filter(p->p.getName().equals(productName)).findFirst().get();
		if(searchedProduct == null)
		{
			System.out.println("The product does not exist");
		}
		else
		{
			searchedProduct.displayProduct();
		}
	}
}

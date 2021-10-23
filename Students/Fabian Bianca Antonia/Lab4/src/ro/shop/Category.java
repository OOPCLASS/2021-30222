package ro.shop;

public class Category 
{
	private String name;
	public Category()
	{
		
	}
	public Category(String name)
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public void displayCategory()
	{
		System.out.println(name);
	}

	
	
} 

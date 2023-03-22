package settergetter;

public class Mobile
{
	private int ram;
	private String name;
	private double weight;
	private float price;
	
	public void setRam(int ram)
	{
		this.ram=ram;
	}
	public int getRam()
	{
		return ram;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}

}

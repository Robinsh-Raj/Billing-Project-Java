package Billing;

public class Product 
{
	private int id;
	private String name;
	private Float price;
	private int stock;
	//Product(0,"Oil",87.5f,100);
	public Product(int id,String name,Float price,int stock )
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.stock=stock;
	}
	public void display()
	{
		System.out.println("id="+id+", name="+name+", price="+price+", stock="+stock);
	}
	public String getName() {
        return name;
    }
	public Float getPrice() {
        return price;
    }
	public int getstock()
	{
		return stock;
	}

}

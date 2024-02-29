package Billing;

import Billing.Product;


public class ProductDB
{	
	private int n;
	private String name;
	private int stock;
	private Product p [];
	

	public ProductDB() {
		super();
		n=10;
		p=new Product[n];
		p[0]=new Product(0,"Oil",87.5f,100);
        p[1]=new Product(1,"Sugar",37.0f,1000);
        p[2]=new Product(2,"Wheat",24.0f,1000);
        p[3]=new Product(3,"Rice",55.0f,1000);
        p[4]=new Product(4,"Colgate Paste",52.0f,10);
        p[5]=new Product(5,"Lux Soap",28.0f,50);
        p[6]=new Product(6,"Tea Powder",110.0f,10);
        p[7]=new Product(7,"Salt",18.0f,35);
        p[8]=new Product(8,"Tur Dal",65.5f,150);
        p[9]=new Product(9,"Pickle",22.0f,15);
		
	}
	public Product getProduct(int i)
	{
		return p[i];
	}
	
}

package Billing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Billing.BillDB;
import Billing.Product;
import Billing.ProductDB;

public class BillConsole 
{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
	ProductDB pdb;
	BillDB bdb;
	public BillConsole()
	{
		pdb=new ProductDB(); 
		bdb = new BillDB();
	}
	int menu() throws NumberFormatException, IOException 
    {   int choice=0;
            System.out.println("1--->Make a Bill");
            System.out.println("2--->Display All Bills");
            System.out.println("3--->Exit");
            System.out.println("Enter your choice");
            
//            try {
            choice=Integer.parseInt( br.readLine());
//            }
//           catch (Exception e)
//            {
        
            return choice;
    
    }
    public void start() throws NumberFormatException, IOException    
{
    while (true) {
    	Product p;
    	int m;
    	String name;
        int choice=menu();
        switch (choice) {
            case 1: // Make a Bill
            		
//                        billing();
            	System.out.println("Enter Customer Name ");
            	name = br.readLine();
            	System.out.println("Enter mobile number ");
            	m = Integer.parseInt(br.readLine());
            	while(true)
            	{
            	System.out.println("Enter id or 9999 to stop ");
            	for (int i = 0; i < 10; i++)
        		{
        			p=pdb.getProduct(i);
        			p.display();
        		}
            	System.out.println("Enter id or 9999 to stop ");
            	int response = Integer.parseInt(br.readLine());
            	if (response==9999) {
                    break;
                }
            	pdb.getProduct(response);
    			p=pdb.getProduct(response);
            	System.out.println("Stock of "+p.getName()+" is "+p.getstock());
            	System.out.println("Enter quantity required ");
            	int quantity = Integer.parseInt(br.readLine());
            	bdb.addBill(name,p,quantity);
            	System.out.println("Purchased items");
            	bdb.displayBills(name);
            	}
            	System.out.println("--->"+name+" "+m+"  "+"Amount:"+bdb.calculateTotal(name));
            	System.out.println("Purchased items");
            	bdb.displayBills(name);
                break;
            case 2: // Display all Bills
                      bdb.displayAllBills();
                        break;
            case 3:System.exit(0);
                
                break;
            
            default: System.out.println("You entered wrong choice");
                }
    }
   
    
}//start
	
	
}


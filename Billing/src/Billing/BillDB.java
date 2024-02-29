package Billing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillDB 
{
    private Map<String, List<BillItem>> bills = new HashMap<>();

    public void addBill(String customerName, Product product, int quantity) 
    {
        bills.putIfAbsent(customerName, new ArrayList<>());
        bills.get(customerName).add(new BillItem(product, quantity));
    }

    public double calculateTotal(String customerName) 
    {
        double total = 0;
        List<BillItem> billItems = bills.get(customerName);
        if (billItems != null) {
            for (BillItem item : billItems) {
                total += item.getProduct().getPrice() * item.getQuantity();
            }
        }
        return total;
    }

    public void displayBills(String customerName)
    {
        List<BillItem> billItems = bills.get(customerName);
        if (billItems != null) {
            for (BillItem item : billItems) {
                System.out.println("\t....."+item.getProduct().getName() + " " + item.getQuantity()+" "+item.getProduct().getPrice()+" "+"("+(item.getQuantity()*item.getProduct().getPrice())+")");
            }
        }
        System.out.println("....Total =" + calculateTotal(customerName));
    }

    // Method to display all bills for all customers
    public void displayAllBills() {
        for (String customerName : bills.keySet()) {
            displayBills(customerName);
        }
    }
//    public void displayAllBill()
//    {
//    	System.out.println("--->"+item.getProduct().getName());
//    }
}

class BillItem {
    private Product product;
    private int quantity;

    public BillItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
//    public String getcustomerName() {
//        return bills.get();
//    }
    public int getQuantity() {
        return quantity;
    }
}

package Billing;
import java.io.IOException;

import Billing.BillConsole;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BillConsole ec= new BillConsole();
		ec.start();
	}
}

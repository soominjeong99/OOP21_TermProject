package mall;

import java.util.ArrayList;
import java.util.Arrays;


//Managing Customer
public class CustomerManager implements Manager {
	
	ArrayList<Customer> customers;
	
	public CustomerManager()
	{
		customers = new ArrayList<>();
	}
	
	@Override
	public void add(Object o)
	{
		customers.add((Customer) o);
	}
	
	@Override
	public void remove(int id)
	{
		Customer temp;
		
		for (int i = 0; i < customers.size(); i++)
		{
			temp = customers.get(i);
			if (temp.getId() == id)
			{
				customers.remove(temp);
				break;
			}
		}
	}
	
	@Override
	public void modify(int id, Object o)
	{
		Customer temp;
		
		for (int i = 0; i < customers.size(); i++)
		{
			temp = customers.get(i);
			if (temp.getId() == id)
			{
				customers.remove(temp);
				customers.add((Customer) o);
				break;
			}
		}
	}
	
	@Override
	public void display()
	{
		System.out.println("\n Customers present are: ");
		Customer temp;
		
		for (int i = 0; i < customers.size(); i++)
		{
			temp = customers.get(i);
			System.out.println(temp.toString());
		}
	}
}


/**
	ArrayList<Customer> customerArray = new ArrayList<Customer>();// Array of goods
	int customerCount = 0;

	@Override
	// Add
	public void add(Object o) {

		customerArray.add((Customer) o);
		customerCount++;

	}

	@Override
	// Remove(Delete)
	public void remove(int i) throws Exception {
		try {
			// Search the index of goods ID and remove the index
			for (int k = 0; k < customerArray.size(); k++) {
				if (customerArray.get(k).getId() == i) {
					customerArray.remove(k);
					customerCount--;
				}

			}
		} catch (Exception e) {
			throw new Exception("臾쇳뭹 �뾾�쓬");
		}

	}

	@Override
	// Modify
	public void modify(int i, Object o) throws Exception {

		try {
			// Search the index of goods ID and modify the contents
			for (int k = 0; k < customerArray.size(); k++) {
				if (customerArray.get(k).getId() == i) {
					customerArray.set(k, (Customer) o);
				}
			}

		} catch (Exception e) {
			throw new Exception("臾쇳뭹 �뾾�쓬");
		}

	}

	@Override
	// Print the entire contents to the screen
	public void display() {
		for (Customer customers : customerArray) {
			System.out.println(customers);
		}
	}

}
*/

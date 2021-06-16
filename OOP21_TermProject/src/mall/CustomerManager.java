package mall;

import java.util.ArrayList;
import java.util.Arrays;

//Managing Customer
public class CustomerManager implements Manager {

	ArrayList<Customer> customers;

	public CustomerManager() {
		customers = new ArrayList<>();
	}

	@Override
	public void add(Object o) {
		customers.add((Customer) o);
	}

	@Override
	public void remove(int id) {
		Customer temp;

		for (int i = 0; i < customers.size(); i++) {
			temp = customers.get(i);
			if (temp.getId() == id) {
				customers.remove(temp);
				break;
			}
		}
	}

	@Override
	public void modify(int id, Object o) {
		Customer temp;

		for (int i = 0; i < customers.size(); i++) {
			temp = customers.get(i);
			if (temp.getId() == id) {
				customers.remove(temp);
				customers.add((Customer) o);
				break;
			}
		}
	}

	@Override
	public void display() {
		System.out.println("\n Customers present are: ");
		Customer temp;

		for (int i = 0; i < customers.size(); i++) {
			temp = customers.get(i);
			System.out.println(temp.toString());
		}
	}
}

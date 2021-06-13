package mall;

import java.util.ArrayList;
import java.util.Arrays;

//Managing Customer
public class CustomerManager implements Manager {
	
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
			throw new Exception("물품 없음");
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
			throw new Exception("물품 없음");
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

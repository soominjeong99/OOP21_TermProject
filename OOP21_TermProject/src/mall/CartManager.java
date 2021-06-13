package mall;

import java.util.ArrayList;
import java.util.Arrays;

//Managing Cart
public class CartManager implements Manager {
	ArrayList<Cart> cartArray = new ArrayList<Cart>();// Array of goods
	int itemCount = 0;

	@Override
	// Add
	public void add(Object o) {

		cartArray.add((Cart) o);
		itemCount++;

	}

	@Override
	// Remove(Delete)
	public void remove(int i) throws Exception {
		try {
			// Search the index of goods ID and remove the index
			for (int k = 0; k < cartArray.size(); k++) {
				if (cartArray.get(k).id == i) {
					cartArray.remove(k);
					itemCount--;
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
			for (int k = 0; k < cartArray.size(); k++) {
				if (cartArray.get(k).id == i) {
					cartArray.set(k, (Cart) o);
				}
			}

		} catch (Exception e) {
			throw new Exception("물품 없음");
		}

	}

	@Override
	// Print the entire contents to the screen
	public void display() {
		for (Cart carts : cartArray) {
			System.out.println(carts);
		}
	}
}

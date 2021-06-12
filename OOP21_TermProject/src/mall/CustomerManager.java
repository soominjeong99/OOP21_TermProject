package mall;

import java.util.Arrays;

//Managing Customer
public class CustomerManager implements Manager {
	
	Customer[] customerArray = new Customer[20]; //Array of customers
	int count = 0;

	@Override
	// Add
	public void add(Object o) {
		// Cannot append if it exceeds the size of the array
		if (count >= customerArray.length) {
			throw new ArrayIndexOutOfBoundsException("더이상 추가할 수 없습니다.");
		}
		customerArray[count++] = (Customer) o;
	}

	@Override
	// Remove(Delete)
	public void remove(int i) {
		// Store the index of the customer ID in the array in deleteKey
		int deleteKey = Arrays.binarySearch(customerArray, i);

		if (deleteKey < 0) // If the item is not in the array
		{
			throw new ArrayIndexOutOfBoundsException("해당 고객을 찾을 수 없습니다");
		} else {
			// Delete data at deleteKey location index, and the data behind is pulled
			for (int k = deleteKey; k < count - 1; k++) {
				customerArray[k] = customerArray[k + 1];
			}
			count--;
			customerArray[count] = null;
		}
	}

	@Override
	// Modify
	public void modify(int i, Object o) {

		// Store the index of the customer ID in the array in searhKey
		int searchKey = Arrays.binarySearch(customerArray, i);

		if (searchKey < 0) // If the item is not in the array
		{
			throw new ArrayIndexOutOfBoundsException("해당 고객을 찾을 수 없습니다");
		} else {
			customerArray[searchKey] = (Customer) o;
		}
	}

	@Override
	// Print the entire contents to the screen
	public void display() {
		System.out.println(Arrays.toString(customerArray));
	}

}

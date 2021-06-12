package mall;

import java.util.Arrays;

//Managing Cart
public class CartManager implements Manager {
	Cart[] cartArray = new Cart[20]; //Array of shopping carts
	int count = 0;

	@Override
	// Add
	public void add(Object o) {
		// Cannot append if it exceeds the size of the array
		if (count >= cartArray.length) {
			throw new ArrayIndexOutOfBoundsException("더이상 추가할 수 없습니다.");
		}
		cartArray[count++] = (Cart) o;
	}

	@Override
	// Remove(Delete)
	public void remove(int i) {
		// Store the index of the product ID in the array in deleteKey
		int deleteKey = Arrays.binarySearch(cartArray, i);

		if (deleteKey < 0) // If the item is not in the array
		{
			throw new ArrayIndexOutOfBoundsException("해당 물품을 찾을 수 없습니다");
		} else {
			// Delete data at deleteKey location index, and the data behind is pulled
			for (int k = deleteKey; k < count - 1; k++) {
				cartArray[k] = cartArray[k + 1];
			}
			count--;
			cartArray[count] = null;
		}
	}

	@Override
	// Modify
	public void modify(int i, Object o) {

		// Store the index of the product ID in the array in searhKey
		int searchKey = Arrays.binarySearch(cartArray, i);

		if (searchKey < 0) // If the item is not in the array
		{
			throw new ArrayIndexOutOfBoundsException("해당 물품을 찾을 수 없습니다");
		} else {
			cartArray[searchKey] = (Cart) o;
		}
	}

	@Override
	// Print the entire contents to the screen
	public void display() {
		System.out.println(Arrays.toString(cartArray));
	}
}

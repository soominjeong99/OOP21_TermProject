package mall;

import java.util.Arrays;

//Managing Goods
public class GoodsManager implements Manager {

	Goods[] goodsArray = new Goods[20]; //Array of goods
	int count = 0;

	@Override
	// Add
	public void add(Object o) {
		// Cannot append if it exceeds the size of the array
		if (count >= goodsArray.length) {
			throw new ArrayIndexOutOfBoundsException("더이상 추가할 수 없습니다.");
		}
		goodsArray[count++] = (Goods) o;
	}

	@Override
	// Remove(Delete)
	public void remove(int i) {
		// Store the index of the goods ID in the array in deleteKey
		int deleteKey = Arrays.binarySearch(goodsArray, i);

		if (deleteKey < 0) // If the item is not in the array
		{
			throw new ArrayIndexOutOfBoundsException("해당 물품을 찾을 수 없습니다");
		} else {
			// Delete data at deleteKey location index, and the data behind is pulled
			for (int k = deleteKey; k < count - 1; k++) {
				goodsArray[k] = goodsArray[k + 1];
			}
			count--;
			goodsArray[count] = null;
		}
	}

	@Override
	// Modify
	public void modify(int i, Object o) {

		// Store the index of the goods ID in the array in searhKey
		int searchKey = Arrays.binarySearch(goodsArray, i);

		if (searchKey < 0) // If the item is not in the array
		{
			throw new ArrayIndexOutOfBoundsException("해당 물품을 찾을 수 없습니다");
		} else {
			goodsArray[searchKey] = (Goods) o;
		}
	}

	@Override
	// Print the entire contents to the screen
	public void display() {
		System.out.println(Arrays.toString(goodsArray));
	}

}

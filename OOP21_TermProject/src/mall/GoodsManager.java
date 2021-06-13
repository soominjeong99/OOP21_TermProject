package mall;

import java.util.ArrayList;
import java.util.Arrays;

//Managing Goods
public class GoodsManager implements Manager {

	ArrayList<Goods> goodsArray = new ArrayList<Goods>();// Array of goods
	int itemCount = 0;

	@Override
	// Add
	public void add(Object o) {

		goodsArray.add((Goods) o);
		itemCount++;

	}

	@Override
	// Remove(Delete)
	public void remove(int i) throws Exception {
		try {
			// Search the index of goods ID and remove the index
			for (int k = 0; k < goodsArray.size(); k++) {
				if (goodsArray.get(k).id == i) {
					goodsArray.remove(k);
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
			for (int k = 0; k < goodsArray.size(); k++) {
				if (goodsArray.get(k).id == i) {
					goodsArray.set(k, (Goods) o);
				}
			}

		} catch (Exception e) {
			throw new Exception("물품 없음");
		}

	}

	@Override
	// Print the entire contents to the screen
	public void display() {
		for (Goods goods : goodsArray) {
			System.out.println(goods);
		}
	}

}

package mall;

import java.util.Scanner; //scanner import
//Goods Class

public class Goods {
	int id; // Goods number
	String gName; // name
	int stockNum; // stock
	int gPrice; // price

	/*
//Delete Quantity
	int subStock(int amount) {
		if (stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}

	// Plus Quantity

	int addStock(int amount) {
		stockNum += amount;
		return amount;
	}
*/
	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public int getgPrice() {
		return gPrice;
	}

	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}

	public int getStockNum() {
		return stockNum;
	}
/*
	Goods(int id_code, int num, String name, int price) { // 占쎄문占쎄쉐占쎌��
		id = id_code;
		stockNum = num;
		gName = name;
		gPrice = price;
	}
*/
	/*
	 * public void add_goods() { Scanner keyboard = new Scanner(System.in); //
	 * Receive keyboard value
	 * 
	 * System.out.println("�곕떽占쏙옙釉� 占쎄맒占쎈�뱄옙�� ��遺얜굡��占� 占쎌��占쎌�곤옙釉�占쎄쉭占쎌�� : ");
	 * int new_id=keyboard.nextInt();
	 * System.out.println("�곕떽占쏙옙釉� 占쎄맒占쎈�뱄옙�� 占쎌���깃쑴�� 占쎌��占쎌�곤옙釉�占쎄쉭占쎌�� : ");
	 * String new_gname=keyboard.nextLine(); System.out.
	 * println("�곕떽占쏙옙釉� 占쎄맒占쎈�뱄옙�� �λ��由� 占쎈��占쎌�억옙�� 占쎌��占쎌�곤옙釉�占쎄쉭占쎌�� : "); int
	 * new_stockNum=keyboard.nextInt();
	 * System.out.println("�곕떽占쏙옙釉� 占쎄맒占쎈�뱄옙�� 揶�占썲���뱀�� 占쎌��占쎌�곤옙釉�占쎄쉭占쎌�� : ");
	 * int new_gPrice=keyboard.nextInt();
	 * 
	 * 
	 * }
	 */
}
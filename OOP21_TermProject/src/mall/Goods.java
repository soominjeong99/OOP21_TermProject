package mall;

import java.util.Scanner; //scanner import
//Goods Class

public class Goods {
	int id; // Goods number
	String gName; // name
	int stockNum; // stock
	int gPrice; // price

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
	 * Goods(int id_code, int num, String name, int price) { // ����臾멨����������占쏙옙
	 * id = id_code; stockNum = num; gName = name; gPrice = price; }
	 */
	/*
	 * public void add_goods() { Scanner keyboard = new Scanner(System.in); //
	 * Receive keyboard value
	 * 
	 * System.out.
	 * println("占쎄��썲��������占� ����留�����占쎈���占쏙옙 占쏙옙�븐��援∽옙占썲��占� ����占쏙옙����占쎄낀����占썲����������占쏙옙 : "
	 * ); int new_id=keyboard.nextInt(); System.out.
	 * println("占쎄��썲��������占� ����留�����占쎈���占쏙옙 ����占쏙옙占쎄��댐옙占� ����占쏙옙����占쎄낀����占썲����������占쏙옙 : "
	 * ); String new_gname=keyboard.nextLine(); System.out.
	 * println("占쎄��썲��������占� ����留�����占쎈���占쏙옙 占싸삼옙占썹�깍옙 ����占쏙옙����占쎌�듭��占쏙옙 ����占쏙옙����占쎄낀����占썲����������占쏙옙 : "
	 * ); int new_stockNum=keyboard.nextInt(); System.out.
	 * println("占쎄��썲��������占� ����留�����占쎈���占쏙옙 �띰옙���뀐옙占쏙옙諭�占쏙옙 ����占쏙옙����占쎄낀����占썲����������占쏙옙 : "
	 * ); int new_gPrice=keyboard.nextInt();
	 * 
	 * 
	 * }
	 */
}
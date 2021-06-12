package mall;

public class Order {

	   int orderNum; // Order Number
	   int id; // Goods number
	   String gName; // name
	   int buyNum; //Number of purchases
	   int gPrice; //Price per unit
	   int totalPrice; //Total Price 

	   int orderNum; // 주문번호
	   int id; // 굿즈 넘버
	   String gName; // 이름
	   int buyNum; // 산 갯수
	   int gPrice; // 개당가격
	   int totalPrice; // 총가격


	   int totalPrice() {
	      return buyNum * gPrice;
	   }

	   public int getOrderNum() {
	      return orderNum;
	   }

	   public int getId() {
	      return id;
	   }

	   public String getName() {
	      return gName;
	   }

	   public int getBuyNum() {
	      return buyNum;
	   }

	   public int getTotalPrice() {
	      return totalPrice;
	   }

	   public int getPrice() {
	      return gPrice;
	   }

	   Order(int orderNumber, int id_code, String name, int num, int buyNumber, int perPrice, int tolPrice) { // 생성자
	      orderNum = orderNumber;
	      id = id_code;
	      gName = name;
	      buyNum = buyNumber;
	      gPrice = perPrice;
	      totalPrice = tolPrice;
	   }

	}
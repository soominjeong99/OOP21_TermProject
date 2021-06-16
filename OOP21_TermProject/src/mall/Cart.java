package mall;


//Cart Class
public class Cart {
int id; //goods number
String gName; //name
int stockNum; //stock
int buyNum; //Number of purchases
int gPrice; //Price per unit
int totalPrice; //Total Price 
Goods goods;




  int subStock(int amount){  
        if(stockNum < amount)  
            return 0;  
        stockNum -= amount;  
        return amount;  
    }  
  

  // Quantity



  int addStock(int amount){  
        stockNum += amount;  
        return amount;  
    }  
  

  int totalPrice() {
     return buyNum *gPrice;
  }
  
  public int getId() {
     return id;
     }
  public int getStockNum() {
     return stockNum;
     }
  public int getBuyNum() {
     return buyNum;
     }
  public int getTotalPrice() {
     return totalPrice;
  }
  public String getName() {
     return gName;
     }
  public int getPrice() {
     return gPrice;
     }
  
  public void setId(int id) {
	     this.id = id;
	     }
	  public void setStockNum(int stockNum) {
	     this.stockNum = stockNum;
	     }
	  public void setBuyNum(int buyNum) {
	     this.buyNum = buyNum;
	     }
	  public void setTotalPrice(int totalPrice) {
	     this.totalPrice = totalPrice;
	  }
	  public void setName(String name) {
	     this.gName = name;
	     }
	  public void setPrice(int gPrice) {
	     this.gPrice = gPrice;
	     }
	  
  Cart(int id_code,String name, int num, int buyNumber,int perPrice,int tolPrice){  // �깮�꽦�옄 
        id = id_code;                 
        gName=name;
        stockNum = num;
        buyNum =buyNumber;
        gPrice = perPrice;
        totalPrice = tolPrice;
    }     

  public String toString() {
     return  goods.id+"\t"+ goods.gName+"\t"+goods.stockNum+"\t"+
           buyNum+"\t"+goods.gPrice+"\t"+totalPrice();
     }

}

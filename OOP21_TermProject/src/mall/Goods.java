package mall;

//굿즈 클래스
public class Goods {
 int id; //상품 번호
 int stockNum; //재고
 String gName; //이름
 int gPrice; //가격
 
 //수량 마이너스
   int subStock(int amount){  
         if(stockNum < amount)  
             return 0;  
         stockNum -= amount;  
         return amount;  
     }  
   //수량 플러스
   int addStock(int amount){  
         stockNum += amount;  
         return amount;  
     }  
   
   public int getId() {
      return id;
      }
   public int getStockNum() {
      return stockNum;
      }
   public String getName() {
      return gName;
      }
   public int getPrice() {
      return gPrice;
      }
   
   Goods(int id_code, int num,String name,int price){  // 생성자 
         id = id_code;                 
         stockNum = num;
         gName=name;
         gPrice = price;
     }     



}
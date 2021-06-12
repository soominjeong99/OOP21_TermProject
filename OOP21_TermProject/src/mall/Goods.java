package mall;


import java.util.Scanner; //scanner import
//Goods Class
public class Goods {
 int id; //Goods number
 int stockNum; //stock
 String gName; //name
 int gPrice; //price
 
//Delete Quantity


public class Goods {
 int id; //상품 번호
 int stockNum; //재고
 String gName; //이름
 int gPrice; //가격
 


   int subStock(int amount){  
         if(stockNum < amount)  
             return 0;  
         stockNum -= amount;  
         return amount;  
     }  

 //Plus Quantity

 

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


   /*
   public void add_goods() {
	   Scanner keyboard = new Scanner(System.in); // Receive keyboard value
	 
	   System.out.println("추가할 상품의 코드를 입력하세요 : ");
	   int new_id=keyboard.nextInt();
	   System.out.println("추가할 상품의 이름을 입력하세요 : ");
	   String new_gname=keyboard.nextLine();
	   System.out.println("추가할 상품의 초기 수량을 입력하세요 : ");
	   int new_stockNum=keyboard.nextInt();
	   System.out.println("추가할 상품의 가격을 입력하세요 : ");
	   int new_gPrice=keyboard.nextInt();
	   
		
	}
*/
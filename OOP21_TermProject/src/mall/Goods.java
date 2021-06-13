package mall;


import java.util.Scanner; //scanner import
//Goods Class
public class Goods {
 int id; //Goods number
 int stockNum; //stock
 String gName; //name
 int gPrice; //price
 
//Delete Quantity
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
   
   Goods(int id_code, int num,String name,int price){  // �깮�꽦�옄 
         id = id_code;                 
         stockNum = num;
         gName=name;
         gPrice = price;
     }     


   /*
   public void add_goods() {
	   Scanner keyboard = new Scanner(System.in); // Receive keyboard value
	 
	   System.out.println("異붽��븷 �긽�뭹�쓽 肄붾뱶瑜� �엯�젰�븯�꽭�슂 : ");
	   int new_id=keyboard.nextInt();
	   System.out.println("異붽��븷 �긽�뭹�쓽 �씠由꾩쓣 �엯�젰�븯�꽭�슂 : ");
	   String new_gname=keyboard.nextLine();
	   System.out.println("異붽��븷 �긽�뭹�쓽 珥덇린 �닔�웾�쓣 �엯�젰�븯�꽭�슂 : ");
	   int new_stockNum=keyboard.nextInt();
	   System.out.println("異붽��븷 �긽�뭹�쓽 媛�寃⑹쓣 �엯�젰�븯�꽭�슂 : ");
	   int new_gPrice=keyboard.nextInt();
	   
		
	}
*/
}
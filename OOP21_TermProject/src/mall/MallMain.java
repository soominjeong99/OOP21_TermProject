package mall;

import java.util.*;

public class MallMain {
	static GoodsManager goodsManager = new GoodsManager();
	static CustomerManager customerManager = new CustomerManager();
	static CartManager cartManager = new CartManager();
	static LoginManager loginManager = new LoginManager();

	static boolean isNext = false;
	public static int id;
	public static String pwd;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		MallMain main = new MallMain();
		main.mainMenu();
	}

	public void mainMenu()
	{
		System.out.println("[1] 로그인 \t [2] 회원가입");
		int menu = sc.nextInt();

		switch (menu)
		{
		case 1 :
			System.out.println("ID를 입력하세요.");
			int id = sc.nextInt();
			System.out.println("PassWord를 입력하세요.");
			String pwd = sc.nextLine().trim();
			
			this.id = id;
			this.pwd = pwd;

			loginManager.login(id, pwd);

			break;
		case 2 :
			customerManager.add(customerManager.inputAdd());

			break;
		}

		shopMenu();
	}

	static void shopMenu() 
	{
		isNext = false;
		
		while (!isNext)
		{
			System.out.println("저희 쇼핑몰을 찾아주셔서 감사합니다!");
			System.out.println("[1] 상품 구경 \t [2] 장바구니 \t [3] 내 정보 \t [4] 로그아웃");
			
			int selectMenu = sc.nextInt();
			
			switch (selectMenu)
			{
			case 1 :
				goodsManager.goodsMenu();
				isNext = true;
				break;
				
			case 2 : 
				cartManager.cartMenu();
				isNext = true;
				break;
				
			case 3 : 
				customerManager.customerMenu();
				isNext = true;
				break;
				
				//요 부분은 임시입니다!
				
			case 4 :
				loginManager.logout(id);
				break;
			}
		}
	}
}

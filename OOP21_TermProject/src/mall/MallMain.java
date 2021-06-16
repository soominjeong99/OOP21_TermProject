package mall;

import java.util.*;

public class MallMain {
	static GoodsManager goodsManager = new GoodsManager();
	static CustomerManager customerManager = new CustomerManager();
	static CartManager cartManager = new CartManager();
	static LoginManager loginManager = new LoginManager(customerManager);
	static Customer customer = new Customer();

	static boolean isNext = false;
	public static int id;
	public static String pwd;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		MallMain main = new MallMain();
		main.mainMenu();
	}

	// Start
	public void mainMenu()
	{
		System.out.println("[1] �α��� \t [2] ȸ������");
		int menu = sc.nextInt();

		switch (menu)
		{
		//Login - call LoginManager
		case 1 :
			System.out.println("ID�� �Է��ϼ���.");
			int id = sc.nextInt();
			System.out.println("PassWord�� �Է��ϼ���.");
			String pwd = sc.nextLine().trim(); // remove spaces
			
			this.id = id;
			this.pwd = pwd;

			loginManager.login(id, pwd);

			break;
			
		// Sign up - call CustomerManager
		case 2 :
			customerManager.add(customer);

			break;
		}
		
		//Move to shopMenu
		shopMenu();
	}

	//Shopping Menu
	static void shopMenu() 
	{
		isNext = false;
		
		while (!isNext)
		{
			System.out.println("���� ���θ��� ã���ּż� �����մϴ�!");
			System.out.println("[1] ��ǰ ���� \t [2] ��ٱ��� \t [3] �� ���� \t [4] �α׾ƿ�");
			
			int selectMenu = sc.nextInt();
			
			switch (selectMenu)
			{
			// goods list - Call goodsManager
			case 1 :
				goodsManager.display();
				isNext = true;
				break;
				
			// cart list - Call cartManager
			case 2 : 
				cartManager.display();
				isNext = true;
				break;
				
			// My account - Call customerManager
			case 3 : 
				customerManager.display();
				isNext = true;
				break;
				
				
			// Logout - Call LoginManager	
			case 4 :
				loginManager.logout(id);
				break;
			}
		}
	}
}
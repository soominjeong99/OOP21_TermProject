package mall;

import java.util.*;

public class LoginManager {
	CustomerManager customerManager;
	ArrayList<String> loggedUser; // Customer로부터 login User의 name 받아옴

	public LoginManager(CustomerManager customerManager)
	{
		loggedUser = new ArrayList<>();
		this.customerManager = customerManager;
	}
	
	public void login(int id, String pwd)
	{
		for (int i = 0; i < customerManager.customerArray.length; i++)
		{
			Customer temp = customerManager.customerArray.get(i);
			
			if (temp.getId() == id)
			{
				boolean found = false;
				
				for (int j = 0; j < loggedUser.size(); j++)
				{
					if (loggedUser.get(i) == temp.getName())
					{
						found = true;
						break;
					}
				}
				
				if (found)
				{
					System.out.println("\n이미 로그인 되어 있습니다!");
				}
				else
				{
					if (temp.getPwd() != pwd)
					{
						System.out.println("잘못된 비밀번호입니다!");
						return;
					}
				}
			}
			
			System.out.println("\n등록된 고객 정보가 없습니다!");
		}
	}

	public void logout(int id) {
		for (int i = 0; i < customerManager.customerArray.length; i++)
		{
			Customer temp = customerManager.customer.get(i);
			
			if (temp.getId() == id)
			{
				boolean found = false;
				
				for (int j = 0; j < loggedUser.size(); j++)
				{
					if (loggedUser.get(i) == temp.getName())
					{
						found = true;
						break;
					}
				}
				
				if (!found)
				{
					System.out.println("\n로그인 되어 있지 않습니다!");
				}
				else
				{
					System.out.println(temp.getName() +" 님 로그아웃 하셨습니다!");
					loggedUser.remove(temp.getName());
					return;
				}
			}
		}
	}
	
	public void displayLoggedUser() { // 로그인 유저의 인덱스 받아오기
		for (int i = 0; i < loggedUser.size(); i++)
		{
			System.out.println(loggedUser.get(i));
		}
	}
}
package mall;

/*
=======


import java.util.*;

public class LoginManager {
	CustomerManager customerManager;

	ArrayList<Customer> loggedUser; // Customer로부터 login User의 name 받아옴

	public void login(int id, String pwd)
	{
		
		  customer = customerManager;
	
		Customer customer = customerManager.search(id); // id를 customerManager에서 검색

		if (customer.getPwd().equals(pwd)) // pwd가 맞는지 확인
		{
			loggedUser.add(customer); // ArrayList에 loggedUser 추가
			System.out.println("ID : " + customer.getId() + "NAME: " + customer.getName() + "로그인하셨습니다.");
		}
		else
		{
			System.out.println("비밀번호가 틀렸습니다.");
		} 
		
	}
	
	public void logout(int id) {
		int position = isExist(id); // id가 현재 로그인 중인지 확인

		loggedUser.remove(position); // id의 인덱스를 받아와서 제거
		System.out.println(id + " 님 로그아웃하셨습니다.");
	}
	
	public void displayLoggedUser() { // 로그인 유저의 인덱스 받아오기
		for (int i = 0; i < loggedUser.size(); i++)
		{
			System.out.println(loggedUser.get(i));
		}
	}
	
	public int isExist(int id) {
		for (int i = 0; i < loggedUser.size(); i++)
		{
			if (loggedUser.get(i).getId() == id)
			{
				return i;
			}
		}
		return -1;
	}
}

*/
=======
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


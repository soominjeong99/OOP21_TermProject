package mall;

import java.util.*;

public class LoginManager {
	CustomerManager customerManager;
	ArrayList<String> loggedUser; // Customer�κ��� login User�� name �޾ƿ�

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
					System.out.println("\n�̹� �α��� �Ǿ� �ֽ��ϴ�!");
				}
				else
				{
					if (temp.getPwd() != pwd)
					{
						System.out.println("�߸��� ��й�ȣ�Դϴ�!");
						return;
					}
				}
			}
			
			System.out.println("\n��ϵ� �� ������ �����ϴ�!");
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
					System.out.println("\n�α��� �Ǿ� ���� �ʽ��ϴ�!");
				}
				else
				{
					System.out.println(temp.getName() +" �� �α׾ƿ� �ϼ̽��ϴ�!");
					loggedUser.remove(temp.getName());
					return;
				}
			}
		}
	}
	
	public void displayLoggedUser() { // �α��� ������ �ε��� �޾ƿ���
		for (int i = 0; i < loggedUser.size(); i++)
		{
			System.out.println(loggedUser.get(i));
		}
	}
}
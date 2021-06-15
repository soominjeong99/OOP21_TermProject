package mall;

import java.util.*;

public class LoginManager {
	CustomerManager customerManager;

	/*ArrayList<Customer> loggedUser; // Customer濡�遺��� login User�� name 諛�����

	public void login(int id, String pwd)
	{
		
		  customer = customerManager;
	
		Customer customer = customerManager.search(id); // id瑜� customerManager���� 寃���

		if (customer.getPwd().equals(pwd)) // pwd媛� 留���吏� ����
		{
			loggedUser.add(customer); // ArrayList�� loggedUser 異�媛�
			System.out.println("ID : " + customer.getId() + "NAME: " + customer.getName() + "濡�洹몄�명���⑥�듬����.");
		}
		else
		{
			System.out.println("鍮�諛�踰��멸� ���몄�듬����.");
		} 
		
	}
	
	public void logout(int id) {
		int position = isExist(id); // id媛� ���� 濡�洹몄�� 以��몄� ����

		loggedUser.remove(position); // id�� �몃�깆�ㅻ�� 諛������� ��嫄�
		System.out.println(id + " �� 濡�洹몄�������⑥�듬����.");
	}
	
	public void displayLoggedUser() { // 濡�洹몄�� ������ �몃�깆�� 諛����ㅺ린
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
	ArrayList<String> loggedUser; // Customer濡�遺��� login User�� name 諛�����

	public LoginManager(CustomerManager customerManager)
	{
		loggedUser = new ArrayList<>();
		this.customerManager = customerManager;
	}
	
	public void login(int id, String pwd)
	{
		for (int i = 0; i < customerManager.customerArray.size(); i++)
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
					System.out.println("\n�대�� 濡�洹몄�� ���� ���듬����!");
				}
				else
				{
					if (temp.getPwd() != pwd)
					{
						System.out.println("��紐삳�� 鍮�諛�踰��몄������!");
						return;
					}
				}
			}
			
			System.out.println("\n�깅��� 怨�媛� ��蹂닿� ���듬����!");
		}
	}

	public void logout(int id) {
		for (int i = 0; i < customerManager.customerArray.size(); i++)
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
				
				if (!found)
				{
					System.out.println("\n濡�洹몄�� ���� ��吏� ���듬����!");
				}
				else
				{
					System.out.println(temp.getName() +" �� 濡�洹몄���� ���⑥�듬����!");
					loggedUser.remove(temp.getName());
					return;
				}
			}
		}
	}
	
	public void displayLoggedUser() { // 濡�洹몄�� ������ �몃�깆�� 諛����ㅺ린
		for (int i = 0; i < loggedUser.size(); i++)
		{
			System.out.println(loggedUser.get(i));
		}
	}
}


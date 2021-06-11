package mall;

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
			System.out.println("ID : " + customer.getId() + "NAME: " + customer.getName() + "로그인하셨습니다."");
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


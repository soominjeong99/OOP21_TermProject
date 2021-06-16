package mall;

import java.util.*;

public class LoginManager {
	CustomerManager customerManager;
	ArrayList<String> loggedUser; // Receive login user's name from customer

	public LoginManager(CustomerManager customerManager) {
		loggedUser = new ArrayList<>();
		this.customerManager = customerManager;
	}

	public void login(int id, String pwd) {
		// Make sure ID and password are on the customers list
		for (int i = 0; i < customerManager.customers.size(); i++) {
			Customer temp = customerManager.customers.get(i);

			// Matching ID with log in users
			if (temp.getId() == id) {
				boolean found = false;

				for (int j = 0; j < loggedUser.size(); j++) {
					if (loggedUser.get(i) == temp.getName()) {
						found = true;
						break;
					}
				}

				// if loggedUser already exist
				if (found) {
					System.out.println("\n이미 로그인 되어 있습니다!");
				}
				// if new loggedUser - password matching
				else {
					if (temp.getPwd() != pwd) {
						System.out.println("잘못된 비밀번호입니다!");
						return;
					}
				}
			}

			System.out.println("\n등록된 고객 정보가 없습니다!");
		}
	}

	public void logout(int id) {

		// Make sure ID and password are on the customers list
		for (int i = 0; i < customerManager.customers.size(); i++) {
			Customer temp = customerManager.customers.get(i);

			// Matching ID with log in users
			if (temp.getId() == id) {
				boolean found = false;

				for (int j = 0; j < loggedUser.size(); j++) {
					if (loggedUser.get(i) == temp.getName()) {
						found = true;
						break;
					}
				}

				// if user trying to log out is not logged in
				if (!found) {
					System.out.println("\n로그인 되어 있지 않습니다!");
				}

				// if logged in user is trying to log out
				else {
					System.out.println(temp.getName() + " 님 로그아웃 하셨습니다!");
					loggedUser.remove(temp.getName());
					return;
				}
			}
		}
	}

	public void displayLoggedUser() { // Get the index of the logged in user
		for (int i = 0; i < loggedUser.size(); i++) {
			System.out.println(loggedUser.get(i));
		}
	}
}
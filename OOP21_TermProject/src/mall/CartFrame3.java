package mall;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


//Reads the shopping cart list from a file and prints it to the console
public class CartFrame3 extends JFrame {
	public static void main(String[] args) throws IOException {
		String file = "Cart.txt";
		Scanner sc = new Scanner(new FileReader(file));
		ArrayList<Cart> arrayCart = new ArrayList<>();
		while (sc.hasNextLine())
		{
			String temp = sc.nextLine();
			String[] split = temp.split("/");
			
			//casting
			int id = Integer.parseInt(split[0]);
			String name = split[1];
			int num = Integer.parseInt(split[2]);
			int buyNumber = Integer.parseInt(split[3]);
			int perPrice = Integer.parseInt(split[4]);
			int tolPrice = Integer.parseInt(split[5]);
			
			Cart c = new Cart(id, name, num, buyNumber, perPrice, tolPrice);
			
			arrayCart.add(c);
		}
		
		for (Cart cart : arrayCart)
		{
			System.out.println(cart);
		}
		
	}
}

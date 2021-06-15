package mall;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;

public class CartFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public CartFrame() throws FileNotFoundException {
		
		String file = "Cart.txt";
		
		String[] columns = new String[] {
				"No.", "이름", "재고수량", "갯수", "가격", "총 가격"
		};
		
		Scanner sc = new Scanner(new FileReader(file)); // cart database에서 읽어오기

		ArrayList<Cart> arrayCart = new ArrayList<Cart>();

		while (sc.hasNextLine())
		{
			String temp = sc.nextLine();
			String[] split = temp.split("/");
			
			int id = Integer.parseInt(split[0]);
			String name = split[1];
			int num = Integer.parseInt(split[2]);
			int buyNumber = Integer.parseInt(split[3]);
			int perPrice = Integer.parseInt(split[4]);
			int tolPrice = Integer.parseInt(split[5]);
			
			Cart c = new Cart(id, name, num, buyNumber, perPrice, tolPrice);
			
			arrayCart.add(c);
		}

		sc.close();

		String[][] stringArray = arrayCart.stream().toArray(String[][]::new);

		JTable table = new JTable(stringArray, columns);

		this.add(new JScrollPane(table));

		this.setTitle("Cart");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartFrame cartFrame = new CartFrame();
					cartFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
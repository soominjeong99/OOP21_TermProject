package mall;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class CartFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public void Table() throws FileNotFoundException {
		String[] columns = new String[] {
				"No.", "이름", "갯수", "가격", "총 가격"
		};

		ArrayList<String> list = new ArrayList<String>();

		Scanner sc = new Scanner(new File("Cart.txt"), "UTF-8"); // cart database에서 읽어오기

		while (sc.hasNext())
		{
			list.add(sc.nextLine().split(" "));
		}

		sc.close();

		String[][] stringArray = list.stream().toArray(String[][]::new);

		for (String[] array : stringArray)
		{
			array[3] = new DecimalFormat("#,##0").format(Integer.parseInt(array[3]));
		}
		
		JTable table = new JTable(stringArray, columns);

		this.add(new JScrollPane(table));

		this.setTitle("Cart");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args)
	{ 
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CartFrame();
			}
		});
	}
}
package mall;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;


public class CartFrame2 extends JFrame {
	private static final String goodsName = null;

	public static void main(String[] args)
	{
		JFrame jframe = new JFrame();
		jframe.setBounds(50, 50, 500, 300);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);

		JPanel jpanel = new JPanel();
		jpanel.setLayout(null);
		jframe.add(jpanel);

		JTextArea ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		jsp.setSize(500, 300);
		jframe.add(jsp);

		ta.setText("장바구니 보기");
		
		Cart cart = new Cart(2, goodsName, 5, 2000, 2, 4000);
		
		ArrayList<Cart> list = new ArrayList<Cart>();
		
		String[] temp = {"6", "원피스", "5", "20000", "2", "40000"};
		
		int id = Integer.parseInt(temp[0]);
		String gName = temp[1];
		int stockNum = Integer.parseInt(temp[2]);
		int gPrice = Integer.parseInt(temp[3]);
		int buyNum = Integer.parseInt(temp[4]);
		int totalPrice = Integer.parseInt(temp[5]);
		list.add(new Cart(id, gName, stockNum, gPrice, buyNum, totalPrice));
		
		for (int i = 0; i < list.size(); i++)
		{
			ta.append(list.get(i).toString() + "\n");
		}
	}
}
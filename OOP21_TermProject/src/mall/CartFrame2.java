package mall;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

//Print the shopping cart list serially
public class CartFrame2 extends JFrame {

	public static void main(String[] args)
	{
		//Set Frame
		JFrame jframe = new JFrame();
		jframe.setBounds(50, 50, 500, 300);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setTitle("장바구니 보기");

		JPanel jpanel = new JPanel();
		jpanel.setLayout(null);
		jframe.add(jpanel);

		// Typing area
		JTextField tf = new JTextField();
		tf.setSize(300, 30);
		tf.setLocation(5, 5);
		jpanel.add(tf);


		// Print area
		JTextArea ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		jsp.setSize(300, 200);
		jsp.setLocation(5, 50);
		jframe.add(jsp);

		ta.setText("입력 : 상품 번호, 이름, 재고 수량, 개당 가격, 구매 수량, 총 가격\n" + "검색 / 수정 / 삭제 시 이름 입력 \n");

		JButton input = new JButton("입력");
		jpanel.add(input);
		input.setBounds(350, 20, 100, 30);

		JButton output = new JButton("출력");
		jpanel.add(output);
		output.setBounds(350, 60, 100, 30);

		JButton search = new JButton("검색");
		jpanel.add(search);
		search.setBounds(350, 100, 100, 30);

		JButton modify = new JButton("수정");
		jpanel.add(modify);
		modify.setBounds(350, 140, 100, 30);

		JButton delete = new JButton("삭제");
		jpanel.add(delete);
		delete.setBounds(350, 180, 100, 30);

		JButton exit = new JButton("종료");
		jpanel.add(exit);
		exit.setBounds(350, 220, 100, 30);


		//		Cart cart = new Cart(2, goodsName, 5, 2000, 2, 4000);

		ArrayList<Cart> cartList = new ArrayList<Cart>();

		//input button event
		input.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				String[] temp = tf.getText().split(" ");

				//Casting
				int id = Integer.parseInt(temp[0]);
				String gName = temp[1];
				int stockNum = Integer.parseInt(temp[2]);
				int gPrice = Integer.parseInt(temp[3]);
				int buyNum = Integer.parseInt(temp[4]);
				int totalPrice = Integer.parseInt(temp[5]);
				cartList.add(new Cart(id, gName, stockNum, gPrice, buyNum, totalPrice));
				ta.append(tf.getText() + "\n");
			}
		});

		//output button event
		output.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0; i < cartList.size(); i++)
				{
					ta.append(cartList.get(i).toString() + "\n");
				}
			}
		});


		//search button event
		search.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				String name = tf.getText();
				Iterator<Cart> it = cartList.iterator();
				while (it.hasNext())
				{
					Cart temp = it.next();
					//search by name
					if (temp.getName().equals(name))
					{
						ta.setText(temp.toString() + "\n");
					}
				}
			}
		});

		//modify button event
		modify.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				String[] name1 = tf.getText().split(" ");
				int id = Integer.parseInt(name1[0]);
				String gName = name1[1];
				int stockNum = Integer.parseInt(name1[2]);
				int gPrice = Integer.parseInt(name1[3]);
				int buyNum = Integer.parseInt(name1[4]);
				int totalPrice = Integer.parseInt(name1[5]);

				Iterator<Cart> it1 = cartList.iterator();

				while (it1.hasNext())
				{
					Cart temp = it1.next();

					if (temp.getName().equals(name1[1]))
					{
						temp.setId(id);
						temp.setBuyNum(buyNum);
					}
				}
			}
		});

		//delete button event
		delete.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				int num = 0;
				String name2 = tf.getText();
				Iterator<Cart> it2 = cartList.iterator();
				while (it2.hasNext())
				{
					Cart temp = it2.next();

					if (temp.getName().equals(name2))
					{
						cartList.remove(num);
					}
					num++;
				}
			}
		});

		//exit button event
		exit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
	}
}
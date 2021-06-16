package mall;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

//Managing Goods
public class GoodsManager extends JFrame implements Manager {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoodsManager frames = new GoodsManager();
					frames.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Goods> goodsArray = new ArrayList<Goods>();// Array of goods
	int itemCount = 0;

	@Override
	// Add
	public void add(Object o) {

		goodsArray.add((Goods) o);
		itemCount++;

	}

	@Override
	// Remove(Delete)
	public void remove(int i) {
		try {
			// Search the index of goods ID and remove the index
			for (int k = 0; k < goodsArray.size(); k++) {
				if (goodsArray.get(k).id == i) {
					goodsArray.remove(k);
					itemCount--;
				}

			}
		} catch (Exception e) {

		}

	}

	@Override
	// Modify
	public void modify(int i, Object o) throws Exception {

		try {
			// Search the index of goods ID and modify the contents
			for (int k = 0; k < goodsArray.size(); k++) {
				if (goodsArray.get(k).id == i) {
					goodsArray.set(k, (Goods) o);
				}
			}

		} catch (Exception e) {
			throw new Exception("물품 없음");
		}

	}

	@Override
	// Print the entire contents to the screen
	public void display() {
		for (Goods goods : goodsArray) {
			System.out.println(goods);
		}
	}

	public GoodsManager() {
		setTitle("*재고관리*");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel_1 = new JLabel("재고관리");
		lblNewLabel_1.setBounds(184, 10, 90, 31);
		contentPane.add(lblNewLabel_1);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(77, 51, 292, 152);
		contentPane.add(textArea);

		JButton btnNewButton_1 = new JButton("재고 출력하기");
		btnNewButton_1.setBounds(151, 207, 138, 31);
		contentPane.add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int j = 0; j < goodsArray.size(); j++) {
					textArea.append("" + goodsArray.get(j) + "\n");
				}
			}
		});

	}

}
package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;

public class StockMangerFrame extends JFrame {
	ArrayList<Goods> goodsArray = new ArrayList<Goods>();// Array of goods
	int itemCount = 0;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockMangerFrame frame = new StockMangerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Add
	public void add(Object o) {

		goodsArray.add((Goods) o);
		itemCount++;

	}

	@Override
	// Remove(Delete)
	public void remove(int i) {
	
			// Search the index of goods ID and remove the index
			for (int k = 0; k < goodsArray.size(); k++) {
				if (goodsArray.get(k).id == i) {
					goodsArray.remove(k);
					itemCount--;
				}
			}

		
	}

	
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
			throw new Exception("오류");
		}

	}


	/**
	 * Create the frame.
	 */
	public StockMangerFrame() {
		setTitle("*재고관리*");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("재고관리");
		lblNewLabel.setBounds(178, 23, 82, 34);
		contentPane.add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(49, 53, 320, 186);
		contentPane.add(list);
		
		for (Goods goods : goodsArray) {
			
			System.out.println(goods);
		}
	}
}

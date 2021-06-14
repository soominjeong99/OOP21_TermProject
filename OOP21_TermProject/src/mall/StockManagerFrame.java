package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StockManagerFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockManagerFrame frame = new StockManagerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StockManagerFrame() {
		
		setTitle("재고 관리창"); //title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("상품 등록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockRegister.main(null);
			}
		});
		btnNewButton.setBounds(172, 39, 118, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("상품 관리");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockManaging.main(null);
			}
		});
		btnNewButton_1.setBounds(172, 107, 118, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("상품 검색");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockSearch.main(null);
			}
		});
		btnNewButton_2.setBounds(172, 173, 118, 44);
		contentPane.add(btnNewButton_2);
	}
}

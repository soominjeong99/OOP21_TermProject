package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.Font;
import javax.swing.JLabel;

public class ManagerFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerFrame frame = new ManagerFrame();
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
	public ManagerFrame() {
		setTitle("������ ���� �޴�â"); //title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("�� ����");
		btnNewButton.setBounds(71, 143, 137, 50);
		contentPane.add(btnNewButton);
		
		//�� ���� �������� �̵�
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			UserListFrame.main(null);
						}
		});
		
		JButton btnNewButton_1 = new JButton("��� ����");
		btnNewButton_1.setBounds(240, 143, 137, 50);
		contentPane.add(btnNewButton_1);
		//��� ���� �������� �̵�
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			StockManagerFrame.main(null);
						}
		});
		
		JLabel lblNewLabel = new JLabel("������ ���");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel.setBounds(167, 68, 113, 40);
		contentPane.add(lblNewLabel);
		
	
	}
}

package mall;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Frame that appears after user login
 * 1. Shopping -> Shopping
 * 2. Cart -> CartFrame2
 * 3. Logout
 */

public class UserFrameLogin extends JFrame {

	private JPanel contentPane;
	MyFrame frame = new MyFrame();

	public UserFrameLogin() {
		super("�����ϱ�"); // title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Button for shopping
		JButton shopping = new JButton("����");
		shopping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Shopping();
				setVisible(false);
			}
		});
		shopping.setBounds(172, 39, 118, 44);
		contentPane.add(shopping);

		//Button for going cart
		JButton cart = new JButton("��ٱ���");
		cart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CartFrame2();
				setVisible(false); // â �Ⱥ��̰� �ϱ�
			}
		});
		cart.setBounds(172, 107, 118, 44);
		contentPane.add(cart);

		//Button for logging out
		JButton logout = new JButton("�α׾ƿ�");
		logout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�α׾ƿ� �Ǿ����ϴ�");
				setVisible(false); // â �Ⱥ��̰� �ϱ�
			}
		});

		logout.setBounds(172, 173, 118, 44);
		contentPane.add(logout);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

	}
}

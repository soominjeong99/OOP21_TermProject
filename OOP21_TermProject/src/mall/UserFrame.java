package mall;

import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/*
 * Frame that users can login and signup
 * 1. loginFrame
 * 2. SignUpFrame
 */

class UserFrame extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	UserFrame() {
		super("����� ���� �޴�â"); // Ÿ��Ʋ
		// JPanel jPanel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JButton login = new JButton("�α���");
		login.setBounds(172, 60, 118, 44);
		contentPane.add(login);

		JButton singup = new JButton("ȸ������");
		singup.setBounds(172, 130, 118, 44);
		contentPane.add(singup);

		JButton Cart = new JButton("��ٱ��� ����"); // �α��� ����

		//if user clicks login button
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new loginFrame();
				setVisible(false); // â �Ⱥ��̰� �ϱ�
			}
		});
		
		//if user clicks signup button
		singup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUpFrame();
				setVisible(false); // â �Ⱥ��̰� �ϱ�
			}
		});

	}
}

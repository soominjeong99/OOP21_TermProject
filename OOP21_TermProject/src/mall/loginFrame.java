package mall;

import javax.swing.*;

import java.awt.TextField;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//�α��� ������
public class loginFrame extends JFrame {

	public loginFrame() {

		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("PassWord : ");
		JTextField txtID = new JTextField(10);
		TextField txtPass = new TextField(10);
		add(txtPass);
		txtPass.setEchoChar('*');// ��ȣȭ
		JButton logBtn = new JButton("Log in");

		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);

		logBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {
				try {
					String s;
					String[] array;
					BufferedReader bos = new BufferedReader(new FileReader("members.txt"));
					while ((s = bos.readLine()) != null) {
						array = s.split("/");
						if (txtID.getText().equals(array[0]) && txtPass.getText().equals(array[1])) {
							JOptionPane.showMessageDialog(null, "�α��� ����");
							new UserFrameLogin();
						} else {
							JOptionPane.showMessageDialog(null, "�α��� ����");
						}
					}
					bos.close();
				} catch (IOException E10) {
					System.out.println("���� �о���� ����");
				}
			}
		});

		add(panel);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

package mall;

import javax.swing.*;
import java.awt.event.*;

//로그인 프레임
public class loginFrame extends JFrame {

	public loginFrame() {

		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("PassWord : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		JButton logBtn = new JButton("Log in");

		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);

		logBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String id = "SUBIN";
				String pass = "1234";

				if (id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {

					JOptionPane.showMessageDialog(null, "로그인 성공");
					new UserFrameLogin();
					setVisible(false);
				} else {

					JOptionPane.showMessageDialog(null, " 로그인 실패 ");

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

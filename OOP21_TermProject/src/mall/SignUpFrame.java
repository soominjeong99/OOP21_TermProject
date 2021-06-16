package mall;

import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

//Sign up
class SignUpFrame extends JFrame implements ActionListener {

	JPanel panel;
	JLabel lblid, lblpw, lblname, lblemail, lbladdr;
	JButton Signup, Quit;
	JTextField txtid, txtpw, txtname, txtemail, txtaddr;

	SignUpFrame() {

		setTitle("ȸ������ â");

		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		lblid = new JLabel("ID");
		lblpw = new JLabel("PW");
		lblname = new JLabel("NAME");
		lblemail = new JLabel("EMAIL");
		lbladdr = new JLabel("ADDREES");

		txtid = new JTextField(10);
		txtpw = new JTextField(10);
		txtname = new JTextField(10);
		txtemail = new JTextField(20);
		txtaddr = new JTextField(30);

		Signup = new JButton("����");
		Quit = new JButton("���");

		panel.add(lblid);
		panel.add(txtid);
		panel.add(lblpw);
		panel.add(txtpw);
		panel.add(lblname);
		panel.add(txtname);
		panel.add(lblemail);
		panel.add(txtemail);
		panel.add(lbladdr);
		panel.add(txtaddr);
		panel.add(Signup);
		panel.add(Quit);

		add(panel);

		Signup.addActionListener(this);
		Quit.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			String s = null;
			boolean isOk = false;
			// �޸��忡 ����
			BufferedWriter bw = new BufferedWriter(new FileWriter("members.txt", true));
			BufferedReader br = new BufferedReader(new FileReader("members.txt"));

			if (e.getSource() == Signup) {
				while ((s = br.readLine()) != null) {

					// ���̵� �ߺ�
					String[] array = s.split("/");
					if (array[0].equals(txtid.getText())) {
						isOk = true;
						break;
					}
				}
				// ���� �Է½� �ߺ��� ������ ������ ����
				if (!isOk) {
					bw.write(txtid.getText() + "/");
					bw.write(txtpw.getText() + "/");
					bw.write(txtname.getText() + "/");
					bw.write(txtemail.getText() + "/");
					bw.write(txtaddr.getText() + "\r\n");
					bw.close();

					JOptionPane.showMessageDialog(null, "ȸ�������� �����մϴ�.");
					new UserFrame();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "ȸ�����Կ� �����Ͽ����ϴ�.");
				}

			} else if (e.getSource() == Quit) {
				txtid.setText("");
				txtpw.setText("");
				txtname.setText("");
				txtemail.setText("");
				txtaddr.setText("");
				dispose();
			}
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "����");
		}
	}

}

package mall;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Edit extends StockManagerFrame implements ActionListener {
	MyFrame frame3 = new MyFrame();
	JButton eName = new JButton("��ǰ �̸�");
	JButton eNum = new JButton("��ǰ ����");
	JButton ePrice = new JButton("��ǰ ����");
	JButton eConfirm = new JButton("Ȯ��");
	JButton eCancel = new JButton("���");

	private JTextField tName;
	private JTextField tNum;
	private JTextField tPrice;

	int index;
	String name = null, num = null, price = null;

	public Edit(int index) {
		frame3.getContentPane().setEnabled(false);
		frame3.setTitle("����");
		frame3.setSize(409, 295);
		frame3.setLocation(550, 350);
		frame3.setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);

		this.index = index - 1;

		JLabel lblNewLabel = new JLabel("����");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel.setBounds(20, 20, 47, 23);
		frame3.getContentPane().add(lblNewLabel);

		eName.setBounds(275, 65, 105, 25);
		frame3.getContentPane().add(eName);

		eNum.setBounds(275, 95, 105, 25);
		frame3.getContentPane().add(eNum);

		ePrice.setBounds(275, 125, 105, 25);
		frame3.getContentPane().add(ePrice);

		eConfirm.setBounds(61, 222, 105, 25);
		frame3.getContentPane().add(eConfirm);

		eCancel.setBounds(218, 222, 105, 25);
		frame3.getContentPane().add(eCancel);

		JLabel name = new JLabel("��ǰ�� : ");
		name.setBounds(12, 70, 57, 15);
		frame3.getContentPane().add(name);

		JLabel age = new JLabel("��ǰ���� : ");
		age.setBounds(12, 100, 83, 15);
		frame3.getContentPane().add(age);

		JLabel sex = new JLabel("��ǰ���� : ");
		sex.setBounds(12, 130, 83, 15);
		frame3.getContentPane().add(sex);

		tName = new JTextField();
		tName.setEditable(false);
		tName.setBounds(60, 70, 198, 21);
		frame3.getContentPane().add(tName);
		tName.setColumns(10);

		tNum = new JTextField();
		tNum.setEditable(false);
		tNum.setColumns(10);
		tNum.setBounds(73, 100, 185, 21);
		frame3.getContentPane().add(tNum);

		tPrice = new JTextField();
		tPrice.setEditable(false);
		tPrice.setColumns(10);
		tPrice.setBounds(73, 130, 185, 21);
		frame3.getContentPane().add(tPrice);

		tName.setText(list.get(this.index).getgName());
		tNum.setText(String.valueOf(list.get(this.index).getStockNum()));
		tPrice.setText(String.valueOf(list.get(this.index).getgPrice()));

		frame3.setVisible(true);
		eName.addActionListener(this);
		eNum.addActionListener(this);
		ePrice.addActionListener(this);
		eConfirm.addActionListener(this);
		eCancel.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		int check;
		if (e.getSource() == eName) {
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + "��ǰ�� : " + tName.getText(), "�޽���",
					JOptionPane.INFORMATION_MESSAGE);
			if (check == 0) {
				name = JOptionPane.showInputDialog("������ ��ǰ���� �Է��ϼ���", list.get(this.index).getgName());
				tName.setText(name);
				if (name == null) {
					tName.setText(list.get(this.index).getgName());
				}
			}
		} else if (e.getSource() == eNum) {
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + "ȸ�� ���� : " + tNum.getText(), "�޽���",
					JOptionPane.INFORMATION_MESSAGE);
			if (check == 0) {
				num = JOptionPane.showInputDialog("������ ���̸� �Է��ϼ���", list.get(this.index).getStockNum());
				tNum.setText(num);
				if (num == null) {
					tNum.setText(String.valueOf(list.get(this.index).getStockNum()));
				}
			}
		} else if (e.getSource() == ePrice) {
			check = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?\n" + "��ȭ��ȣ : " + tPrice.getText(), "�޽���",
					JOptionPane.INFORMATION_MESSAGE);
			if (check == 0) {
				price = JOptionPane.showInputDialog("������ ��ȭ��ȣ�� �Է��ϼ���", list.get(this.index).getgPrice());
				tPrice.setText(price);
				if (price == null) {
					tPrice.setText(String.valueOf(list.get(this.index).getgPrice()));
				}
			}
		}

		if (e.getSource() == eConfirm) {
			if (name != null) {
				list.get(this.index).setgName(this.name);
			}
			if (num != null) {
				list.get(this.index).setStockNum(Integer.parseInt(this.num));
			}
			if (price != null) {
				list.get(this.index).setgPrice(Integer.parseInt(this.price));
			}

			frame3.dispose();
			StockManaging sm = new StockManaging();
		} else if (e.getSource() == eCancel) {
			frame3.dispose();
			StockManaging sm = new StockManaging();
		}
		// list.get(this.index).setName(name);
	}
}

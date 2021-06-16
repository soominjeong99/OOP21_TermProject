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
	JButton eName = new JButton("상품 이름");
	JButton eNum = new JButton("상품 수량");
	JButton ePrice = new JButton("상품 가격");
	JButton eConfirm = new JButton("확인");
	JButton eCancel = new JButton("취소");

	private JTextField tName;
	private JTextField tNum;
	private JTextField tPrice;

	int index;
	String name = null, num = null, price = null;

	public Edit(int index) {
		frame3.getContentPane().setEnabled(false);
		frame3.setTitle("수정");
		frame3.setSize(409, 295);
		frame3.setLocation(550, 350);
		frame3.setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);

		this.index = index - 1;

		JLabel lblNewLabel = new JLabel("수정");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
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

		JLabel name = new JLabel("상품명 : ");
		name.setBounds(12, 70, 57, 15);
		frame3.getContentPane().add(name);

		JLabel age = new JLabel("상품수량 : ");
		age.setBounds(12, 100, 83, 15);
		frame3.getContentPane().add(age);

		JLabel sex = new JLabel("상품가격 : ");
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
			check = JOptionPane.showConfirmDialog(this, "수정하시겠습니까?\n" + "상품명 : " + tName.getText(), "메시지",
					JOptionPane.INFORMATION_MESSAGE);
			if (check == 0) {
				name = JOptionPane.showInputDialog("수정할 상품명을 입력하세요", list.get(this.index).getgName());
				tName.setText(name);
				if (name == null) {
					tName.setText(list.get(this.index).getgName());
				}
			}
		} else if (e.getSource() == eNum) {
			check = JOptionPane.showConfirmDialog(this, "수정하시겠습니까?\n" + "회원 나이 : " + tNum.getText(), "메시지",
					JOptionPane.INFORMATION_MESSAGE);
			if (check == 0) {
				num = JOptionPane.showInputDialog("수정할 나이를 입력하세요", list.get(this.index).getStockNum());
				tNum.setText(num);
				if (num == null) {
					tNum.setText(String.valueOf(list.get(this.index).getStockNum()));
				}
			}
		} else if (e.getSource() == ePrice) {
			check = JOptionPane.showConfirmDialog(this, "수정하시겠습니까?\n" + "전화번호 : " + tPrice.getText(), "메시지",
					JOptionPane.INFORMATION_MESSAGE);
			if (check == 0) {
				price = JOptionPane.showInputDialog("수정할 전화번호를 입력하세요", list.get(this.index).getgPrice());
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

package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//Registering stock
public class StockRegister extends StockManagerFrame implements ActionListener {
	private JTextField id;
	private JTextField stockNum; // the number of stock
	private JTextField gName;
	private JTextField gPrice;
	MyFrame frame = new MyFrame();
	JButton bt1 = new JButton("���");
	JButton bt2 = new JButton("���");
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockRegister frame = new StockRegister();
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
	public StockRegister() {
		setTitle("��ǰ ���"); // title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 330);
		frame.setLocation(500, 300);		
		

		JLabel pId = new JLabel("��ǰ ID :");
		pId.setBounds(27, 25, 90, 30);
		frame.getContentPane().add(pId);

		JLabel pName = new JLabel("��ǰ �̸� :");
		pName.setBounds(27, 65, 90, 30);
		frame.getContentPane().add(pName);

		JLabel pNum = new JLabel("��ǰ ���� :");
		pNum.setBounds(27, 105, 90, 30);
		frame.getContentPane().add(pNum);

		JLabel pPrice = new JLabel("��ǰ ���� :");
		pPrice.setBounds(27, 145, 90, 30);
		frame.getContentPane().add(pPrice);

		id = new JTextField();
		id.setColumns(10);
		id.setBounds(97, 30, 62, 21);
		if(list.size() != 0){
			id.setText((list.get(list.size()-1).getId()+1)+"");
		}else{
			id.setText(1001 + "");
		}
		frame.getContentPane().add(id);

		gName = new JTextField();
		gName.setColumns(10);
		gName.setBounds(97, 70, 62, 21);
		frame.getContentPane().add(gName);
		
		stockNum = new JTextField();
		stockNum.setColumns(10);
		stockNum.setBounds(97, 110, 62, 21);
		frame.getContentPane().add(stockNum);
		
		gPrice = new JTextField();
		gPrice.setColumns(10);
		gPrice.setBounds(97, 150, 62, 21);
		frame.getContentPane().add(gPrice);

		bt1.setBounds(97, 232, 97, 40);
		frame.getContentPane().add(bt1);

		bt2.setBounds(280, 232, 97, 40);
		frame.getContentPane().add(bt2);

		frame.setVisible(true);

		bt1.addActionListener(this);
		bt2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bt1) {
			String goodsId = id.getText();
			String goodsName = gName.getText();
			String goodsNum = stockNum.getText();
			String goodsPrice = gPrice.getText();

			if (goodsId.equals("")) {
				JOptionPane.showMessageDialog(this, "��ǰ ID�� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			} else if (goodsName.equals("")) {
				JOptionPane.showMessageDialog(this, "��ǰ �̸��� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			} else if (goodsNum.equals("")) {
				JOptionPane.showMessageDialog(this, "��ǰ ������ �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
			} else if (goodsPrice.equals("")) {
				JOptionPane.showMessageDialog(this, "��ǰ ���ݸ� �Է��� �ּ���", "�޽���", JOptionPane.INFORMATION_MESSAGE);
					} else {
				for (int i = 0; i < list.size(); i++) {
					if (goodsId.equals(list.get(i).getId())) {
						JOptionPane.showMessageDialog(this, "������ ��ǰID�� �ֽ��ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				if (!integerOrNot(goodsId)) {
					JOptionPane.showMessageDialog(this, "��ǰ ID �� ���ڸ� �Է��� �� �����ϴ�.", "�޽���",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (!integerOrNot(goodsNum)) {
					JOptionPane.showMessageDialog(this, "��ǰ ������ ���ڸ� �Է��� �� �����ϴ�.", "�޽���",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (!integerOrNot(goodsPrice)) {
					JOptionPane.showMessageDialog(this, "��ǰ ������ ���ڸ� �Է��� �� �����ϴ�.", "�޽���",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					int check = JOptionPane.showConfirmDialog(this,
							"�Է��� ������ �½��ϱ�?\n" + "��ǰ ID : " + goodsId + "\n��ǰ �̸� : " + goodsName
									+ "\n��ǰ ���� : " + goodsNum + "\n��ǰ ���� : " + goodsPrice,
							"�޽���", JOptionPane.INFORMATION_MESSAGE);
					if (check == 0) {
						Goods g = new Goods();
						g.setId(Integer.parseInt(goodsId));
						g.setgName(goodsName);
						g.setStockNum(Integer.parseInt(goodsNum));
						g.setgPrice(Integer.parseInt(goodsPrice));
				;
						list.add(g);
						JOptionPane.showMessageDialog(this, "��ǰ�� ��ϵǾ����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
						int check2 = JOptionPane.showConfirmDialog(this, "��� �Է��Ͻðڽ��ϱ�?");
						if (check2 == 0) {
							id.setText(list.get(list.size() - 1).getId() + 1 + "");
							gName.setText(null);
							stockNum.setText(null);
							gPrice.setText(null);
						} else if (check2 == 1) {
							frame.setVisible(false);
						}
					}
				}
			}
		} else if (e.getSource() == bt2) {
			frame.dispose();
		}
	}

	public boolean integerOrNot(String strData) { // �Է°��� �������� �������� �Ǻ� :
		char[] charData = strData.toCharArray();
		boolean check = true;
		while (check) {
			for (int i = 0; i < charData.length; i++) {
				if (!Character.isDigit(charData[i])) {
					check = !check;
					break;
				}
			}
			break;
		}
		return check;
	}
}

package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

//Searching Stock
public class StockSearch extends StockManagerFrame implements ActionListener {

	MyFrame frame5 = new MyFrame();
	JButton sID = new JButton("상품 ID");
	JButton sName = new JButton("상품명");
	// JButton sAll = new JButton("전체 상품");
	JButton sCancel = new JButton("취소");
	JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockSearch frame = new StockSearch();
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
	public StockSearch() {
		frame5.setTitle("상품 검색");
		frame5.setSize(477, 293);
		frame5.setLocation(550, 350);
		frame5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("검색");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(354, 3, 43, 32);
		frame5.getContentPane().add(lblNewLabel);

		sID.setBounds(354, 40, 95, 32);
		frame5.getContentPane().add(sID);

		sName.setBounds(354, 82, 95, 32);
		frame5.getContentPane().add(sName);

		/*
		 * sAll.setBounds(354, 124, 95, 32);
		 * 
		 * frame5.getContentPane().add(sAll);
		 */
		sCancel.setBounds(354, 124, 95, 32);
		frame5.getContentPane().add(sCancel);

		textArea.setEditable(false);
		textArea.setBounds(12, 9, 331, 234);
		frame5.getContentPane().add(textArea);

		JList list_1 = new JList();
		list_1.setBounds(242, 48, 1, 1);
		frame5.getContentPane().add(list_1);

		frame5.setVisible(true);

		sID.addActionListener(this);
		sName.addActionListener(this);
		// sAll.addActionListener(this);
		sCancel.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		int dataCnt = 1;
		String[] nameCollection = null;
		String nameCode = null;
		if (e.getSource() == sID) {
			String code = JOptionPane.showInputDialog("검색할 상품ID을 입력하세요");
			if (code == null) {
				return;
			}
			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					if (code.equals(String.valueOf(list.get(i).getId()))) {
						textArea.setText(
								"상품ID : " + list.get(i).getId() + "\n\n상품명 : " + list.get(i).getgName() + "\n\n상품 수량 : "
										+ list.get(i).getStockNum() + "\n\n상품 가격 : " + list.get(i).getgPrice());
						break;
					}
					dataCnt++;
				}
				if (dataCnt == list.size() + 1) {
					JOptionPane.showMessageDialog(this, "일치하는 상품이 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(this, "등록된 상품이 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (e.getSource() == sName) {
			int cnt = 0;
			String name = JOptionPane.showInputDialog("검색할 상품명을 입력하세요");
			if (name == null) {
				return;
			}
			if (list.size() != 0) {
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getgName())) {
						cnt++;
					}
				}
				if (cnt > 1) {
					nameCollection = new String[cnt];
					int namecnt = 0;
					for (int i = 0; i < list.size(); i++) {
						if (name.equals(list.get(i).getgName())) {
							nameCollection[namecnt] = list.get(i).getId() + ". " + list.get(i).getgName();
							namecnt++;
						}
					}
					nameCode = (String) JOptionPane.showInputDialog(this, "같은 상품명이 존재합니다.\n", "메시지",
							JOptionPane.INFORMATION_MESSAGE, null, nameCollection, nameCollection[0]);
					if (nameCode == null) {
						return;
					}
					nameCode = nameCode.substring(0, 4);
					for (int i = 0; i < list.size(); i++) {
						if (nameCode.equals(String.valueOf(list.get(i).getId()))) {
							textArea.setText("상품 ID : " + list.get(i).getId() + "\n\n상품명 : " + list.get(i).getgName()
									+ "\n\n상품 수량 : " + list.get(i).getStockNum() + "\n\n상품 가격 : "
									+ list.get(i).getgPrice());
						}
					}
				} else {
					for (int i = 0; i < list.size(); i++) {
						if (name.equals(list.get(i).getgName())) {
							textArea.setText("상품ID : " + list.get(i).getId() + "\n\n상품명 : " + list.get(i).getgName()
									+ "\n\n상품 수량 : " + list.get(i).getStockNum() + "\n\n상품 가격 : "
									+ list.get(i).getgPrice());
							break;
						}
						dataCnt++;
					}
					if (dataCnt == list.size() + 1) {
						JOptionPane.showMessageDialog(this, "일치하는 상품이 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			} else {
				JOptionPane.showMessageDialog(this, "등록된 상품이 없습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
			}
			// else if(e.getSource() == sAll){
			// AllSearch al = new AllSearch();
		} else if (e.getSource() == sCancel) {
			frame5.dispose();
		}
	}
}
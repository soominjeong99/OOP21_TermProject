package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

//Managing stock
public class StockManaging extends StockManagerFrame  implements ActionListener, ItemListener  {
	
	MyFrame frame2 = new MyFrame();
	JButton add = new JButton("��ǰ �߰�");
	JButton edit = new JButton("��ǰ ����");
	JButton delete = new JButton("���� ����");
	JButton cancel = new JButton("���");
	JComboBox cb = new JComboBox();
	private JLabel select = new JLabel("��ǰ ����");
	private final JTextArea productInfo = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockManaging frame = new StockManaging();
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
	public StockManaging() {
		frame2.setTitle("��ǰ����");
		frame2.setSize(331, 285);
		frame2.setLocation(550, 350);
		frame2.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
		cb.setBounds(12, 39, 183, 21);
		cb.addItem("��ǰ�� �����ϼ���");
		for(int i=0; i<list.size(); i++){
			cb.addItem(list.get(i).getId() + ". " + list.get(i).getgName());
		}
		frame2.getContentPane().add(cb);
		
		edit.setBounds(207, 40, 97, 32);
		frame2.getContentPane().add(edit);
		
		delete.setBounds(207, 82, 97, 32);
		frame2.getContentPane().add(delete);
		
		cancel.setBounds(207, 166, 97, 32);
		frame2.getContentPane().add(cancel);
		
		select.setBounds(12, 14, 57, 15);
		frame2.getContentPane().add(select);
		
		productInfo.setEditable(false);
		productInfo.setBounds(12, 80, 183, 152);
		frame2.getContentPane().add(productInfo);
		
		add.setBounds(207, 124, 97, 32);
		frame2.getContentPane().add(add);
		
		add.addActionListener(this);
		edit.addActionListener(this);
		delete.addActionListener(this);
		cancel.addActionListener(this);
		cb.addItemListener(this);

		
		frame2.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie){
		if(cb.getSelectedIndex()!=0){
			int select = cb.getSelectedIndex()-1;
			productInfo.setText("��ǰ ID : "+list.get(select).getId() + "\n��ǰ �̸� : "+ list.get(select).getgName() 
				+ "\n��ǰ ���� : " + list.get(select).getStockNum()  + "\n��ǰ ���� : " + list.get(select).getgPrice());
		}else{
			productInfo.setText(null);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == edit){
			int select = cb.getSelectedIndex();
			Edit ed = new Edit(select);
			frame2.dispose();
		}else if(e.getSource() == delete){
			int select = cb.getSelectedIndex()-1;
			list.remove(select);
			cb.removeItemAt(select+1);
		}else if(e.getSource() == add){
			frame2.dispose();
			StockRegister mr = new StockRegister();
		}else if(e.getSource() == cancel){
			frame2.dispose();
		}
	}
}

package mall;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//����� �α��� �� ��Ÿ����������
//����, ��ٱ���, �α׾ƿ�
public class UserFrameLogin extends JFrame {
	
	private JPanel contentPane;
	MyFrame frame = new MyFrame();


	public UserFrameLogin()
	{		
		super("�����ϱ�"); //title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton shopping = new JButton("����");
		shopping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Shopping();
				setVisible(false); 
			}
		});
		shopping.setBounds(172, 39, 118, 44);
		contentPane.add(shopping);
		
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

		 /* super("����� �α��� �޴�â"); //Ÿ��Ʋ
	      JPanel jPanel = new JPanel();
	  	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	      setSize(500, 300);

	      add(jPanel);
	    


	      JButton cart = new JButton("��ٱ��� ����");
	      JButton logout = new JButton("�α׾ƿ�");
	      jPanel.add(cart);
	      jPanel.add(logout);
	      
	      
	      cart.addActionListener(new ActionListener() {
	          @Override
	          public void actionPerformed(ActionEvent e) {
	              new CartFrame2();
	              setVisible(false); // â �Ⱥ��̰� �ϱ� 
	          }
	      });
	      logout.addActionListener(new ActionListener() {
	          @Override
	          public void actionPerformed(ActionEvent e) {
	        	  JOptionPane.showMessageDialog(null, "�α׾ƿ� �Ǿ����ϴ�");
	              setVisible(false); // â �Ⱥ��̰� �ϱ� 
	          }
	      });
	      
	      add(jPanel);
	      Dimension frameSize = getSize();
	      Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
	      setLocation((windowSize.width - frameSize.width) / 2,(windowSize.height - frameSize.height) / 2); //ȭ�� �߾ӿ� ����
	      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      setVisible(true);
*/
	}
}

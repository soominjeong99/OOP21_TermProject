package mall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserFrameLogin extends JFrame {
	public UserFrameLogin()
	{
		  super("����� �α��� �޴�â"); //Ÿ��Ʋ
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

	}
}

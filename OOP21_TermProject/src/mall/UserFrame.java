package mall;

import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
 
class UserFrame extends JFrame{
	UserFrame(){
	  super("����� ���� �޴�â"); //Ÿ��Ʋ
      JPanel jPanel = new JPanel();
  	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
      setSize(500, 300);

      add(jPanel);
    


      JButton login = new JButton("�α���");
      JButton singup = new JButton("ȸ������");
      jPanel.add(login);
      jPanel.add(singup);
    
      
      
      login.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new loginFrame();
              setVisible(false); // â �Ⱥ��̰� �ϱ� 
          }
      });
      singup.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new SignUpFrame();
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

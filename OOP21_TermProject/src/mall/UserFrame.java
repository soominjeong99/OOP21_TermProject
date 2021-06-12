package mall;

import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
 
class UserFrame extends JFrame{
	UserFrame(){
	  super("사용자 메인 메뉴창"); //타이틀
      JPanel jPanel = new JPanel();
  	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
      setSize(500, 300);

      add(jPanel);
    


      JButton login = new JButton("로그인");
      JButton singup = new JButton("회원가입");
      jPanel.add(login);
      jPanel.add(singup);
    
      
      
      login.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new loginFrame();
              setVisible(false); // 창 안보이게 하기 
          }
      });
      singup.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new SignUpFrame();
              setVisible(false); // 창 안보이게 하기 
          }
      });
      
      add(jPanel);
      Dimension frameSize = getSize();
      Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation((windowSize.width - frameSize.width) / 2,(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setVisible(true);
	}
}

package mall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserFrameLogin extends JFrame {
	public UserFrameLogin()
	{
		  super("사용자 로그인 메뉴창"); //타이틀
	      JPanel jPanel = new JPanel();
	  	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	      setSize(500, 300);

	      add(jPanel);
	    


	      JButton cart = new JButton("장바구니 보기");
	      JButton logout = new JButton("로그아웃");
	      jPanel.add(cart);
	      jPanel.add(logout);
	      
	      
	      cart.addActionListener(new ActionListener() {
	          @Override
	          public void actionPerformed(ActionEvent e) {
	              new CartFrame2();
	              setVisible(false); // 창 안보이게 하기 
	          }
	      });
	      logout.addActionListener(new ActionListener() {
	          @Override
	          public void actionPerformed(ActionEvent e) {
	        	  JOptionPane.showMessageDialog(null, "로그아웃 되었습니다");
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

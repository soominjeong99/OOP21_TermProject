package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class UserListFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	static ArrayList<String> user = new ArrayList<String>();
	/**
	 * Launch the application.
	 */

	
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserListFrame frame = new UserListFrame();
					frame.setVisible(true);

					
					  File file = new File("C:\\Users\\Com\\git\\OOP21_TermProject\\members.txt");
				         //�Է� ��Ʈ�� ����
				         FileReader file_reader = new FileReader(file);
				         
				         int cur = 0;
				         String s;
				    

  
                         //1�� ������ �о� ���ڿ� ����

				         if(file.exists()) {
				        	 @SuppressWarnings("resource")
							BufferedReader inFile = new BufferedReader(new FileReader(file)); 
				        	 String sLine = null; 
				        	 while( (sLine = inFile.readLine()) != null ) 
				        	
				        		 System.out.println(sLine); //�о���� ���ڿ��� ��� �մϴ�.
				        	 }
				         
				         System.out.println(user);
		
				         file_reader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		
		});
		
	}

	/**
	 * Create the frame.
	 */
	public UserListFrame() {
		setTitle("*���� ����*");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("���� ����Ʈ");
		lblNewLabel.setBounds(180, 0, 109, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("���̵� / ��й�ȣ / �̸� / �̸��� / �ּ�");
		lblNewLabel_2.setBounds(107, 53, 384, 15);
		contentPane.add(lblNewLabel_2);
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(357, 103, -321, 102);
		contentPane.add(scrollPane);
		
	
	

	
		
	}
	
}


package mall;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ManagerFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ArrayList<String> lineArray = new ArrayList<String>();

	private JPanel contentPane;

	static UserListFrame frames1 = new UserListFrame(lineArray);
	static GoodsManager frames2 = new GoodsManager();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					ManagerFrame frames = new ManagerFrame();
					frames.setVisible(true);
					File text = new File("C:\\Users\\Com\\git\\OOP21_TermProject\\members.txt");
					FileReader textRead = new FileReader(text);
					@SuppressWarnings("resource")
					BufferedReader bfReader = new BufferedReader(textRead);
					String line = "";

					// null 이 아닐때까지 반복한다.
					while ((line = bfReader.readLine()) != null) {
						lineArray.add(line);
					}

					frames2.setVisible(false);
					frames1.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @return
	 */

	public ManagerFrame() {
		setTitle("*매니저*");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel("매니저 관리창");
		lblNewLabel.setBounds(174, 33, 90, 46);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("유저 관리");
		btnNewButton.setBounds(83, 115, 109, 40);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UserListFrame(lineArray);
				frames1.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnNewButton_1 = new JButton("재고 관리");
		btnNewButton_1.setBounds(249, 115, 109, 40);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GoodsManager();
				frames2.setVisible(true);
				setVisible(false);
			}
		});

	}

	public void UserListFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("*회원리스트*");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		System.out.print(lineArray);
		JLabel lblNewLabel_1 = new JLabel("회원리스트");
		lblNewLabel_1.setBounds(168, 10, 90, 31);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("아이디   |   비밀번호   |   이름   |   이메일   |   주소 ");
		lblNewLabel_2.setBounds(77, 46, 350, 20);
		contentPane.add(lblNewLabel_2);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(77, 76, 292, 133);
		contentPane.add(textArea);

		JButton btnNewButton_1 = new JButton("회원 출력하기");
		btnNewButton_1.setBounds(168, 213, 109, 40);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int j = 0; j < lineArray.size(); j++) {
					textArea.append("" + lineArray.get(j) + "\n");
				}
			}
		});

	}

}

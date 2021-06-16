package mall;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//Start Frame
public class StartFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
		ImageIcon icon = new ImageIcon("C:\\Users\\Com\\git\\OOP21_TermProject\\logo3.jpg"); // 이미지 아이콘 객체 생성
		setTitle("*쇼핑몰관리시스템*");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Color b = new Color(230, 220, 202);

		Image im = icon.getImage(); // 뽑아온 이미지 객체 사이즈를 새롭게 만들기!
		ImageIcon icon2 = new ImageIcon(im);
		JLabel img = new JLabel(icon2);
		img.setBounds(93, 45, 248, 138);
		contentPane.add(img);
		contentPane.setBackground(b);

		JButton btnNewButton4 = new JButton("시작하기");

		btnNewButton4.setBounds(166, 191, 113, 23);
		btnNewButton4.setBackground(b);
		contentPane.add(btnNewButton4);
		setLocationRelativeTo(null);
		btnNewButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				setVisible(false);
			}
		});
	}
}

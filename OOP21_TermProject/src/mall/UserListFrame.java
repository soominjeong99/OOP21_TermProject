package mall;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class UserListFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static ArrayList<String> lineArray = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					File text = new File("C:\\Users\\Com\\git\\OOP21_TermProject\\members.txt");
					FileReader textRead = new FileReader(text);
					@SuppressWarnings("resource")
					BufferedReader bfReader = new BufferedReader(textRead);
					String line = "";

					// null �� �ƴҶ����� �ݺ��Ѵ�.
					while ((line = bfReader.readLine()) != null) {
						// System.out.println(line); ���
						// ����Ʈ �迭�� line �������پ� �߰�.
						lineArray.add(line);

					}
					UserListFrame frame = new UserListFrame(lineArray);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @param lineArray
	 * @param lineArray2
	 */
	public UserListFrame(ArrayList<String> lineArray) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		System.out.print(lineArray);
		JLabel lblNewLabel_1 = new JLabel("ȸ������Ʈ");
		lblNewLabel_1.setBounds(184, 10, 90, 31);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("���̵�   |   ��й�ȣ   |   �̸�   |   �̸���   |   �ּ� ");
		lblNewLabel_2.setBounds(77, 46, 350, 20);
		contentPane.add(lblNewLabel_2);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(77, 76, 292, 133);
		contentPane.add(textArea);

		JButton btnNewButton_1 = new JButton("ȸ�� ����ϱ�");
		btnNewButton_1.setBounds(151, 207, 138, 31);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("�ѹ��� Ŭ�����ּ���.");
		lblNewLabel.setBounds(161, 238, 122, 15);
		contentPane.add(lblNewLabel);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int j = 0; j < lineArray.size(); j++) {
					textArea.append("" + lineArray.get(j) + "\n");
				}
			}
		});

	}

}

package mall;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;

class Dialog extends JDialog {
	JButton ok = new JButton("OK");
	JLabel caution = new JLabel();

	public Dialog(JFrame frame, String title, String text) {
		super(frame, title);
		setLayout(new FlowLayout());
		caution.setText(text);
		add(caution);
		add(ok);
		setSize(300, 100);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("*?¶??? ???θ?*");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		setVisible(true);
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);

		// â ??? ??ġ
		setLocationRelativeTo(null);

		JButton btnNewButton = new JButton("??????");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UserFrame();

				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("????", Font.PLAIN, 15));
		btnNewButton.setBounds(145, 107, 130, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("??????");
		btnNewButton_1.setFont(new Font("????", Font.PLAIN, 15));
		btnNewButton_1.setBounds(145, 140, 130, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ManagerFrame();
			}
		});

		JButton button = new JButton("????");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button.setFont(new Font("????", Font.PLAIN, 13));
		button.setBounds(163, 199, 97, 23);
		panel.add(button);

		JLabel lblNewLabel = new JLabel("???Ͻô? ?۾??? ?????? ?ּ???.");
		lblNewLabel.setFont(new Font("?????ٸ???", Font.PLAIN, 13));
		lblNewLabel.setBounds(99, 48, 229, 38);
		panel.add(lblNewLabel);

	}

}

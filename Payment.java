package final_TP;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;



public class Payment {

	private JFrame frame;
	private JTable List;
	private JTextArea nameInput;
	private JTextArea pwdInput;
	private JTextArea NumInput;
	private JTextArea BnameInput;
	private JTextArea BnumInput;
	private JTextArea BpwdInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment window = new payment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Payment");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel main = new JPanel();
		main.setLayout(null);
		main.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(main);	
		
		JPanel Done = new JPanel();
		Done.setLayout(null);
		Done.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(Done);
		
		JButton QuitButton = new JButton("Quit");
		QuitButton.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		QuitButton.setBounds(269, 479, 252, 43);
		Done.add(QuitButton);
		
		JTextArea txtrYourPayment = new JTextArea();
		txtrYourPayment.setText("Your payment has been completed!");
		txtrYourPayment.setFont(new Font("Dubai Medium", Font.PLAIN, 35));
		txtrYourPayment.setEditable(false);
		txtrYourPayment.setBounds(110, 64, 519, 64);
		Done.add(txtrYourPayment);
		

		
		JButton BankButton = new JButton("BankTransferPayment");
		BankButton.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		BankButton.setBounds(425, 462, 296, 51);
		main.add(BankButton);
		
		JButton CreditButton = new JButton("CreditPayment");
		CreditButton.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		CreditButton.setBounds(82, 462, 296, 51);
		main.add(CreditButton);
		
		JTextArea Payment = new JTextArea();
		Payment.setText("Payment");
		Payment.setFont(new Font("Dubai Medium", Font.PLAIN, 40));
		Payment.setEditable(false);
		Payment.setBounds(313, 36, 152, 64);
		main.add(Payment);
		
		JTextArea txtrChooseTheMethod = new JTextArea();
		txtrChooseTheMethod.setEditable(false);
		txtrChooseTheMethod.setFont(new Font("Dubai Medium", Font.PLAIN, 35));
		txtrChooseTheMethod.setText("Choose the method of payment");
		txtrChooseTheMethod.setBounds(83, 148, 621, 64);
		main.add(txtrChooseTheMethod);
		

		
		JPanel Bank = new JPanel();
		Bank.setLayout(null);
		Bank.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(Bank);
		
		JTextArea txtrEnterTheInforamtion_1 = new JTextArea();
		txtrEnterTheInforamtion_1.setText("Enter the inforamtion below");
		txtrEnterTheInforamtion_1.setFont(new Font("Dubai Medium", Font.PLAIN, 35));
		txtrEnterTheInforamtion_1.setEditable(false);
		txtrEnterTheInforamtion_1.setBounds(175, 23, 434, 59);
		Bank.add(txtrEnterTheInforamtion_1);
		
		JButton DoneButton1 = new JButton("Done!");
		DoneButton1.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		DoneButton1.setBounds(264, 495, 252, 43);
		Bank.add(DoneButton1);
		
		JTextArea txtrEnterTheName = new JTextArea();
		txtrEnterTheName.setText("Enter the bank name of the account ");
		txtrEnterTheName.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheName.setEditable(false);
		txtrEnterTheName.setBounds(43, 100, 476, 43);
		Bank.add(txtrEnterTheName);
		
		BnameInput = new JTextArea();
		BnameInput.setColumns(10);
		BnameInput.setBounds(41, 161, 434, 33);
		Bank.add(BnameInput);
		
		BnumInput = new JTextArea();
		BnumInput.setColumns(10);
		BnumInput.setBounds(39, 278, 434, 33);
		Bank.add(BnumInput);
		
		JTextArea txtrEnterTheBank = new JTextArea();
		txtrEnterTheBank.setText("Enter the bank account number ");
		txtrEnterTheBank.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheBank.setEditable(false);
		txtrEnterTheBank.setBounds(41, 217, 476, 43);
		Bank.add(txtrEnterTheBank);
		
		BpwdInput = new JTextArea();
		BpwdInput.setColumns(10);
		BpwdInput.setBounds(39, 397, 434, 33);
		Bank.add(BpwdInput);
		
		JTextArea txtrEnterTheBank_2 = new JTextArea();
		txtrEnterTheBank_2.setText("Enter the bank account password");
		txtrEnterTheBank_2.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheBank_2.setEditable(false);
		txtrEnterTheBank_2.setBounds(41, 336, 476, 43);
		Bank.add(txtrEnterTheBank_2);

		
		JPanel Credit = new JPanel();
		Credit.setLayout(null);
		Credit.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(Credit);
		
		
		
		JTextArea txtrEnterTheInforamtion = new JTextArea();
		txtrEnterTheInforamtion.setEditable(false);
		txtrEnterTheInforamtion.setText("Enter the inforamtion below");
		txtrEnterTheInforamtion.setFont(new Font("Dubai Medium", Font.PLAIN, 35));
		txtrEnterTheInforamtion.setBounds(185, 28, 434, 59);
		Credit.add(txtrEnterTheInforamtion);
		
		JButton DoneButton = new JButton("Done!");
		DoneButton.setFont(new Font("Dubai Medium", Font.PLAIN, 25));
		DoneButton.setBounds(255, 457, 252, 43);
		Credit.add(DoneButton);
		
		JTextArea txtrEnterTheCards = new JTextArea();
		txtrEnterTheCards.setEditable(false);
		txtrEnterTheCards.setText("Enter the name of the card ");
		txtrEnterTheCards.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheCards.setBounds(45, 111, 434, 43);
		Credit.add(txtrEnterTheCards);
		
		nameInput = new JTextArea();
		nameInput.setBounds(45, 174, 434, 33);
		Credit.add(nameInput);
		nameInput.setColumns(10);
		
		JTextArea txtrEnterThePassword = new JTextArea();
		txtrEnterThePassword.setEditable(false);
		txtrEnterThePassword.setText("Enter the password of the card ");
		txtrEnterThePassword.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterThePassword.setBounds(45, 226, 434, 43);
		Credit.add(txtrEnterThePassword);
		
		pwdInput = new JTextArea();
		pwdInput.setBounds(45, 289, 434, 33);
		Credit.add(pwdInput);
		
		JTextArea txtrEnterTheNumber = new JTextArea();
		txtrEnterTheNumber.setEditable(false);
		txtrEnterTheNumber.setText("Enter the number of the card ");
		txtrEnterTheNumber.setFont(new Font("Dubai Medium", Font.PLAIN, 30));
		txtrEnterTheNumber.setBounds(45, 339, 434, 43);
		Credit.add(txtrEnterTheNumber);
		
		NumInput = new JTextArea();
		NumInput.setColumns(10);
		NumInput.setBounds(45, 402, 434, 33);
		Credit.add(NumInput);
		
		Credit.setVisible(false);
		Bank.setVisible(false);
		main.setVisible(true);
		Done.setVisible(false);
		
		CreditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				Done.setVisible(false);
				Credit.setVisible(true);
				Bank.setVisible(false);
				
			}
		});
		
		BankButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				Done.setVisible(false);
				Credit.setVisible(false);
				Bank.setVisible(true);
				
			}
		});
		
		DoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				Done.setVisible(true);
				Credit.setVisible(false);
				Bank.setVisible(false);
				
				String name = nameInput.getText();
				String num = NumInput.getText();
				String pwd = pwdInput.getText();
			}
		});

		
		DoneButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Done.setVisible(true);				
				main.setVisible(false);
				Credit.setVisible(false);
				Bank.setVisible(false);
				
				
				String Bname = BnameInput.getText();
				String Bnum = BnumInput.getText();
				String Bpwd = BpwdInput.getText();
			}
		});

		QuitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}

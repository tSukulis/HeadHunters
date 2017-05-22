package hy360;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class employer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField name;
	private JTextField address;
	private JTextField phone;
	private JTextField mail;
	private JTextField account;
	private JTextField discount;
	private JTextField cardnumber;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public employer() {
		setTitle("Employer Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("name");
		txtrName.setBounds(0, 10, 145, 23);
		contentPane.add(txtrName);
		
		JTextArea txtrAddress = new JTextArea();
		txtrAddress.setText("address");
		txtrAddress.setBounds(0, 48, 145, 23);
		contentPane.add(txtrAddress);
		
		JTextArea txtrPhone = new JTextArea();
		txtrPhone.setText("phone");
		txtrPhone.setBounds(0, 87, 145, 23);
		contentPane.add(txtrPhone);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("email");
		txtrEmail.setBounds(0, 127, 145, 23);
		contentPane.add(txtrEmail);
		
		JTextArea txtrAccount = new JTextArea();
		txtrAccount.setText("account");
		txtrAccount.setBounds(0, 164, 145, 23);
		contentPane.add(txtrAccount);
		
		JTextArea txtrDiscount = new JTextArea();
		txtrDiscount.setText("discount");
		txtrDiscount.setBounds(0, 202, 145, 23);
		contentPane.add(txtrDiscount);
		
		JTextArea txtrCardnumber = new JTextArea();
		txtrCardnumber.setText("cardnumber");
		txtrCardnumber.setBounds(0, 240, 145, 23);
		contentPane.add(txtrCardnumber);
		
		name = new JTextField();
		name.setBounds(184, 11, 290, 22);
		contentPane.add(name);
		name.setColumns(10);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(184, 49, 290, 22);
		contentPane.add(address);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(184, 87, 290, 22);
		contentPane.add(phone);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(184, 127, 290, 22);
		contentPane.add(mail);
		
		account = new JTextField();
		account.setColumns(10);
		account.setBounds(184, 165, 290, 22);
		contentPane.add(account);
		
		discount = new JTextField();
		discount.setColumns(10);
		discount.setBounds(184, 202, 290, 22);
		contentPane.add(discount);
		
		cardnumber = new JTextField();
		cardnumber.setColumns(10);
		cardnumber.setBounds(184, 241, 290, 22);
		contentPane.add(cardnumber);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ename = name.getText();
				String eaddress = address.getText();
				String ephone = phone.getText();
				String email = mail.getText();
				String eaccount = account.getText();
				String ediscount = discount.getText();
				String ecardNumber = cardnumber.getText();
				login.employee_Account = Integer.parseInt(eaccount);

			
				/*INSERT TO EMPLOYEE ARRAY################################################################*/
				// 3306 is the default port for MySQL in XAMPP.
		        String url = "jdbc:mysql://localhost:3306/";
		        
		         // The MySQL user.
		        String user = "root";
		        
		         // If no password has been set 
		         // an empty string can be used.
		        String password = "";
				
		        try{
				        Class.forName("com.mysql.jdbc.Driver").newInstance();
			            Connection con = DriverManager.getConnection(url, user, password);
			            
			            Statement stt = con.createStatement();
			            
			             // Create and select a database for use. 
			            stt.execute("USE hy360");
			            
			            String sql = "INSERT INTO employer " +
				                   "VALUES ('"+ ename+"', '"+ eaddress+"', '"+ ephone +"',"+ 0 +",'"+ email +"','"+ eaccount +"','" + ediscount +"','"+ ecardNumber+ "')";
				      stt.executeUpdate(sql);
				      employer_actions e2 = new employer_actions();
				      e2.setVisible(true);
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		        }
				
			}
		});
		btnNewButton.setBounds(10, 278, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}

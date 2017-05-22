package hy360;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

//import com.mysql.jdbc.Statement;





import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;


public class employee_actions extends JFrame implements Printable {

	private JPanel contentPane;
	private Statement stt;
	private JTextField account;
	private JTextField date;
	private JTextField profession;

	/**
	 * Create the frame.
	 */
	
	
	
	
	public employee_actions()  {
		setTitle("Employee Actions");
		PrinterJob printJob = PrinterJob.getPrinterJob();
		printJob.setPrintable(this);
		printJob.setPrintable(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("find Job");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String eaccount = account.getText();
				String edate = date.getText();
				String eprofession = profession.getText();
				    
				    
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
				            System.out.println("edwwwwwwwwwww:\n");

				            stt = con.createStatement();
				            stt.execute("USE hy360");
				             // Create and select a database for use. 
				            //stt.execute("USE hy360");
				            //query
				            String sql1 = "INSERT INTO query (account,ddate,profession)"+"  VALUES ("
								+""+ eaccount+",' "
									+ edate+"',' "
									+eprofession +"')";
							System.out.println(sql1);

				            
					      stt.executeUpdate(sql1);
			        }
			        catch (Exception e2)
			        {
			            e2.printStackTrace();
			        }
				    
				    
			}
		});
		
		
		btnNewButton.setBounds(10, 11, 132, 23);
		contentPane.add(btnNewButton);
		
		JButton btnMatchJobs = new JButton("Add Skills, Languages, Studies ");
		btnMatchJobs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skills sk = new skills();
				sk.setVisible(true);
			}
		});
		btnMatchJobs.setBounds(10, 161, 181, 23);
		contentPane.add(btnMatchJobs);
		
		account = new JTextField();
		account.setBounds(171, 44, 199, 20);
		contentPane.add(account);
		account.setColumns(10);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(171, 75, 199, 20);
		contentPane.add(date);
		
		profession = new JTextField();
		profession.setColumns(10);
		profession.setBounds(171, 106, 199, 20);
		contentPane.add(profession);
		
		JTextArea txtrAccount = new JTextArea();
		txtrAccount.setText("Account");
		txtrAccount.setBounds(10, 45, 120, 19);
		contentPane.add(txtrAccount);
		
		JTextArea txtrDate = new JTextArea();
		txtrDate.setText("Date");
		txtrDate.setBounds(10, 75, 120, 20);
		contentPane.add(txtrDate);
		
		JTextArea txtrProfession = new JTextArea();
		txtrProfession.setText("Profession");
		txtrProfession.setBounds(10, 106, 120, 20);
		contentPane.add(txtrProfession);
	}


	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		// TODO Auto-generated method stub
		return 0;
	}

}

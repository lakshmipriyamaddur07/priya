package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class student {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;
	private JTextField tb4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
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
	public student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(154, 11, 157, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lb1 = new JLabel("NAME");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb1.setBounds(62, 61, 46, 14);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("ID");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb2.setBounds(62, 102, 46, 14);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("ADDRESS");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb3.setBounds(62, 145, 69, 14);
		frame.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("MARKS");
		lb4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb4.setBounds(62, 193, 46, 14);
		frame.getContentPane().add(lb4);
		
		tb1 = new JTextField();
		tb1.setBounds(189, 58, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(189, 99, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		tb3 = new JTextField();
		tb3.setBounds(189, 142, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		tb4 = new JTextField();
		tb4.setBounds(189, 190, 86, 20);
		frame.getContentPane().add(tb4);
		tb4.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String id=tb2.getText();
				String address=tb3.getText();
				String marks=tb4.getText();
				int m=Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into student values('"+name+"','"+id+"','"+address+"','"+m+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "successful");
				}
				catch(SQLException el)
				{
					el.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(136, 221, 121, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ECOMMERCEAPP {

	private JFrame frame;
	int items=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOMMERCEAPP window = new ECOMMERCEAPP();
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
	public ECOMMERCEAPP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 64));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERCE APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(108, 10, 189, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JButton b1 = new JButton("");
		b1.setBackground(new Color(0, 128, 64));
		b1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\OIP (3).jfif"));
		b1.setBounds(34, 50, 115, 153);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\OIP (4).jfif"));
		b2.setBounds(206, 50, 109, 153);
		frame.getContentPane().add(b2);
		
		
		JLabel lb1 = new JLabel("CART:0");
		lb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb1.setBounds(345, 28, 63, 13);
		frame.getContentPane().add(lb1);
		
		JLabel lblNewLabel_1 = new JLabel("RS:350");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(66, 229, 63, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RS:700");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(231, 229, 58, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		JButton btnNewButton = new JButton("BUY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(323, 227, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}

}

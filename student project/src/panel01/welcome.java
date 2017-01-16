package panel01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panel2.loginpage;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcome extends JPanel {

	//private JFrame frame;
	 static JPanel panel1;
		 static welcome window;
		public JButton btnThanks;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 window = new welcome();
					window.frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		/*frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);*/
	    //panel1 = new JPanel();
		setBackground(new Color(238, 232, 170));
		//add(panel1, BorderLayout.CENTER);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to My Project");
		lblNewLabel.setBounds(32, 34, 388, 46);
		lblNewLabel.setIcon(null);
		lblNewLabel.setBackground(new Color(128, 128, 0));
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(420, 23, 0, 0);
		add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("By Anoop Singh(14bcs008) And Sangam Kumar(14bcs045)");
		lblNewLabel_3.setBounds(32, 256, 424, 15);
		add(lblNewLabel_3);
		
		btnThanks = new JButton("Cont...");
		btnThanks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThanks.setBackground(new Color(154, 205, 50));
		btnThanks.setBounds(257, 190, 82, 31);
		add(btnThanks);
		
	
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("/home/sangam/Desktop/1356e736-b1aa-456e-be87-898af0482e98_560_420.jpg"));
		lblNewLabel_2.setBounds(-61, -38, 525, 350);
		add(lblNewLabel_2);
		
	}	
		
}

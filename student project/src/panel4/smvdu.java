package panel4;

import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class smvdu extends JPanel {

	//private JFrame frame;
	public JComboBox comboBox;
	public JTextField txtStudentName;
	public JTextField txtEntryNumber;
	public JTextField txtFhfhjh;
	public JButton btnNewButton;
	public java.sql.Connection conn;
	public PreparedStatement ps;
	public ResultSet result1;


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					smvdu window = new smvdu();
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
	public smvdu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		/*frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);*/
		setLayout(null);
		setBounds(100, 100, 450, 300);
		JLabel lblNewLabel = new JLabel("Shri Mata Vaishno Devi University ,Katra(J&k)");
		lblNewLabel.setBounds(59, 13, 336, 31);
		add(lblNewLabel);
		
		txtStudentName = new JTextField();
		txtStudentName.setText("Student Name\n\n");
		txtStudentName.setBounds(133, 76, 193, 24);
		add(txtStudentName);
		txtStudentName.setColumns(10);
		
		txtEntryNumber = new JTextField();
		txtEntryNumber.setText("Entry Number\n");
		txtEntryNumber.setBounds(133, 133, 193, 24);
		add(txtEntryNumber);
		txtEntryNumber.setColumns(10);
		String str[] = {"Ece","Cse","Mech"};
	    comboBox = new JComboBox(str);
		comboBox.setToolTipText("Branch");
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(143, 185, 155, 24);
		add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Branch");
		lblNewLabel_1.setBounds(43, 169, 95, 31);
		add(lblNewLabel_1);
		
	    btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(79, 243, 117, 25);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(238, 243, 117, 25);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("/home/sangam/Desktop/naturefreshsmvdu.jpg"));
		lblNewLabel_2.setBounds(0, -6, 451, 300);
		add(lblNewLabel_2);
		
		
	}
	public boolean checkLogin()
	{
		boolean flag = false;
		
		
		try{
			String driver = "com.mysql.jdbc.Driver";

	        Class.forName(driver);
	        java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smvdu", "root", "password");
	        
			ps = (PreparedStatement) conn.prepareStatement("SELECT name,entryno,branch FROM detail  WHERE name=? AND entryno=? AND branch=?");
			
			ps.setString(1,txtStudentName.getText() );
			
			ps.setString(2,txtEntryNumber.getText() );
		
			ps.setString(3,(String)comboBox.getSelectedItem());
			
			result1 = ps.executeQuery();
			
			if(result1.next())
			{
				   flag=true;
				     
			System.out.println(result1.getString(1));
				   
				   
				   
				   
			}
			else{
				flag = false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Network Connection Problem");
			JOptionPane.showMessageDialog(null,"Network Connection Problem");
		}
		return flag;
	}
	public void cancelAction(){
		txtStudentName.setText("");
		txtEntryNumber.setText("");
	}
	      
}



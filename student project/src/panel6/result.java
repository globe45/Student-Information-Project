package panel6;
import panel4.*;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

//import com.mysql.jdbc.ResultSetMetaData;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class result extends JPanel {
	public JLabel textField;
	public JLabel textField_1;
	public JLabel textField_2;
	public JLabel textField_3;
	public JLabel textField_4;
	public JButton btnLogOut;
	public JButton btnBack ;
	//static smvdu sm;

	/**
	 * Create the panel.
	 */
	public result()throws Exception  {
		setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Your Detail is :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(36, 12, 326, 52);
		add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(57, 74, 59, 17);
		add(lblName);
		
		textField = new JLabel();
		textField.setBounds(128, 74, 234, 19);
		add(textField);
		
		//textField.setText("ddfgdf");
		

		JLabel lblEntryNo = new JLabel("Entry No. :");
		lblEntryNo.setBounds(36, 103, 91, 15);
		add(lblEntryNo);
		
		textField_1 = new JLabel();
		textField_1.setBounds(128, 101, 234, 19);
		add(textField_1);
		//textField_1.setColumns(10);
		
		
		
		JLabel lblFatherName = new JLabel("Father Name :");
		lblFatherName.setBounds(12, 130, 115, 15);
		add(lblFatherName);
		
		textField_2 = new JLabel();
		textField_2.setBounds(128, 128, 234, 19);
		add(textField_2);
		//textField_2.setColumns(10);
		
		textField_3 = new JLabel();
		textField_3.setBounds(128, 157, 234, 19);
		add(textField_3);
		//textField_3.setColumns(10);
		
		JLabel lblCurrentCgpa = new JLabel("Current CGPA :");
		lblCurrentCgpa.setBounds(12, 155, 115, 23);
		add(lblCurrentCgpa);
		
		JLabel lblContect = new JLabel(" Contect No :");
		lblContect.setBounds(12, 185, 104, 15);
		add(lblContect);
		
		textField_4 = new JLabel();
		textField_4.setBounds(128, 181, 234, 19);
		add(textField_4);
		//textField_4.setColumns(10);
		
		 btnLogOut = new JButton("Log Out");
		
		btnLogOut.setBounds(95, 234, 117, 25);
		add(btnLogOut);
		
		 btnBack = new JButton("Back");
		 
		btnBack.setBounds(245, 234, 117, 25);
		add(btnBack);
		
		
		

	}
	//m=new smvdu();
	
	   
}

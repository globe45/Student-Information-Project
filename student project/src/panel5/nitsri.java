package panel5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class nitsri extends JPanel {
	private JTextField txtStudentName;
	private JTextField txtEntryNumber;
	private JButton btnSubmit;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public nitsri() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NATIONAL INSTITUTE OF TECHNOLOGY,SRINAGAR");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(12, 0, 413, 51);
		add(lblNewLabel);
		
		txtStudentName = new JTextField();
		txtStudentName.setText("student name");
		txtStudentName.setBounds(135, 86, 114, 24);
		add(txtStudentName);
		txtStudentName.setColumns(10);
		
		txtEntryNumber = new JTextField();
		txtEntryNumber.setText("entry number");
		txtEntryNumber.setBounds(135, 138, 114, 24);
		add(txtEntryNumber);
		txtEntryNumber.setColumns(10);
		String str[]={"chemical","civil","cse","electrical","ECE","IT","Mech","Metallurgical"};

		JComboBox comboBox = new JComboBox(str);
		comboBox.setBounds(135, 187, 114, 24);
		add(comboBox);
		
		btnSubmit = new JButton("submit");
		btnSubmit.setBounds(58, 246, 90, 25);
		add(btnSubmit);
		
		btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(217, 246, 90, 25);
		add(btnNewButton);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon("/home/sangam/Desktop/NIT-SRINAGAR.jpg"));
		lblNewLabel_1.setBounds(-12, 0, 462, 312);
		add(lblNewLabel_1);

	}
}

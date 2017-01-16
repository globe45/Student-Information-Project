package panel00;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class admin extends JPanel {
	 public JButton btnNewButton;
	 public JButton btnNewButton_1;
	/**
	 * Create the panel.
	 */
	public admin() {
		setLayout(null);
		
		JLabel lblStudentInformation = new JLabel("STUDENT INFORMATION");
		lblStudentInformation.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblStudentInformation.setBounds(115, 23, 239, 40);
		add(lblStudentInformation);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/home/sangam/Desktop/eclipse/javaproject/panel01/src/1.png"));
		btnNewButton.setBounds(89, 111, 96, 105);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("/home/sangam/Desktop/eclipse/javaproject/panel01/src/3.png"));
		btnNewButton_1.setBounds(236, 111, 96, 105);
		add(btnNewButton_1);

	}
}

package panel3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class university extends JPanel {

	/**
	 * Create the panel.
	 */
	public JButton btnNewButton;
	public JButton btnNewButton_1;
	public university() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Your University");
		lblNewLabel.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 20));
		lblNewLabel.setBounds(109, 33, 236, 45);
		add(lblNewLabel);
		
	    btnNewButton = new JButton("SMVDU");
		btnNewButton.setBounds(119, 85, 206, 25);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("NIT SRINAGAR");
		btnNewButton_1.setBounds(119, 135, 206, 25);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("IIT JAMMU");
		btnNewButton_2.setBounds(119, 185, 206, 25);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("/home/sangam/Desktop/Kashmir-JK.jpg"));
		lblNewLabel_1.setBounds(0, -3, 450, 300);
		add(lblNewLabel_1);

	}
}

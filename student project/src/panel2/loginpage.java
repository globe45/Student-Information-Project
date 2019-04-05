package panel2;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class loginpage extends JPanel {

	//private JFrame frame;
	public JTextField textField;
	public JPasswordField passwordField;
	public JButton btnNewButton;
	java.sql.Connection conn;
	PreparedStatement ps;
	ResultSet result;

	public loginpage() {
		setBackground(new Color(107, 142, 35));
		initialize();
	}


	private void initialize() {
		
		setLayout(null);
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(149, 117, 80, 15);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 222, 179));
		textField.setBounds(235, 113, 176, 24);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBounds(149, 171, 80, 15);
		add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(245, 222, 179));
		passwordField.setBounds(238, 163, 176, 24);
		add(passwordField);
		
		btnNewButton = new JButton("LogIn");
		btnNewButton.setBackground(new Color(240, 230, 140));
		
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBounds(222, 219, 91, 25);
		add(btnNewButton);
		
		JButton btnCa = new JButton("Cancel");
		btnCa.setBackground(new Color(240, 230, 140));
		btnCa.setForeground(new Color(139, 0, 0));
		btnCa.setBounds(335, 219, 91, 25);
		add(btnCa);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/home/sangam/Desktop/security.png"));
		lblNewLabel_2.setBounds(26, 35, 122, 172);
		add(lblNewLabel_2);
	}
	/*public boolean connect()
	{boolean flag=false;
		System.out.println("succesfull1");
		try{ String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db";
        String username = "root";
        String password = "password";

        Class.forName(driver);
        System.out.println("succesfull2");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("succesfull3");
        ps = (PreparedStatement) conn.prepareStatement("SELECT username,password FROM login WHERE username=? AND password=?");
		ps.setString(1,textField.getText() );
		ps.setString(2,String.valueOf(passwordField.getPassword()));
		rs = ps.executeQuery();
        /*stmt = conn.createStatement();
        System.out.println("succesfull4");
       // String query = "select name,rollno from student ";
        
        String user=textField.getText().trim();
        System.out.println("succesfull5");
        String pass=passwordField.getText().trim();
        System.out.println("succesfull6");
        
        //String sql="select username ,password from student where username='"+user+"'password='"+pass+"'";
        System.out.println("succesfull7");
        rs = stmt.executeQuery("select * from student");
        String s1 = rs.getString(1);
        String s2 = rs.getString(2);
        System.out.println("succesfull8"+s1+s2);
       int count=0;
       while(rs.next()) {
        	System.out.println("succesfull9");
      	count++;
       }
       if(count>=1){
       	System.out.println("succesfull10");
        	flag=true;
        	return flag;
        }
        else
        {
      	System.out.println("succesfull11");
       	return flag;
        }
    /*    if(s1.equalsIgnoreCase(user)&& s2.equalsIgnoreCase(pass)){
        	return true;
        }
        else
        	 return false;
		}
		catch (Exception e) {
            e.printStackTrace();
        } 
         return flag;   
        
	}*/
	public boolean checkLogin()
	{
		boolean flag = false;
		
		try{
			String driver = "com.mysql.jdbc.Driver";

	        Class.forName(driver);
	        java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "password");
			ps = (PreparedStatement) conn.prepareStatement("SELECT username,password FROM student WHERE username=? AND password=?");
			ps.setString(1,textField.getText() );
			ps.setString(2,String.valueOf(passwordField.getPassword()));
			result = ps.executeQuery();
			if(result.next())
			{
				    flag = true;
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
		textField.setText("");
		passwordField.setText("");
	}
	      
}

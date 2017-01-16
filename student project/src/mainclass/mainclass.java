package mainclass;
import panel01.*;
import admin.*;
import panel00.*;
import panel3.*;
import panel2.*;
import panel4.*;
import panel5.*;
import panel6.*;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class mainclass extends WindowAdapter {
	private static JFrame frame;
	static welcome wel;
	static mainclass mn;
	static loginpage lp;
	static smvdu sm;
	static university un; 
	static nitsri ns;
	static result rs;
	static admin ad;
	static Login adln;
	public static java.sql.Connection conn;
	public static PreparedStatement ps;
	public static ResultSet result1;

	public static void main(String args[])throws Exception
	{ 
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					lp=new loginpage();
					mn=new mainclass();
					ad=new admin();
					adln=new Login();
					mn.frame.setVisible(true);
					mn.frame.setBounds(100,100,450,300);
					wel=new welcome();
					mn.frame.add(wel);
					wel.btnThanks.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							
							openadmin();
						}
						});
					ad.btnNewButton_1.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							
							openlogin();
						}
						});
					ad.btnNewButton.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
							
							openadlogin();
						}
						});
					lp=new loginpage();
					un=new university();
					
					lp.btnNewButton.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							boolean loginSuccesful = lp.checkLogin();
							if(loginSuccesful == true){
								
								openuniversity();
							}
							else{
								lp.cancelAction();
								//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								
								JOptionPane.showMessageDialog(lp,"Invalid Username or Password");
							}
						}
					});
					
					un.btnNewButton.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							opensmvdu();
						}
					
				});
					ns=new nitsri();
					
					un.btnNewButton_1.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							opennitsri();
						}});
					sm=new smvdu();
					rs= new result();
					sm.btnNewButton.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							boolean loginSuccesful = sm.checkLogin();
							if(loginSuccesful == true){
								try{
								openresult();
								System.out.println("sfd"+sm.txtStudentName.getText());
								data();}
								catch(Exception e)
								{
									e.printStackTrace();
								}
							}
							else{
								sm.cancelAction();
								//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								
								JOptionPane.showMessageDialog(null,"Invalid Name,entry no. or Branch ");
							}
						}
					});
					
					un.btnNewButton.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							opensmvdu();
						}
					
				});
					
				rs.btnLogOut.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							openlogin();
						}
					});	
				rs.btnBack.addActionListener(new ActionListener() {
				 	public void actionPerformed(ActionEvent e) {
				 		opensmvdu();
				 	}
				 });
					
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});

		
		}
public static void openlogin(){
		
		mn.frame.add(lp);
		lp.setVisible(true);
		lp.textField.setText("");
		lp.passwordField.setText("");
		ad.setVisible(false);
		rs.setVisible(false);
		wel.setVisible(false);
		}
public static void openadlogin(){
	
	//mn.frame.add(adln);
	adln.setVisible(true);
	
	ad.setVisible(false);
	rs.setVisible(false);
	wel.setVisible(false);
	}
public static void openadmin(){
	
	mn.frame.add(ad);
	ad.setVisible(true);
	lp.textField.setText("");
	lp.passwordField.setText("");
	rs.setVisible(false);
	wel.setVisible(false);
	}
public static void opensmvdu(){
		
		mn.frame.add(sm);
		sm.setVisible(true);
		rs.setVisible(false);
		un.setVisible(false);
		lp.setVisible(false);
		wel.setVisible(false);}
public static void opennitsri(){
		//ns=new nitsri();
		mn.frame.add(ns);
		ns.setVisible(true);
		un.setVisible(false);
		lp.setVisible(false);
		wel.setVisible(false);}
public static void openuniversity(){
		
		mn.frame.add(un);
		un.setVisible(true);
		lp.setVisible(false);
		wel.setVisible(false);}
public static void openresult(){
	
	mn.frame.add(rs);
	//System.out.println("dffd"+sm.txtStudentName.getText());
	rs.setVisible(true);
	sm.setVisible(false);
	un.setVisible(false);
	lp.setVisible(false);
	wel.setVisible(false);}
public static void data() throws Exception
{
	String driver = "com.mysql.jdbc.Driver";
	System.out.println("data"+sm.txtStudentName.getText());
	String name = sm.txtStudentName.getText();
   // sm= new smvdu();
    Class.forName(driver);
    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smvdu", "root", "password");
    
	ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM detail  WHERE name=? AND entryno = ? AND branch = ? ");
	
	ps.setString(1,name );
	//System.out.println("dffd"+name);
	
	ps.setString(2,sm.txtEntryNumber.getText() );

	ps.setString(3,(String)sm.comboBox.getSelectedItem());
	
	result1 = ps.executeQuery();

	if(result1.next())
	{
		rs.textField.setText(result1.getString(1));
		rs.textField_1.setText(result1.getString(2));
		rs.textField_2.setText(result1.getString(4));
		rs.textField_3.setText(result1.getString(5));
		rs.textField_4.setText(result1.getString(6));
	}
	
}
	public mainclass(){
		initialize();
	}
	private void initialize(){
		frame =new JFrame();
		frame.setBounds(100,100,450,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void windowOpened(WindowEvent e){
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e1){
			e1.printStackTrace();
			
		}
	}

}

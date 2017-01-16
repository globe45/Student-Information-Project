package admin;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anoop
 */
public final class abc extends javax.swing.JFrame {

    /**
     * Creates new form Success
     * @throws java.sql.SQLException
     */
    public abc() throws SQLException {
        initComponents();
         getContentPane().setBackground(Color.pink);
         getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
         		FormSpecs.UNRELATED_GAP_COLSPEC,
         		ColumnSpec.decode("76px"),
         		FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
         		ColumnSpec.decode("86px"),
         		FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
         		ColumnSpec.decode("81px"),
         	    FormSpecs.RELATED_GAP_COLSPEC,
         		ColumnSpec.decode("418px"),},
         	new RowSpec[] {
         		RowSpec.decode("24px"),
         		RowSpec.decode("31px"),
         		FormSpecs.UNRELATED_GAP_ROWSPEC,
         		RowSpec.decode("74px"),
         		FormSpecs.UNRELATED_GAP_ROWSPEC,
         		RowSpec.decode("29px"),
         		FormSpecs.PARAGRAPH_GAP_ROWSPEC,
         		RowSpec.decode("29px"),
         		FormSpecs.PARAGRAPH_GAP_ROWSPEC,
         		RowSpec.decode("32px"),
         		RowSpec.decode("68px"),
         		RowSpec.decode("134px"),}));
         getContentPane().add(jLabel2, "6, 2, 3, 1, left, fill");
         getContentPane().add(jLabel5, "2, 8, center, fill");
         getContentPane().add(jLabel4, "2, 10, center, fill");
         getContentPane().add(jLabel3, "2, 6, center, fill");
         getContentPane().add(jLabel1, "2, 4, right, bottom");
         getContentPane().add(jTextField2, "4, 4, 3, 1, fill, bottom");
         getContentPane().add(jTextField1, "4, 6, 3, 1, fill, fill");
         getContentPane().add(jTextField3, "4, 8, 3, 1, fill, fill");
         getContentPane().add(jTextField4, "4, 10, 3, 1, fill, fill");
         getContentPane().add(jButton2, "2, 12, left, top");
         getContentPane().add(jButton3, "4, 12, left, top");
         getContentPane().add(jButton1, "6, 12, left, top");
         getContentPane().add(jScrollPane1, "8, 4, 1, 9, fill, fill");
        Show_Users();
    }
    public Connection getConnection()
    {
        Connection con;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/search","root","password");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    public ArrayList<User> getUsersList() throws SQLException
    {
       ArrayList<User> usersList = new ArrayList<User>();
       Connection connection = getConnection();
       String query;
        query = "SELECT * FROM search.users";
       Statement st;
       ResultSet rs;
       try{
           st = connection.createStatement();
           rs= st.executeQuery(query);
           User user;
           while(rs.next())
                   {
                      user = new User(rs.getString("id"),rs.getString("name"),rs.getString("fname"),rs.getString("cgpa"));
                      usersList.add(user);
                   }
       }
       catch(Exception e)
       {e.printStackTrace();
       }
       return usersList;
    }

    /**
     *
     * @throws SQLException
     */
    public void Show_Users() throws SQLException 
    {
        ArrayList<User> list = getUsersList();
        DefaultTableModel mode1;
        mode1 = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getFname();
            row[3] = list.get(i).getCGPA();
            mode1.addRow(row);
        }
        
    }
    // Exequte The SQL query
    
    public void executeSQlQuery(String query, String message)
    {
        Connection con = getConnection();
        Statement st;
        try{
            st=con.createStatement();
            if((st.executeUpdate(query))==1)
            {
                //Refresh the jtable data
                DefaultTableModel mode1 = (DefaultTableModel)jTable1.getModel();
                mode1.setRowCount(0);
                Show_Users();
                
                JOptionPane.showMessageDialog(null,"Data"+message+"Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Data Not"+message+"Successfully");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("STUDENT INFORMATION");

        jLabel1.setText("ID:");

        jLabel3.setText("NAME:");

        jLabel4.setText("CGPA:");

        jLabel5.setText("FNAME:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Fname", "CGPA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //Display slected row in jtextfields
        int i = jTable1.getSelectedRow();
        TableModel mode1=jTable1.getModel();
        jTextField2.setText(mode1.getValueAt(i,0).toString());
         jTextField1.setText(mode1.getValueAt(i,1).toString());
          jTextField3.setText(mode1.getValueAt(i,2).toString());
           jTextField4.setText(mode1.getValueAt(i,3).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String query;
            query = "INSERT INTO users (id,name,fname,cgpa) VALUES ('"+jTextField2.getText()+"','"+jTextField1.getText()+"','"+jTextField3.getText()+"',"+jTextField4.getText()+")";
            executeSQlQuery(query,"INSERTED");
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String query;
       query = "UPDATE users SET `name` ='"+jTextField1.getText()+"',`fname` ='"+jTextField3.getText()+"',`cgpa` ="+jTextField4.getText()+"  WHERE `id` ="+jTextField2.getText();
       executeSQlQuery(query,"UPDATED");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String query;
     query = "DELETE FROM users WHERE id = "+jTextField2.getText();
     executeSQlQuery(query,"Deleted");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(abc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new abc().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(abc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

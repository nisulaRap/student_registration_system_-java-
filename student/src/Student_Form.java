
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Toolkit;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nisula Premaratne
 */
public class Student_Form extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    /**
     * Creates new form Student_Form1
     */
    public Student_Form() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
        con = databaseConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        name_with_initials = new javax.swing.JTextField();
        fullname = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        search = new javax.swing.JButton();
        newStudent = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        courseid = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        coursename = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT REGISTRATION FORM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Student_ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name with Initials");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Name in Full");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("NIC No");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Gender");

        sid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        name_with_initials.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        fullname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        nic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        dob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));

        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon("D:\\Technology college - NVQ 5\\Projects\\Software Programming\\Java\\images\\Ok-icon.png")); // NOI18N
        submit.setText(" SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon("D:\\Technology college - NVQ 5\\Projects\\Software Programming\\Java\\images\\search_16px.png")); // NOI18N
        search.setText(" SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        newStudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newStudent.setIcon(new javax.swing.ImageIcon("D:\\Technology college - NVQ 5\\Projects\\Software Programming\\Java\\images\\add_20px.png")); // NOI18N
        newStudent.setText("NEW");
        newStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("D:\\Technology college - NVQ 5\\Projects\\Software Programming\\Java\\images\\delete_16px.png")); // NOI18N
        delete.setText(" DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon("D:\\Technology college - NVQ 5\\Projects\\Software Programming\\Java\\images\\back_arrow_20px.png")); // NOI18N
        back.setText(" BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        telephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Telephone No");

        courseid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        courseid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ICTNVQ5", "AMNVQ5", "MTRNVQ5", "ACCNVQ5" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Course_ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("COURSE NAME");

        coursename.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coursename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ICT - NVQ 05", "Automobile - NVQ 05", "Mechatronic - NVQ 05", "Accounting - NVQ 05" }));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("D:\\Technology college - NVQ 5\\Projects\\Software Programming\\Java\\images\\available_updates_16px.png")); // NOI18N
        update.setText(" UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(courseid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(telephone)
                                            .addComponent(coursename, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(140, 140, 140)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                    .addGap(72, 72, 72)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fullname)
                                        .addComponent(name_with_initials)
                                        .addComponent(sid)
                                        .addComponent(nic)
                                        .addComponent(dob)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(name_with_initials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coursename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(submit)
                        .addGap(18, 18, 18)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update)
                        .addGap(15, 15, 15)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        if(sid.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's ID.");
        }
        else if(name_with_initials.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Name With Initials.");
        }
        else if(fullname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Full Name.");
        }
        else if(nic.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's NIC / Passport Number.");
        }
        else if(dob.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Date of Birth.");
        }
        else if(gender.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Gender.");
        }
        else if(address.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Address.");
        }
        else if(email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Email.");
        }
        else if(telephone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Telephone Number.");
        }
        else if(courseid.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Course_ID.");
        }
        else if(coursename.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Student's Course Name.");
        }
        else
        try{
            stmt = con.createStatement();

            String sId = sid.getText();
            String sName = name_with_initials.getText();
            String sFullName = fullname.getText();
            String sNIC = nic.getText();
            String sBirthday = dob.getText();
            String sGender = (String) gender.getSelectedItem();
            String sAddress = address.getText();
            String sEmail = email.getText();
            String sTelephone = telephone.getText();
            String sCourseId = (String) courseid.getSelectedItem();
            String sCourse = (String) coursename.getSelectedItem();

            String query = "INSERT INTO student (sid,name_with_initials,fullname,nic,dob,gender,address,email,telephone,courseid,course) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1,sId);
            preparedStmt.setString(2, sName);
            preparedStmt.setString(3, sFullName);
            preparedStmt.setString(4, sNIC);
            preparedStmt.setString(5, sBirthday);
            preparedStmt.setString(6, sGender);
            preparedStmt.setString(7, sAddress);
            preparedStmt.setString(8, sEmail);
            preparedStmt.setString(9, sTelephone);
            preparedStmt.setString(10, sCourseId);
            preparedStmt.setString(11, sCourse);

            preparedStmt.execute();
            JOptionPane.showMessageDialog(null, "Added");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
            stmt = con.createStatement();

            String sId = sid.getText();

            String query = "SELECT * FROM student";

            rs = stmt.executeQuery(query);

            while(rs.next()){
                if(sId.equals(rs.getString("sid"))){
                    name_with_initials.setText(rs.getString("name_with_initials"));
                    fullname.setText(rs.getString("fullname"));
                    nic.setText(rs.getString("nic"));
                    dob.setText(String.format("%s", rs.getDate("dob")));
                    gender.setSelectedItem(rs.getString("gender"));
                    address.setText(rs.getString("address"));
                    email.setText(rs.getString("email"));
                    telephone.setText(String.format(0 + "%s", rs.getInt("telephone")));
                    courseid.setSelectedItem(rs.getString("courseid"));
                    coursename.setSelectedItem(rs.getString("course"));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_newStudentActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            stmt = con.createStatement();

            String sId = sid.getText();

            String query = "DELETE FROM student WHERE sid = '"+sId+"' ";

            stmt.executeUpdate(query);

            Reset();
            JOptionPane.showMessageDialog(null, "Deleted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        home view = new home();
        view.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            stmt = con.createStatement();

            String sId = sid.getText();
            String sName = name_with_initials.getText();
            String sFullName = fullname.getText();
            String sNIC = nic.getText();
            String sBirthday = dob.getText();
            String sGender = (String) gender.getSelectedItem();
            String sAddress = address.getText();
            String sEmail = email.getText();
            String sTelephone = telephone.getText();
            String sCourseId = (String) courseid.getSelectedItem();
            String sCourse = (String) coursename.getSelectedItem();

            String query = "UPDATE student SET name_with_initials = ?, fullname = ?, nic = ?, dob = ?, gender = ?, address = ?, email = ?, telephone = ?, courseid = ?, course = ? WHERE sid = ?";

            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, sName);
            preparedStmt.setString(2, sFullName);
            preparedStmt.setString(3, sNIC);
            preparedStmt.setString(4, sBirthday);
            preparedStmt.setString(5, sGender);
            preparedStmt.setString(6, sAddress);
            preparedStmt.setString(7, sEmail);
            preparedStmt.setString(8, sTelephone);
            preparedStmt.setString(9, sCourseId);
            preparedStmt.setString(10, sCourse);
            preparedStmt.setString(11, sId);

            preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> courseid;
    private javax.swing.JComboBox<String> coursename;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name_with_initials;
    private javax.swing.JButton newStudent;
    private javax.swing.JTextField nic;
    private javax.swing.JButton search;
    private javax.swing.JTextField sid;
    private javax.swing.JButton submit;
    private javax.swing.JTextField telephone;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void Reset() {
        sid.setText(null);
        name_with_initials.setText(null);
        fullname.setText(null);
        nic.setText(null);
        dob.setText(null);
        gender.setSelectedItem(null);
        address.setText(null);
        email.setText(null);
        telephone.setText(null);
        courseid.setSelectedItem(null);
        coursename.setSelectedItem(null);
    }
}

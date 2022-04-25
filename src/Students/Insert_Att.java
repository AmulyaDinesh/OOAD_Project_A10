package Students;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Insert_Att extends javax.swing.JFrame {

    public Insert_Att() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        mathsfield = new javax.swing.JTextField();
        physicsfield = new javax.swing.JTextField();
        chemistryfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 5));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        jLabel1.setText("ATTENDENCE PORTAL");

        jLabel10.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel10.setText("Student ID");

        idfield.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        idfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfieldActionPerformed(evt);
            }
        });

        mathsfield.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mathsfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathsfieldActionPerformed(evt);
            }
        });

        physicsfield.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        physicsfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicsfieldActionPerformed(evt);
            }
        });

        chemistryfield.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        chemistryfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemistryfieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel6.setText("Chemistry attendence");

        jLabel5.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel5.setText("Physics attendence");

        jLabel4.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel4.setText("Maths attendence");

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chemistryfield, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(physicsfield, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mathsfield, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(resetButton)
                        .addGap(86, 86, 86)
                        .addComponent(submitButton)
                        .addGap(83, 83, 83)
                        .addComponent(backButton)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mathsfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(physicsfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(chemistryfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(submitButton)
                    .addComponent(backButton))
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void idfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idfieldActionPerformed

    private void mathsfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathsfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mathsfieldActionPerformed

    private void physicsfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicsfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_physicsfieldActionPerformed

    private void chemistryfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemistryfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chemistryfieldActionPerformed
    private JFrame frame;
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
         String id=idfield.getText();
        String maths=mathsfield.getText();
        String phy=physicsfield.getText();
        String chem=chemistryfield.getText();
         int maths1,phy1,chem1,total,id1;
        
        if(id.length()==0||maths.length()==0||phy.length()==0||chem.length()==0){
            JOptionPane.showMessageDialog(frame, "Incomplete Values");
            return;
        }
        id1=Integer.parseInt(id);
        maths1=Integer.parseInt(maths);
        phy1=Integer.parseInt(phy);
        chem1=Integer.parseInt(chem);
        if(maths1>100||phy1>100||chem1>100||maths1<-75||phy1<-75||chem1<-75){
            JOptionPane.showMessageDialog(frame, "         Invalid Attendance\nAttendance Range 75 to 100");
            return;
        }
        /*total=maths1+phy1+chem1;
        String tot;
        tot=Integer.toString(total);*/
        try
        {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con;

            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/mysql","root",Credentials.sqlPassword);
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate("use resultsystem;");
            
            String sqls;
            sqls="select * from ids;";
            ResultSet rs=stmt.executeQuery(sqls);
            rs.next();
            String id3=rs.getString("id");
            int idn=Integer.parseInt(id3);
            int idp=Integer.parseInt(id);
            if(idn<=idp){
                 JOptionPane.showMessageDialog(frame, "Invalid ID");
            return;
            }

            sqls="update attendance set maths="+maths+", phy="+phy+", chem="+chem+", where id="+id+";";
            //sqls= "insert into attendance values (id,maths,phy,chem);"
            stmt.executeUpdate(sqls);

            System.out.println("done");
            JOptionPane.showMessageDialog(frame, "Attendance Updated");

            con.close();
            stmt.close();
            JTextField temp=null;

            for(Component c:jPanel1.getComponents()){
                if(c.getClass().toString().contains("javax.swing.JTextField")){
                    temp=(JTextField)c;
                    temp.setText(null);
                }
            }
            id1+=1;
            String id2=Integer.toString(id1);
            idfield.setText(id2);

        }
        catch(Exception e)
        {
            new Home().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        JTextField temp=null;
        
        for(Component c:jPanel1.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                temp=(JTextField)c;
                temp.setText(null);
            }
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new Admin_option().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Insert_Att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Att.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Att().setVisible(true);
            }
        });
    }

    private javax.swing.JButton backButton;
    private javax.swing.JTextField chemistryfield;
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mathsfield;
    private javax.swing.JTextField physicsfield;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;

}
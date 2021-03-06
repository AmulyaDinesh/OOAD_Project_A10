package Students;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Student_Details extends javax.swing.JFrame {

    public Student_Details() {
        initComponents();
        generatecaptcha();
    }

    public void generatecaptcha(){
        char[] cap = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        Random rand=new Random();        
        captcha1.setText(" "+cap[rand.nextInt(62)]+" "+cap[rand.nextInt(62)]+" "+cap[rand.nextInt(62)]+
                " "+cap[rand.nextInt(62)]+" "+cap[rand.nextInt(62)]);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        genderfield = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryfield = new javax.swing.JComboBox<>();
        namef = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fnamef = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        mnamef = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        statef = new javax.swing.JTextField();
        mon = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        date = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        captcha1 = new javax.swing.JTextField();
        captcha2 = new javax.swing.JTextField();
        captchaButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 3, 36)); // NOI18N
        jLabel1.setText("Student Information");

        genderfield.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        genderfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderfieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel2.setText("DOB");

        jLabel3.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel3.setText("Category");

        categoryfield.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        categoryfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "OBC", "SC", "ST" }));
        categoryfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryfieldActionPerformed(evt);
            }
        });

        namef.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        namef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel4.setText("Name");

        jLabel10.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel10.setText("Father's Name");

        fnamef.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fnamef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnamefActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel11.setText("Mother's Name");

        mnamef.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mnamef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnamefActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel12.setText("State");

        submitButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel5.setText("Gender");

        statef.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        statef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statefActionPerformed(evt);
            }
        });

        mon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rachana", 1, 24)); // NOI18N
        jLabel6.setText("Captcha");

        captcha1.setEditable(false);
        captcha1.setBackground(new java.awt.Color(153, 255, 255));
        captcha1.setFont(new java.awt.Font("Bradley Hand ITC", 2, 24)); // NOI18N
        captcha1.setDisabledTextColor(new java.awt.Color(153, 255, 255));
        captcha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captcha1ActionPerformed(evt);
            }
        });

        captcha2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        captcha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captcha2ActionPerformed(evt);
            }
        });

        captchaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Win10\\Pictures\\reload.png")); // NOI18N
        captchaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captchaButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Prove that you're not a Robot");

        jLabel8.setText("Captcha is Case Sensitive");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(mnamef))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(statef))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(87, 87, 87))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fnamef)
                                .addComponent(namef)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(genderfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(captcha1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(captcha2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(captchaButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8))))
                                    .addGap(0, 18, Short.MAX_VALUE))))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(categoryfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(314, 314, 314))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fnamef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mnamef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(statef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(categoryfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(captcha1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(captcha2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(captchaButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnamefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnamefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnamefActionPerformed

    private void fnamefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnamefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnamefActionPerformed

    private void namefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefActionPerformed

    private void categoryfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryfieldActionPerformed

    private void genderfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderfieldActionPerformed
    private JFrame frame;
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String name=namef.getText();
        String fname=fnamef.getText();
        String mname=mnamef.getText();
        String state=statef.getText();
        String gender=(String) genderfield.getSelectedItem();
        String category=(String) categoryfield.getSelectedItem();
        String yob=(String) year.getSelectedItem();
        String mob=(String) mon.getSelectedItem();
        String dtob=(String) date.getSelectedItem();
        String dob=dtob+" "+mob+" "+yob;
        if(name.length()==0||fname.length()==0||mname.length()==0||state.length()==0){
            JOptionPane.showMessageDialog(frame, "Incomplete Values");
            return;
        }
        String cap1=captcha1.getText();
        cap1=cap1.replaceAll("\\s+","");
        String cap2=captcha2.getText();
        if(!cap1.equals(cap2)){
            JOptionPane.showMessageDialog(frame, "Invalid Captcha");
            generatecaptcha();
            captcha2.setText("");
            return;
        }
        String s="0";
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
            String id=rs.getString("id");
            int idn=Integer.parseInt(id);
            idn++;
            String id1;
            id1 = Integer.toString(idn);
            System.out.println(id1);
            sqls="update ids set id="+id1+" where flag=1;";
            stmt.executeUpdate(sqls);
            sqls="insert into result values('"+id+"','"+name+"','"+mname+"','"+fname+"','"+gender+"','"+category+"','"+state
                +"','"+dob+"','"+s+"','"+s+"','"+s+"','"+s+"')";
            stmt.executeUpdate(sqls);



            con.close();
            stmt.close();
            JOptionPane.showMessageDialog(frame, "Student Registered with id:"+id);
            this.setVisible(false);
            new Student_login().setVisible(true);
        }
        catch(  HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
        {
            new Home().setVisible(true);
            this.setVisible(false);
        }

        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void statefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statefActionPerformed

    private void monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void captcha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captcha1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_captcha1ActionPerformed

    private void captcha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captcha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_captcha2ActionPerformed

    private void captchaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captchaButtonActionPerformed
        // TODO add your handling code here:
        generatecaptcha();
    }//GEN-LAST:event_captchaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Details().setVisible(true);                
            }
        });
        
    }

    private javax.swing.JTextField captcha1;
    private javax.swing.JTextField captcha2;
    private javax.swing.JButton captchaButton;
    private javax.swing.JComboBox<String> categoryfield;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JTextField fnamef;
    private javax.swing.JComboBox<String> genderfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mnamef;
    private javax.swing.JComboBox<String> mon;
    private javax.swing.JTextField namef;
    private javax.swing.JTextField statef;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> year;
}

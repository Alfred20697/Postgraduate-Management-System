/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class LecProgressReport extends javax.swing.JFrame {

    LinkedList<ProgressReport> progressList = new LinkedList<>();
    LinkedList<String> studentList = new LinkedList<>();
    LinkedList<ProgressReport> fullList = new LinkedList<>();

    String Id;
    String studentID;
    
    String url ="jdbc:db2:PMS";
    
    DefaultTableModel ReportModel = new DefaultTableModel()
    {
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };
    
    public LecProgressReport() {
        initComponents();
        
        refreshProgress();
        
        addReport.setVisible(false);
        viewReport.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProcessCompleteDialog1 = new javax.swing.JDialog();
        ProcessCompletePanel = new javax.swing.JPanel();
        ProcessCompleteOKButton = new javax.swing.JButton();
        ProcessCompleteLabel1 = new javax.swing.JLabel();
        BG = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        btn_addReport = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_viewReport = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        paymentLabel = new javax.swing.JLabel();
        btn_Back = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        contentMainPanel = new javax.swing.JPanel();
        viewReport = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        addReport = new javax.swing.JPanel();
        lblAddReport = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btn_add = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        StudentComboBox = new javax.swing.JComboBox<>();

        ProcessCompleteDialog1.setSize(new java.awt.Dimension(400, 200));

        ProcessCompletePanel.setBackground(new java.awt.Color(255, 255, 255));

        ProcessCompleteOKButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProcessCompleteOKButton.setText("OK");
        ProcessCompleteOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessCompleteOKButtonActionPerformed(evt);
            }
        });

        ProcessCompleteLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProcessCompleteLabel1.setText("Something must have gone wrong!");

        javax.swing.GroupLayout ProcessCompletePanelLayout = new javax.swing.GroupLayout(ProcessCompletePanel);
        ProcessCompletePanel.setLayout(ProcessCompletePanelLayout);
        ProcessCompletePanelLayout.setHorizontalGroup(
            ProcessCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcessCompletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProcessCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProcessCompleteLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcessCompletePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ProcessCompleteOKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ProcessCompletePanelLayout.setVerticalGroup(
            ProcessCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcessCompletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProcessCompleteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProcessCompleteOKButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ProcessCompleteDialog1Layout = new javax.swing.GroupLayout(ProcessCompleteDialog1.getContentPane());
        ProcessCompleteDialog1.getContentPane().setLayout(ProcessCompleteDialog1Layout);
        ProcessCompleteDialog1Layout.setHorizontalGroup(
            ProcessCompleteDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProcessCompletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProcessCompleteDialog1Layout.setVerticalGroup(
            ProcessCompleteDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProcessCompletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lecturer-Progress Report");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(60, 100, 255));
        sidepanel.setPreferredSize(new java.awt.Dimension(340, 720));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_addReport.setBackground(new java.awt.Color(60, 100, 255));
        btn_addReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addReportMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Add_32px_2.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add Report");

        javax.swing.GroupLayout btn_addReportLayout = new javax.swing.GroupLayout(btn_addReport);
        btn_addReport.setLayout(btn_addReportLayout);
        btn_addReportLayout.setHorizontalGroup(
            btn_addReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addReportLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        btn_addReportLayout.setVerticalGroup(
            btn_addReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_addReportLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepanel.add(btn_addReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 340, -1));

        btn_viewReport.setBackground(new java.awt.Color(60, 100, 255));
        btn_viewReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewReportMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_View_24px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View Report");

        javax.swing.GroupLayout btn_viewReportLayout = new javax.swing.GroupLayout(btn_viewReport);
        btn_viewReport.setLayout(btn_viewReportLayout);
        btn_viewReportLayout.setHorizontalGroup(
            btn_viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_viewReportLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        btn_viewReportLayout.setVerticalGroup(
            btn_viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_viewReportLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(15, 15, 15))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepanel.add(btn_viewReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        sidepanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 280, 10));

        paymentLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentLabel.setText("Progress Report");
        sidepanel.add(paymentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        btn_Back.setBackground(new java.awt.Color(60, 100, 255));
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Back_Arrow_32px_3.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Back");

        javax.swing.GroupLayout btn_BackLayout = new javax.swing.GroupLayout(btn_Back);
        btn_Back.setLayout(btn_BackLayout);
        btn_BackLayout.setHorizontalGroup(
            btn_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BackLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        btn_BackLayout.setVerticalGroup(
            btn_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_BackLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(15, 15, 15))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepanel.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        BG.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 720));

        contentMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentMainPanel.setLayout(new java.awt.CardLayout());

        viewReport.setBackground(new java.awt.Color(255, 255, 255));

        reportTable.setBackground(new java.awt.Color(255, 255, 255));
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        reportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reportTable);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("View Report");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Student ID :");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Progress    :");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout viewReportLayout = new javax.swing.GroupLayout(viewReport);
        viewReport.setLayout(viewReportLayout);
        viewReportLayout.setHorizontalGroup(
            viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewReportLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewReportLayout.createSequentialGroup()
                        .addGroup(viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(34, 34, 34)
                        .addGroup(viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        viewReportLayout.setVerticalGroup(
            viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewReportLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewReportLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewReportLayout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
                .addGroup(viewReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        contentMainPanel.add(viewReport, "card3");

        addReport.setBackground(new java.awt.Color(255, 255, 255));
        addReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddReport.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblAddReport.setForeground(new java.awt.Color(0, 0, 0));
        lblAddReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddReport.setText("Add Report");
        addReport.add(lblAddReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 880, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Student ID :");
        addReport.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Date           :");
        addReport.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        addReport.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 480, 50));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        addReport.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 480, 230));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Description:");
        addReport.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        btn_add.setBackground(new java.awt.Color(240, 240, 240));
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ADD");

        javax.swing.GroupLayout btn_addLayout = new javax.swing.GroupLayout(btn_add);
        btn_add.setLayout(btn_addLayout);
        btn_addLayout.setHorizontalGroup(
            btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_addLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(62, 62, 62))
        );
        btn_addLayout.setVerticalGroup(
            btn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_addLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(23, 23, 23))
        );

        addReport.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 180, 80));

        addReport.add(StudentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 480, 50));

        contentMainPanel.add(addReport, "card2");

        BG.add(contentMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 940, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addReportMouseClicked
        addReport.setVisible(true);
        viewReport.setVisible(false);
    }//GEN-LAST:event_btn_addReportMouseClicked

    private void btn_viewReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewReportMouseClicked
        addReport.setVisible(false);
        viewReport.setVisible(true);
    }//GEN-LAST:event_btn_viewReportMouseClicked

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        if (Jets.UserType.equals("STUDENT"))
            new StudentMainMenu().setVisible(true);
        if (Jets.UserType.equals("ADMIN"))
            new AdminMainMenu().setVisible(true);
        if (Jets.UserType.equals("LECTURER"))
            new LecturerMainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_BackMouseClicked

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        String id = StudentComboBox.getItemAt(StudentComboBox.getSelectedIndex());
        String date = jTextField2.getText();
        String desc = jTextArea1.getText();
        boolean isCheck = checkDate(date);
        boolean desCheck = checkDes(desc);
        
        if (!isCheck){
            JOptionPane.showMessageDialog(null, "The date should be in YYYY-MM-DD format. Ensure the value is correct");
            jTextField2.setText("");
        }
        
        if (!desCheck){
            JOptionPane.showMessageDialog(null, "Description cannot be more than 500 words");
        }
        
        String progressID;
        if(fullList.isEmpty()){
            progressID = "REP-0001";
        }
        else{
            progressID = generateNewReportID(fullList.get(fullList.size()-1).getID());
        }
        
        if (id.length()>0 && jTextField2.getText().length()>0 && jTextArea1.getText().length()>0){

            String url = "jdbc:db2:PMS";  //database name
            Connection con;
            try
            {
                Class.forName("com.ibm.db2.jcc.DB2Driver");
                con = DriverManager.getConnection(url);
                Statement sql;
                ResultSet rs;

                String input = "insert into PROGRESS_REPORT values (" 
                        + "'" + progressID + "'" + ", "
                        + "'" + date + "'" + ", "
                        + "'" + desc + "'" + ", "
                        + "'" + id + "'" + ", "
                        + "'" + Jets.UserID + "')"
                        ;
                sql = con.createStatement();
                sql.executeUpdate(input);
                sql.close();
                con.close();
                //jTextField1.setText("");
                jTextField2.setText("");
                jTextArea1.setText("");
                //jTextField1.setForeground(new java.awt.Color(102,102,102));
                //jTextField2.setForeground(new java.awt.Color(102,102,102));
                //jTextArea1.setForeground(new java.awt.Color(102,102,102));
                //jTextField1.setText("Example: 1151100653");
                //jTextField2.setText("Example: 2017-05-20");
                //jTextArea1.setText("Example: Report (words not more than 100)");
                ProcessCompleteLabel1.setText("Report has been added successfully!");
                ProcessCompleteDialog1.setVisible(true);
                progressList.add(new ProgressReport(progressID, date, desc, id, Jets.UserID));
                fullList.add(new ProgressReport(progressID, date, desc));
                refreshProgress();
            }
            catch (ClassNotFoundException | SQLException e)
            {

            }
        }
        else{
            JOptionPane.showMessageDialog(null, "All fields cannot be empty");
        }
    }//GEN-LAST:event_btn_addMouseClicked

    private void ProcessCompleteOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessCompleteOKButtonActionPerformed

        ProcessCompleteDialog1.dispose();
    }//GEN-LAST:event_ProcessCompleteOKButtonActionPerformed

    private void reportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseClicked
        int x = reportTable.getSelectedRow();
        jTextField3.setEditable(false);
        jTextField3.setText(progressList.get(x).getStuID());
        jTextArea2.setEditable(false);
        jTextArea2.setText(progressList.get(x).getDescription());

    }//GEN-LAST:event_reportTableMouseClicked

    public boolean checkDate(String date){
        date = date.toLowerCase();
        if (date.contains("a")||date.contains("b")||date.contains("c")||date.contains("d")||date.contains("e")||date.contains("f")
                ||date.contains("g")||date.contains("h")||date.contains("i")||date.contains("j")||date.contains("k")||date.contains("l")
                ||date.contains("m")||date.contains("n")||date.contains("o")||date.contains("p")||date.contains("q")||date.contains("r")
                ||date.contains("s")||date.contains("t")||date.contains("u")||date.contains("v")||date.contains("w")||date.contains("x")
                ||date.contains("y")||date.contains("z")||date.contains(".")||date.contains("/")){
            return false;
        }
        if((date.length()>10)||(date.length()<10)){
            return false;
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String d1 = localDate.format(dtf);
        String[] dt = d1.split("-");
        String y = dt[0];
        String m = dt[1];
        String d = dt[2];
        String[] splited = date.split("-");
        String splitYear = splited[0];
        String splitMonth = splited[1];
        String splitDay = splited[2];
        int currentY = Integer.parseInt(y);
        int currentM = Integer.parseInt(m);
        int currentD = Integer.parseInt(d);
        int targetY = Integer.parseInt(splitYear);
        int targetM = Integer.parseInt(splitMonth);
        int targetD = Integer.parseInt(splitDay);
        if (currentY>targetY){
            return false;
        }
        if ((currentY<=targetY)&&(currentM>targetM)){
            return false;
        }
        if ((currentY<=targetY)&&(currentM<=targetM)&&(currentD>targetD)){
            return false;
        }
        String datePattern = "\\d{4}-\\d{2}-\\d{2}";
        return ((date.matches(datePattern))&&(checkMonthAndDay(Integer.parseInt(splitYear),Integer.parseInt(splitMonth),Integer.parseInt(splitDay))));
    }
    
    public boolean checkMonthAndDay(int year, int month, int day){
        int month31[] = {1,3,5,7,8,10,12};
        int month30[] = {4,6,9,11};
        int month28[] = {2};
        double yr = (double)year;
        boolean checked = true;
        if (contains(month31, month)){
            if (day>31){
                checked = false;
            }
        }
        if (contains(month30, month)){
            if (day>30){
                checked = false;
            }
        }
        //System.out.println(yr%4);
        if (contains(month28, month)){
            if (yr%4 == 0){
                if (day>29){
                    System.out.println(yr%4);
                    checked = false;
                }
            }
            else{
                if (day>28){
                    checked = false;
                }
            }
        }
        return checked;
    }
    
    public boolean checkDes(String desc){
        boolean check = false;
        if (desc.length()>500){
            return check;
        }
        else{
            return true;
        }
    }
    
    public boolean contains(final int[] array, final int v) {
        for (final int e : array)
            if (e == v)
                return true;
        return false;
    }
     
    public String generateNewReportID(String lastID){
        String[] splited = lastID.split("-");
        String splitDigit = splited[1];
        int digit = Integer.parseInt(splitDigit);
        String newID = String.format("%0"+4+"d", digit+1);
        return ("REP-"+newID);
    }   
    
    public void refreshProgress(){
        progressList.clear();
        fullList.clear();
        String date;
        String description;
        String StuID;
        String LecID;
        
        Connection con;
        
        try{
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            con = DriverManager.getConnection(url);
            Statement sql1;
            ResultSet rs;
            
            String s1 ="select * from progress_report where lecturer_id = '" + Jets.UserID + "'";
            sql1= con.createStatement();
            rs = sql1.executeQuery(s1);   
            while (rs.next()){
                Id = rs.getString("report_id");
                date = rs.getString("report_date");
                description = rs.getString("progress");
                StuID = rs.getString("student_id");
                LecID = rs.getString("lecturer_id");
                progressList.add(new ProgressReport(Id,date,description,StuID,LecID));   
            }
            rs.close();
            sql1.close();
            
            Statement sql2;
            ResultSet rs2;
            String s2 = "select student_id from student where lecturer_id = '" + Jets.UserID + "'";
            sql2 = con.createStatement();
            rs2 = sql2.executeQuery(s2);
            while(rs2.next()){
                StudentComboBox.addItem(rs2.getString(1));
            }
            rs2.close();
            sql2.close();
            
            Statement sql3;
            ResultSet rs3;
            String s3 ="select * from progress_report" ;
            sql3= con.createStatement();
            rs3 = sql3.executeQuery(s3);
            while (rs3.next()){
                Id = rs3.getString("report_id");
                date = rs3.getString("report_date");
                description = rs3.getString("progress");
                StuID = rs3.getString("student_id");
                LecID = rs3.getString("lecturer_id");
                fullList.add(new ProgressReport(Id,date,description));
            }
            sql3.close();
            rs3.close();
            
            con.close();
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        if (!progressList.isEmpty()){
            ReportModel = (DefaultTableModel) reportTable.getModel();
            Object[][] progressData =
            {
                {progressList.get(0).getID(), progressList.get(0).getDate(), progressList.get(0).getDescription(), progressList.get(0).getStuID()}
            };
            String[] colName = {"Report ID", "Date Created", "Progress", "Student ID"};
            ReportModel.setDataVector(progressData, colName);
            for(int i = 1; i < progressList.size(); i++)
            {
                ReportModel.addRow(new Object[]{progressList.get(i).getID(), progressList.get(i).getDate(), progressList.get(i).getDescription(), progressList.get(i).getStuID()});
            }
            reportTable.setModel(ReportModel);
        }
        else{
            ReportModel = (DefaultTableModel) reportTable.getModel();
            Object[][] Subjectdata =
                {
                    {}
                };
            String[] SubjectcolName = {"Report ID", "Date Created", "Progress", "Student ID"};
            ReportModel.setDataVector(Subjectdata, SubjectcolName);
            ReportModel.removeRow(0);
            reportTable.setModel(ReportModel);
        }
    }
    
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
            java.util.logging.Logger.getLogger(LecProgressReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecProgressReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecProgressReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecProgressReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecProgressReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JDialog ProcessCompleteDialog1;
    private javax.swing.JLabel ProcessCompleteLabel1;
    private javax.swing.JButton ProcessCompleteOKButton;
    private javax.swing.JPanel ProcessCompletePanel;
    private javax.swing.JComboBox<String> StudentComboBox;
    private javax.swing.JPanel addReport;
    private javax.swing.JPanel btn_Back;
    private javax.swing.JPanel btn_add;
    private javax.swing.JPanel btn_addReport;
    private javax.swing.JPanel btn_viewReport;
    private javax.swing.JPanel contentMainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblAddReport;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JTable reportTable;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPanel viewReport;
    // End of variables declaration//GEN-END:variables
}

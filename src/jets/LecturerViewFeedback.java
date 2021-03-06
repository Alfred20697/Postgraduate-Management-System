package jets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class LecturerViewFeedback extends javax.swing.JFrame 
{
    LinkedList<String> FeedbackID = new LinkedList<String>();
    LinkedList<String> FeedbackTitle = new LinkedList<String>();
    LinkedList<String> FeedbackContent = new LinkedList<String>();
    LinkedList<String> FeedbackApproval = new LinkedList<String>();
    LinkedList<String> StudentID = new LinkedList<String>();
    LinkedList<String> LecturerID = new LinkedList<String>();
    /**
     * Creates new form ViewFeedback
     */
    DefaultTableModel Feedbackmodel = new DefaultTableModel()
    {
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };
    public LecturerViewFeedback() {
        initComponents();
        String url = "jdbc:db2:PMS";  //database name
        Connection con;
        try
        {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            con = DriverManager.getConnection(url);
            Statement sql;
            ResultSet rs;

            String input = "select feedback_id from feedback where lecturer_id = '" + Jets.UserID + "'";
            //System.out.println(input);
            sql = con.createStatement();
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                FeedbackID.add(rs.getString(1));
            }
            input = "select feedback_title from feedback where lecturer_id = '" + Jets.UserID + "'";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                //System.out.println(rs.getString(1));
                FeedbackTitle.add(rs.getString(1));
            }
            input = "select feedback_content from feedback where lecturer_id = '" + Jets.UserID + "'";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                //System.out.println(rs.getString(1));
                FeedbackContent.add(rs.getString(1));
            }
            rs.close();
            sql.close();
            con.close();
        }
        catch (ClassNotFoundException e)
        {

        }
        catch (SQLException e)
        {

        }
        
        if(FeedbackID.size() == 0)
        {
            Object[][] Feedbackdata =
            {
                {}
            };
            String[] FeedbackcolName = {"Feedback ID", "Feedback Title", "Feedback Content"};
            Feedbackmodel.setDataVector(Feedbackdata, FeedbackcolName);
            ViewFeedbackTable.setModel(Feedbackmodel);
            Feedbackmodel.removeRow(0);
        }
        else
        {
        Object[][] Feedbackdata =
        {
            {FeedbackID.get(0), FeedbackTitle.get(0), FeedbackContent.get(0)}
        };
        String[] FeedbackcolName = {"Feedback ID", "Feedback Title", "Feedback Content"};
        Feedbackmodel.setDataVector(Feedbackdata, FeedbackcolName);
        for(int i = 1; i < FeedbackID.size(); i++)
        {
            Feedbackmodel.addRow(new Object[]{FeedbackID.get(i), FeedbackTitle.get(i), FeedbackContent.get(i)});
        }
        ViewFeedbackTable.setModel(Feedbackmodel);
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

        ViewFeedbackPanel = new javax.swing.JPanel();
        ViewFeedbackLabel = new javax.swing.JLabel();
        ViewFeedbackScroll = new javax.swing.JScrollPane();
        ViewFeedbackTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContentTextArea = new javax.swing.JTextArea();
        DetailsLabel = new javax.swing.JLabel();
        FeedbackIDLabel = new javax.swing.JLabel();
        FeedbackTitleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lecturer - Feedback");

        ViewFeedbackPanel.setBackground(new java.awt.Color(255, 255, 255));

        ViewFeedbackLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        ViewFeedbackLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewFeedbackLabel.setText("View Feedback");

        ViewFeedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ViewFeedbackTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ViewFeedbackTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewFeedbackTableMouseClicked(evt);
            }
        });
        ViewFeedbackScroll.setViewportView(ViewFeedbackTable);

        ContentTextArea.setColumns(20);
        ContentTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ContentTextArea.setRows(5);
        jScrollPane1.setViewportView(ContentTextArea);

        DetailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        DetailsLabel.setText("Details of Feedback: ");

        FeedbackIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        FeedbackIDLabel.setText("Select a feedback from table");

        FeedbackTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Back_Arrow_64px_3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout ViewFeedbackPanelLayout = new javax.swing.GroupLayout(ViewFeedbackPanel);
        ViewFeedbackPanel.setLayout(ViewFeedbackPanelLayout);
        ViewFeedbackPanelLayout.setHorizontalGroup(
            ViewFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewFeedbackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewFeedbackPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewFeedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ViewFeedbackPanelLayout.createSequentialGroup()
                        .addGroup(ViewFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ViewFeedbackScroll)
                            .addGroup(ViewFeedbackPanelLayout.createSequentialGroup()
                                .addGroup(ViewFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FeedbackTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ViewFeedbackPanelLayout.createSequentialGroup()
                                        .addComponent(DetailsLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FeedbackIDLabel))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 260, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        ViewFeedbackPanelLayout.setVerticalGroup(
            ViewFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewFeedbackPanelLayout.createSequentialGroup()
                .addGroup(ViewFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewFeedbackLabel)
                    .addGroup(ViewFeedbackPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewFeedbackScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ViewFeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DetailsLabel)
                    .addComponent(FeedbackIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FeedbackTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewFeedbackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewFeedbackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewFeedbackTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewFeedbackTableMouseClicked
        // TODO add your handling code here:
        int x = ViewFeedbackTable.getSelectedRow();
        FeedbackIDLabel.setText(FeedbackID.get(x));
        FeedbackTitleLabel.setText(FeedbackTitle.get(x));
        ContentTextArea.setText(FeedbackContent.get(x));
    }//GEN-LAST:event_ViewFeedbackTableMouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        if (Jets.UserType.equals("STUDENT"))
            new StudentMainMenu().setVisible(true);
        if (Jets.UserType.equals("ADMIN"))
            new AdminMainMenu().setVisible(true);
        if (Jets.UserType.equals("LECTURER"))
            new LecturerMainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(LecturerViewFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerViewFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerViewFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerViewFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerViewFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ContentTextArea;
    private javax.swing.JLabel DetailsLabel;
    private javax.swing.JLabel FeedbackIDLabel;
    private javax.swing.JLabel FeedbackTitleLabel;
    private javax.swing.JLabel ViewFeedbackLabel;
    private javax.swing.JPanel ViewFeedbackPanel;
    private javax.swing.JScrollPane ViewFeedbackScroll;
    private javax.swing.JTable ViewFeedbackTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

package jets;

import java.awt.Color;
import java.util.*;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentPayment extends javax.swing.JFrame {

    LinkedList<Invoice> invoiceList = new LinkedList<>();
    List<Invoice> inv2 = new ArrayList<>();
    
    String url ="jdbc:db2:PMS";
    String accNo;
    String pass;
    String amt;
    String id;
    String idPayable;
    
    DefaultTableModel InvoiceModel = new DefaultTableModel()
    {
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };
    
    public StudentPayment() {
        initComponents();
        
        refreshPayment();
        
        
        makePaymentPanel.setVisible(true);
        contentMainPanel.setVisible(false);
        viewInvoicePanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VerifyUser = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        accountNumber = new javax.swing.JTextField();
        btnCancelPayment = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel37 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        PayAmount = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        amount1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        amount2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        btnCancelPayment1 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        btnPayment9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        btn_makePayment = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_viewInvoice = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        paymentLabel = new javax.swing.JLabel();
        btn_Back = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PaymentMain = new javax.swing.JPanel();
        contentMainPanel = new javax.swing.JPanel();
        viewInvoicePanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InvoiceTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        makePaymentPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        btnPayment1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnPayment2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnPayment3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btnPayment7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnPayment4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnPayment5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnPayment6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnPayment8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();

        VerifyUser.setMinimumSize(new java.awt.Dimension(730, 400));
        VerifyUser.setSize(new java.awt.Dimension(740, 370));
        VerifyUser.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(730, 370));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Account Number :");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Password             :");

        accountNumber.setBackground(new java.awt.Color(255, 255, 255));

        btnCancelPayment.setBackground(new java.awt.Color(240, 240, 240));
        btnCancelPayment.setPreferredSize(new java.awt.Dimension(155, 155));
        btnCancelPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelPaymentMousePressed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(48, 118, 232));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(48, 118, 232));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Cancel");

        javax.swing.GroupLayout btnCancelPaymentLayout = new javax.swing.GroupLayout(btnCancelPayment);
        btnCancelPayment.setLayout(btnCancelPaymentLayout);
        btnCancelPaymentLayout.setHorizontalGroup(
            btnCancelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnCancelPaymentLayout.setVerticalGroup(
            btnCancelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelPaymentLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(29, 29, 29))
        );

        btnLogin.setBackground(new java.awt.Color(240, 240, 240));
        btnLogin.setPreferredSize(new java.awt.Dimension(155, 155));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(48, 118, 232));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(48, 118, 232));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Login");

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(29, 29, 29))
        );

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Login");

        jLabel1.setText("Default Acc No: 7057788999");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnCancelPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel18)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(accountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                                .addComponent(jPasswordField1)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        VerifyUser.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        PayAmount.setMinimumSize(new java.awt.Dimension(822, 416));
        PayAmount.setSize(new java.awt.Dimension(822, 416));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        amount1.setEditable(false);
        amount1.setBackground(new java.awt.Color(255, 255, 255));
        amount1.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        amount1.setBorder(null);
        jPanel2.add(amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 370, 60));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Bank Account Number : __________________");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 802, 61));

        amount2.setEditable(false);
        amount2.setBackground(new java.awt.Color(255, 255, 255));
        amount2.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        amount2.setBorder(null);
        jPanel2.add(amount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 270, 60));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Amount Owe                 : RM _____________");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 802, 61));

        btnCancelPayment1.setBackground(new java.awt.Color(240, 240, 240));
        btnCancelPayment1.setPreferredSize(new java.awt.Dimension(155, 155));
        btnCancelPayment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelPayment1MousePressed(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(48, 118, 232));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(48, 118, 232));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Cancel");

        javax.swing.GroupLayout btnCancelPayment1Layout = new javax.swing.GroupLayout(btnCancelPayment1);
        btnCancelPayment1.setLayout(btnCancelPayment1Layout);
        btnCancelPayment1Layout.setHorizontalGroup(
            btnCancelPayment1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnCancelPayment1Layout.setVerticalGroup(
            btnCancelPayment1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelPayment1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(29, 29, 29))
        );

        jPanel2.add(btnCancelPayment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 280, 90));

        btnPayment9.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment9.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment9MouseClicked(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(48, 118, 232));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(48, 118, 232));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("PAY");

        javax.swing.GroupLayout btnPayment9Layout = new javax.swing.GroupLayout(btnPayment9);
        btnPayment9.setLayout(btnPayment9Layout);
        btnPayment9Layout.setHorizontalGroup(
            btnPayment9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnPayment9Layout.setVerticalGroup(
            btnPayment9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPayment9Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(29, 29, 29))
        );

        jPanel2.add(btnPayment9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 280, 90));

        javax.swing.GroupLayout PayAmountLayout = new javax.swing.GroupLayout(PayAmount.getContentPane());
        PayAmount.getContentPane().setLayout(PayAmountLayout);
        PayAmountLayout.setHorizontalGroup(
            PayAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayAmountLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PayAmountLayout.setVerticalGroup(
            PayAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayAmountLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student - Payment");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(1280, 720));
        bg.setPreferredSize(new java.awt.Dimension(1280, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(60, 100, 255));
        sidepanel.setPreferredSize(new java.awt.Dimension(340, 720));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_makePayment.setBackground(new java.awt.Color(60, 100, 255));
        btn_makePayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_makePaymentMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Money_Bag_32px_3.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Make Payment");

        javax.swing.GroupLayout btn_makePaymentLayout = new javax.swing.GroupLayout(btn_makePayment);
        btn_makePayment.setLayout(btn_makePaymentLayout);
        btn_makePaymentLayout.setHorizontalGroup(
            btn_makePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_makePaymentLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        btn_makePaymentLayout.setVerticalGroup(
            btn_makePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_makePaymentLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepanel.add(btn_makePayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 340, -1));

        btn_viewInvoice.setBackground(new java.awt.Color(60, 100, 255));
        btn_viewInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewInvoiceMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Invoice_32px_2.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View invoice");

        javax.swing.GroupLayout btn_viewInvoiceLayout = new javax.swing.GroupLayout(btn_viewInvoice);
        btn_viewInvoice.setLayout(btn_viewInvoiceLayout);
        btn_viewInvoiceLayout.setHorizontalGroup(
            btn_viewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_viewInvoiceLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        btn_viewInvoiceLayout.setVerticalGroup(
            btn_viewInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_viewInvoiceLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(15, 15, 15))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepanel.add(btn_viewInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        sidepanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 280, 10));

        paymentLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentLabel.setText("Payment");
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

        bg.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 720));

        PaymentMain.setBackground(new java.awt.Color(255, 255, 255));
        PaymentMain.setLayout(new java.awt.CardLayout());

        contentMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PaymentMain.add(contentMainPanel, "card3");

        viewInvoicePanel.setBackground(new java.awt.Color(255, 255, 255));
        viewInvoicePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Invoice");
        viewInvoicePanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        InvoiceTable.setBackground(new java.awt.Color(255, 255, 255));
        InvoiceTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        InvoiceTable.setForeground(new java.awt.Color(51, 51, 51));
        InvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        InvoiceTable.setRowHeight(20);
        InvoiceTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        InvoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(InvoiceTable);

        viewInvoicePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 940, 260));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Payment Status          :");
        viewInvoicePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Invoice ID                   :");
        viewInvoicePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Invoice Description    :");
        viewInvoicePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Invoice Date               :");
        viewInvoicePanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Invoice Amount         :");
        viewInvoicePanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        viewInvoicePanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 590, 50));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        viewInvoicePanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 590, 50));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        viewInvoicePanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 590, 50));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        viewInvoicePanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 590, 50));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        viewInvoicePanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 590, 50));

        PaymentMain.add(viewInvoicePanel, "card4");

        makePaymentPanel.setBackground(new java.awt.Color(255, 255, 255));
        makePaymentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Amount Owe : RM __________________");
        makePaymentPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 802, 61));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("1. Payment via Paypal,FPX or Credit Card");
        makePaymentPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("2. Payment via Online Banking");
        makePaymentPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        amount.setEditable(false);
        amount.setBackground(new java.awt.Color(255, 255, 255));
        amount.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        makePaymentPanel.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 410, 60));

        btnPayment1.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment1.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment1MouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(48, 118, 232));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(48, 118, 232));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MASTERCARD");

        javax.swing.GroupLayout btnPayment1Layout = new javax.swing.GroupLayout(btnPayment1);
        btnPayment1.setLayout(btnPayment1Layout);
        btnPayment1Layout.setHorizontalGroup(
            btnPayment1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPayment1Layout.setVerticalGroup(
            btnPayment1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPayment1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(29, 29, 29))
        );

        makePaymentPanel.add(btnPayment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 280, 90));

        btnPayment2.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment2.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment2MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(48, 118, 232));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(48, 118, 232));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("VISA");

        javax.swing.GroupLayout btnPayment2Layout = new javax.swing.GroupLayout(btnPayment2);
        btnPayment2.setLayout(btnPayment2Layout);
        btnPayment2Layout.setHorizontalGroup(
            btnPayment2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnPayment2Layout.setVerticalGroup(
            btnPayment2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPayment2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel21)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        makePaymentPanel.add(btnPayment2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 280, 90));

        btnPayment3.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment3.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment3MouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(48, 118, 232));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(48, 118, 232));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("PAYPAL");

        javax.swing.GroupLayout btnPayment3Layout = new javax.swing.GroupLayout(btnPayment3);
        btnPayment3.setLayout(btnPayment3Layout);
        btnPayment3Layout.setHorizontalGroup(
            btnPayment3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnPayment3Layout.setVerticalGroup(
            btnPayment3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPayment3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(29, 29, 29))
        );

        makePaymentPanel.add(btnPayment3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 280, 90));

        btnPayment7.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment7.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment7MouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(48, 118, 232));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(48, 118, 232));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("FPX");

        javax.swing.GroupLayout btnPayment7Layout = new javax.swing.GroupLayout(btnPayment7);
        btnPayment7.setLayout(btnPayment7Layout);
        btnPayment7Layout.setHorizontalGroup(
            btnPayment7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnPayment7Layout.setVerticalGroup(
            btnPayment7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPayment7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel23)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        makePaymentPanel.add(btnPayment7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 280, 90));

        btnPayment4.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment4.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment4MouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(48, 118, 232));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(48, 118, 232));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("CIMB CLICKS");

        javax.swing.GroupLayout btnPayment4Layout = new javax.swing.GroupLayout(btnPayment4);
        btnPayment4.setLayout(btnPayment4Layout);
        btnPayment4Layout.setHorizontalGroup(
            btnPayment4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnPayment4Layout.setVerticalGroup(
            btnPayment4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPayment4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel25)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        makePaymentPanel.add(btnPayment4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 280, 90));

        btnPayment5.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment5.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment5MouseClicked(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(48, 118, 232));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(48, 118, 232));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("HONG LEONG CONNECT");

        javax.swing.GroupLayout btnPayment5Layout = new javax.swing.GroupLayout(btnPayment5);
        btnPayment5.setLayout(btnPayment5Layout);
        btnPayment5Layout.setHorizontalGroup(
            btnPayment5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPayment5Layout.setVerticalGroup(
            btnPayment5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPayment5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel26)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        makePaymentPanel.add(btnPayment5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 280, 90));

        btnPayment6.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment6.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment6MouseClicked(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(48, 118, 232));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(48, 118, 232));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("MAYBANK2U");

        javax.swing.GroupLayout btnPayment6Layout = new javax.swing.GroupLayout(btnPayment6);
        btnPayment6.setLayout(btnPayment6Layout);
        btnPayment6Layout.setHorizontalGroup(
            btnPayment6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnPayment6Layout.setVerticalGroup(
            btnPayment6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPayment6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel27)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        makePaymentPanel.add(btnPayment6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 280, 90));

        btnPayment8.setBackground(new java.awt.Color(240, 240, 240));
        btnPayment8.setPreferredSize(new java.awt.Dimension(155, 155));
        btnPayment8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayment8MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(48, 118, 232));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(48, 118, 232));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("RHB NOW");

        javax.swing.GroupLayout btnPayment8Layout = new javax.swing.GroupLayout(btnPayment8);
        btnPayment8.setLayout(btnPayment8Layout);
        btnPayment8Layout.setHorizontalGroup(
            btnPayment8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnPayment8Layout.setVerticalGroup(
            btnPayment8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPayment8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel28)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        makePaymentPanel.add(btnPayment8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 280, 90));

        PaymentMain.add(makePaymentPanel, "card3");

        bg.add(PaymentMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 940, 720));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_makePaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_makePaymentMouseClicked
        makePaymentPanel.setVisible(true);
        contentMainPanel.setVisible(false);
        viewInvoicePanel.setVisible(false);
    }//GEN-LAST:event_btn_makePaymentMouseClicked

    private void btn_viewInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewInvoiceMouseClicked
        makePaymentPanel.setVisible(false);
        contentMainPanel.setVisible(false);
        viewInvoicePanel.setVisible(true);
    }//GEN-LAST:event_btn_viewInvoiceMouseClicked

    private void btnPayment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment1MouseClicked
        if(amount.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You don't have amount due. Access denied.");
        }
        else{
            VerifyUser.setVisible(true);
        }
    }//GEN-LAST:event_btnPayment1MouseClicked

    private void btnPayment2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment2MouseClicked
        if(amount.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You don't have amount due. Access denied.");
        }
        else{
            VerifyUser.setVisible(true);
        }
    }//GEN-LAST:event_btnPayment2MouseClicked

    private void btnPayment3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment3MouseClicked
        if(amount.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You don't have amount due. Access denied.");
        }
        else{
            VerifyUser.setVisible(true);
        }
    }//GEN-LAST:event_btnPayment3MouseClicked

    private void btnPayment7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment7MouseClicked
        if(amount.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You don't have amount due. Access denied.");
        }
        else{
            VerifyUser.setVisible(true);
        }
    }//GEN-LAST:event_btnPayment7MouseClicked

    private void btnPayment4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment4MouseClicked
        if(amount.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You don't have amount due. Access denied.");
        }
        else{
            VerifyUser.setVisible(true);
        }
    }//GEN-LAST:event_btnPayment4MouseClicked

    private void btnPayment5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment5MouseClicked
        if(amount.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You don't have amount due. Access denied.");
        }
        else{
            VerifyUser.setVisible(true);
        }
    }//GEN-LAST:event_btnPayment5MouseClicked

    private void btnPayment6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment6MouseClicked
        if(amount.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You don't have amount due. Access denied.");
        }
        else{
            VerifyUser.setVisible(true);
        }
    }//GEN-LAST:event_btnPayment6MouseClicked

    private void btnPayment8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment8MouseClicked
        if(amount.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You don't have amount due. Access denied.");
        }
        else{
            VerifyUser.setVisible(true);
        }
    }//GEN-LAST:event_btnPayment8MouseClicked

    private void btnCancelPaymentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPaymentMousePressed
        VerifyUser.dispose();
    }//GEN-LAST:event_btnCancelPaymentMousePressed

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        accNo = accountNumber.getText();
        pass = jPasswordField1.getText();
        
        Connection con;
        
        String acc = "";
        String pw = "";
        
	try {
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		con = DriverManager.getConnection(url);
		Statement sql1;
		ResultSet rs;
		String s1 = "SELECT STUDENT_ACC_No, STUDENT_PASSWORD FROM STUDENT WHERE STUDENT_ID = '" +  Jets.UserID + "'";
		sql1 = con.createStatement();
		rs = sql1.executeQuery(s1);
		while (rs.next ()) {
                    acc = rs.getString(1);
                    pw = rs.getString(2);
		}
		rs.close();
		sql1.close();
		//con.close();
	} //end try
        catch (ClassNotFoundException | SQLException e) {
		System.out.println(e);
	}

        if ((accNo.equals(acc))&&(pass.equals(pw))){
            accNo = acc;
            JOptionPane.showMessageDialog(null, "Verify successfully");
            //new StudentPayment().setVisible(true);
            PayAmount.setVisible(true);
            accountNumber.setText("");
            jPasswordField1.setText("");
            VerifyUser.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Your account number or password is incorrect");
            accountNumber.setText("");
            jPasswordField1.setText("");
        }
        amount1.setText(accNo);
        amount2.setText(String.valueOf(amt));
        
    }//GEN-LAST:event_btnLoginMousePressed

    private void btnCancelPayment1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelPayment1MousePressed
        PayAmount.dispose();
    }//GEN-LAST:event_btnCancelPayment1MousePressed

    private void btnPayment9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayment9MouseClicked
         Connection con;
         invoiceList.clear();
         inv2.clear();
         try
        {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            con = DriverManager.getConnection(url);
            Statement sql;
            ResultSet rs;

            String input = "update invoice set payment_status = 'PAID' where student_id = '"  
                    + Jets.UserID + "' and invoice_ID = '" + idPayable + "'";
            sql = con.createStatement();
            sql.executeUpdate(input);
            sql.close();
            
            Statement sql2;
            String s2 ="select * from invoice where student_id = '" + Jets.UserID + "'" ;
            sql2= con.createStatement();
            rs = sql2.executeQuery(s2);
            
            String date;
            String description;
            String payStatus;
            String admID;
            String temp;
            String amount;
            
            while (rs.next()){
                id = rs.getString("invoice_id");
                amount = rs.getString("amount_to_pay");
                double x = Double.parseDouble(amount);
                date = rs.getString("invoice_date");
                description = rs.getString("invoice_description");
                payStatus = rs.getString("payment_status");
                admID = rs.getString("admin_ID");
                temp = rs.getString("Student_id");
                invoiceList.add(new Invoice(id,x,date,description,payStatus, temp));               
            }
            
            rs.close();
            sql2.close();
            
            Statement sql3;
            ResultSet rs3;
            String amountPayable = "";
            String s3 = "select invoice_id, amount_to_pay as sum from invoice where student_id = '" + Jets.UserID + "' and payment_status = 'NOT PAID'";
            sql3 = con.createStatement();
            rs3 = sql3.executeQuery(s3);
            double y;
            double total=0;
            while(rs3.next()){
                idPayable = rs3.getString("invoice_id");
                amountPayable = rs3.getString("sum");
                y = Double.parseDouble(amountPayable);
                total+=y;
                inv2.add(new Invoice(idPayable, y));
            }
            this.amount.setText(Double.toString(total));
            amt=amountPayable;
            
            rs3.close();
            sql3.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
        }
        Object[][] invoiceData =
        {
            {invoiceList.get(0).getID(), invoiceList.get(0).getDate(), invoiceList.get(0).getAmount(), invoiceList.get(0).getDescription(),invoiceList.get(0).getPaymentStatus()}
        };
        String[] colName = {"Invoice ID", "Date Created", "Total Amount", "Description", "Payment Status"};
        InvoiceModel.setDataVector(invoiceData, colName);
        for(int i = 1; i < invoiceList.size(); i++)
        {
            InvoiceModel.addRow(new Object[]{invoiceList.get(i).getID(), invoiceList.get(i).getDate(), invoiceList.get(i).getAmount(), invoiceList.get(i).getDescription(),invoiceList.get(i).getPaymentStatus()});
        }
        InvoiceTable.setModel(InvoiceModel); 
         
        JOptionPane.showMessageDialog(null, "Paid Successfully");
        PayAmount.dispose();
        refreshPayment();
    }//GEN-LAST:event_btnPayment9MouseClicked

    private void InvoiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoiceTableMouseClicked
        int x = InvoiceTable.getSelectedRow();
        jTextField4.setEditable(false);
        jTextField4.setText(invoiceList.get(x).getDate());
        jTextField2.setEditable(false);
        jTextField2.setText(invoiceList.get(x).getID());
        jTextField3.setEditable(false);
        jTextField3.setText(invoiceList.get(x).getDescription());
        jTextField5.setEditable(false);
        jTextField5.setText(Double.toString(invoiceList.get(x).getAmount()));
        jTextField1.setEditable(false);
        jTextField1.setText(invoiceList.get(x).getPaymentStatus());
        
    }//GEN-LAST:event_InvoiceTableMouseClicked

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        if (Jets.UserType.equals("STUDENT"))
            new StudentMainMenu().setVisible(true);
        if (Jets.UserType.equals("ADMIN"))
            new AdminMainMenu().setVisible(true);
        if (Jets.UserType.equals("LECTURER"))
            new LecturerMainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_BackMouseClicked
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InvoiceTable;
    private javax.swing.JDialog PayAmount;
    private javax.swing.JPanel PaymentMain;
    private javax.swing.JDialog VerifyUser;
    private javax.swing.JTextField accountNumber;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount2;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnCancelPayment;
    private javax.swing.JPanel btnCancelPayment1;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel btnPayment1;
    private javax.swing.JPanel btnPayment2;
    private javax.swing.JPanel btnPayment3;
    private javax.swing.JPanel btnPayment4;
    private javax.swing.JPanel btnPayment5;
    private javax.swing.JPanel btnPayment6;
    private javax.swing.JPanel btnPayment7;
    private javax.swing.JPanel btnPayment8;
    private javax.swing.JPanel btnPayment9;
    private javax.swing.JPanel btn_Back;
    private javax.swing.JPanel btn_makePayment;
    private javax.swing.JPanel btn_viewInvoice;
    private javax.swing.JPanel contentMainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel makePaymentPanel;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPanel viewInvoicePanel;
    // End of variables declaration//GEN-END:variables

    private void refreshPayment() {
        invoiceList.clear();
        String date;
        String description;
        String payStatus;
        String admID;
        String temp;
        String amount;
        String amountPayable = "";
        
        Connection con;
        
        try{
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            con = DriverManager.getConnection(url);
            Statement sql1;
            ResultSet rs;
            Statement sql2;
            ResultSet rs2;
            
            String s1 ="select * from invoice where student_id = '" + Jets.UserID + "'" ;
            sql1= con.createStatement();
            rs = sql1.executeQuery(s1);
            
            while (rs.next()){
                id = rs.getString("invoice_id");
                amount = rs.getString("amount_to_pay");
                double x = Double.parseDouble(amount);
                date = rs.getString("invoice_date");
                description = rs.getString("invoice_description");
                payStatus = rs.getString("payment_status");
                admID = rs.getString("admin_ID");
                temp = rs.getString("Student_id");
                invoiceList.add(new Invoice(id,x,date,description,payStatus, temp));               
            }
            
            rs.close();
            sql1.close();
            
            String s2 = "select invoice_id, amount_to_pay as sum from invoice where student_id = '" + Jets.UserID + "' and payment_status = 'NOT PAID'";
            sql2 = con.createStatement();
            rs2 = sql2.executeQuery(s2);
            double y;
            double total=0;
            while(rs2.next()){
                idPayable = rs2.getString("invoice_id");
                amountPayable = rs2.getString("sum");
                y = Double.parseDouble(amountPayable);
                total+=y;
                inv2.add(new Invoice(idPayable, y));
            }

            this.amount.setText(Double.toString(total));
            amt=amountPayable;
            //System.out.println(amt);
            
            rs2.close();
            sql2.close();
            con.close();
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }        
        if (!invoiceList.isEmpty()){
            Object[][] invoiceData =
            {
                {invoiceList.get(0).getID(), invoiceList.get(0).getDate(), invoiceList.get(0).getAmount(), invoiceList.get(0).getDescription(),invoiceList.get(0).getPaymentStatus()}
            };
            String[] colName = {"Invoice ID", "Date Created", "Total Amount", "Description", "Payment Status"};
            InvoiceModel.setDataVector(invoiceData, colName);
            for(int i = 1; i < invoiceList.size(); i++)
            {
                InvoiceModel.addRow(new Object[]{invoiceList.get(i).getID(), invoiceList.get(i).getDate(), invoiceList.get(i).getAmount(), invoiceList.get(i).getDescription(),invoiceList.get(i).getPaymentStatus()});
            }
            InvoiceTable.setModel(InvoiceModel);
        }
        else{
            Object[][] Subjectdata =
                {
                    {}
                };
            String[] SubjectcolName = {"Invoice ID", "Date Created", "Total Amount", "Description", "Payment Status"};
            InvoiceModel.setDataVector(Subjectdata, SubjectcolName);
            InvoiceModel.removeRow(0);
            InvoiceTable.setModel(InvoiceModel);
        }
    }
}

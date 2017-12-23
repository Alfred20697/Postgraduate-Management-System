package jets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class AdminSubjectManagement extends javax.swing.JFrame 
{

    /**
     * Creates new form SubjectManagement
     */
    LinkedList<String> SubjectID = new LinkedList<>();
    LinkedList<String> SubjectDescription = new LinkedList<>();
    LinkedList<String> SubjectName = new LinkedList<>();
    LinkedList<String> SubjectCreditHour = new LinkedList<>();
    LinkedList<String> SubjectCost = new LinkedList<>();
    LinkedList<String> CourseID = new LinkedList<>();
    LinkedList<String> CourseName = new LinkedList<>();
    LinkedList<String> LecturerID = new LinkedList<>();
    LinkedList<String> LecturerName = new LinkedList<>();
    
    DefaultTableModel Subjectmodel = new DefaultTableModel()
    {
        @Override
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };
    public AdminSubjectManagement() {
        initComponents();
        String url = "jdbc:db2:PMS";  //database name
        Connection con;
        CourseComboBox.addItem("-");
        LecturerComboBox.addItem("-");
        EditCourseComboBox.addItem("-");
        EditLecturerComboBox.addItem("-");
        try
        {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            con = DriverManager.getConnection(url);
            Statement sql;
            ResultSet rs;

            String input = "select * from subject";
            sql = con.createStatement();
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                SubjectID.add(rs.getString(1));
            }
            input = "select subject_name from subject";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                SubjectName.add(rs.getString(1));
            }
            input = "select subject_description from subject";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                SubjectDescription.add(rs.getString(1));
            }
            input = "select credit_hour from subject";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                SubjectCreditHour.add(rs.getString(1));
            }
            input = "select subject_cost from subject";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                SubjectCost.add(rs.getString(1));
            }
            input = "select course_id from subject";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                CourseID.add(rs.getString(1));
            }
            input = "select lecturer_id from subject";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                LecturerID.add(rs.getString(1));
            }
            input = "select course_name from course";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                CourseComboBox.addItem(rs.getString(1));
                EditCourseComboBox.addItem(rs.getString(1));
            }
            input = "select lecturer_name from lecturer";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                LecturerComboBox.addItem(rs.getString(1));
                EditLecturerComboBox.addItem(rs.getString(1));
            }
            for(int i = 0; i < CourseID.size(); i++)
            {
                input = "select course_name from course where course_id = '" + CourseID.get(i) + "'";
                rs = sql.executeQuery(input);
                while (rs.next())
                {
                    CourseName.add(rs.getString(1));
                }
            }
            for(int i = 0; i < LecturerID.size(); i++)
            {
                input = "select lecturer_name from lecturer where lecturer_id = '" + LecturerID.get(i) + "'";
                rs = sql.executeQuery(input);
                while (rs.next())
                {
                    LecturerName.add(rs.getString(1));
                }
            }
            
            if(SubjectID.size() == 0)
            {
                Object[][] Subjectdata =
                {
                    {}
                };
                String[] SubjectcolName = {"Subject ID", "Subject Name", "Subject Description", "Credit Hour", "Cost", "Course ID", "Lecturer ID"};
                Subjectmodel.setDataVector(Subjectdata, SubjectcolName);
                Subjectmodel.removeRow(0);
            }
            else
            {
                Object[][] Subjectdata =
                {
                    {SubjectID.get(0), SubjectName.get(0), SubjectDescription.get(0), SubjectCreditHour.get(0), 
                    SubjectCost.get(0), CourseID.get(0), LecturerID.get(0)}
                };
                String[] SubjectcolName = {"Subject ID", "Subject Name", "Subject Description", "Credit Hour", "Cost", "Course ID", "Lecturer ID"};
                Subjectmodel.setDataVector(Subjectdata, SubjectcolName);
                for(int i = 1; i < SubjectID.size(); i++)
                {
                    Subjectmodel.addRow(new Object[]{SubjectID.get(i), SubjectName.get(i), SubjectDescription.get(i), SubjectCreditHour.get(i), 
                        SubjectCost.get(i), CourseID.get(i), LecturerID.get(i)});
                }
            }
            
            SubjectTable.setModel(Subjectmodel);
            rs.close();
            sql.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("We have a problem");
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

        ExceptionDialog = new javax.swing.JDialog();
        ExceptionDialogPanel = new javax.swing.JPanel();
        OKButton = new javax.swing.JButton();
        ExceptionScrollPane = new javax.swing.JScrollPane();
        ExceptionTextArea = new javax.swing.JTextArea();
        ProcessCompleteDialog = new javax.swing.JDialog();
        ProcessCompletePanel = new javax.swing.JPanel();
        ProcessCompleteOKButton = new javax.swing.JButton();
        ProcessCompleteLabel = new javax.swing.JLabel();
        DeleteConfirmation = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        DeleteConfirmationOKButton = new javax.swing.JButton();
        DeleteConfirmationCancelButton = new javax.swing.JButton();
        WarningLabel = new javax.swing.JLabel();
        WarningMessageLabel = new javax.swing.JLabel();
        ProceedLabel = new javax.swing.JLabel();
        WarningMessageLabel2 = new javax.swing.JLabel();
        CourseManagementPanel = new javax.swing.JPanel();
        CourseManagementLabel = new javax.swing.JLabel();
        SubjectTableScroll = new javax.swing.JScrollPane();
        SubjectTable = new javax.swing.JTable();
        AddSubjectLabel = new javax.swing.JLabel();
        SubjectIDLabel = new javax.swing.JLabel();
        SubjectDescriptionLabel = new javax.swing.JLabel();
        SubjectCreditHourLabel = new javax.swing.JLabel();
        SubjectCostTextField = new javax.swing.JTextField();
        SubjectIDTextField = new javax.swing.JTextField();
        AddSubjectButton = new javax.swing.JButton();
        EditCourseTitleLabel = new javax.swing.JLabel();
        EditSubjectNameLabel = new javax.swing.JLabel();
        EditSubjectCreditHourLabel = new javax.swing.JLabel();
        EditSubjectCreditHourTextField = new javax.swing.JTextField();
        EditSubjectButton = new javax.swing.JButton();
        BackButton = new javax.swing.JLabel();
        EditSubjectLabel = new javax.swing.JLabel();
        DeleteSubjectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SubjectNameTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        EditSubjectNameTextArea = new javax.swing.JTextArea();
        SubjectNameLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SubjectDescriptionTextArea = new javax.swing.JTextArea();
        SubjectCostLabel = new javax.swing.JLabel();
        SubjectCreditHourTextField = new javax.swing.JTextField();
        LecturerComboBox = new javax.swing.JComboBox<>();
        CourseComboBox = new javax.swing.JComboBox<>();
        SubjectNameLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        EditSubjectDescriptionTextArea = new javax.swing.JTextArea();
        EditSubjectCostLabel = new javax.swing.JLabel();
        EditSubjectCostTextField = new javax.swing.JTextField();
        EditCourseComboBox = new javax.swing.JComboBox<>();
        EditLecturerComboBox = new javax.swing.JComboBox<>();

        ExceptionDialog.setMinimumSize(new java.awt.Dimension(400, 200));

        ExceptionDialogPanel.setBackground(new java.awt.Color(255, 255, 255));

        OKButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        ExceptionScrollPane.setBorder(null);

        ExceptionTextArea.setEditable(false);
        ExceptionTextArea.setColumns(20);
        ExceptionTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ExceptionTextArea.setLineWrap(true);
        ExceptionTextArea.setRows(5);
        ExceptionTextArea.setText("An unexpected error has occured!");
        ExceptionTextArea.setWrapStyleWord(true);
        ExceptionTextArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ExceptionScrollPane.setViewportView(ExceptionTextArea);

        javax.swing.GroupLayout ExceptionDialogPanelLayout = new javax.swing.GroupLayout(ExceptionDialogPanel);
        ExceptionDialogPanel.setLayout(ExceptionDialogPanelLayout);
        ExceptionDialogPanelLayout.setHorizontalGroup(
            ExceptionDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExceptionDialogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExceptionDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExceptionDialogPanelLayout.createSequentialGroup()
                        .addGap(0, 250, Short.MAX_VALUE)
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ExceptionScrollPane))
                .addContainerGap())
        );
        ExceptionDialogPanelLayout.setVerticalGroup(
            ExceptionDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExceptionDialogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExceptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OKButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ExceptionDialogLayout = new javax.swing.GroupLayout(ExceptionDialog.getContentPane());
        ExceptionDialog.getContentPane().setLayout(ExceptionDialogLayout);
        ExceptionDialogLayout.setHorizontalGroup(
            ExceptionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExceptionDialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ExceptionDialogLayout.setVerticalGroup(
            ExceptionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExceptionDialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ProcessCompleteDialog.setSize(new java.awt.Dimension(400, 200));

        ProcessCompletePanel.setBackground(new java.awt.Color(255, 255, 255));

        ProcessCompleteOKButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProcessCompleteOKButton.setText("OK");
        ProcessCompleteOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessCompleteOKButtonActionPerformed(evt);
            }
        });

        ProcessCompleteLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProcessCompleteLabel.setText("Something must have gone wrong!");

        javax.swing.GroupLayout ProcessCompletePanelLayout = new javax.swing.GroupLayout(ProcessCompletePanel);
        ProcessCompletePanel.setLayout(ProcessCompletePanelLayout);
        ProcessCompletePanelLayout.setHorizontalGroup(
            ProcessCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcessCompletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProcessCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcessCompletePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ProcessCompleteOKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProcessCompleteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        ProcessCompletePanelLayout.setVerticalGroup(
            ProcessCompletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcessCompletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProcessCompleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(ProcessCompleteOKButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout ProcessCompleteDialogLayout = new javax.swing.GroupLayout(ProcessCompleteDialog.getContentPane());
        ProcessCompleteDialog.getContentPane().setLayout(ProcessCompleteDialogLayout);
        ProcessCompleteDialogLayout.setHorizontalGroup(
            ProcessCompleteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProcessCompletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProcessCompleteDialogLayout.setVerticalGroup(
            ProcessCompleteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProcessCompletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DeleteConfirmation.setSize(new java.awt.Dimension(400, 200));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        DeleteConfirmationOKButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeleteConfirmationOKButton.setText("OK");
        DeleteConfirmationOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteConfirmationOKButtonActionPerformed(evt);
            }
        });

        DeleteConfirmationCancelButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeleteConfirmationCancelButton.setText("Cancel\n");
        DeleteConfirmationCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteConfirmationCancelButtonActionPerformed(evt);
            }
        });

        WarningLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WarningLabel.setText("WARNING");

        WarningMessageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WarningMessageLabel.setText("Deleting this subject will affect Timetable, Exam Result and");

        ProceedLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProceedLabel.setText("Proceed?");

        WarningMessageLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WarningMessageLabel2.setText("Invoice.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DeleteConfirmationCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteConfirmationOKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WarningLabel)
                            .addComponent(WarningMessageLabel)
                            .addComponent(ProceedLabel)
                            .addComponent(WarningMessageLabel2))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WarningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WarningMessageLabel)
                .addGap(1, 1, 1)
                .addComponent(WarningMessageLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProceedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteConfirmationOKButton)
                    .addComponent(DeleteConfirmationCancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout DeleteConfirmationLayout = new javax.swing.GroupLayout(DeleteConfirmation.getContentPane());
        DeleteConfirmation.getContentPane().setLayout(DeleteConfirmationLayout);
        DeleteConfirmationLayout.setHorizontalGroup(
            DeleteConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DeleteConfirmationLayout.setVerticalGroup(
            DeleteConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin - Manage Subject");

        CourseManagementPanel.setBackground(new java.awt.Color(255, 255, 255));
        CourseManagementPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        CourseManagementLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CourseManagementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseManagementLabel.setText("Subject Management");

        SubjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        SubjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubjectTableMouseClicked(evt);
            }
        });
        SubjectTableScroll.setViewportView(SubjectTable);

        AddSubjectLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddSubjectLabel.setText("Add Subject");

        SubjectIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectIDLabel.setText("Subject ID");

        SubjectDescriptionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectDescriptionLabel.setText("Subject Description");

        SubjectCreditHourLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectCreditHourLabel.setText("Credit Hour");

        SubjectCostTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectCostTextField.setForeground(new java.awt.Color(102, 102, 102));
        SubjectCostTextField.setText("Example: 1000000.00 (Postive decimal, 9 digits only)");
        SubjectCostTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SubjectCostTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SubjectCostTextFieldFocusLost(evt);
            }
        });

        SubjectIDTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectIDTextField.setForeground(new java.awt.Color(102, 102, 102));
        SubjectIDTextField.setText("Example: TSN-1101 (Within 8 characters)");
        SubjectIDTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SubjectIDTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SubjectIDTextFieldFocusLost(evt);
            }
        });

        AddSubjectButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddSubjectButton.setText("Submit");
        AddSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjectButtonActionPerformed(evt);
            }
        });

        EditCourseTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EditCourseTitleLabel.setText("Edit Subject");

        EditSubjectNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditSubjectNameLabel.setText("Subject Name");

        EditSubjectCreditHourLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditSubjectCreditHourLabel.setText("Credit Hour");

        EditSubjectCreditHourTextField.setEditable(false);
        EditSubjectCreditHourTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        EditSubjectButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EditSubjectButton.setText("Submit");
        EditSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSubjectButtonActionPerformed(evt);
            }
        });

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Back_Arrow_64px_3.png"))); // NOI18N
        BackButton.setText("jLabel1");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackButtonMousePressed(evt);
            }
        });

        EditSubjectLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditSubjectLabel.setText("Click an item in the table to edit a specific item");

        DeleteSubjectButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeleteSubjectButton.setText("Delete Subject");
        DeleteSubjectButton.setEnabled(false);
        DeleteSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSubjectButtonActionPerformed(evt);
            }
        });

        SubjectNameTextArea.setColumns(20);
        SubjectNameTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectNameTextArea.setForeground(new java.awt.Color(102, 102, 102));
        SubjectNameTextArea.setLineWrap(true);
        SubjectNameTextArea.setRows(2);
        SubjectNameTextArea.setText("Example: ADVANCED COMPUTER NETWORKING or SOFTWARE DESIGN (Within 50 characters)");
        SubjectNameTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SubjectNameTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SubjectNameTextAreaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(SubjectNameTextArea);

        EditSubjectNameTextArea.setEditable(false);
        EditSubjectNameTextArea.setColumns(20);
        EditSubjectNameTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditSubjectNameTextArea.setLineWrap(true);
        EditSubjectNameTextArea.setRows(2);
        EditSubjectNameTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditSubjectNameTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditSubjectNameTextAreaFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(EditSubjectNameTextArea);

        SubjectNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectNameLabel.setText("Subject Name");

        SubjectDescriptionTextArea.setColumns(20);
        SubjectDescriptionTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectDescriptionTextArea.setForeground(new java.awt.Color(102, 102, 102));
        SubjectDescriptionTextArea.setLineWrap(true);
        SubjectDescriptionTextArea.setRows(2);
        SubjectDescriptionTextArea.setText("Example: This subject focuses on advanced micro engineering in full detail. (Within 100 characters)");
        SubjectDescriptionTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SubjectDescriptionTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SubjectDescriptionTextAreaFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(SubjectDescriptionTextArea);

        SubjectCostLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectCostLabel.setText("Cost                  RM");

        SubjectCreditHourTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectCreditHourTextField.setForeground(new java.awt.Color(102, 102, 102));
        SubjectCreditHourTextField.setText("Example: 4 (Positive Integers only)");
        SubjectCreditHourTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SubjectCreditHourTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SubjectCreditHourTextFieldFocusLost(evt);
            }
        });

        LecturerComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        CourseComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CourseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBoxActionPerformed(evt);
            }
        });

        SubjectNameLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubjectNameLabel2.setText("Subject Description");

        EditSubjectDescriptionTextArea.setEditable(false);
        EditSubjectDescriptionTextArea.setColumns(20);
        EditSubjectDescriptionTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditSubjectDescriptionTextArea.setLineWrap(true);
        EditSubjectDescriptionTextArea.setRows(2);
        EditSubjectDescriptionTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditSubjectDescriptionTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditSubjectDescriptionTextAreaFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(EditSubjectDescriptionTextArea);

        EditSubjectCostLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditSubjectCostLabel.setText("Cost                  RM");

        EditSubjectCostTextField.setEditable(false);
        EditSubjectCostTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditSubjectCostTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditSubjectCostTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditSubjectCostTextFieldFocusLost(evt);
            }
        });
        EditSubjectCostTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSubjectCostTextFieldActionPerformed(evt);
            }
        });

        EditCourseComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EditCourseComboBox.setEnabled(false);

        EditLecturerComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EditLecturerComboBox.setEnabled(false);

        javax.swing.GroupLayout CourseManagementPanelLayout = new javax.swing.GroupLayout(CourseManagementPanel);
        CourseManagementPanel.setLayout(CourseManagementPanelLayout);
        CourseManagementPanelLayout.setHorizontalGroup(
            CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CourseManagementLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteSubjectButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CourseManagementPanelLayout.createSequentialGroup()
                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SubjectIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SubjectNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                        .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(LecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SubjectIDTextField)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)))
                            .addComponent(AddSubjectButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddSubjectLabel)
                            .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                .addComponent(SubjectCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubjectCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                .addComponent(SubjectDescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3))
                            .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                .addComponent(SubjectCreditHourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubjectCreditHourTextField)))
                        .addGap(18, 18, 18)
                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EditSubjectLabel)
                                    .addComponent(EditSubjectNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SubjectNameLabel2)
                                            .addComponent(EditSubjectCreditHourLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2)
                                            .addComponent(jScrollPane4)
                                            .addComponent(EditSubjectCreditHourTextField)))
                                    .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                        .addComponent(EditSubjectCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EditSubjectCostTextField))
                                    .addComponent(EditSubjectButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(85, 85, 85))
                            .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                                .addComponent(EditCourseTitleLabel)
                                .addGap(18, 18, 18)
                                .addComponent(EditCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EditLecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(SubjectTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        CourseManagementPanelLayout.setVerticalGroup(
            CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CourseManagementLabel)
                    .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackButton)
                            .addComponent(DeleteSubjectButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubjectTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddSubjectLabel)
                    .addComponent(LecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditCourseTitleLabel)
                    .addComponent(EditLecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SubjectIDLabel)
                        .addComponent(SubjectIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EditSubjectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SubjectNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(EditSubjectNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubjectNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditSubjectCreditHourLabel)
                            .addComponent(EditSubjectCreditHourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditSubjectButton))
                    .addGroup(CourseManagementPanelLayout.createSequentialGroup()
                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubjectDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubjectCostLabel)
                            .addComponent(SubjectCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditSubjectCostLabel)
                            .addComponent(EditSubjectCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CourseManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubjectCreditHourLabel)
                            .addComponent(SubjectCreditHourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddSubjectButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CourseManagementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CourseManagementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        // TODO add your handling code here:
        ExceptionDialog.dispose();
    }//GEN-LAST:event_OKButtonActionPerformed

    private void ProcessCompleteOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessCompleteOKButtonActionPerformed
        // TODO add your handling code here:
        ProcessCompleteDialog.dispose();
    }//GEN-LAST:event_ProcessCompleteOKButtonActionPerformed

    private void EditSubjectCostTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSubjectCostTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditSubjectCostTextFieldActionPerformed

    private void EditSubjectCostTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditSubjectCostTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_EditSubjectCostTextFieldFocusLost

    private void EditSubjectCostTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditSubjectCostTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_EditSubjectCostTextFieldFocusGained

    private void EditSubjectDescriptionTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditSubjectDescriptionTextAreaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_EditSubjectDescriptionTextAreaFocusLost

    private void EditSubjectDescriptionTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditSubjectDescriptionTextAreaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_EditSubjectDescriptionTextAreaFocusGained

    private void SubjectCreditHourTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectCreditHourTextFieldFocusLost
        // TODO add your handling code here:
        if(SubjectCreditHourTextField.getText().equals(""))
        {
            SubjectCreditHourTextField.setForeground(new java.awt.Color(102,102,102));
            SubjectCreditHourTextField.setText("Example: 4 (Positive Integers only)");
        }
    }//GEN-LAST:event_SubjectCreditHourTextFieldFocusLost

    private void SubjectCreditHourTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectCreditHourTextFieldFocusGained
        // TODO add your handling code here:
        if (SubjectCreditHourTextField.getText().equals("Example: 4 (Positive Integers only)"))
        {
            SubjectCreditHourTextField.setForeground(new java.awt.Color(0,0,0));
            SubjectCreditHourTextField.setText("");
        }
    }//GEN-LAST:event_SubjectCreditHourTextFieldFocusGained

    private void SubjectDescriptionTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectDescriptionTextAreaFocusLost
        // TODO add your handling code here:
        if(SubjectDescriptionTextArea.getText().equals(""))
        {
            SubjectDescriptionTextArea.setForeground(new java.awt.Color(102,102,102));
            SubjectDescriptionTextArea.setText("Example: This subject focuses on advanced micro engineering in full detail. (Within 100 characters)");
        }
    }//GEN-LAST:event_SubjectDescriptionTextAreaFocusLost

    private void SubjectDescriptionTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectDescriptionTextAreaFocusGained
        // TODO add your handling code here:
        if (SubjectDescriptionTextArea.getText().equals("Example: This subject focuses on advanced micro engineering in full detail. (Within 100 characters)"))
        {
            SubjectDescriptionTextArea.setForeground(new java.awt.Color(0,0,0));
            SubjectDescriptionTextArea.setText("");
        }
    }//GEN-LAST:event_SubjectDescriptionTextAreaFocusGained

    private void EditSubjectNameTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditSubjectNameTextAreaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_EditSubjectNameTextAreaFocusLost

    private void EditSubjectNameTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditSubjectNameTextAreaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_EditSubjectNameTextAreaFocusGained

    private void SubjectNameTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectNameTextAreaFocusLost
        // TODO add your handling code here:
        if(SubjectNameTextArea.getText().equals(""))
        {
            SubjectNameTextArea.setForeground(new java.awt.Color(102,102,102));
            SubjectNameTextArea.setText("Example: ADVANCED COMPUTER NETWORKING or SOFTWARE DESIGN (Within 50 characters)");
        }
    }//GEN-LAST:event_SubjectNameTextAreaFocusLost

    private void SubjectNameTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectNameTextAreaFocusGained
        // TODO add your handling code here:
        if (SubjectNameTextArea.getText().equals("Example: ADVANCED COMPUTER NETWORKING or SOFTWARE DESIGN (Within 50 characters)"))
        {
            SubjectNameTextArea.setForeground(new java.awt.Color(0,0,0));
            SubjectNameTextArea.setText("");
        }
    }//GEN-LAST:event_SubjectNameTextAreaFocusGained

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        // TODO add your handling code here:
        if (Jets.UserType.equals("STUDENT"))
        new StudentMainMenu().setVisible(true);
        if (Jets.UserType.equals("ADMIN"))
        new AdminMainMenu().setVisible(true);
        if (Jets.UserType.equals("LECTURER"))
        new LecturerMainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonMousePressed

    private void EditSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSubjectButtonActionPerformed
        // TODO add your handling code here:
        String errors = "Errors detected: ";
        Boolean errordetected = new Boolean(false);
        if(EditSubjectNameTextArea.getText().length() > 50 || EditSubjectNameTextArea.getText().length() < 1)
        {
            errors = errors + "\n" + "Subject Name should only have 50 characters or less!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        
        if(EditSubjectDescriptionTextArea.getText().length() > 100 || SubjectDescriptionTextArea.getText().length() < 1)
        {
            errors = errors + "\n" + "Subject Description should only have 100 characters or less!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        try
        {
            if (Integer.parseInt(EditSubjectCreditHourTextField.getText()) < 0)
            {
                errors = errors + "\n" + "Total Credit Hour should be more than 0!";
                ExceptionTextArea.setText(errors);
                ExceptionDialog.setVisible(true);
                errordetected = true;
            }
        }
        catch (NumberFormatException e)
        {
            errors = errors + "\n" + "Total Credit Hour should be integer only!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        try
        {
            if(Double.parseDouble(EditSubjectCostTextField.getText()) < 0 || Double.parseDouble(EditSubjectCostTextField.getText()) > 9999999.99)
            {
                errors = errors + "\n" + "Cost should be more than 0 or less than 9999999.99!";
                ExceptionTextArea.setText(errors);
                ExceptionDialog.setVisible(true);
                errordetected = true;
            }
            else if (!EditSubjectCostTextField.getText().matches("\\d*\\.\\d\\d"))
            {
                errors = errors + "\n" + "Cost must have 2 decimal places!";
                ExceptionTextArea.setText(errors);
                ExceptionDialog.setVisible(true);
                errordetected = true;
            }
        }
        catch (NumberFormatException e)
        {
            errors = errors + "\n" + "Cost should be decimal or integer only!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        if(EditLecturerComboBox.getSelectedItem().toString().equals("-"))
        {
            errors = errors + "\n" + "You must select a lecturer!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        if(EditCourseComboBox.getSelectedItem().toString().equals("-"))
        {
            errors = errors + "\n" + "You must select a course!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        
        if(errordetected == false)
        {
            String url = "jdbc:db2:PMS";  //database name
            String NameRemoveNewLines = EditSubjectNameTextArea.getText();
            NameRemoveNewLines = NameRemoveNewLines.replace("\n", " ");
            String DescriptionRemoveNewLines = EditSubjectDescriptionTextArea.getText();
            DescriptionRemoveNewLines = DescriptionRemoveNewLines.replace("\n", " ");
            Connection con;
            try
            {
                Class.forName("com.ibm.db2.jcc.DB2Driver");
                con = DriverManager.getConnection(url);
                Statement sql;
                ResultSet rs;
                sql = con.createStatement();
                int x = SubjectTable.getSelectedRow();
                
                SubjectName.remove(x);
                SubjectCreditHour.remove(x);
                SubjectDescription.remove(x);
                SubjectCost.remove(x);
                LecturerID.remove(x);
                LecturerName.remove(x);
                CourseID.remove(x);
                CourseName.remove(x);
                
                SubjectName.add(x, EditSubjectNameTextArea.getText());
                SubjectCreditHour.add(x, EditSubjectCreditHourTextField.getText());
                SubjectDescription.add(x, EditSubjectDescriptionTextArea.getText());
                SubjectCost.add(x, EditSubjectCostTextField.getText());
                LecturerName.add(x, EditLecturerComboBox.getSelectedItem().toString());
                CourseName.add(x, EditCourseComboBox.getSelectedItem().toString());
                
                String input = "select Course_ID from course where course_name = '" + EditCourseComboBox.getSelectedItem().toString() + "'";
                rs = sql.executeQuery(input);
                while (rs.next ())
                {
                    CourseID.add(x, rs.getString(1));
                }
                input = "select Lecturer_ID from lecturer where lecturer_name = '" + EditLecturerComboBox.getSelectedItem().toString() + "'";
                rs = sql.executeQuery(input);
                while (rs.next ())
                {
                    LecturerID.add(x, rs.getString(1));
                }
                
                input = "update SUBJECT set "
                + "Subject_Name = "
                + "'" + NameRemoveNewLines + "'" + ", "
                + "Subject_Description = "
                + "'" + DescriptionRemoveNewLines + "'" + ", "
                + "Credit_Hour = "
                + EditSubjectCreditHourTextField.getText() + ", "
                + "Course_ID = "
                + "'" + CourseID.get(x) + "'" + ", "
                + "Lecturer_ID = "
                + "'" + LecturerID.get(x) + "'"
                + " where Subject_ID = " + "'" + SubjectID.get(x) + "'";
                //System.out.println(input);
                sql.executeUpdate(input);
                
                Subjectmodel.removeRow(x);
                Subjectmodel.insertRow(x, new Object[]{SubjectID.get(x), NameRemoveNewLines, DescriptionRemoveNewLines, SubjectCreditHour.get(x), 
                SubjectCost.get(x), CourseID.get(x), LecturerID.get(x)});
                Subjectmodel.fireTableDataChanged();
            
                EditSubjectLabel.setText("Click an item in the table to edit a specific item");
                EditSubjectNameTextArea.setEditable(false);
                EditSubjectNameTextArea.setText("");
                EditSubjectCreditHourTextField.setEditable(false);
                EditSubjectCreditHourTextField.setText("");
                EditSubjectDescriptionTextArea.setEditable(false);
                EditSubjectDescriptionTextArea.setText("");
                EditSubjectCostTextField.setEditable(false);
                EditSubjectCostTextField.setText("");
                EditCourseComboBox.setEnabled(false);
                EditCourseComboBox.setSelectedItem("-");
                EditLecturerComboBox.setEnabled(false);
                EditLecturerComboBox.setSelectedItem("-");
                DeleteSubjectButton.setEnabled(false);
                
                CourseComboBox.setSelectedItem("-");
                LecturerComboBox.setSelectedItem("-");
                SubjectIDTextField.setForeground(new java.awt.Color(102,102,102));
                SubjectNameTextArea.setForeground(new java.awt.Color(102,102,102));
                SubjectCostTextField.setForeground(new java.awt.Color(102,102,102));
                SubjectDescriptionTextArea.setForeground(new java.awt.Color(102,102,102));
                SubjectCreditHourTextField.setForeground(new java.awt.Color(102,102,102));

                SubjectIDTextField.setText("Example: TSN-1101 (Within 8 characters)");
                SubjectNameTextArea.setText("Example: ADVANCED COMPUTER NETWORKING or SOFTWARE DESIGN (Within 50 characters)");
                SubjectCreditHourTextField.setText("Example: 4 (Positive Integers only)");
                SubjectDescriptionTextArea.setText("Example: This subject focuses on advanced micro engineering in full detail. (Within 100 characters)");
                SubjectCostTextField.setText("Example: 1000000.00 (Postive decimal, 9 digits only)");
                ProcessCompleteLabel.setText("Subject has been added successfully!");
                ProcessCompleteDialog.setVisible(true);
                
                sql.close();
                con.close();
            }
            catch (ClassNotFoundException | SQLException e)
            {

            }
        }
    }//GEN-LAST:event_EditSubjectButtonActionPerformed

    private void AddSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjectButtonActionPerformed
        // TODO add your handling code here:
        String errors = "Errors detected: ";
        Boolean errordetected = new Boolean(false);
        if(SubjectIDTextField.getText().length() > 8 || SubjectIDTextField.getText().length() < 1)
        {
            errors = errors + "\n" + "ID should only have 8 characters or less!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        for(int i = 0; i < SubjectID.size(); i++)
        {
            if(SubjectID.get(i).equals(SubjectIDTextField.getText()))
            {
                errors = errors + "\n" + "ID already exists!";
                ExceptionTextArea.setText(errors);
                ExceptionDialog.setVisible(true);
                errordetected = true;
            }
        }
        if(SubjectDescriptionTextArea.getText().length() > 100 || SubjectDescriptionTextArea.getText().length() < 1)
        {
            errors = errors + "\n" + "Subject Description should only have 100 characters or less!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        if(SubjectNameTextArea.getText().length() > 50 || SubjectNameTextArea.getText().length() < 1)
        {
            errors = errors + "\n" + "Subject Name should only have 50 characters or less!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        if(SubjectDescriptionTextArea.getText().length() > 100 || SubjectDescriptionTextArea.getText().length() < 1
        || SubjectDescriptionTextArea.getText().equals("Example: This subject focuses on advanced micro engineering in full detail. (Within 100 characters)"))
        {
            errors = errors + "\n" + "Subject Description should only have 100 characters or less!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        
        try
        {
            if (Integer.parseInt(SubjectCreditHourTextField.getText()) < 0)
            {
                errors = errors + "\n" + "Credit Hour should be more than 0!";
                ExceptionTextArea.setText(errors);
                ExceptionDialog.setVisible(true);
                errordetected = true;
            }
        }
        catch (NumberFormatException e)
        {
            errors = errors + "\n" + "Credit Hour should be integer only!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        
        try
        {
            if(Double.parseDouble(SubjectCostTextField.getText()) < 0 || Double.parseDouble(SubjectCostTextField.getText()) > 9999999.99)
            {
                errors = errors + "\n" + "Cost should be more than 0 or less than 9999999.99!";
                ExceptionTextArea.setText(errors);
                ExceptionDialog.setVisible(true);
                errordetected = true;
            }
            else if (!SubjectCostTextField.getText().matches("\\d*\\.\\d\\d"))
            {
                errors = errors + "\n" + "Cost must have 2 decimal places!";
                ExceptionTextArea.setText(errors);
                ExceptionDialog.setVisible(true);
                errordetected = true;
            }
        }
        catch (NumberFormatException e)
        {
            errors = errors + "\n" + "Cost should be decimal or integer only!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        if(LecturerComboBox.getSelectedItem().toString().equals("-"))
        {
            errors = errors + "\n" + "You must select a lecturer!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        if(CourseComboBox.getSelectedItem().toString().equals("-"))
        {
            errors = errors + "\n" + "You must select a course!";
            ExceptionTextArea.setText(errors);
            ExceptionDialog.setVisible(true);
            errordetected = true;
        }
        if(errordetected == false)
        {
            String NameRemoveNewLines = SubjectNameTextArea.getText();
            NameRemoveNewLines = NameRemoveNewLines.replace("\n", " ");
            String DescriptionRemoveNewLines = SubjectDescriptionTextArea.getText();
            DescriptionRemoveNewLines = DescriptionRemoveNewLines.replace("\n", " ");
            String url = "jdbc:db2:PMS";  //database name
            Connection con;
            try
            {
                Class.forName("com.ibm.db2.jcc.DB2Driver");
                con = DriverManager.getConnection(url);
                Statement sql;
                ResultSet rs;

                sql = con.createStatement();
                
                SubjectID.add(SubjectIDTextField.getText());
                SubjectName.add(NameRemoveNewLines);
                SubjectCreditHour.add(SubjectCreditHourTextField.getText());
                SubjectDescription.add(DescriptionRemoveNewLines);
                SubjectCost.add(SubjectCostTextField.getText());
                LecturerName.add(LecturerComboBox.getSelectedItem().toString());
                CourseName.add(CourseComboBox.getSelectedItem().toString());
                
                String input = "select Course_ID from course where course_name = '" + CourseComboBox.getSelectedItem().toString() + "'";
                rs = sql.executeQuery(input);
                while (rs.next ())
                {
                    CourseID.add(rs.getString(1));
                }
                
                input = "select Lecturer_ID from lecturer where lecturer_name = '" + LecturerComboBox.getSelectedItem().toString() + "'";
                rs = sql.executeQuery(input);
                while (rs.next ())
                {
                    LecturerID.add(rs.getString(1));
                }

                input = "insert into SUBJECT values ("
                + "'" + SubjectIDTextField.getText() + "'" + ", "
                + "'" + NameRemoveNewLines + "'" + ", "
                + "'" + DescriptionRemoveNewLines + "'" + ", "
                + SubjectCreditHourTextField.getText() + ", "
                + SubjectCostTextField.getText() + ", "
                + "'" + CourseID.getLast() + "'" + ", "
                + "'" + LecturerID.getLast() + "'"
                + ")";
                
                sql.executeUpdate(input);
                
                Subjectmodel.addRow(new Object[]{SubjectIDTextField.getText(),
                NameRemoveNewLines, DescriptionRemoveNewLines, 
                SubjectCreditHourTextField.getText(), SubjectCostTextField.getText(),
                CourseID.getLast(), LecturerID.getLast()});
                Subjectmodel.fireTableDataChanged();
            
                EditSubjectLabel.setText("Click an item in the table to edit a specific item");
                EditSubjectNameTextArea.setEditable(false);
                EditSubjectNameTextArea.setText("");
                EditSubjectCreditHourTextField.setEditable(false);
                EditSubjectCreditHourTextField.setText("");
                EditSubjectDescriptionTextArea.setEditable(false);
                EditSubjectDescriptionTextArea.setText("");
                EditSubjectCostTextField.setEditable(false);
                EditSubjectCostTextField.setText("");
                EditCourseComboBox.setEnabled(false);
                EditCourseComboBox.setSelectedItem("-");
                EditLecturerComboBox.setEnabled(false);
                EditLecturerComboBox.setSelectedItem("-");
                DeleteSubjectButton.setEnabled(false);
                
                CourseComboBox.setSelectedItem("-");
                LecturerComboBox.setSelectedItem("-");
                SubjectIDTextField.setForeground(new java.awt.Color(102,102,102));
                SubjectNameTextArea.setForeground(new java.awt.Color(102,102,102));
                SubjectCostTextField.setForeground(new java.awt.Color(102,102,102));
                SubjectDescriptionTextArea.setForeground(new java.awt.Color(102,102,102));
                SubjectCreditHourTextField.setForeground(new java.awt.Color(102,102,102));

                SubjectIDTextField.setText("Example: TSN-1101 (Within 8 characters)");
                SubjectNameTextArea.setText("Example: ADVANCED COMPUTER NETWORKING or SOFTWARE DESIGN (Within 50 characters)");
                SubjectCreditHourTextField.setText("Example: 4 (Positive Integers only)");
                SubjectDescriptionTextArea.setText("Example: This subject focuses on advanced micro engineering in full detail. (Within 100 characters)");
                SubjectCostTextField.setText("Example: 1000000.00 (Postive decimal, 9 digits only)");
                ProcessCompleteLabel.setText("Subject has been added successfully!");
                ProcessCompleteDialog.setVisible(true);
                sql.close();
                con.close();
            }
            catch (ClassNotFoundException | SQLException e)
            {

            }
        }
    }//GEN-LAST:event_AddSubjectButtonActionPerformed

    private void SubjectIDTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectIDTextFieldFocusLost
        // TODO add your handling code here:
        if(SubjectIDTextField.getText().equals(""))
        {
            SubjectIDTextField.setForeground(new java.awt.Color(102,102,102));
            SubjectIDTextField.setText("Example: TSN-1101 (Within 8 characters)");
        }
    }//GEN-LAST:event_SubjectIDTextFieldFocusLost

    private void SubjectIDTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectIDTextFieldFocusGained
        // TODO add your handling code here:
        if(SubjectIDTextField.getText().equals("Example: TSN-1101 (Within 8 characters)"))
        {
            SubjectIDTextField.setForeground(new java.awt.Color(0,0,0));
            SubjectIDTextField.setText("");
        }
    }//GEN-LAST:event_SubjectIDTextFieldFocusGained

    private void SubjectCostTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectCostTextFieldFocusLost
        // TODO add your handling code here:
        if(SubjectCostTextField.getText().equals(""))
        {
            SubjectCostTextField.setForeground(new java.awt.Color(102,102,102));
            SubjectCostTextField.setText("Example: 1000000.00 (Postive decimal, 9 digits only)");
        }
    }//GEN-LAST:event_SubjectCostTextFieldFocusLost

    private void SubjectCostTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectCostTextFieldFocusGained
        // TODO add your handling code here:
        if (SubjectCostTextField.getText().equals("Example: 1000000.00 (Postive decimal, 9 digits only)"))
        {
            SubjectCostTextField.setForeground(new java.awt.Color(0,0,0));
            SubjectCostTextField.setText("");
        }
    }//GEN-LAST:event_SubjectCostTextFieldFocusGained

    private void SubjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectTableMouseClicked
        // TODO add your handling code here:
        int x = SubjectTable.getSelectedRow();
        EditSubjectLabel.setText(SubjectID.get(x));
        EditSubjectNameTextArea.setEditable(true);
        EditSubjectNameTextArea.setText(SubjectName.get(x));
        EditSubjectCreditHourTextField.setEditable(true);
        EditSubjectCreditHourTextField.setText(SubjectCreditHour.get(x));
        EditSubjectDescriptionTextArea.setEditable(true);
        EditSubjectDescriptionTextArea.setText(SubjectDescription.get(x));
        EditSubjectCostTextField.setEditable(true);
        EditSubjectCostTextField.setText(SubjectCost.get(x));
        EditCourseComboBox.setEnabled(true);
        EditCourseComboBox.setSelectedItem(CourseName.get(x));
        EditLecturerComboBox.setEnabled(true);
        EditLecturerComboBox.setSelectedItem(LecturerName.get(x));
        DeleteSubjectButton.setEnabled(true);
    }//GEN-LAST:event_SubjectTableMouseClicked

    private void CourseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBoxActionPerformed

    private void DeleteSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSubjectButtonActionPerformed
        // TODO add your handling code here:
        DeleteConfirmation.setVisible(true);
    }//GEN-LAST:event_DeleteSubjectButtonActionPerformed

    private void DeleteConfirmationOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteConfirmationOKButtonActionPerformed
        // TODO add your handling code here:
        int x = SubjectTable.getSelectedRow();
        //System.out.println(x);
        String url = "jdbc:db2:PMS";  //database name
        LinkedList<String> ItemsToDelete = new LinkedList<>();
        Connection con;
        try
        {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            con = DriverManager.getConnection(url);
            Statement sql;
            ResultSet rs;
            
            sql = con.createStatement();
            String input = "select * from trimester where subject_id = '" + SubjectID.get(x) + "'";
            rs = sql.executeQuery(input);
            while (rs.next ())
            {
                ItemsToDelete.add(rs.getString(1));
            }
            
            for(int i = 0; i < ItemsToDelete.size(); i++)
            {
                input = "delete from timetable where trimester_id = '" + ItemsToDelete.get(i) + "'";
                sql.executeUpdate(input);
            }
            for(int i = 0; i < ItemsToDelete.size(); i++)
            {
                input = "delete from exam_result where trimester_id = '" + ItemsToDelete.get(i) + "'";
                sql.executeUpdate(input);
            }
            
            input = "delete from invoice_subject where subject_id = '" + SubjectID.get(x) + "'";
            sql.executeUpdate(input);
            input = "delete from trimester where subject_id = '" + SubjectID.get(x) + "'";
            sql.executeUpdate(input);
            input = "delete from subject where subject_id = '" + SubjectID.get(x) + "'";
            sql.executeUpdate(input);
            
            SubjectID.remove(x);
            SubjectName.remove(x);
            SubjectCreditHour.remove(x);
            SubjectDescription.remove(x);
            SubjectCost.remove(x);
            LecturerID.remove(x);
            LecturerName.remove(x);
            CourseID.remove(x);
            CourseName.remove(x);

            Subjectmodel.removeRow(x);
            Subjectmodel.fireTableDataChanged();

            EditSubjectLabel.setText("Click an item in the table to edit a specific item");
            EditSubjectNameTextArea.setEditable(false);
            EditSubjectNameTextArea.setText("");
            EditSubjectCreditHourTextField.setEditable(false);
            EditSubjectCreditHourTextField.setText("");
            EditSubjectDescriptionTextArea.setEditable(false);
            EditSubjectDescriptionTextArea.setText("");
            EditSubjectCostTextField.setEditable(false);
            EditSubjectCostTextField.setText("");
            EditCourseComboBox.setEnabled(false);
            EditCourseComboBox.setSelectedItem("-");
            EditLecturerComboBox.setEnabled(false);
            EditLecturerComboBox.setSelectedItem("-");

            SubjectIDTextField.setForeground(new java.awt.Color(102,102,102));
            SubjectNameTextArea.setForeground(new java.awt.Color(102,102,102));
            SubjectCostTextField.setForeground(new java.awt.Color(102,102,102));
            SubjectDescriptionTextArea.setForeground(new java.awt.Color(102,102,102));
            SubjectCreditHourTextField.setForeground(new java.awt.Color(102,102,102));

            SubjectIDTextField.setText("Example: TSN-1101 (Within 8 characters)");
            SubjectNameTextArea.setText("Example: ADVANCED COMPUTER NETWORKING or SOFTWARE DESIGN (Within 50 characters)");
            SubjectCreditHourTextField.setText("Example: 4 (Positive Integers only)");
            SubjectDescriptionTextArea.setText("Example: This subject focuses on advanced micro engineering in full detail. (Within 100 characters)");
            SubjectCostTextField.setText("Example: 1000000.00 (Postive decimal, 9 digits only)");
            ProcessCompleteLabel.setText("Subject has been added successfully!");
            ProcessCompleteDialog.setVisible(true);
            DeleteConfirmation.dispose();
            DeleteSubjectButton.setEnabled(false);
            sql.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {

        }
    }//GEN-LAST:event_DeleteConfirmationOKButtonActionPerformed

    private void DeleteConfirmationCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteConfirmationCancelButtonActionPerformed
        // TODO add your handling code here:
        DeleteConfirmation.dispose();
    }//GEN-LAST:event_DeleteConfirmationCancelButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSubjectManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSubjectManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSubjectButton;
    private javax.swing.JLabel AddSubjectLabel;
    private javax.swing.JLabel BackButton;
    private javax.swing.JComboBox<String> CourseComboBox;
    private javax.swing.JLabel CourseManagementLabel;
    private javax.swing.JPanel CourseManagementPanel;
    private javax.swing.JDialog DeleteConfirmation;
    private javax.swing.JButton DeleteConfirmationCancelButton;
    private javax.swing.JButton DeleteConfirmationOKButton;
    private javax.swing.JButton DeleteSubjectButton;
    private javax.swing.JComboBox<String> EditCourseComboBox;
    private javax.swing.JLabel EditCourseTitleLabel;
    private javax.swing.JComboBox<String> EditLecturerComboBox;
    private javax.swing.JButton EditSubjectButton;
    private javax.swing.JLabel EditSubjectCostLabel;
    private javax.swing.JTextField EditSubjectCostTextField;
    private javax.swing.JLabel EditSubjectCreditHourLabel;
    private javax.swing.JTextField EditSubjectCreditHourTextField;
    private javax.swing.JTextArea EditSubjectDescriptionTextArea;
    private javax.swing.JLabel EditSubjectLabel;
    private javax.swing.JLabel EditSubjectNameLabel;
    private javax.swing.JTextArea EditSubjectNameTextArea;
    private javax.swing.JDialog ExceptionDialog;
    private javax.swing.JPanel ExceptionDialogPanel;
    private javax.swing.JScrollPane ExceptionScrollPane;
    private javax.swing.JTextArea ExceptionTextArea;
    private javax.swing.JComboBox<String> LecturerComboBox;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel ProceedLabel;
    private javax.swing.JDialog ProcessCompleteDialog;
    private javax.swing.JLabel ProcessCompleteLabel;
    private javax.swing.JButton ProcessCompleteOKButton;
    private javax.swing.JPanel ProcessCompletePanel;
    private javax.swing.JLabel SubjectCostLabel;
    private javax.swing.JTextField SubjectCostTextField;
    private javax.swing.JLabel SubjectCreditHourLabel;
    private javax.swing.JTextField SubjectCreditHourTextField;
    private javax.swing.JLabel SubjectDescriptionLabel;
    private javax.swing.JTextArea SubjectDescriptionTextArea;
    private javax.swing.JLabel SubjectIDLabel;
    private javax.swing.JTextField SubjectIDTextField;
    private javax.swing.JLabel SubjectNameLabel;
    private javax.swing.JLabel SubjectNameLabel2;
    private javax.swing.JTextArea SubjectNameTextArea;
    private javax.swing.JTable SubjectTable;
    private javax.swing.JScrollPane SubjectTableScroll;
    private javax.swing.JLabel WarningLabel;
    private javax.swing.JLabel WarningMessageLabel;
    private javax.swing.JLabel WarningMessageLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}

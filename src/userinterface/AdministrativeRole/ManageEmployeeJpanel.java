/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author vgout
 */
public class ManageEmployeeJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJpanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private static Logger log = Logger.getLogger(ManageEmployeeJpanel.class);
    private static final String CLASS_NAME = ManageEmployeeJpanel.class.getName();
        public ManageEmployeeJpanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;               
        populateOrganizationEmpComboBox();
         populateOrganizationComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        orglbl = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpComboBox = new javax.swing.JComboBox();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage Employee");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 470, -1));

        orglbl.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        orglbl.setText("Organization:");
        add(orglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        organizationComboBox.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 270, 32));

        organizationTbl.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        organizationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationTbl.setRowHeight(25);
        organizationTbl.getTableHeader().setResizingAllowed(false);
        organizationTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(organizationTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 547, 165));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("Select Organization:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 404, 190, 30));

        organizationEmpComboBox.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        organizationEmpComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 290, 40));

        nameTextField.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 290, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("Enter Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 464, 190, 30));

        backJButton.setBackground(new java.awt.Color(153, 153, 153));
        backJButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 110, 50));

        addJButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 240, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) organizationEmpComboBox.getSelectedItem();
        String name = nameTextField.getText().trim();
        if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid input");
            return;
        }
        ArrayList<String> namecheck = new ArrayList<>();
        for(Employee o:organization.getEmployeeDirectory().getEmployeeList())
        {
            namecheck.add(o.getName().toLowerCase());
            
        }
        if(namecheck.contains(name.toLowerCase()))
        {
            JOptionPane.showMessageDialog(null,"Employee already exists");
            return;
        }
        log.debug("Enterprise admin adding following employee \t" +name+ "in following Organization \t" +organization+ "\t" +CLASS_NAME);
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        nameTextField.setText("");
    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
         Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void organizationEmpComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationEmpComboBoxActionPerformed
 public void populateOrganizationComboBox(){
        organizationComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationComboBox.addItem(organization);
        }
    }
 public void populateOrganizationEmpComboBox(){
        organizationEmpComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpComboBox.addItem(organization);
        }
    }
 private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationTbl.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JComboBox organizationEmpComboBox;
    private javax.swing.JTable organizationTbl;
    private javax.swing.JLabel orglbl;
    // End of variables declaration//GEN-END:variables
}

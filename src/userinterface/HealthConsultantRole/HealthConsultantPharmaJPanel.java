/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthConsultantRole;

import Business.EcoSystem;
import Business.Enterprise.ConsultationEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HealthConsultationOrganization;
import Business.Organization.Organization;
import Business.Organization.WellnessPlatformOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Business.Organization.PharmaOrganization;
import javax.swing.JPanel;
import Business.DB4OUtil.DB4OUtil;

/**
 *
 * @author ram
 */
public class HealthConsultantPharmaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthConsultantPharmaJPanel
     */
    JPanel userProcessContainer;
    private WellnessPlatformOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private  WellnessPlatformOrganization wellnessPlatformOrganization;
    private Network network;
    private EcoSystem system;
    private DB4OUtil db;
    
    private Organization hcOrganisation;
 

   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

    public HealthConsultantPharmaJPanel(JPanel userProcessContainer, UserAccount userAccount, WellnessPlatformOrganization wellnessPlatformOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.wellnessPlatformOrganization= wellnessPlatformOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        medicineJTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        quantityJTxt = new javax.swing.JTextField();
        reqPharma = new javax.swing.JButton();

        jLabel1.setText("Medicine Name:");

        medicineJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineJTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity:");

        quantityJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityJTxtActionPerformed(evt);
            }
        });

        reqPharma.setText("Place order to pharma");
        reqPharma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqPharmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(medicineJTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(quantityJTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(reqPharma)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(medicineJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantityJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(reqPharma)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reqPharmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqPharmaActionPerformed
        // TODO add your handling code here:
        PharmacyWorkRequest phar= new PharmacyWorkRequest();
         if(medicineJTxt.getText().trim().equals("") && quantityJTxt.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "please enter the prescription");
            return;
        }
        
        phar.setMedicationName(medicineJTxt.getText().trim());
        phar.setQuantity(Integer.parseInt(quantityJTxt.getText().trim())); // added username and HeartBeat 
        phar.setSender(userAccount);
        phar.setStatus("Requested");
        
        //get Doctor Org 
        Organization org = null;
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof ConsultationEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof PharmaOrganization) {  // change to pharma organisation .. 
                            org = organization;
                            break;
                        }
                    }
                }

            }
        }
        
        System.out.println("Organisation is "+org.getName()); // null pointer exception

        if (org!= null) {
            org.getWorkQueue().getWorkRequestList().add(phar);
            userAccount.getWorkQueue().getWorkRequestList().add(phar); // add workqueue to org 

            JOptionPane.showMessageDialog(null, "your prescription has beenr requested to pharma", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        System.out.println(org.getWorkQueue().getWorkRequestList().size());
        db.storeSystem(system);
        
        
        
        
    }//GEN-LAST:event_reqPharmaActionPerformed

    private void medicineJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineJTxtActionPerformed

    private void quantityJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityJTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField medicineJTxt;
    private javax.swing.JTextField quantityJTxt;
    private javax.swing.JButton reqPharma;
    // End of variables declaration//GEN-END:variables
}

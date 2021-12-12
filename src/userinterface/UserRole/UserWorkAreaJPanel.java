/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.WellnessPlatformOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.apache.log4j.Logger;


/**
 *
 * @author vgout
 */
public class UserWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WellnessPlatformOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private  WellnessPlatformOrganization wellnessPlatformOrganization;
    private Network network;
    private EcoSystem system;
    private static Logger log = Logger.getLogger(UserWorkAreaJPanel.class);
    private static final String CLASS_NAME = UserWorkAreaJPanel.class.getName();

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public UserWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, WellnessPlatformOrganization organization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.wellnessPlatformOrganization = wellnessPlatformOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        network();
    }

    public void network() {
        network.getName();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        healthConsultationBtn = new javax.swing.JButton();
        wellnessDataBtn = new javax.swing.JButton();
        doctorLbl = new javax.swing.JLabel();
        nutritionConsultationBtn = new javax.swing.JButton();
        fitnessConsultationBtn = new javax.swing.JButton();
        healthConsultationBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setPreferredSize(new java.awt.Dimension(2000, 1200));

        healthConsultationBtn.setBackground(new java.awt.Color(255, 255, 255));
        healthConsultationBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        healthConsultationBtn.setForeground(new java.awt.Color(0, 0, 102));
        healthConsultationBtn.setText("Order Food");
        healthConsultationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthConsultationBtnActionPerformed(evt);
            }
        });

        wellnessDataBtn.setBackground(new java.awt.Color(255, 255, 255));
        wellnessDataBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        wellnessDataBtn.setForeground(new java.awt.Color(0, 0, 102));
        wellnessDataBtn.setText("Wellness Data Record");
        wellnessDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wellnessDataBtnActionPerformed(evt);
            }
        });

        doctorLbl.setBackground(new java.awt.Color(0, 204, 204));
        doctorLbl.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        doctorLbl.setForeground(new java.awt.Color(0, 0, 102));
        doctorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorLbl.setText("Welcome User!");

        nutritionConsultationBtn.setBackground(new java.awt.Color(255, 255, 255));
        nutritionConsultationBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        nutritionConsultationBtn.setForeground(new java.awt.Color(0, 0, 102));
        nutritionConsultationBtn.setText("Nutrition Consultation");
        nutritionConsultationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutritionConsultationBtnActionPerformed(evt);
            }
        });

        fitnessConsultationBtn.setBackground(new java.awt.Color(255, 255, 255));
        fitnessConsultationBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        fitnessConsultationBtn.setForeground(new java.awt.Color(0, 0, 102));
        fitnessConsultationBtn.setText("Fitness Consultation");
        fitnessConsultationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fitnessConsultationBtnActionPerformed(evt);
            }
        });

        healthConsultationBtn1.setBackground(new java.awt.Color(255, 255, 255));
        healthConsultationBtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        healthConsultationBtn1.setForeground(new java.awt.Color(0, 0, 102));
        healthConsultationBtn1.setText("Health Consultation");
        healthConsultationBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthConsultationBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthConsultationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthConsultationBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutritionConsultationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fitnessConsultationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wellnessDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(doctorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(healthConsultationBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nutritionConsultationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fitnessConsultationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wellnessDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(healthConsultationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void healthConsultationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthConsultationBtnActionPerformed
        // TODO add your handling code here:

         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
          log.debug("inside doctor role");
          userProcessContainer.add("UserHealthRequestJPanel", new userinterface.UserRole.UserHealthRequestJPanel(userProcessContainer,userAccount,enterprise,organization,system,network));
       //  userProcessContainer.add("PrescriptionJPanel", new userinterface.DoctorRole.PrescriptionJPanel(userProcessContainer, userAccount, enterprise));
         layout.next(userProcessContainer);

    }//GEN-LAST:event_healthConsultationBtnActionPerformed

    private void wellnessDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wellnessDataBtnActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        log.debug("inside the health consultation request");
        //userProcessContainer.add("TestJPanel", new userinterface.DoctorRole.DoctorRequestJpanel(userProcessContainer, userAccount, organization, enterprise, system, network));

        layout.next(userProcessContainer);
    }//GEN-LAST:event_wellnessDataBtnActionPerformed

    private void nutritionConsultationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutritionConsultationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutritionConsultationBtnActionPerformed

    private void fitnessConsultationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fitnessConsultationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fitnessConsultationBtnActionPerformed

    private void healthConsultationBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthConsultationBtn1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
          log.debug("inside Restaurant role");
          //userProcessContainer.add("OrderFood", new userinterface.UserRole.OrderFoodRequestJPanel(userProcessContainer,userAccount,enterprise,organization,system,network));
       //  userProcessContainer.add("PrescriptionJPanel", new userinterface.DoctorRole.PrescriptionJPanel(userProcessContainer, userAccount, enterprise));
         layout.next(userProcessContainer);
    }//GEN-LAST:event_healthConsultationBtn1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doctorLbl;
    private javax.swing.JButton fitnessConsultationBtn;
    private javax.swing.JButton healthConsultationBtn;
    private javax.swing.JButton healthConsultationBtn1;
    private javax.swing.JButton nutritionConsultationBtn;
    private javax.swing.JButton wellnessDataBtn;
    // End of variables declaration//GEN-END:variables
}

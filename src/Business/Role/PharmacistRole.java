/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;

import Business.Organization.Organization;
import Business.Organization.PharmaOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

import userinterface.Pharmacist.PharmacistJPanel;

/**
 *
 * @author shreyasprasad
 */
public class PharmacistRole extends  Role{
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        
        
        return new PharmacistJPanel(userProcessContainer,account,(PharmaOrganization)organization,enterprise,business,network);
    }
    
    
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.RestaurantOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RestaurantManagerRole.RestaurantMangerJPanel;

/**
 *
 * @author shreyasprasad
 */
public class RestaurantManagerRole extends  Role{
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        
        
        return new RestaurantMangerJPanel(userProcessContainer,account,(RestaurantOrganization)organization,enterprise,business,network);
    }
    
    
}



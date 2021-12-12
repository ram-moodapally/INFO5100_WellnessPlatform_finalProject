/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;


import Business.Role.PharmacistRole;
import Business.Role.Role;
import Business.Role.SupplementManagerRole;
import java.util.ArrayList;

/**
 *
 * @author shreyasprasad
 */
public class SupplementOrganization extends Organization {
     public SupplementOrganization() {
         super(Organization.Type.Supplement.getValue());
     }
     
         @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplementManagerRole ());
        return roles;
    }
     
     
     }
    
    



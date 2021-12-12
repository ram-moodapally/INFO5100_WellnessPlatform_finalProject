/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HealthConsultantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyasprasad
 */
public class HealthConsultationOrganization extends Organization {
     public HealthConsultationOrganization() {
         super(Organization.Type.HealthConsultation.getValue());
     }
     
     
     
         @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthConsultantRole());
        return roles;
    }
     
     
     }
    
    



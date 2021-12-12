/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.FitnessConsultantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyasprasad
 */
public class FitnessConsultationOrganization extends Organization {
     public FitnessConsultationOrganization() {
         super(Organization.Type.FitnessConsultation.getValue());
     }
     
     
     
         @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FitnessConsultantRole());
        return roles;
    }
     
     
     }
    
    



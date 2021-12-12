/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HealthConsultantRole;
import Business.Role.ManufacturerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyasprasad
 */
public class ManufacturingOrganization extends Organization {
     public ManufacturingOrganization() {
         super(Organization.Type.Manufacturing.getValue());
     } 
         @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManufacturerRole ());
        return roles;
    }
     
     
     }
    
    



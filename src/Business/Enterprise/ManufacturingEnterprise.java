/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyasprasad
 */
public class ManufacturingEnterprise extends Enterprise{
    public ManufacturingEnterprise(String name){
    super(name,EnterpriseType.Manufacturing);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}



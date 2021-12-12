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
public class EcommerceEnterprise extends Enterprise{
    public EcommerceEnterprise(String name){
    super(name,EnterpriseType.Ecommerce);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}



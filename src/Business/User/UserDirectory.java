/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.*;


/**
 *
 * @author ram
 */
public class UserDirectory {
    
    private ArrayList <User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
}

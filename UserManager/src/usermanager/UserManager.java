/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanager;

/**
 *
 * @author Formation
 */
public class UserManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ConnectionView connection = new ConnectionView();
        
        connection.setLocationRelativeTo(null);
        
        connection.setVisible(true);
    }
    
}

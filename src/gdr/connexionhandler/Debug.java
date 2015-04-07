/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdr.connexionhandler;

import javax.swing.JOptionPane;

/**
 *
 * @author Grégory
 */
public class Debug {
    public Debug(){
        
    }
    
    public void showErrorMessage(int messageID,boolean displayMessage){
        System.out.print("ERROR_");
        switch(messageID){
            //1 BAD LOGIN
            case 1: 
                System.out.println("1 - BAD LOGIN");
                if(displayMessage){
                    JOptionPane.showMessageDialog(null, "Bad login, unknown username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            //0 UNEXPECTED
            default: 
                System.out.println("0 - UNEXPECTED ERROR");
                JOptionPane.showMessageDialog(null, "Unexpected error", "ERROR CODE 0", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    
    public void showInformationMessage(int messageID,boolean displayMessage){
        System.out.print("DEBUG INFORMATION_");
        switch(messageID){
            //1 ACCESS GRANTED
            case 1: 
                System.out.println("1 - ACCESS GRANTED");
                if(displayMessage){
                    JOptionPane.showMessageDialog(null, "Access Granted !", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
        }
    }
}

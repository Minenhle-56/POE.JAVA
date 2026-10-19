/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart2reg;


/**
 *
 * @author user
 */
public class Poepart2reg {

    public static void main(String[] args) {
        
        //instantiating Login
        Login login = new Login("userName");
        login.welcome();
        login.Option();
        
        //instantiating Message
        Message message = new Message(0,"RECIPIENT","MESSAGE");
        message.checkMessageID();
        message.checkRecipientCell();
        message.createMessageHash();
        message.createMessageHash();
        message.checkMessageLength();
        message.SentMessage(1);
        message.printMessages();
        }
    
  
}    


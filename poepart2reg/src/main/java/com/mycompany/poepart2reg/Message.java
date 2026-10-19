/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart2reg;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Message {
     //attributes
    private String messageID="";
    private int messageNum;
    private String recipient="";
    private String message="";
    private String messageHash;
    private static int totalMessages =0;
    private static ArrayList<Message> sentMessages = new ArrayList<>();
    
    
    //constructor 
    Message(int messageNum, String recipient,String message){
        this.messageNum = messageNum;
        this.recipient = recipient;
        this.message = message;
        this.messageID = generateMessageID();
        
    }
    static String generateMessageID(){
       Random rand = new Random();
        String id = "";
        for(int i = 0; i < 10; i++){
            id += rand.nextInt(10);
        }
        return id;
    }
    public boolean checkMessageID(){
        return messageID.length() <=10;
    }
    public String checkRecipientCell(){
        if( recipient.length() <= 10 && recipient.startsWith("+")){
            return "cellphone number successful captured";
        }
        else{
            return "cellphone number is incorrect";
        }
    }
    public String createMessageHash(){
        String[] words = message.trim().split("\\s+");
        String first = words[0].toUpperCase();
        String last = words[words.length - 1].toUpperCase();
        return messageID.substring(0, 2) + ":" + first + last;
    }
    public String checkMessageLength(){
        if(message.length() > 250){
            return "Please enter a message of less than 250 characters.";
        }
        return "Message sent";
    }
    public String SentMessage(int Choice){
        if (Choice ==1){
            totalMessages++;
            sentMessages.add(this);
            return "message successfully sent";
        }
        else if(Choice ==2){
            return "press 0 to delete message";
        }
        else if (Choice ==3){
            return "message successfully stored";
        }
        return "invalid option";
    }
    
    public String printMessages(){
        if(sentMessages.isEmpty()){
            return "No messages sent yet";
        }
        String result="";
       for(Message m : sentMessages){
           result += "Message ID: " + m.messageID + "\n" + "MessageHash: " + m.messageHash + "\n" + "recipient" + m.recipient + "\n" + "Message" + m.message + "\n\n";
       }
       return result;
   }
    public static int returnTotalMessages(){
        return totalMessages;
    }
}
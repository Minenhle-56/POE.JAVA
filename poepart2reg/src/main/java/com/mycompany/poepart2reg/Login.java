/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart2reg;

/**
 *
 * @author user
 */
public class Login {
    //attributes
    String userName;
    int Option;
    
    //constructor
    Login(String userName){
        this.userName = userName;
    }
    void welcome(){
        System.out.print(this.userName + "WELCOME TO QUICK CHAT");
    }
    void Option(){
        switch (Option){
              case 1->
               System.out.print("Send messages");
           case 2->
               System.out.print("Comong soon");
           case 3->
               System.out.print("Quit");

        }
    }
    
}

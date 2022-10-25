/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_2;

import java.util.HashMap;

/**
 *
 * @author jagru
 */
public class Assignment_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         HashMap <String, login> users = new HashMap <String, login>();
        
        login albert = new login("Albert","Pinto","Doctor");
        users.put(albert.getUsername(), albert);
        login jagruti = new login("Jagruti","Agrawal","System Admin");
        users.put(jagruti.getUsername(), jagruti);
        login krishnna = new login("Krishnna","Sarrdah","Community Admin");
        users.put(krishnna.getUsername(), krishnna);
        login sarvesh = new login("Sarvesh","Malpani","Patient");
        users.put(sarvesh.getUsername(), sarvesh);
        System.out.print(users.size());
    }
    
}

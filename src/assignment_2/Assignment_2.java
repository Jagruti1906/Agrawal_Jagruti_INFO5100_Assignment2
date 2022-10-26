/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_2;

import java.util.HashMap;
import views.login;

/**
 *
 * @author jagru
 */
public class Assignment_2 {
    static public HashMap <String, loginClass> users = new HashMap <String, loginClass>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        login loginPage = new login();
//        loginPage.show();
//        loginClass albert = new loginClass("Albert","Pinto","Doctor");
//        users.put(albert.getUsername(), albert);
//        loginClass jagruti = new loginClass("Jagruti","Agrawal","System Admin");
//        users.put(jagruti.getUsername(), jagruti);
//        loginClass krishnna = new loginClass("Krishnna","Sarrdah","Community Admin");
//        users.put(krishnna.getUsername(), krishnna);
//        loginClass sarvesh = new loginClass("Sarvesh","Malpani","Patient");
//        users.put(sarvesh.getUsername(), sarvesh);
          PeopleClass com = new PeopleClass("Jagruti",22,"Female","609","Jagruti","Jvue",02120,"Boston");
          System.out.println(com.getGender());
    }
    
}

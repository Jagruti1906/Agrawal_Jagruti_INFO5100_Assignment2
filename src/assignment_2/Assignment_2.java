/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import views.login;

/**
 *
 * @author jagru
 */
public class Assignment_2 {
    static public HashMap <String, loginClass> users = new HashMap <String, loginClass>();
    static public HashMap <String, DoctorClass> doctors = new HashMap <String, DoctorClass>();
    static public HashMap <String, PatientClass> patients = new HashMap <String, PatientClass>();
    static public HashMap <String, CommunityAdmin> communityAdmins = new HashMap <String, CommunityAdmin>();
    static public HashMap <String, CommunityClass> community = new HashMap <String, CommunityClass>();
    static public HashMap <String, HospitalClass> hospitals = new HashMap <String, HospitalClass>();
    static public HashMap <String, HouseClass> houses = new HashMap <String, HouseClass>();
    static public ArrayList<String> cities = new ArrayList<String>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login loginPage = new login();
        loginPage.show();
        loginClass albert = new loginClass("Albert","Pinto","Doctor");
        users.put(albert.getUsername(), albert);
        loginClass jagruti = new loginClass("Jagruti","Agrawal","System Admin");
        users.put(jagruti.getUsername(), jagruti);
        loginClass krishnna = new loginClass("Krishnna","Sarrdah","Community Admin");
        users.put(krishnna.getUsername(), krishnna);
        loginClass sarvesh = new loginClass("Sarvesh","Malpani","Patient");
        users.put(sarvesh.getUsername(), sarvesh);
        cities.add("Boston");
        CommunityClass com = new CommunityClass("Jvue", 02120, "Boston");
        community.put(com.getCommunityName(), com);
        HospitalClass hos = new HospitalClass("Ruby", "Jvue", 02120, "Boston");
        hospitals.put(hos.getHospitalName(), hos);
//        CommunityAdmin com = new CommunityAdmin("Jagruti","Jagruti","Jvue",02120,"Boston");
//        communityAdmins.put(com.getUsername(), com);
//        System.out.println(com.getCity());
//        Iterator<Map.Entry<String, CommunityAdmin>> it = communityAdmins.entrySet().iterator();
//        // iterating every set of entry in the HashMap. 
//        while (it.hasNext()) {
//                HashMap.Entry<String, CommunityAdmin> set = (HashMap.Entry<String, CommunityAdmin>) it.next();
//                System.out.println(set.getKey() + " = " + set.getValue());
//        }
//          communityAdmins.forEach((key,value) -> System.out.println(key + " = " + value));
    }
    
}

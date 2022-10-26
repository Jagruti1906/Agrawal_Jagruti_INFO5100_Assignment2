/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_2;

/**
 *
 * @author jagru
 */
public class PatientClass extends PeopleClass{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    PatientClass(String username, String name, int age, String gender, String communityName, String houseName, String address, int zip, String city) {
        super(name, age, gender, communityName, houseName, address, zip, city);
        this.setUsername(username);
    }
}

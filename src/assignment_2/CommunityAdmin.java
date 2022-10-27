/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_2;

/**
 *
 * @author jagru
 */
public class CommunityAdmin extends CommunityClass{
    private String username;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    CommunityAdmin(String username, String name, String CommunityName, int zip, String city) {
        super(name, zip, city);
        this.setUsername(username);
        this.setName(name);
    }
}

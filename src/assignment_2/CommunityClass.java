/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_2;

/**
 *
 * @author jagru
 */
public class CommunityClass extends CityClass {
    
    private String CommunityName;
    private int zip;
    
    public CommunityClass(String name, int zip, String city) {
        super(city);
        this.setCommunityName(name);
        this.setZip(zip);
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String name) {
        this.CommunityName = name;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}

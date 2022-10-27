/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_2;

/**
 *
 * @author jagru
 */
public class HouseClass extends CommunityClass{
    private String houseName;

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    
    HouseClass(String name, String houseName, int zip, String city) {
        super(name, zip, city);
        this.setHouseName(houseName);
    }
}

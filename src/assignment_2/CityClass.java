/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_2;

import static assignment_2.Assignment_2.cities;

/**
 *
 * @author jagru
 */
public class CityClass {
    private String city;
    
    CityClass(String city) {
        this.setCity(city);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    } 
    
    public static void addCity(String city) {
        cities.add(city);
    }
}

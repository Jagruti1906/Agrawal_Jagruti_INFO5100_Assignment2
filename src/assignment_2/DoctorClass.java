/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_2;

/**
 *
 * @author jagru
 */
public class DoctorClass extends PeopleClass{
    private String hospitalName;
    private String username;
    private int doctorID;

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    public DoctorClass(String username, int doctorID, String name, int age, String gender, String hospitalName, String communityName, String houseName, int zip, String city) {
        super(name, age, gender, communityName, houseName, zip, city);
        this.setHospitalName(hospitalName);
        this.setUsername(username);
        this.setDoctorID(doctorID);
    }
}

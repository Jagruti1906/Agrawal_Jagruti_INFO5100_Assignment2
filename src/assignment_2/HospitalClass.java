/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_2;

/**
 *
 * @author jagru
 */
public class HospitalClass extends CommunityClass{
    private String hospitalName;
    private int hospitalID;

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    public HospitalClass(int hospitalID, String hospitalName, String name, int zip, String city) {
        super(name,zip,city);
        this.setHospitalName(hospitalName);
        this.setHospitalID(hospitalID);
    }
}

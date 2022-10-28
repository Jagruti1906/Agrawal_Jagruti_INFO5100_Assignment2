/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_2;

import java.util.Date;

/**
 *
 * @author jagru
 */
public class Encounter extends Vitals{
    private String patientName;
    private String doctorName;
    private Date date;
    private int patientID;
    private int doctorID;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public Encounter(String patientName, Date date, int patientID, int doctorID, String doctorName, float bloodPressure, float heartRate, float temperature) {
        super(bloodPressure, heartRate, temperature);
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
        this.patientID = patientID;
        this.doctorID = doctorID;
    }

    
}

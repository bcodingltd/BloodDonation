/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author student
 */
@Entity
public class BloodDonor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nationalId;
    private String names;
    private String phone;
    private java.util.Date dob;
    private String gender;
    private String bloodType;
    private String email;
   @OneToMany(mappedBy = "donar",cascade = CascadeType.ALL)
private List<BloodChedule>schedule;
   @OneToMany(mappedBy = "blood",cascade = CascadeType.ALL)
private List<BloodSample>sample;

    public BloodDonor() {
    }

    public BloodDonor(int id, String nationalId, String names, String phone, java.util.Date dob, String gender, String bloodType, String email, List<BloodChedule> schedule, List<BloodSample> sample) {
        this.id = id;
        this.nationalId = nationalId;
        this.names = names;
        this.phone = phone;
        this.dob = dob;
        this.gender = gender;
        this.bloodType = bloodType;
        this.email = email;
        this.schedule = schedule;
        this.sample = sample;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public java.util.Date getDob() {
        return dob;
    }

    public void setDob(java.util.Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BloodChedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<BloodChedule> schedule) {
        this.schedule = schedule;
    }

    public List<BloodSample> getSample() {
        return sample;
    }

    public void setSample(List<BloodSample> sample) {
        this.sample = sample;
    }
    
}

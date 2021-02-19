/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author student
 */
@Entity
public class BloodSample implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bloodType;
    private String quantity;
    private Date testDate=java.sql.Date.valueOf(LocalDate.now());
    private String result;
@ManyToOne
   private BloodDonor blood;
@ManyToOne
   private RegionCenter center;
@ManyToOne
   private Supervisor supervisor;
@ManyToOne
   private LabTechnician technician;

    public BloodSample() {
    }

    public BloodSample(int id, String bloodType, String quantity, String result, BloodDonor blood, RegionCenter center, Supervisor supervisor, LabTechnician technician) {
        this.id = id;
        this.bloodType = bloodType;
        this.quantity = quantity;
        this.result = result;
        this.blood = blood;
        this.center = center;
        this.supervisor = supervisor;
        this.technician = technician;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public BloodDonor getBlood() {
        return blood;
    }

    public void setBlood(BloodDonor blood) {
        this.blood = blood;
    }

    public RegionCenter getCenter() {
        return center;
    }

    public void setCenter(RegionCenter center) {
        this.center = center;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public LabTechnician getTechnician() {
        return technician;
    }

    public void setTechnician(LabTechnician technician) {
        this.technician = technician;
    }
    
}

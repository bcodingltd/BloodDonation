/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author student
 */
@Entity
public class LabTechnician implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String techName;
    private String email;
@OneToMany(mappedBy = "technician",cascade = CascadeType.ALL)
private List<BloodSample>schedule;
@ManyToOne
private RegionCenter region;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LabTechnician() {
    }

    public LabTechnician(int id, String techName, String email, List<BloodSample> schedule, RegionCenter region) {
        this.id = id;
        this.techName = techName;
        this.email = email;
        this.schedule = schedule;
        this.region = region;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BloodSample> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<BloodSample> schedule) {
        this.schedule = schedule;
    }

    public RegionCenter getRegion() {
        return region;
    }

    public void setRegion(RegionCenter region) {
        this.region = region;
    }
    
}

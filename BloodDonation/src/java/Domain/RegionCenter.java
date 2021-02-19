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
import javax.persistence.OneToMany;

/**
 *
 * @author student
 */
@Entity
public class RegionCenter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int code;
    private String regionName;
    @OneToMany(mappedBy = "center",cascade = CascadeType.ALL)
private List<BloodSample>schedule;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
private List<LabTechnician>lab;

    public RegionCenter() {
    }

    public RegionCenter(int id, int code, String regionName, List<BloodSample> schedule, List<LabTechnician> lab) {
        this.id = id;
        this.code = code;
        this.regionName = regionName;
        this.schedule = schedule;
        this.lab = lab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<BloodSample> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<BloodSample> schedule) {
        this.schedule = schedule;
    }

    public List<LabTechnician> getLab() {
        return lab;
    }

    public void setLab(List<LabTechnician> lab) {
        this.lab = lab;
    }
    
    
}

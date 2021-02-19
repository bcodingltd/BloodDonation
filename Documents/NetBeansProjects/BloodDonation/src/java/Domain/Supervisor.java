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
public class Supervisor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int phone;
    private String email;
    @OneToMany(mappedBy = "supervisor",cascade = CascadeType.ALL)
private List<BloodSample>schedule;
    @OneToMany(mappedBy = "sup",cascade = CascadeType.ALL)
private List<Drone>drone;

    public Supervisor() {
    }

    public Supervisor(int id, String name, int phone, String email, List<BloodSample> schedule, List<Drone> drone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.schedule = schedule;
        this.drone = drone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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

    public List<Drone> getDrone() {
        return drone;
    }

    public void setDrone(List<Drone> drone) {
        this.drone = drone;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
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
public class Drone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;
    @ManyToOne
private Supervisor sup;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drone() {
    }

    public Drone(int id, String address, Supervisor sup) {
        this.id = id;
        this.address = address;
        this.sup = sup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Supervisor getSup() {
        return sup;
    }

    public void setSup(Supervisor sup) {
        this.sup = sup;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author student
 */
@Entity
public class BloodChedule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private String description;
    @ManyToOne
    private BloodDonor donar;

    public BloodChedule() {
    }

    public BloodChedule(int id, Date date, String description, BloodDonor donar) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.donar = donar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BloodDonor getDonar() {
        return donar;
    }

    public void setDonar(BloodDonor donar) {
        this.donar = donar;
    }
    
    
    
}

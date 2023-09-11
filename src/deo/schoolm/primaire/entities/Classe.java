/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Deo Gratias 228
 */
@Entity
@Table(name = "classe")
public class Classe implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "distingush")
    private String distingush;
    
    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;

    
    public Classe() {
    }

    public Classe(Integer id, String distingush, Cours cours) {
        this.id = id;
        this.distingush = distingush;
        this.cours = cours;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistingush() {
        return distingush;
    }

    public void setDistingush(String distingush) {
        this.distingush = distingush;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }
    
}

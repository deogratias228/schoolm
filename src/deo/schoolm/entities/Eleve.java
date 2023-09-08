/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Deo Gratias 228
 */
@Entity
@Table(name="eleve")
public class Eleve implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "eleve_nom", length = 30)
    private String eleveNom;
    
    @Column(name = "eleve_prenom", length = 35)
    private String elevePrenom;
    
    @Column(name = "tuteur_nom", length = 50)
    private String tuteurNom;
    
    @Column(name = "tuteur_contact", length = 20)
    private String tuteurContact;

    public Eleve() {
    }

    public Eleve(String nom, String prenom, String nomTuteur, String contactTuteur) {
        this.eleveNom = nom;
        this.elevePrenom = prenom;
        this.tuteurNom = nomTuteur;
        this.tuteurContact = contactTuteur;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return eleveNom;
    }

    public void setNom(String nom) {
        this.eleveNom = nom;
    }

    public String getPrenom() {
        return elevePrenom;
    }

    public void setPrenom(String prenom) {
        this.elevePrenom = prenom;
    }

    public String getNomTuteur() {
        return tuteurNom;
    }

    public void setNomTuteur(String nomTuteur) {
        this.tuteurNom = nomTuteur;
    }

    public String getContactTuteur() {
        return tuteurContact;
    }

    public void setContactTuteur(String contactTuteur) {
        this.tuteurContact = contactTuteur;
    }

    @Override
    public String toString() {
        return "Eleve{" + "Matricule=" + id + ", nom=" + eleveNom + ", prenom=" + elevePrenom + ", nomTuteur=" + tuteurNom + ", contactTuteur=" + tuteurContact + '}';
    }
            
    
    
}

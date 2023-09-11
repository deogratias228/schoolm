/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    
    @Column(name="eleve_matricule", length=15)
    private double eleveMatricule;
    
    @Column(name = "eleve_nom", length = 30)
    private String eleveNom;
    
    @Column(name = "eleve_prenom", length = 35)
    private String elevePrenom;
    
    @Column(name = "eleve_naissance")
    private LocalDate eleveNaissance;
    
    @Column(name = "tuteur_nom", length = 50)
    private String tuteurNom;
    
    @Column(name = "tuteur_contact", length = 20)
    private String tuteurContact;
    
    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;

    public Eleve() {
    }

    public Eleve(double matricule, String nom, String prenom, LocalDate naissance, String nomTuteur, String contactTuteur) {
        this.eleveMatricule = matricule;
        this.eleveNom = nom;
        this.elevePrenom = prenom;
        this.eleveNaissance = naissance;
        this.tuteurNom = nomTuteur;
        this.tuteurContact = contactTuteur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getEleveMatricule() {
        return eleveMatricule;
    }

    public void setEleveMatricule(double eleveMatricule) {
        this.eleveMatricule = eleveMatricule;
    }

    public String getEleveNom() {
        return eleveNom;
    }

    public void setEleveNom(String eleveNom) {
        this.eleveNom = eleveNom;
    }

    public String getElevePrenom() {
        return elevePrenom;
    }

    public void setElevePrenom(String elevePrenom) {
        this.elevePrenom = elevePrenom;
    }

    public String getTuteurNom() {
        return tuteurNom;
    }

    public void setTuteurNom(String tuteurNom) {
        this.tuteurNom = tuteurNom;
    }

    public String getTuteurContact() {
        return tuteurContact;
    }

    public void setTuteurContact(String tuteurContact) {
        this.tuteurContact = tuteurContact;
    }
    
    public LocalDate getEleveNaissance() {
        return this.eleveNaissance;
    }
    
    public void setEleveNaissance(LocalDate naissance) {
        this.eleveNaissance = naissance;
    }
    
    @Override
    public String toString() {
        return "Eleve{" + "Matricule=" + id + ", nom=" + eleveNom + ", prenom=" + elevePrenom + ", nomTuteur=" + tuteurNom + ", contactTuteur=" + tuteurContact + '}';
    }
            
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
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
@Table(name = "instituteur")
public class Instituteur implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "numero_matricule")
    private Long numeroMatricule;
    
    @Column(name = "nom", length = 30)
    private String nom;
    
    @Column(name = "prenom", length = 50)
    private String prenom;
    
    @Column(name = "grade_echelon", length = 5)
    private String gradeEchelon;
    
    @Column(name = "contact", length = 12)
    private String contact;
    
    @Column(name = "titre", length = 15)
    private String titre;
    
    @Column(name = "date_prise_de_service")
    private LocalDate datePriseDeService;

    public Instituteur() {
    }

    public Instituteur(Integer id, Long numeroMatricule, String nom, String prenom, String gradeEchelon, String contact, String titre, LocalDate datePriseDeService) {
        this.id = id;
        this.numeroMatricule = numeroMatricule;
        this.nom = nom;
        this.prenom = prenom;
        this.gradeEchelon = gradeEchelon;
        this.contact = contact;
        this.titre = titre;
        this.datePriseDeService = datePriseDeService;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNumeroMatricule() {
        return numeroMatricule;
    }

    public void setNumeroMatricule(Long numeroMatricule) {
        this.numeroMatricule = numeroMatricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGradeEchelon() {
        return gradeEchelon;
    }

    public void setGradeEchelon(String gradeEchelon) {
        this.gradeEchelon = gradeEchelon;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDatePriseDeService() {
        return datePriseDeService;
    }

    public void setDatePriseDeService(LocalDate datePriseDeService) {
        this.datePriseDeService = datePriseDeService;
    }

    @Override
    public String toString() {
        return "Instituteur{" + "id=" + id + ", numeroMatricule=" + numeroMatricule + ", nom=" + nom + ", prenom=" + prenom + ", gradeEchelon=" + gradeEchelon + ", contact=" + contact + ", titre=" + titre + ", datePriseDeService=" + datePriseDeService + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.numeroMatricule);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instituteur other = (Instituteur) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.numeroMatricule, other.numeroMatricule);
    }
    
    
    
}

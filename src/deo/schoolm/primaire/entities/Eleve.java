/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
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
    private long eleveMatricule;
    
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
    
    @OneToMany(mappedBy = "eleve")
    private List<Note> notes;
    
    @OneToMany(mappedBy = "eleve")
    private List<Matiere> matieres;
    

    public Eleve() {
    }

    public Eleve(long matricule, String nom, String prenom, LocalDate naissance, String nomTuteur, String contactTuteur) {
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

    public long getEleveMatricule() {
        return eleveMatricule;
    }

    public void setEleveMatricule(long eleveMatricule) {
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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }
    
    
    
    @Override
    public String toString() {
        return "Eleve{" + "Matricule=" + id + ", nom=" + eleveNom + ", prenom=" + elevePrenom + ", nomTuteur=" + tuteurNom + ", contactTuteur=" + tuteurContact + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Eleve other = (Eleve) obj;
        if (this.eleveMatricule != other.eleveMatricule) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
            
    
    
}

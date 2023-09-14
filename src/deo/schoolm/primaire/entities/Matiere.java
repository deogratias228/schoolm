/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.entities;

import java.io.Serializable;
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
@Table(name = "matiere")
public class Matiere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "intitule", length = 255)
    private String intitule;
    
    @Column(name = "note_maxi")
    private double noteMaxi;
    
    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;
    
    @OneToMany(mappedBy = "matiere")
    private List<Note> notes;
    
    @OneToMany(mappedBy = "matiere")
    private List<Eleve> eleves;

    public Matiere() {
    }

    public Matiere(Integer id, String intitule, double noteMaxi, Cours cours) {
        this.id = id;
        this.intitule = intitule;
        this.noteMaxi = noteMaxi;
        this.cours = cours;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getNoteMaxi() {
        return noteMaxi;
    }

    public void setNoteMaxi(double noteMaxi) {
        this.noteMaxi = noteMaxi;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }
    
    

    @Override
    public String toString() {
        return "Matiere{" + "id=" + id + ", intitule=" + intitule + ", noteMaxi=" + noteMaxi + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Matiere other = (Matiere) obj;
        if (!Objects.equals(this.intitule, other.intitule)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
}

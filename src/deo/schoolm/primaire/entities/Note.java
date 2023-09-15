/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.entities;

import java.io.Serializable;
import java.util.Objects;
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
@Table(name = "p_note")
public class Note implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "note_obtenue")
    private double noteObtenue;
    
    @ManyToOne
    @JoinColumn(name = "eleve_id")
    private Eleve eleve;
    
    @ManyToOne
    @JoinColumn(name = "evaluation_id")
    private Evaluation evaluation;
    
    @ManyToOne
    @JoinColumn(name = "matiere_id")
    private Matiere matiere;

    public Note() {
    }

    public Note(Integer id, double noteObtenue, Eleve eleve, Evaluation evaluation, Matiere matiere) {
        this.id = id;
        this.eleve = eleve;
        this.evaluation = evaluation;
        this.matiere = matiere;
        this.noteObtenue = noteObtenue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public double getNote_obtenue() {
        return noteObtenue;
    }

    public void setNote_obtenue(double note_obtenue) {
        this.noteObtenue = note_obtenue;
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", eleve=" + eleve + ", evaluation=" + evaluation + ", matiere=" + matiere + ", note_obtenue=" + noteObtenue + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Note other = (Note) obj;
        if (Double.doubleToLongBits(this.noteObtenue) != Double.doubleToLongBits(other.noteObtenue)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.eleve, other.eleve)) {
            return false;
        }
        if (!Objects.equals(this.evaluation, other.evaluation)) {
            return false;
        }
        return Objects.equals(this.matiere, other.matiere);
    }
    
    
    
}

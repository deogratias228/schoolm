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
@Table(name = "p_evaluation")
public class Evaluation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "intitule", length = 50)
    private String intitule;
    
    @Column(name = "observations", length = 255)
    private String observations;
    
    @ManyToOne
    @JoinColumn(name ="classe_id")
    private Classe classe;
    
    @OneToMany(mappedBy = "evaluation")
    private List<Note> notes;

    
    public Evaluation() {
    }

    public Evaluation(Integer id, String intitule, String observations, Classe classe) {
        this.id = id;
        this.intitule = intitule;
        this.observations = observations;
        this.classe = classe;
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

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
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
    
    

    @Override
    public String toString() {
        return "Evaluation{" + "id=" + id + ", intitule=" + intitule + ", observations=" + observations + ", classe=" + classe + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final Evaluation other = (Evaluation) obj;
        if (!Objects.equals(this.intitule, other.intitule)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
    
}

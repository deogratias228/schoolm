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
@Table(name = "p_classe")
public class Classe implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "distingush")
    private String distingush;
    
    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;
    
    @ManyToOne
    @JoinColumn(name = "instituteur_id")
    private Instituteur instituteur;
    
    @OneToMany(mappedBy = "classe")
    private List<Evaluation> evaluations;
    
    @OneToMany(mappedBy = "classe")
    private List<Eleve> eleves;
    
    public Classe() {
        this.distingush = " ";
    }

    public Classe(Integer id, String distingush, Cours cours, Instituteur instituteur) {
        this.id = id;
        this.distingush = distingush;
        this.cours = cours;
        this.instituteur = instituteur;
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

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public List<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }

    public Instituteur getInstituteur() {
        return instituteur;
    }

    public void setInstituteur(Instituteur instituteur) {
        this.instituteur = instituteur;
    }
    
    

    @Override
    public String toString() {
        return "Classe{" + "id=" + id + ", distingush=" + distingush + ", cours=" + cours + ", instituteur=" + instituteur + ", evaluations=" + evaluations + ", eleves=" + eleves + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Classe other = (Classe) obj;
        if (!Objects.equals(this.distingush, other.distingush)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
    
}

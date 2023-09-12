/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Eleve;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface EleveDao {
    public void ajouter(Eleve eleve);
    public void supprimer(long matricule);
    public void supprimer(Eleve eleve);
    public Eleve modifier(Eleve eleve);
    public Eleve trouver(long matricule);
    public List<Eleve> lister();
    public List<Eleve> lister(String eleveTuteurContact);
    public List<Eleve> lister(long anneeNaissance);
    
}

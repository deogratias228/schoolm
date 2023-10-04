/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Cours;
import deo.schoolm.primaire.entities.Eleve;
import deo.schoolm.primaire.entities.Matiere;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface MatiereDao {
    public void ajouter(Matiere m);
    public void supprimer(Matiere m);
    public void supprimer(Integer id);
    public Matiere modifier(Matiere m);
    public Matiere trouver(Integer id);
    public List<Matiere> lister();
    public List<Matiere> lister(double note);
    public List<Matiere> lister(String search);
}

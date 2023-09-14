/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.*;
import deo.schoolm.primaire.entities.Instituteur;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface InstituteurService {
    public void ajouter(Instituteur instituteur);
    public void supprimer(Instituteur instituteur);
    public void supprimer(Integer id );
    public void supprimer(long matricule);
    public Instituteur modifier(Instituteur instituteur);
    public Instituteur trouver(Integer id);
//    public Instituteur trouver(long matricule);
    public List<Instituteur> lister();
    public List<Instituteur> lister(String gradeOuTitre);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.entities.Classe;
import deo.schoolm.primaire.entities.Cours;
import deo.schoolm.primaire.entities.Instituteur;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface ClasseService {
    public void ajouter(Classe classe);
    public void supprimer(Classe classe);
    public void supprimer(Integer id);
    public Classe modifier(Classe classe);
    public Classe trouver(Integer id);
    public List<Classe> lister();
    public List<Classe> lister(Cours cours);
    public List<Classe> lister(String distingush);
    public List<Classe> lister(Instituteur instituteur);
}

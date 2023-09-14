/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.*;
import deo.schoolm.primaire.entities.Cours;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface CoursService {
    public void ajouter(Cours cours);
    public void supprimer(Cours cours);
    public void supprimer(Integer id);
    public void supprimer(String code);
    public Cours modifier(Cours cours);
    public Cours trouver(Integer id);
    public List<Cours> lister();
}

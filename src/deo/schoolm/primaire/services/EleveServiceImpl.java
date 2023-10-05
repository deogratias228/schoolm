/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.EleveDaoImpl;
import deo.schoolm.primaire.entities.Eleve;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public class EleveServiceImpl implements EleveService {

    EleveDaoImpl dao = new EleveDaoImpl();
    
    @Override
    public void ajouter(Eleve eleve) {
        dao.ajouter(eleve);
    }

    @Override
    public void supprimer(Integer id) {
        dao.supprimer(id);
    }

    @Override
    public void supprimer(Eleve eleve) {
        dao.supprimer(eleve);
    }

    @Override
    public Eleve modifier(Eleve eleve) {
        return dao.modifier(eleve);
    }

    @Override
    public Eleve trouver(Integer id) {
        return dao.trouver(id);
    }

    @Override
    public List<Eleve> lister() {
        return dao.lister();
    }

    @Override
    public List<Eleve> lister(String eleveTuteurContact) {
        return dao.lister(eleveTuteurContact);
    }

    @Override
    public List<Eleve> lister(long anneeNaissance) {
        return dao.lister(anneeNaissance);
    }
    
}

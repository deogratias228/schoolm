/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.CoursDaoImpl;
import deo.schoolm.primaire.entities.Cours;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public class CoursServiceImpl implements CoursService {

    private CoursDaoImpl dao = new CoursDaoImpl();
    
    @Override
    public void ajouter(Cours cours) {
        dao.ajouter(cours);
    }

    @Override
    public void supprimer(Cours cours) {
        dao.supprimer(cours);
    }

    @Override
    public void supprimer(Integer id) {
        dao.supprimer(id);
    }

    @Override
    public Cours modifier(Cours cours) {
        return dao.modifier(cours);
    }

    @Override
    public Cours trouver(Integer id) {
        return dao.trouver(id);
    }

    @Override
    public List<Cours> lister() {
        return dao.lister();
    }

    @Override
    public List<Cours> lister(String filter) {
        return dao.lister(filter);
    }
    
}

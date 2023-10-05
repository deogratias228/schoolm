/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.MatiereDaoImpl;
import deo.schoolm.primaire.entities.Matiere;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public class MatiereServiceImpl implements MatiereService{

    MatiereDaoImpl dao = new MatiereDaoImpl();
    
    @Override
    public void ajouter(Matiere m) {
        dao.ajouter(m);
    }

    @Override
    public void supprimer(Matiere m) {
        dao.supprimer(m);
    }

    @Override
    public void supprimer(Integer id) {
        dao.supprimer(id);
    }

    @Override
    public Matiere modifier(Matiere m) {
        return dao.modifier(m);
    }

    @Override
    public Matiere trouver(Integer id) {
        return dao.trouver(id);
    }

    @Override
    public List<Matiere> lister() {
        return dao.lister();
    }

    @Override
    public List<Matiere> lister(double note) {
        return dao.lister(note);
    }

    @Override
    public List<Matiere> lister(String search) {
        return dao.lister(search);
    }
    
}

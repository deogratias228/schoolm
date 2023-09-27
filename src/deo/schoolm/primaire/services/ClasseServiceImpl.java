/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.ClasseDaoImpl;
import deo.schoolm.primaire.entities.Classe;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public class ClasseServiceImpl implements ClasseService {

    private ClasseDaoImpl dao = new ClasseDaoImpl();
    
    @Override
    public void ajouter(Classe classe) {
        dao.ajouter(classe);
    }

    @Override
    public void supprimer(Classe classe) {
        dao.supprimer(classe);
    }

    @Override
    public void supprimer(Integer id) {
        dao.supprimer(id);
    }

    @Override
    public Classe modifier(Classe classe) {
        return dao.modifier(classe);
    }

    @Override
    public Classe trouver(Integer id) {
        return dao.trouver(id);
    }

    @Override
    public List<Classe> lister() {
        return dao.lister();
    }

    @Override
    public List<Classe> lister(String distingush) {
        return dao.lister(distingush);
    }
}

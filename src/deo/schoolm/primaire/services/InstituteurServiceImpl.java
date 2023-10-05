/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.InstituteurDaoImpl;
import deo.schoolm.primaire.entities.Instituteur;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public class InstituteurServiceImpl implements InstituteurService {

    InstituteurDaoImpl dao = new InstituteurDaoImpl();
    
    @Override
    public void ajouter(Instituteur instituteur) {
        dao.ajouter(instituteur);
    }

    @Override
    public void supprimer(Instituteur instituteur) {
        dao.supprimer(instituteur);
    }

    @Override
    public void supprimer(Integer id) {
        dao.supprimer(id);
    }

    @Override
    public Instituteur modifier(Instituteur instituteur) {
        return dao.modifier(instituteur);
    }

    @Override
    public Instituteur trouver(Integer id) {
        return dao.trouver(id);
    }

    @Override
    public List<Instituteur> lister() {
        return dao.lister();
    }

    @Override
    public List<Instituteur> lister(String filter) {
        return dao.lister(filter);
    }
    
}

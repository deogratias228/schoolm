/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.EvaluationDaoImpl;
import deo.schoolm.primaire.entities.Evaluation;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public class EvaluationServiceImpl implements EvaluationService {

    EvaluationDaoImpl dao = new EvaluationDaoImpl();
    
    @Override
    public void ajouter(Evaluation e) {
        dao.ajouter(e);
    }

    @Override
    public void supprimer(Evaluation e) {
        dao.supprimer(e);
    }

    @Override
    public void supprimer(Integer id) {
        dao.supprimer(id);
    }

    @Override
    public Evaluation modifier(Evaluation e) {
        return dao.modifier(e);
    }

    @Override
    public Evaluation trouver(Integer id) {
        return dao.trouver(id);
    }

    @Override
    public List<Evaluation> lister() {
        return dao.lister();
    }

    @Override
    public List<Evaluation> lister(String filter) {
        return dao.lister(filter);
    }
    
}

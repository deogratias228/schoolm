/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.dao.NoteDaoImpl;
import deo.schoolm.primaire.entities.Note;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public class NoteServiceImpl implements NoteService {
   
    NoteDaoImpl dao = new NoteDaoImpl();

    @Override
    public void ajouter(Note note) {
        dao.ajouter(note);
    }

    @Override
    public void supprimer(Note note) {
        dao.supprimer(note);
    }

    @Override
    public void supprimer(Integer id) {
        dao.supprimer(id);
    }

    @Override
    public Note modifier(Note note) {
        return dao.modifier(note);
    }

    @Override
    public Note trouver(Integer id) {
        return dao.trouver(id);
    }

    @Override
    public List<Note> lister() {
        return dao.lister();
    }

    @Override
    public List<Note> lister(String filter) {
        return dao.lister(filter);
    }

    @Override
    public List<Note> lister(double note) {
        return dao.lister(note);
    }
    
    
}

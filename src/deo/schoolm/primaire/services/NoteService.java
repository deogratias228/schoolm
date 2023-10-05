/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.entities.Note;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface NoteService {
    public void ajouter(Note note);
    public void supprimer(Note note);
    public void supprimer(Integer id);
    public Note modifier(Note note);
    public Note trouver(Integer id);
    public List<Note> lister();
    public List<Note> lister(String filter);
    public List<Note> lister(double note);
}

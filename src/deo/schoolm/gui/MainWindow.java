/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Deo Gratias 228
 */
public class MainWindow extends JFrame {
    JPanel panel = new JPanel();
    Accueil accueil = new Accueil();
    
    public MainWindow(){
        super("School Manager");
        this.setSize(900, 720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel.add(accueil);
        this.getContentPane().add(panel);
        this.setVisible(true);
    }
    
}

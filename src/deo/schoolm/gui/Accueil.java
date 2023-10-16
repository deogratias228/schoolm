/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Deo Gratias 228
 */
public class Accueil extends JPanel{

    
    public Accueil() {
        
        JLabel title = new JLabel("Accueil");
        title.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
        
        JLabel optionNew = getOption("Nouvelle année");
        JLabel optionInfo = getOption("Visite guidée");
        JLabel optionOpen = getOption("Ouvrir un dossier");
        JLabel optionLikes = getOption("Préférences");
        JLabel optionExit = getOption("Quitter");
                
        JPanel panTitle = new JPanel(new BorderLayout());
        panTitle.setPreferredSize(new Dimension(500, 75));
        panTitle.add(title);
        
        JPanel panOptions = new JPanel(new GridLayout(4, 1));
        panOptions.setPreferredSize(new Dimension(400, 250));
        panOptions.add(optionNew);
        panOptions.add(optionInfo);
        panOptions.add(optionOpen);
        panOptions.add(optionLikes);
        
        JPanel panExit = new JPanel(new BorderLayout());
        panExit.setPreferredSize(new Dimension(500, 75));
        panExit.add(optionExit, BorderLayout.EAST);
        optionExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                optionExit.setForeground(Color.decode("#025284"));
                System.exit(0);
            }
        });
        
        this.add(panTitle);
        this.add(panOptions);
        this.add(panExit);
        
    }
    
    private JLabel getOption(String text){
        JLabel option = new JLabel(text);
        option.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        Border roundedBorder = BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode("#025284")),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );
        Border compound = BorderFactory.createCompoundBorder(lineBorder, roundedBorder);
        
        option.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                option.setForeground(Color.decode("#025284"));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                option.setForeground(Color.decode("#025284"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                option.setForeground(Color.red);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                option.setForeground(Color.decode("#0376BD"));
                option.setBorder(compound);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                option.setForeground(Color.black);
                option.setBorder(null);
            }
        });
        return option;
    }
    
    private JPanel getPanel(){
        JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER));
        return pan;
    }
}

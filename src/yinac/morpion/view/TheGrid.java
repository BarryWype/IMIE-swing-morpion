/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yinac.morpion.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import yinac.morpion.model.IMorpionModel;

/**
 *
 * @author imie
 */
public class TheGrid extends JComponent {
    
    public Plateau plateau;
    private IMorpionModel imorpmod;
    
    public TheGrid(Plateau plateau, IMorpionModel imorpmod){
        this.plateau = plateau;
        this.imorpmod = imorpmod;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
        }});
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        Integer cellWidth = getWidth()/3;
        Integer cellHeight = getHeight()/3;
                
                
        for (int cpt = 0; cpt < 3; cpt++) {
            for (int cpt2 = 0; cpt2 < 3; cpt2++) {
                g2d.drawRect(cpt * cellWidth, cpt2 * cellHeight, cellWidth, cellHeight);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yinac.morpion.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.JComponent;

/**
 *
 * @author imie
 */
public class TheGrid extends JComponent {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        for (int cpt = 0; cpt < 3; cpt++) {
            for (int cpt2 = 0; cpt2 < 3; cpt2++) {
                g2d.drawRect(cpt * 50, cpt * 50, cpt2 * 50, cpt2 * 50);
            }
        }

    }

}

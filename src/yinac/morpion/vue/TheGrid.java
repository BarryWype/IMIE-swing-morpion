/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.vue;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JComponent;

/**
 *
 * @author imie
 */
public class TheGrid extends JComponent{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(0, 0, 50, 50);
        
    }
    
}

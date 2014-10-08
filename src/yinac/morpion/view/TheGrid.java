/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.view;

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
        
        for(int cpt=0;cpt<3;cpt++){
            for(int cpt2=0;cpt2<3;cpt++){
                g.drawRect(cpt*50, cpt*50, cpt2*50, cpt2*50);
            }
        }
        
        
    }
    
}

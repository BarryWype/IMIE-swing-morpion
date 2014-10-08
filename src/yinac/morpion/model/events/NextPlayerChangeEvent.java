/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.model.events;

import yinac.morpion.model.Player;

/**
 *
 * @author imie
 */
public class NextPlayerChangeEvent extends MorpionEvent{

    public NextPlayerChangeEvent() {
        super(Type.NextPlayerChange);
    }
    
}

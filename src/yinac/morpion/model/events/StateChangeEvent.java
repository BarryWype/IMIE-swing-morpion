/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.model.events;

/**
 *
 * @author imie
 */
public class StateChangeEvent extends MorpionEvent{
    public StateChangeEvent() {
        super(Type.StateChange);
    }
}

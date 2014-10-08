/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.view.events;

/**
 *
 * @author imie
 */
public class MorpionViewEvent {
     public enum Type {
        CellClicked
        
    };
    private Type type;

    public MorpionViewEvent(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}

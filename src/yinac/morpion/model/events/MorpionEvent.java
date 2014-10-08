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
public class MorpionEvent {
    public enum Type {
        CellChange,
        NextPlayerChange,
        StateChange
        
    };
    private Type type;

    public MorpionEvent(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
    
}

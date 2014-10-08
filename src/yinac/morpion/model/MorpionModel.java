/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.model;

import java.util.List;
import java.util.Random;


/**
 *
 * @author imie
 */
public class MorpionModel implements IMorpionModel {
    private Player crossPlayer;
    private Player circlePlayer;
    private Player winningPlayer;
    private Cell nextCellType;
    private GameState state;
    private List<Cell> cells;
    
    MorpionModel(Player player1, Player player2) {
        if (new Random().nextBoolean()) {
            crossPlayer = player1;
            circlePlayer = player2;
        } else {
            crossPlayer = player2;
            circlePlayer = player1;
        }
        nextCellType = Cell.circle;
        winningPlayer = null;
        state = GameState.running;
        while (cells.size() < getRowCount() * getColumnCount())
            cells.add(Cell.empty);
    }

    @Override
    public Cell getCellAt(int row, int column) {
        return cells.get(row + column*getRowCount());
    }

    @Override
    public GameState getGameState() {
        return state;
    }

    @Override
    public Player getWinner() {
        return winningPlayer;
    }

    @Override
    public Player getCirclePlayer() {
        return circlePlayer;
    }

    @Override
    public Player getCrossPlayer() {
        return crossPlayer;
    }

    @Override
    public Cell getCellTypeFromPlayer(Player player) {
        if (player == crossPlayer) return Cell.cross;
        if (player == circlePlayer) return Cell.circle;
        return Cell.empty;
    }

    @Override
    public Player getNextPlayer() {
        return nextCellType == Cell.cross ? crossPlayer : circlePlayer;
    }

    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
}

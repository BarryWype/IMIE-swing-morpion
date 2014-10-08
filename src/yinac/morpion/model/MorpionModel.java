/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yinac.morpion.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;
import yinac.morpion.model.events.CellChangeEvent;
import yinac.morpion.model.events.NextPlayerChangeEvent;
import yinac.morpion.model.events.StateChangeEvent;

/**
 *
 * @author imie
 */
public class MorpionModel extends Observable implements IMorpionModel {

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
        cells = new ArrayList<Cell>();
        while (cells.size() < getRowCount() * getColumnCount()) {
            cells.add(Cell.empty);
        }
    }

    public void playCell(int row, int column) {
        cells.set(getIndexFromRowColumn(row, column), nextCellType);
        setChanged();
        notifyObservers(new CellChangeEvent(row, column));
        checkGameState();
        nextCellType = toggleCellType(nextCellType);
        setChanged();
        notifyObservers(new NextPlayerChangeEvent());
    }

    private void checkGameState() {
        if (new Random().nextInt(4) == 0) { // 1 chance sur 4
            if (new Random().nextBoolean()) {
                winningPlayer = new Random().nextBoolean() ? crossPlayer : circlePlayer;
                state = GameState.won;
            } else {
                state = GameState.won;
            }
            setChanged();
            notifyObservers(new StateChangeEvent());
        }
    }

    @Override
    public Cell getCellAt(int row, int column) {
        return cells.get(getIndexFromRowColumn(row, column));
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
        if (player == crossPlayer) {
            return Cell.cross;
        }
        if (player == circlePlayer) {
            return Cell.circle;
        }
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

    private static Cell toggleCellType(Cell cellType) {
        return cellType == Cell.circle ? Cell.cross : Cell.circle;
    }

    private int getIndexFromRowColumn(int row, int column) {
        return row + column * getRowCount();
    }

}

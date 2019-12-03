package ga;

import java.util.Arrays;

public class DNA {
    private boolean[] grid;
    private boolean[] finalGrid;
    private int fitness;

    public DNA(int gridSize) {
        grid = new boolean[gridSize];
        finalGrid = new boolean[gridSize];
    }

    public boolean[] getGrid() {
        return grid;
    }

    public void setGrid(boolean[] grid) {
        this.grid = Arrays.copyOf(grid, grid.length);
    }

    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    public boolean[] getFinalGrid() {
        return finalGrid;
    }

    public void setFinalGrid(boolean[] finalGrid) {
        this.finalGrid = Arrays.copyOf(finalGrid, finalGrid.length);
    }
}

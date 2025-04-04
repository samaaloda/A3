package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {
    private Cell cell = new Cell(' ');

    @Test
    void checkWall() {
        cell.setValue('#');
        assertEquals('#', cell.getValue());
    }

    @Test
    void checkPath() {
        cell.setValue(' ');
        assertEquals(' ', cell.getValue());
    }
}
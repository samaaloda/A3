package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MazeTest {
    Maze maze;

    @BeforeEach
    void setUp(){
        maze = new Maze();
    } 

    @Test
    void isWallTest(){
        ArrayList<ArrayList<Cell>> m = new ArrayList<ArrayList<Cell>>();
        m.add(new ArrayList<Cell>());
        m.get(0).add(new Cell('#'));
        maze.setMaze(m);
        assertTrue(maze.isWall(new int[]{0,0}));
    }

    @Test
    void isNotWallTest(){
        ArrayList<ArrayList<Cell>> m = new ArrayList<ArrayList<Cell>>();
        m.add(new ArrayList<Cell>());
        m.get(0).add(new Cell(' '));
        maze.setMaze(m);
        assertFalse(maze.isWall(new int[]{0,0}));
    }


}
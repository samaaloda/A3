package ca.mcmaster.se2aa4.mazerunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        MazeFileReader m = new MazeFileReader(args);
        System.out.println(m.getString());
        Maze maze = new Maze();
        maze.createMaze(m.getString());
        System.out.println(maze);
    }
}

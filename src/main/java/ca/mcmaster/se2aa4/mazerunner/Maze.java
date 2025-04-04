package ca.mcmaster.se2aa4.mazerunner;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//Class Maze for the implementation of the maze
public class Maze{
    
    private ArrayList<ArrayList<Cell>> maze;

    public Maze(){
        maze=new ArrayList<ArrayList<Cell>>();
    }

    public void setMaze(ArrayList<ArrayList<Cell>> m){
        maze= m;
    }

    //Method below creates the maze by taking in input from the reader and creating the 2D ArrayList of the maze consisting of type Cell
    //Its return type is of type void and it takes in a BufferedReader type reader to read from
    public void createMaze(String mazeString) {
    String[] rows = mazeString.split("\n"); 
    int colSize = 0;

    for (int row = 0; row < rows.length; row++) {
        String line = rows[row];
        maze.add(new ArrayList<>()); 
        if (row == 0) {
            colSize = line.length();
        }
        for (int idx = 0; idx < colSize; idx++) {
            if (idx >= line.length()) {
                maze.get(row).add(new Cell(' '));
            } else {
                maze.get(row).add(new Cell(line.charAt(idx)));
            }
        }
    }
}

    //Method below returns the Maze as a 2D ArrayList of type Cell (e.g. ArrayList<ArrayList<Cells>>)
    //It takes in no parameters
    public ArrayList<ArrayList<Cell>> getMaze(){
        return maze;
    }

    //below returns a String of the maze. It takes in no parameters
    public String toString(){
        String print="";
        for(int i=0;i<maze.size();i++){
            for(int j=0;j<maze.get(0).size();j++){
                print= print+maze.get(i).get(j);
            }
            print=print+"\n";
        }
        return print;
    }

    //below returns the Cell at spot indicated by row and col from the parameters
    //It takes in row and col both as integers, indicating row and column respectively
    public Cell getSpot(int row, int col){
        if(!maze.isEmpty())
            return maze.get(row).get(col);
        return new Cell('i');
    }

    public Cell getSpot(int[] spot){
        if(!maze.isEmpty())
            return maze.get(spot[0]).get(spot[1]);
        return new Cell('i');
    }

    public boolean isWall(int[]spot){
        if(!maze.isEmpty())
            return maze.get(spot[0]).get(spot[1]).getValue()=='#';
        return false;
    }

}


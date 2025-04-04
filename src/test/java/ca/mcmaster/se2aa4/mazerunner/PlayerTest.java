package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void checkTurnRight(){
        player.setAngle(0);
        player.right();
        assertEquals(270,player.getAngle());
    }

    @Test
    void checkTurnLeft(){
        player.setAngle(0);
        player.left();
        assertEquals(90,player.getAngle());
    }

    @Test
    void checkForward(){
        player.setSpot(1,1);
        player.setAngle(0);
        player.forward();
        assertEquals(player.getSpot()[0],1);
        assertEquals(player.getSpot()[1],2);
    }

    @Test
    void checkRightCell(){
        player.setSpot(1,1);
        player.setAngle(0);
        player.setSpot(player.checkRight());
        assertEquals(player.getSpot()[0], 2);
        assertEquals(player.getSpot()[1], 1);
    }

    @Test
    void checkLeftCell(){
        player.setSpot(1,1);
        player.setAngle(0);
        player.setSpot(player.checkLeft());
        assertEquals(player.getSpot()[0], 0);
        assertEquals(player.getSpot()[1], 1);
    }
}

package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PathTest {
    private Path path;

    @BeforeEach
    void setUp() {
        path = new PathFinder(); 
    }

    @Test
    void getFactorizedTest() {
        assertEquals("3F 2R", path.getFactorizedForm("FFFRR"));
    }

    @Test
    void getCanonicalTest() {
        assertEquals("FFF LLLL F RR", path.getCanonicalForm("3F 4L F 2R"));
    }

}

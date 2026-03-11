package nl.tudelft.jpacman.level;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//import nl.tudelft.jpacman.PacmanConfigurationException;
//import nl.tudelft.jpacman.board.Board;
//import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.Ghost;
public class ParsedMap {
    private final Square[][] grid;
    private final List<Ghost> ghosts;
    private final List<Square> startPositions;

    public ParsedMap(int width, int height) {
        this.grid = new Square[width][height];
        this.ghosts = new ArrayList<>();
        this.startPositions = new ArrayList<>();
}

public Square[][] getGrid() {
    return grid;
}

public List<Ghost> getGhosts() {
    return ghosts;
}

public List<Square> getStartPositions() {
    return startPositions;
}

}
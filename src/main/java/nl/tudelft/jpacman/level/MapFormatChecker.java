package nl.tudelft.jpacman.level;

import java.util.List;

import nl.tudelft.jpacman.PacmanConfigurationException;

public class MapFormatChecker {

     /**
     * Check the correctness of the map lines in the text.
     * @param text Map to be checked
     * @throws PacmanConfigurationException if map is not OK.
     */
    public void checkMapFormat(List<String> text) {
    checkTextValidity(text);
    checkWidthConsistency(text);
}

/**
     * HelperFunction Used with checkMapFormat, specifically checks text related exceptions.
     * @param text Map to be checked
     * @throws PacmanConfigurationException if map is not OK.
     */
private void checkTextValidity(List<String> text) {
    if (text == null) {
        throw new PacmanConfigurationException("Input text cannot be null.");
    }
    if (text.isEmpty()) {
        throw new PacmanConfigurationException("Input text must consist of at least 1 row.");
    }
}

/**
     * HelperFunction Used with checkMapFormat, specifically checks width consistency related exceptions.
     * @param text Map to be checked
     * @throws PacmanConfigurationException if map is not OK.
     */
private void checkWidthConsistency(List<String> text) {
    int width = text.get(0).length();
    if (width == 0) {
        throw new PacmanConfigurationException("Input text lines cannot be empty.");
    }
    for (String line : text) {
        if (line.length() != width) {
            throw new PacmanConfigurationException("Input text lines are not of equal width.");
        }
    }
}
    
}

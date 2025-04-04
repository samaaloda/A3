package ca.mcmaster.se2aa4.mazerunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class MazeFileReader {
    private static final Logger logger = LogManager.getLogger(MazeFileReader.class);

    private Options options = new Options();
    private CommandLineParser parser = new DefaultParser();
    private CommandLine cmd;

    public MazeFileReader(String[] args) {
        options.addOption("i", true, "input maze to find path");
        options.addOption("p", true, "input path to see if viable");
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            logger.error("Error parsing command line arguments: ", e);
        }
    }

    public String getString() {
        StringBuilder s = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(cmd.getOptionValue("i")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                s.append(line).append("\n");
            }
        } catch (IOException e) {
            logger.error("An error occurred while reading the file: ", e);
        }
        return s.toString();
    }
}
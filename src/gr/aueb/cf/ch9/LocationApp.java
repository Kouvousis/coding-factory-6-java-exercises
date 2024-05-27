package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LocationApp {

    public static void main(String[] args) {
        File inFd = new File("C:/tmp/locations.txt");
        File outFd = new File("C:/tmp/locationsOut.txt");
        String line;
        String[] tokens;
        String location;
        String latitude;
        String longitude;
        String textConverter;

        try(Scanner in = new Scanner(inFd); PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {

            if (in.hasNextLine()) {
                in.nextLine();
            }

            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(",");
                location = tokens[0];
                latitude = tokens[1];
                longitude = tokens[2];

                textConverter = String.format("{ location: '%s', latitude: %s, longitude: %s },", location, latitude, longitude);
                ps.println(textConverter);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

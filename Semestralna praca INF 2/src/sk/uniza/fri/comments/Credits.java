package sk.uniza.fri.comments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Jednoduchá trieda na načítanie takzvaných credits čo je vlastne podobné ako popis k hre.
 *
 */
public class Credits {
    private String credits;
    public Credits(String fileName) {
        try {
            this.credits = "";
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                this.credits += scanner.nextLine();
                this.credits += "\n";
            }
            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found " + exception.getMessage());
        }
    }
    public String getCredits() {
        return this.credits;
    }
}

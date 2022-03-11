package sk.uniza.fri.tools;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 *
 * @author Tomáš Kotrík
 * Trieda Buffer nahrává dané image zo súboru.
 */

public class Buffer {

    public static BufferedImage getImage(String route) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(route));
        } catch (IOException ex) {
            System.out.println("File does not exist !");
        }
        return image;
    }
}

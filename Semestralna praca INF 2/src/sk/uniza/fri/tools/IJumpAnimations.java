package sk.uniza.fri.tools;

import java.awt.image.BufferedImage;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Interface ktorý implementujú daný vtáci.
 */
public interface IJumpAnimations {
    BufferedImage getJumpImages();
    void updateJumps();

}

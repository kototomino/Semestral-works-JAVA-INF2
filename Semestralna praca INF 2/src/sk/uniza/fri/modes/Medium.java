package sk.uniza.fri.modes;

import java.awt.Color;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Potomok triedy Modes ktorá vytvára mód MEDIUM.
 * Stredne ťažký mód/level tejto hry.
 */
public class Medium extends Modes {

    public Medium() {
        super(7, new Color(205, 198, 19, 255), new Color(81, 128, 127), new Color(10, 202, 157), new Color(151, 202, 10, 255), new Color(174, 126, 43));
    }
    /**
     @return
     */
    @Override
    public Color getBackgroundColor() {
        return super.getBackgroundColor();
    }
    /**
     @return
     */

    @Override
    public Color getGrassColor() {
        return super.getGrassColor();
    }
    /**
     @return
     */

    @Override
    public Color getGroundColor() {
        return super.getGroundColor();
    }
    /**
     @return
     */

    public int getSpeed() {
        return super.getSpeed();
    }
    /**
     @return
     */
    public Color getTubesColor() {
        return super.getTubesColor();
    }
    /**
     @return
     */
    public Color getCloudsColor() {
        return super.getCloudsColor();
    }
    /**
     @return
     */
}

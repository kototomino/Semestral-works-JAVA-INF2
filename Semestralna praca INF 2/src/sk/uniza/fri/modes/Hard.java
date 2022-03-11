package sk.uniza.fri.modes;

import java.awt.Color;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Potomok triedy Modes ktorá vytvára mód HARD.
 * Najťahší mód/level tejto hry.
 */
public class Hard extends Modes {

    public Hard() {
        super(12, new Color(0, 0, 0), new Color(90, 3, 3), new Color(38, 51, 138), new Color(3, 74, 29), new Color(152, 73, 13) );
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
}

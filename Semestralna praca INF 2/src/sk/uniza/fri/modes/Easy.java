package sk.uniza.fri.modes;

import java.awt.Color;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Potomok triedy Modes ktorá vytvára mód EASY.
 * Najľahší mód/level tejto hry.
 */
public class Easy extends Modes {
    public Easy () {
        super(5, new Color(0, 111, 7), Color.WHITE, new Color(0, 188, 255), new Color(10, 156, 10), Color.ORANGE );
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

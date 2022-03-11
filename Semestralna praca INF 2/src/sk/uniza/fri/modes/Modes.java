package sk.uniza.fri.modes;

import java.awt.Color;


/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Predok Modes je trieda kde sa vytvára mód hry podľa obtiažnosti ktorú určuje rýchlosť a každý level je odlišný aj farbami krajiny a vtáčika.
 * Trieda Modes je abstraktná pretože nieje dôvod vytvárať inštanciu tejto triedy,
 * keďže bude slúžiť ako "továreň" na ostatné triedy ktoré ju budú dediť.
 */
public abstract class Modes {
    private int speed;
    private Color tubesColor;
    private Color cloudsColor;
    private Color backgroundColor;
    private Color grassColor;
    private Color groundColor;


    public Modes(int speed, Color tubesColor, Color cloudColor, Color backgroundColor, Color grassColor, Color groundColor) {
        this.speed = speed;
        this.tubesColor = tubesColor;
        this.cloudsColor = cloudColor;
        this.backgroundColor = backgroundColor;
        this.grassColor = grassColor;
        this.groundColor = groundColor;

    }



    public Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public Color getGrassColor() {
        return this.grassColor;
    }

    public Color getGroundColor() {
        return this.groundColor;
    }

    public Color getTubesColor() {
        return this.tubesColor;
    }

    public Color getCloudsColor() {
        return this.cloudsColor;
    }

    public int getSpeed() {
        return this.speed;
    }


}


package sk.uniza.fri.comments;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Trieda Comments pomocou Graphics vytvára základny pokyn pre hru ktorý sa zobrazí na začiatku hry a na konci.
 */
public class Comments {
    public Comments() {

    }

    public void startComment(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Arial", 1, 50));
        g.drawString("PRESS SPACE TO PLAY", 100, 150);

    }

    public void endComment(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Arial", 1, 100));
        g.drawString("GAME OVER", 100, 300);
    }
}

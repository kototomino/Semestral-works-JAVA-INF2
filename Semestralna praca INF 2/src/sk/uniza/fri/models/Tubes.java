package sk.uniza.fri.models;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Trieda Tubes kde sa vytvárajú dané prekážky čo sú vlastne rúry ktoré zobrazujem ako rectangle s danou farbou
 */
public class Tubes {
    private final ArrayList<Rectangle> tubes;
    private final int width = 800;
    private final int height = 800;

    public Tubes() {
        this.tubes = new ArrayList<>();

    }

    public void addTube(boolean start) {
        Random rand = new Random();

        int space = 300;
        int wid = 100;
        int hei = 50 + rand.nextInt(300);

        if (start) {

            this.tubes.add(new Rectangle(this.width + wid + this.tubes.size() * 300, this.height - hei - 150, wid, hei));
            this.tubes.add(new Rectangle(this.width + wid + (this.tubes.size() - 1) * 300, 0, wid, this.height - hei - space));

        } else {
            this.tubes.add(new Rectangle(this.tubes.get(this.tubes.size() - 1).x + 600, this.height - hei - 150, wid, hei));
            this.tubes.add(new Rectangle(this.tubes.get(this.tubes.size() - 1).x, 0, wid, this.height - hei - space));
        }


    }

    public void paintTube(Graphics g, Rectangle tube, Color tubesColor) {
        g.setColor(tubesColor);
        g.fillRect(tube.x, tube.y, tube.width, tube.height);

    }
    /**
     @return
     */
    public ArrayList<Rectangle> getTubes() {
        return this.tubes;
    }
}



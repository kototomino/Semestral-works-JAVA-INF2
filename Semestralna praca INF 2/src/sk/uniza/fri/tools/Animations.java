package sk.uniza.fri.tools;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Trieda Animations vytvára celkové animácie v hre pomocou updatovania image-ov ktoré pôjdu za sebou.
 */
public class Animations {

    private ArrayList<BufferedImage> images;
    private long past;
    private int time;
    private int index;

    public Animations(int time) {
        this.index = 0;
        this.time = time;
        this.images = new ArrayList<>();
        this.past = 0;
    }

    public void update() {
        if (System.currentTimeMillis() - this.past > this.time) {
            this.index++;
            if (this.index >= this.images.size()) {
                this.index = 0;
            }
            this.past = System.currentTimeMillis();
        }
    }

    public void addImage(BufferedImage image) {
        this.images.add(image);
    }

    public BufferedImage getImage() {
        if (this.images.size() > 0) {
            return this.images.get(this.index);
        }
        return null;
    }

}
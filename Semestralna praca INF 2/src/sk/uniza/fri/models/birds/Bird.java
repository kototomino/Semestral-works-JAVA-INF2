package sk.uniza.fri.models.birds;

import java.awt.Rectangle;


/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Trieda kde sa vytvára hlavná postava hry flappy bird čiže vtáčik.
 * V tejto triede sa vytvára len jeho vnútorná forma čiže rectangle so súradnicami.
 * Trieda Bird je predkom ostatných tried kde sa vytvára už vizuálna časť vtáčika.
 * Gettermi si vraciam potrebné súradnice k ďaľším postupom v hre.
 *
 */
public class Bird  {

    private final int x;
    private final int y;
    private final Rectangle rect;

    public Bird() {

        this.x = 390;
        this.y = 390;
        this.rect = new Rectangle(this.x, this.y, 30, 20);

    }
    public int getWidth() {
        return this.rect.width;
    }

    public int getHeight() {
        return this.rect.height;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

}

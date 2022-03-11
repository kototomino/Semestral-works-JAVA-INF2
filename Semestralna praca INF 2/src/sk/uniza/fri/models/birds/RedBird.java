package sk.uniza.fri.models.birds;

import sk.uniza.fri.tools.Animations;
import sk.uniza.fri.tools.Buffer;
import sk.uniza.fri.tools.IJumpAnimations;

import java.awt.image.BufferedImage;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Potomok triedy Bird
 * Red Bird slúži na reprezentáciu červeného vtáčika v móde hry HARD.
 * Pomocou triedy Animations a Buffer vytváram celý image komplex vtáčika.
 *
 */
public class RedBird extends Bird implements IJumpAnimations {
    private final Animations redJump;

    public RedBird() {
        super();

        this.redJump = new Animations(85);

        this.redJump.addImage(Buffer.getImage("Semestralna praca INF 2\\src\\sk\\uniza\\fri\\images\\redbird-downflap.png"));
        this.redJump.addImage(Buffer.getImage("Semestralna praca INF 2\\src\\sk\\uniza\\fri\\images\\redbird-midflap.png"));
        this.redJump.addImage(Buffer.getImage("Semestralna praca INF 2\\src\\sk\\uniza\\fri\\images\\redbird-upflap.png"));
    }
    /**
     @return
     */
    @Override
    public BufferedImage getJumpImages() {
        return this.redJump.getImage();
    }

    @Override
    public void updateJumps() {
        this.redJump.update();

    }
    /**
     @return
     */
    @Override
    public int getWidth() {
        return super.getWidth();
    }
    /**
     @return
     */
    @Override
    public int getHeight() {
        return super.getHeight();
    }
    /**
     @return
     */
    @Override
    public int getX() {
        return super.getX();
    }
    /**
     @return
     */
    @Override
    public int getY() {
        return super.getY();
    }
}

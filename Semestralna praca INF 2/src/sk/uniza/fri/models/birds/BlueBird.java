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
 * Blue Bird slúži na reprezentáciu modrého vtáčika v móde hry MEDIUM
 * Pomocou triedy Animations a Buffer vytváram celý image komplex vtáčika.
 *
 */
public class BlueBird extends Bird implements IJumpAnimations {
    private final Animations blueJump;

    public BlueBird() {
        super();

        this.blueJump = new Animations(85);

        this.blueJump.addImage(Buffer.getImage("Semestralna praca INF 2\\src\\sk\\uniza\\fri\\images\\bluebird-downflap.png"));
        this.blueJump.addImage(Buffer.getImage("Semestralna praca INF 2\\src\\sk\\uniza\\fri\\images\\bluebird-midflap.png"));
        this.blueJump.addImage(Buffer.getImage("Semestralna praca INF 2\\src\\sk\\uniza\\fri\\images\\bluebird-upflap.png"));
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

    @Override
    /**
    @return
     */
    public BufferedImage getJumpImages() {
        return this.blueJump.getImage();
    }

    @Override
    public void updateJumps() {
        this.blueJump.update();

    }
}

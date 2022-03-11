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
 * Yellow Bird slúži na reprezentáciu žltého vtáčika v móde hry EASY.
 * Pomocou triedy Animations a Buffer vytváram celý image komplex vtáčika.
 */
public class YellowBird extends Bird implements IJumpAnimations {
    private final Animations yellowJump;

    public YellowBird() {
        super();

        this.yellowJump = new Animations(85);

        this.yellowJump.addImage(Buffer.getImage("src\\sk\\uniza\\fri\\images\\yellowbird-downflap.png"));
        this.yellowJump.addImage(Buffer.getImage("src\\sk\\uniza\\fri\\images\\yellowbird-midflap.png"));
        this.yellowJump.addImage(Buffer.getImage("src\\sk\\uniza\\fri\\images\\yellowbird-upflap.png"));
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
    /**
     @return
     */
    @Override
    public BufferedImage getJumpImages() {
        return this.yellowJump.getImage();
    }

    @Override
    public void updateJumps() {
        this.yellowJump.update();

    }
}

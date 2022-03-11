package sk.uniza.fri.logics;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Component;
import java.awt.GridLayout;


/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Jednoduchá trieda na vytvorenie základného obrazu pre hru alebo dané menu pomocou JFrame.
 */
public class Frame {
    private JFrame frame;

    public Frame() {
        this.frame = new JFrame("FlappyBird");
        this.frame.setResizable(false);
        this.frame.setBounds(350, 30, 800, 800);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public Frame(String type) {
        this.frame = new JFrame("Menu");
        switch (type) {
            case "menu" :
                this.frame.setResizable(false);
                GridLayout layout = new GridLayout(1, 4);
                this.frame.setLayout(layout);
                this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                this.frame.setResizable(false);
                this.frame.setSize(900, 320);
                break;
            case "credits" :
                this.frame.setTitle("Credits");
                this.frame.setResizable(false);
                this.frame.setBounds(350, 250, 800, 400);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public void add(Component comp) {
        this.frame.add(comp);
    }

    public void setVisible(boolean factor) {
        if (factor) {
            this.frame.setVisible(true);
        } else {
            this.frame.setVisible(false);
        }
    }

    public JFrame getFrame() {
        return this.frame;
    }
}

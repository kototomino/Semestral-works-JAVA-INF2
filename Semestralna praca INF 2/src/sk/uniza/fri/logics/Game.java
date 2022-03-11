package sk.uniza.fri.logics;

import sk.uniza.fri.comments.Comments;
import sk.uniza.fri.models.Tubes;
import sk.uniza.fri.models.birds.Bird;
import sk.uniza.fri.models.birds.BlueBird;
import sk.uniza.fri.models.birds.RedBird;
import sk.uniza.fri.models.birds.YellowBird;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Trieda Game je celé jadro hry vytvára sa tu celá hra pomocou volania ostatných tried ktoré som vytvoril.
 * Do svojich atribútov nahráva potrebné informácie k ďaľšiemu postupu.
 * Podľa daného módu vybere postavu - vtáčika a dané farby krajiny a objektov.
 * V tejto triede sa rieši aj logika hry čiže detekovanie kolízie skákanie cez objekty a updatovanie animácii.
 */
public class Game extends JPanel implements ActionListener, KeyListener  {

    private final Comments comms;
    private final YellowBird yellowBird;
    private final RedBird redBird;
    private final BlueBird blueBird;
    private final Bird bird;
    private final Tubes tubes;

    private int ticks;
    private int score;

    private boolean started;
    private boolean gameOver;
    private final int width = 800;
    private final int height = 800;
    private final int speed;

    private final Color tubesColor;
    private final Color cloudsColor;
    private final Color backgroundColor;
    private final Color grassColor;
    private final Color groundColor;
    private int velY;
    private String mode;
    private Timer timer;


    private Rectangle birdRec;


    public Game(int speed, Color tubesColor, Color cloudsColor, Color backgroundColor, Color grassColor, Color groundColor, String mode) {
        this.mode = mode;

        this.speed = speed;
        this.tubesColor = tubesColor;
        this.cloudsColor = cloudsColor;
        this.backgroundColor = backgroundColor;
        this.grassColor = grassColor;
        this.groundColor = groundColor;

        this.comms = new Comments();
        this.timer = new Timer(20, this);

        this.addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);

        this.bird = new Bird();
        this.yellowBird = new YellowBird();
        this.blueBird = new BlueBird();
        this.redBird = new RedBird();



        switch (this.mode) {
            case "easy" :
                this.birdRec = new Rectangle(this.yellowBird.getX(), this.yellowBird.getY(), this.yellowBird.getWidth(), this.yellowBird.getHeight());
                break;
            case "medium" :
                this.birdRec = new Rectangle(this.blueBird.getX(), this.blueBird.getY(), this.blueBird.getWidth(), this.blueBird.getHeight());
                break;
            case "hard" :
                this.birdRec = new Rectangle(this.redBird.getX(), this.redBird.getY(), this.redBird.getWidth(), this.redBird.getHeight());
                break;
            default :
        }

        this.tubes = new Tubes();

        this.tubes.addTube(true);
        this.tubes.addTube(true);
        this.tubes.addTube(true);
        this.tubes.addTube(true);
        this.timer.start();



    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(this.backgroundColor);

        Graphics2D g2D = (Graphics2D)g;

        g2D.setColor(this.cloudsColor);
        g2D.fillOval(40, 40, 50, 50);
        g2D.fillOval(60, 35, 60, 60);
        g2D.fillOval(90, 40, 50, 50);

        g2D.fillOval(350, 50, 50, 50);
        g2D.fillOval(370, 45, 60, 60);
        g2D.fillOval(400, 50, 50, 50);

        g2D.fillOval(600, 40, 50, 50);
        g2D.fillOval(620, 35, 60, 60);
        g2D.fillOval(650, 40, 50, 50);

        g2D.setColor(this.groundColor);
        g2D.fillRect(0, this.height - 150, this.width, 150);
        g2D.setColor(this.grassColor);
        g2D.fillRect(0, this.height - 150, this.width, 20);

        switch (this.mode) {
            case "easy" :
                g2D.drawImage(this.yellowBird.getJumpImages(), this.birdRec.x, this.birdRec.y, this.birdRec.width, this.birdRec.height, null);
//                g2D.drawImage(this.bird.getDiscoJumpImages(), this.birdRec.x, this.birdRec.y, this.birdRec.width, this.birdRec.height, null);
                break;
            case "medium" :
                g2D.drawImage(this.blueBird.getJumpImages(), this.birdRec.x, this.birdRec.y, this.birdRec.width, this.birdRec.height, null);
                break;
            case "hard" :
                g2D.drawImage(this.redBird.getJumpImages(), this.birdRec.x, this.birdRec.y, this.birdRec.width, this.birdRec.height, null);
                break;
            default :
        }




        this.tubes.addTube(true);


        for (Rectangle tub : this.tubes.getTubes()) {
            this.tubes.paintTube(g, tub, this.tubesColor);
        }


        if (!this.started) {

            this.comms.startComment(g2D);
        }
        if (!this.gameOver && this.started) {

            g2D.setColor(Color.white);
            g.setFont(new Font("TimesRoman", Font.BOLD, 54));
            g2D.drawString(String.valueOf(this.score), this.width / 2 - 200 , 150);

        }

    }

    public void jump() {
        if (this.gameOver) {

            this.birdRec = new Rectangle (this.bird.getX(), this.bird.getY(), this.bird.getWidth(), this.bird.getHeight());
            this.tubes.getTubes().clear();
            this.velY = 0;

            this.tubes.addTube(true);
            this.tubes.addTube(true);
            this.tubes.addTube(true);
            this.tubes.addTube(true);

            this.gameOver = false;

        }
        if (!this.started) {
            this.started = true;

        } else {
            if (this.velY > 0) {

                this.velY = 0;
            }

            this.velY -= 10;

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.ticks++;

        if (this.started) {
            for (int i = 0; i < this.tubes.getTubes().size(); i++) {
                Rectangle column = this.tubes.getTubes().get(i);
                column.x -= this.speed;

            }
            if (this.ticks % 2 == 0 && this.velY < 25) {
                this.velY += 2;
            }

            for (int i = 0; i < this.tubes.getTubes().size(); i++) {
                Rectangle column = this.tubes.getTubes().get(i);
                if (column.x + column.width < 0) {
                    this.tubes.getTubes().remove(column);
                    if (column.y == 0) {
                        this.tubes.addTube(false);
                    }
                }
            }

            this.birdRec.y += this.velY;

            for (Rectangle column : this.tubes.getTubes()) {
                if (column.y == 0 && this.birdRec.x + this.birdRec.width / 2 > column.x + column.width / 2 - (this.speed / 2 + 1) && this.birdRec.x + this.birdRec.width / 2 < column.x + column.width / 2 + (this.speed / 2 + 1)) {
                    this.score++;
                }

                if (column.intersects(this.birdRec)) {
                    this.gameOver = true;

                }
            }
            if (this.birdRec.y > this.height - 150 || this.birdRec.y < 0) {
                this.gameOver = true;

            }

            if (this.gameOver) {
                this.comms.endComment(this.getGraphics());
                ImageIcon icon = new ImageIcon("src\\sk\\uniza\\fri\\images\\yellowbird-midflap.png");
                int choice = JOptionPane.showConfirmDialog(null, " YOUR SCORE WAS " + this.score + "\n RESTART ?",  "CHOOSE AN OPTION !", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
                if (choice == 0) {
                    this.timer.restart();
                    this.jump();
                    this.score = 0;

                } else {

                    JOptionPane.showMessageDialog(null, " THANK YOU FOR PLAYING THE GAME , BYE !", "CY@" , JOptionPane.QUESTION_MESSAGE, icon);
                    System.exit(0);
                }

            }
            if (this.birdRec.y + this.velY >= this.height - 150) {
                this.birdRec.y = this.height - 150 - this.birdRec.height;
            }

        }

        this.repaint();

    }



    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {

    }


    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            switch (this.mode) {
                case "easy" :
                    //this.bird.updateDiscoJump();
                    this.yellowBird.updateJumps();
                    break;
                case "medium" :
                    this.blueBird.updateJumps();
                    break;
                case "hard" :
                    this.redBird.updateJumps();
                    break;
                default :
            }

            this.jump();
        }
    }

}

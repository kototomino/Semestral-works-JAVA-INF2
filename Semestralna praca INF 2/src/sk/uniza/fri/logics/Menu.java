package sk.uniza.fri.logics;



import sk.uniza.fri.comments.Credits;
import sk.uniza.fri.modes.Easy;
import sk.uniza.fri.modes.Hard;
import sk.uniza.fri.modes.Medium;
import sk.uniza.fri.modes.Modes;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Font;



/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Trieda Menu ktorá všetko začína.
 * Pomocou triedy Frame vytvára GUI prostredie kde sa dá postupne vyberať z daných levelov.
 * Po kliknutí daného JButton-u sa uskutoční daná akcia ktorá mu je priradená.
 * JButton-y sú nastavené na levely EASY MEDIUM HARD a je tam aj JButton na informácie.
 */

public class Menu {


    public Menu() {
        JFrame start = new JFrame("Welcome to the Game !!!");
        ImageIcon startImage = new ImageIcon("src\\sk\\uniza\\fri\\images\\start.jpg");
        JLabel startLabel = new JLabel(startImage);
        start.setBounds(400, 100, 728, 450);
        start.setResizable(false);
        start.add(startLabel);
        start.setVisible(true);
        start.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(null, "WELCOME TO THE GAME :)\nCHOOSE A MODE U WANT TO SHRED!\nCREATED BY : TOMAS KOTRIK");
        start.dispose();

        Frame menu = new Frame("menu");


        ImageIcon iconEasy = new ImageIcon("src\\sk\\uniza\\fri\\images\\easy.png");
        ImageIcon iconMedium = new ImageIcon("src\\sk\\uniza\\fri\\images\\medium.png");
        ImageIcon iconHard = new ImageIcon("src\\sk\\uniza\\fri\\images\\hard.png");
        ImageIcon iconCredits = new ImageIcon("src\\sk\\uniza\\fri\\images\\info.png");

        JButton buttonEasy = new JButton("EASY", iconEasy);
        buttonEasy.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonEasy.setFont(new Font(Font.MONOSPACED, 25, 50));
        buttonEasy.setForeground(Color.WHITE);

        JButton buttonMedium = new JButton("MEDIUM", iconMedium);
        buttonMedium.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonMedium.setFont(new Font(Font.MONOSPACED, 25, 50));
        buttonMedium.setForeground(Color.WHITE);

        JButton buttonHard = new JButton("HARD", iconHard);
        buttonHard.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonHard.setFont(new Font(Font.MONOSPACED, 25, 50));
        buttonHard.setForeground(Color.WHITE);

        JButton buttonCredits = new JButton("", iconCredits);
        buttonCredits.setFont(new Font(Font.MONOSPACED, 25, 50));
        buttonCredits.setForeground(Color.WHITE);

        menu.add(buttonEasy);
        menu.add(buttonMedium);
        menu.add(buttonHard);
        menu.add(buttonCredits);
        menu.setVisible(true);


        buttonEasy.addActionListener(e -> {

            Modes easy = new Easy();
            Frame frame = new Frame();
            Game game = new Game(easy.getSpeed(), easy.getTubesColor(), easy.getCloudsColor(), easy.getBackgroundColor(), easy.getGrassColor(), easy.getGroundColor(), "easy");
            frame.add(game);
            frame.setVisible(true);
            menu.setVisible(false);


        });

        buttonMedium.addActionListener(e -> {
            Modes medium = new Medium();
            Frame frame = new Frame();
            Game game = new Game(medium.getSpeed(), medium.getTubesColor(), medium.getCloudsColor(), medium.getBackgroundColor(), medium.getGrassColor(), medium.getGroundColor(), "medium");
            frame.add(game);
            frame.setVisible(true);
            menu.setVisible(false);


        });

        buttonHard.addActionListener(e -> {
            Modes hard = new Hard();
            Frame frame = new Frame();
            Game game = new Game(hard.getSpeed(), hard.getTubesColor(), hard.getCloudsColor(), hard.getBackgroundColor(), hard.getGrassColor(), hard.getGroundColor(), "hard");
            frame.add(game);
            frame.setVisible(true);
            menu.setVisible(false);

        });

        buttonCredits.addActionListener(e -> {
            Credits credits = new Credits("credits.txt");
            Frame frame = new Frame("credits");
            JTextArea text = new JTextArea();
            text.setText(credits.getCredits());
            text.setFont(new Font(Font.MONOSPACED, 45, 20));
            text.setEditable(false);
            text.setBackground(new Color(0x48D44F));
            frame.add(text);
            frame.setVisible(true);

        });
    }




}

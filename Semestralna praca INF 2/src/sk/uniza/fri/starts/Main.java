package sk.uniza.fri.starts;


import sk.uniza.fri.logics.Menu;

/**
 * Created by IntelliJ IDEA.
 * @author Tomáš Kotrík
 * Date: 29/03/2021
 * Time: 6:15 pm
 * Trieda Main ktorá spúšťa celú hru.
 */
public class Main {

    public static void main(String[] args) {
        new Menu();

        String filepath = "src\\sk\\uniza\\fri\\music\\music.wav";
        Music music = new Music();
        music.playMusic(filepath);





    }



}

package sk.uniza.fri.starts;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.io.File;

/**
 * 29/03/2021 - 6:15 pm
 *
 * @author Tomáš Kotrík
 * Trieda Music dodáva hre originalitu v pojme hudby aby nebolo ticho a nuda.
 */
public class Music {

    public void playMusic (String musicLocation) {

        try {
            File musicPath = new File(musicLocation);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

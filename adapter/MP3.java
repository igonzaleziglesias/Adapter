/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Usuario
 */

public class MP3 implements MediaPlayer {
    //implementa la interfaz mediaplayer
    @Override
    public void play(String filename) {//definimos metodo play
        System.out.println("Playing MP3 File " + filename);//sacamos por pantalla
    }
}

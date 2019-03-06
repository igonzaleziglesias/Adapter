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
public class MP4 implements MediaPackage {
    //implementa la interfaz mediapakage
    @Override
    public void playFile(String filename) { //definimos el metodo play
        System.out.println("Playing MP4 File " + filename);//sacamos por pantalla
    }
}

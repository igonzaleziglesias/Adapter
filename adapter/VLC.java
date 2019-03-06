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
public class VLC implements MediaPackage{
    //implementa la interfaz mediapakage
    @Override
    public void playFile(String filename) {//definimos metodo play
        System.out.println("Playing VLC File " + filename);//sacamos por pantalla
    }
}

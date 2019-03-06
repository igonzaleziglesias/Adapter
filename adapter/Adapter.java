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
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MediaPlayer player = new MP3();//instanciamos mp3
        player.play("file.mp3");//sacamos por pantalla
        player = new FormatAdapter(new MP4());//instanciamos mp4 con el adapter
        player.play("file.mp4");//mostramos por pantalla con el play del adapter
        player = new FormatAdapter(new VLC());//instanciamos vlc con el adapter
        player.play("file.avi");//mostramos por pantalla con el play del adapter
    }

    private static class FormatAdapter implements MediaPlayer {

        private MediaPackage media; //instanciamos un mediapackage

        public FormatAdapter(MediaPackage m) {
            media = m;//asignamos el valor a nuestra variable del parametro
        }

        @Override
        public void play(String filename) {//definimos el metodo play adaptado para usar los metodos playfile
            //ya definidos en las clases del paquete cuando usemos el adapter
            System.out.print("Using Adapter --> ");
            media.playFile(filename);//llamamos al metodo playfile para mostrar por pantalla
        }
    }

}

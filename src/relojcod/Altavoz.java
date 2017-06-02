
package relojcod;

/**
 *
 * @author Brais Núñez
 */
public class Altavoz {
    
    /**
     * Contiene el sonido que suena en el altavoz.
     */

    private String melodia;

    /**
     * Cuando está en true suena el altavoz, false no suena.
     */

    static private boolean ringON;

    /**
     * Hace que deje de sonar el despertador.
     */

        public static void stopSound(){

            ringON=false;
            System.out.println("Alarma parada");

}
    /**
     * Hace sonar el despertador.
     */

    static public void playSound(){

        ringON=true;
        System.out.println("Sonando musica");
    }
    
}

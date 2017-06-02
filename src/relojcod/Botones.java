
package relojcod;

/**
 *
 * @author Brais Núñez
 */
public class Botones {
    
    /**
     * Hace sonar la alarma.
     */

    static public void alarmON() {
        
        Display.showAlarm();
        Display.showLED(true, false, false);

    }
    
    /**
     * Apaga la alarma.
     */

    static public void alarmOFF() {

        Display.showLED(false, false, false);
    }
    
    
    /**
     * Entra en el modo para configurar la hora.
     */
    
    static public void configHora() {

        Display.showLED(true, false, true);
        
    }

    /**
     * Entra en el modo para configurar la alarma.
     */

    static public void configAlarm() {

        Display.showLED(false, true, true);

    }
    
    /**
     * Aumenta en una unidad la hora.
     */

    static public void plusHours() {

        if (Display.ledSet == true) {

            if (Display.ledClock == true) {

                RelojCOD.currentHour = RelojCOD.currentHour.plusHours(1);

                Display.showHR();

            } else {

                RelojCOD.alarma = RelojCOD.alarma.plusHours(1);

                Display.showAlarm();
            }
        }
    }

    /**
     * Aumenta en una unidad los minutos.
     */

    static public void plusMinutes() {

        if (Display.ledSet == true) {

            if (Display.ledClock == true) {

                RelojCOD.currentHour = RelojCOD.currentHour.plusMinutes(1);
                Display.showHR();

            } else {

                RelojCOD.alarma = RelojCOD.alarma.plusMinutes(1);
                Display.showAlarm();
            }
        }
    }

    /**
     * Hace que la alarma deje de sonar.
     */

    public void stopAlarma() {

        Altavoz.stopSound();

    }    
}

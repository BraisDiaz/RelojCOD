
package relojcod;

import java.time.LocalTime;

/**
 *
 * @author Brais Núñez
 */
public class Display {
    
    /**
     * Contiene métodos para el manejo de los leds.
     */

    static boolean ledClock, ledSet, ledAlarm;

    /**
     * Muestra por consola la hora actual.
     */

    static public void showHR() {

        LocalTime lt = LocalTime.now();

        lt = lt.plusHours(RelojCOD.currentHour.getHour())

                .plusMinutes(RelojCOD.currentHour.getMinute());

        System.out.println(lt.getHour() + " : " + lt.getMinute());

    }

    /**
     * Muestra un mensaje por consola cuando suena la alarma.
     */

    static public void showAlarm() {

        System.out.println(RelojCOD.alarma.getHour()+" : "+RelojCOD.alarma.getMinute());
        
    }

    /**
     * Maneja el estado de los led.
     *
     * @param showClock recibe el estado actual de la ledClock
     * @param showAlarm recibe el estado actual de ledAlarm
     * @param showSet recibe el estado actual de ledSet
     */

    static public void showLED(boolean showClock, boolean showAlarm, boolean showSet) {
        
        ledClock = showClock;
        ledAlarm = showAlarm;
        ledSet = showSet;
    }
}

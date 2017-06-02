
package relojcod;

import java.awt.HeadlessException;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class RelojCOD {
       
         static public LocalTime alarma = LocalTime.MIDNIGHT;
         static public LocalTime currentHour = LocalTime.MIDNIGHT;

    public static void main(String[] args) {

        Timer timer = new Timer();

        Botones.alarmOFF();

        TimerTask tk = new TimerTask() {
        @Override
        
        public void run() {

                LocalTime lt = LocalTime.now();

                lt = lt.plusHours(RelojCOD.currentHour.getHour())
                .plusMinutes(RelojCOD.currentHour.getMinute());

                if (lt == alarma) {

                    Altavoz.playSound();
                    System.out.println("Alarma sonando!!!");
                }
            }
        };

        timer.schedule(tk, 10, 10000);

        int opcion;

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción\n1)Mostrar Hora Actual\n2)MostrarAlarma\n3) Configurar Reloj\n4) Configurar Alarma\n5)Aumentar hora\n6)Aumentar minutos\n0)Salir"));

            } catch (HeadlessException | NumberFormatException ex) {

                opcion = -1;

            }

            switch (opcion) {

                case 1:

                    Display.showHR();

                    break;

                case 2:

                    Display.showAlarm();

                    break;

                case 3:

                    Botones.configHora();

                    break;

                case 4:

                    Botones.configAlarm();

                    break;

                case 5:

                    Botones.plusHours();

                    break;

                case 6:

                    Botones.plusMinutes();

                    break;

                case 0:

                    JOptionPane.showMessageDialog(null, "Ha decidido salir");

                    break;



                default:

                    JOptionPane.showMessageDialog(null, "Seleccion errónea");

            }

        } while (opcion != 0);

        timer.cancel();

    }
        
    }
    

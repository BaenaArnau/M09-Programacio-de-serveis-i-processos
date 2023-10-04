import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ludopatia {
    public static void main(String[] args) throws InterruptedException {
        Jugador emilioR = new Jugador("EmilioR");
        Jugador ruben = new Jugador("Ruben");
        DarPuntos darPuntosEmilioR = new DarPuntos(emilioR);
        DarPuntos darPuntosRuben = new DarPuntos(ruben);
        MonitorJugador monitorEmilioR = new MonitorJugador(emilioR);
        MonitorJugador monitorRuben = new MonitorJugador(ruben);

        ScheduledExecutorService schExService = Executors.newScheduledThreadPool(4);
        schExService.scheduleWithFixedDelay(darPuntosEmilioR,4,9, TimeUnit.SECONDS);
        schExService.scheduleWithFixedDelay(darPuntosRuben,15,2,TimeUnit.SECONDS);
        schExService.scheduleWithFixedDelay(monitorEmilioR,1,10,TimeUnit.SECONDS);
        schExService.scheduleWithFixedDelay(monitorRuben,1,10,TimeUnit.SECONDS);

        schExService.awaitTermination(60, TimeUnit.SECONDS);
        schExService.shutdownNow();

        System.out.println(emilioR.toString());
        System.out.println(ruben.toString());
    }
}

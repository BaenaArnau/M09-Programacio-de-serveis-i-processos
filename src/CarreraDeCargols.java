import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CarreraDeCargols {
    public static void main(String[] args) {
        Cargol treubañas = new Cargol("treubañas");
        Cargol petit = new Cargol("Petit");

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.scheduleWithFixedDelay(treubañas,2,4, TimeUnit.SECONDS);

    }
}

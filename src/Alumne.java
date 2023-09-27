import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Alumne implements Callable<Integer> {
    private String nombre;


    public Integer call() throws InterruptedException, ExecutionException{
        List<Alumne> alumneList = new ArrayList<>();
        return (int)(Math.random() * 10 + 1);
    }

    public Alumne(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
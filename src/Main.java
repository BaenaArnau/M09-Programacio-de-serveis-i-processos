import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        try {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        List<Alumne> alumneList = new ArrayList<>();
        //hola
        for (int i = 0; i < 20; i++){
            Alumne crear = new Alumne((String) "alumno"+(i+1));
            alumneList.add(crear);
        }
        List<Future<Integer>> resultadosList;
        resultadosList = executor.invokeAll(alumneList);

        executor.shutdown();
        for (int i = 0; i < resultadosList.size(); i++){
            Future<Integer> notas = resultadosList.get(i);
            try {
                System.out.println("Nota de " + alumneList.get(i).getNombre() + " = " + notas.get());
            }catch (InterruptedException | ExecutionException e){
            }
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

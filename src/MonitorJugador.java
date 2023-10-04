public class MonitorJugador implements Runnable{
    private Jugador jugador;

    public MonitorJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void run() {
        System.out.printf("%s tiene %d puntos%n", jugador.getNombre(), jugador.getPuntos());
    }
}

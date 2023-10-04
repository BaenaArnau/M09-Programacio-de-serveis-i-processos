public class DarPuntos implements Runnable{
    private Jugador jugador;

    public DarPuntos(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void run() {
        jugador.setPuntos(jugador.getPuntos() + ((int) (Math.random() * 50)));
    }
}

public class Jugador{
    private String nombre;
    private int puntos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "La puntuacion maxima de " + nombre + " = " +puntos;
    }
}

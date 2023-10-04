public class Cargol implements Runnable{
    String nom;
    int metros;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public Cargol(String nom) {
        this.nom = nom;
    }

    public void run(){
        metros = metros + (int)(Math.random() * 50);
        System.out.printf("%s lleva %d metros%n",this.nom,this.metros);
    }
}

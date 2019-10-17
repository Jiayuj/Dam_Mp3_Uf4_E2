import java.util.Arrays;
import java.util.Random;

public class Jugador {

    int clau;
    String nom;

    String[] noms ={"QQ","WW","EE","RR","TT","AA","SS","DD","FF","GG"};


    public String getNom() {
        return nom;
    }

    public void setNom() {
        this.nom = noms[new Random().nextInt(noms.length)];
    }

    public int getClau() {
        return clau;
    }

    public void setClau(int clau) {
        this.clau = clau;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "clau=" + clau +
                ", nom='" + nom + '\'' +
                ", noms=" + Arrays.toString(noms) +
                '}';
    }
}

import java.util.Objects;

public class Llapis implements Comparable<Llapis> {

    int color;
    int gruix;


    @Override
    public String toString() {
        return "Llapis{" +
                "color=" + color +
                ", gruix=" + gruix +
                '}'+"\n";
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setGruix(int gruix) {
        this.gruix = gruix;
    }

    public int getColor() {
        return color;
    }

    public int getGruix() {
        return gruix;
    }

    @Override
    public int compareTo(Llapis o) {
        return this.color-o.getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Llapis llapis = (Llapis) o;
        return color == llapis.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

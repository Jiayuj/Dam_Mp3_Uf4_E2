import java.util.Comparator;

public class LlapissosCompartor implements Comparator<Llapis> {

    @Override
    public int compare(Llapis llapis, Llapis t1) {
        return llapis.getGruix()-t1.getGruix();
    }
}

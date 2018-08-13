import java.util.Comparator;

public class RamComparator implements Comparator<Komputer> {
    @Override
    public int compare(Komputer k1, Komputer k2) {
        return Double.compare(k1.getRam(),k2.getRam());
    }
}

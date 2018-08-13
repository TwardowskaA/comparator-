import java.util.Comparator;

public class CpuComparator implements Comparator<Komputer> {

    @Override
    public int compare(Komputer k1, Komputer k2) {
        return Double.compare(k1.getCpu(),k2.getCpu());
    }
}

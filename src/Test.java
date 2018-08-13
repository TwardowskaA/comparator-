import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        List<Komputer> komputery = new ArrayList<>();
        komputery.add(new Komputer("komp1", 70, 8));
        komputery.add(new Komputer("komp2", 20, 4));
        komputery.add(new Komputer("komp3", 50, 16));

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kryterium sortowania");
        String x = scan.nextLine();

        if (x.equals("cpu")) {
            komputery.sort(new CpuComparator());

        }else if (x.equals("ram")) {
            komputery.sort(new RamComparator());

        } else if (x.equals("nazwa")) {
            komputery.sort(Komputer::compareTo);
        }

        System.out.println(komputery);
    }
}


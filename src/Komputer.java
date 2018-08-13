public class Komputer implements Comparable<Komputer> {
    private String nazwa;
    private int cpu;
    private int ram;

    public Komputer(String nazwa, int cpu, int ram) {
        this.nazwa = nazwa;
        this.cpu = cpu;
        this.ram = ram;

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    @Override
    public int compareTo(Komputer k) {
        return this.nazwa.compareTo(k.nazwa);

    }

    @Override
    public String toString() {
        return "Komputer{" +
                "nazwa='" + nazwa + '\'' +
                ", cpu=" + cpu +
                ", ram=" + ram +
                '}';
    }
}

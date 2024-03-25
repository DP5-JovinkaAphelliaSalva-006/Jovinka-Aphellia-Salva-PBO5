package Todo1;

public class Anjing {
    // Properties
    private String nama;
    private int umur;
    private String warnamata;
    private String jenis;

    // Constructor
    public Anjing(String nama, int umur, String warnamata, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.warnamata = warnamata;
        this.jenis = jenis;
    }

    // Methods
    public void renang() {
        System.out.println(nama + " berenang.");
    }

    public void lari() {
        System.out.println(nama + " berlari.");
    }

    public void gigit() {
        System.out.println(nama + " menggigit.");
    }

    public void gonggong() {
        System.out.println(nama + " sedang menggonggong.");
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Warna: " + warnamata);
        System.out.println("Jenis: " + jenis);
    }
}

public abstract class ItemPerpustakaan {
    private String kode;
    private String judul;
    private boolean dipinjam;

    public ItemPerpustakaan(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
        this.dipinjam = false;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public boolean pinjam() {
        if (dipinjam) {
            return false;
        }
        dipinjam = true;
        return true;
    }

    public void kembalikan() {
        dipinjam = false;
    }

    public abstract int getLamaPinjam();

    public abstract double hitungDenda(int hariTerlambat);

    public String status() {
        if (dipinjam) {
            return "Dipinjam";
        } else {
            return "Tersedia";
        }
    }

    public void info() {
        System.out.println("[" + kode + "] " + judul + " (" + getClass().getSimpleName() + ")");
        System.out.println("   Status      : " + status());
        System.out.println("   Lama pinjam : " + getLamaPinjam() + " hari");
    }
}
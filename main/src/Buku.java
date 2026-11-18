public class Buku extends ItemPerpustakaan {
    private String pengarang;

    public Buku(String kode, String judul, String pengarang) {
        super(kode, judul);
        this.pengarang = pengarang;
    }

    public Buku(String kode, String judul) {
        this(kode, judul, "Anonim");
    }

    @Override
    public int getLamaPinjam() {
        return 7;
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        if (hariTerlambat > 0) {
            return hariTerlambat * 1000;
        } else {
            return 0;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("   Pengarang   : " + pengarang);
    }
}
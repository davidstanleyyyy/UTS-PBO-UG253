public class Majalah extends ItemPerpustakaan {
    private String edisi;

    public Majalah(String kode, String judul, String edisi) {
        super(kode, judul);
        this.edisi = edisi;
    }

    @Override
    public int getLamaPinjam() {
        return 3;
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        if (hariTerlambat > 0) {
            return hariTerlambat * 500;
        } else {
            return 0;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("   Edisi       : " + edisi);
    }
}
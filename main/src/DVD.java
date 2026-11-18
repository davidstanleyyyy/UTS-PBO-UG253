public class DVD extends ItemPerpustakaan {
    private int durasi;

    public DVD(String kode, String judul, int durasi) {
        super(kode, judul);
        this.durasi = durasi;
    }

    @Override
    public int getLamaPinjam() {
        return 2;
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        if (hariTerlambat > 0) {
            return hariTerlambat * 3000;
        } else {
            return 0;
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("   Durasi      : " + durasi + " menit");
    }
}
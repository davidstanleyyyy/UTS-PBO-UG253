import java.util.ArrayList;

public class Anggota {
    private String id;
    private String nama;
    private ArrayList<ItemPerpustakaan> daftarPinjam = new ArrayList<>();

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void pinjam(ItemPerpustakaan item) {
        if (item.pinjam()) {
            daftarPinjam.add(item);
            System.out.println(nama + " meminjam: " + item.getJudul());
        } else {
            System.out.println("Gagal: " + item.getJudul() + " sedang dipinjam");
        }
    }

    public void kembalikan(ItemPerpustakaan item, int hariTerlambat) {
        if (!daftarPinjam.contains(item)) {
            System.out.println("Gagal: " + nama + " tidak meminjam " + item.getJudul());
            return;
        }
        double denda = item.hitungDenda(hariTerlambat);
        item.kembalikan();
        daftarPinjam.remove(item);
        System.out.println(nama + " mengembalikan: " + item.getJudul()
                + " (terlambat " + hariTerlambat + " hari)");
        System.out.println("   Denda: Rp" + (int) denda);
    }
}
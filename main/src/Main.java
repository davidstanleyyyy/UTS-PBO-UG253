public class Main {
    public static void main(String[] args) {
        Buku b1 = new Buku("B001", "Pemrograman Java", "Budi Raharjo");
        Buku b2 = new Buku("B002", "Basis Data");
        Majalah m1 = new Majalah("M001", "Tech Monthly", "Oktober 2026");
        DVD d1 = new DVD("D001", "Dokumenter Teknologi", 90);

        ItemPerpustakaan[] koleksi = { b1, b2, m1, d1 };

        System.out.println("Koleksi Perpustakaan");
        for (ItemPerpustakaan item : koleksi) {
            item.info();
        }

        Anggota andi = new Anggota("A001", "Andi");
        Anggota budi = new Anggota("A002", "Budi");

        System.out.println("\nPeminjaman");
        andi.pinjam(b1);
        budi.pinjam(b1);
        andi.pinjam(d1);

        System.out.println("\nPengembalian");
        andi.kembalikan(b1, 3);
        andi.kembalikan(d1, 0);
        budi.kembalikan(m1, 0);

        System.out.println("\nPerbandingan Denda 5 Hari");
        for (ItemPerpustakaan item : koleksi) {
            System.out.println(item.getJudul() + " : Rp" + (int) item.hitungDenda(5));
        }
    }
}
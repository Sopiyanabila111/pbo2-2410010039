package id.ac.uniska.pbo2.p02;

/**
 * Skripsi hanya dapat dibaca di tempat, tidak dapat dipinjam.
 * batasHariPinjam() bernilai 0 dan pinjam() selalu mengembalikan false.
 * Denda selalu 0 karena Skripsi tidak pernah dalam status dipinjam.
 */
public class Skripsi extends Koleksi {

    private final String penulis;
    private final String programStudi;

    public Skripsi(String kode, String judul, int tahunTerbit, String penulis, String programStudi) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    @Override
    public int batasHariPinjam() {
        return 0;
    }

    /** Skripsi tidak pernah bisa dipinjam, apa pun statusnya. */
    @Override
    public boolean pinjam() {
        return false;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        return 0L;
    }

    @Override
    public String keterangan() {
        return "Skripsi oleh " + penulis + ", Prodi " + programStudi;
    }
}
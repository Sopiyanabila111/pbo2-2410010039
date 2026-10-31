/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07.mini.proyek;

/**
 *
 * @author ASUS
 */

import id.ac.uniska.pbo2.p07.mini.proyek.Buku;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModelTableBuku extends AbstractTableModel {

    private final String[] namaKolom = {
        "Kode", "Judul", "Penulis",
        "Tahun Terbit", "Status"
    };

    private final ArrayList<Buku> daftarBuku =
            new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftarBuku.size();
    }

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    @Override
    public String getColumnName(int column) {
        return namaKolom[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Buku buku = daftarBuku.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return buku.getKode();
            case 1:
                return buku.getJudul();
            case 2:
                return buku.getPenulis();
            case 3:
                return buku.getTahunTerbit();
            case 4:
                return buku.getStatus();
            default:
                return null;
        }
    }

    // Mengambil objek buku
    public Buku getBukuAt(int rowIndex) {
        return daftarBuku.get(rowIndex);
    }

    // Menambahkan buku
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        int baris = daftarBuku.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    // Mengubah buku
    public void ubahBuku(int rowIndex, Buku buku) {
        daftarBuku.set(rowIndex, buku);
        fireTableRowsUpdated(rowIndex, rowIndex);
    }

    // Menghapus buku
    public void hapusBuku(int rowIndex) {
        daftarBuku.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    // Jumlah buku
    public int getJumlahBuku() {
        return daftarBuku.size();
    }

    // Jumlah buku tersedia
    public int getJumlahTersedia() {
        int jumlah = 0;

        for (Buku buku : daftarBuku) {
            if (buku.getStatus() == Status.TERSEDIA) {
                jumlah++;
            }
        }

        return jumlah;
    }

    // Data contoh
    public void isiDataContoh() {

        tambahBuku(new Buku(
            "BK001", "Matematika Diskrit",
            2016, "Rinaldi Munir"
        ));

        tambahBuku(new Buku(
            "BK002", "Rekayasa Perangkat Lunak Terstruktur dan Berorientasi Objek",
            2013, "Rosa A.S. dan M. Shalahuddin"
        ));

        tambahBuku(new Buku(
            "BK003", "Analisis dan Desain Sistem Informasi",
            2005, "Jogiyanto H.M."
        ));

        tambahBuku(new Buku(
            "BK004", "Pemodelan Visual dengan UML",
            2005, "Munawar"
        ));

        Buku buku5 = new Buku(
            "BK005", "Pengenalan Sistem Informasi",
            2014, "Abdul Kadir"
        );
   

        buku5.pinjam();
        tambahBuku(buku5);
    }
}

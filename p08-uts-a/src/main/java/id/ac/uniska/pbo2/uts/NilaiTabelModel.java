/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;

public class NilaiTabelModel extends AbstractTableModel {
    private static final String[] KOLOM =
        {"NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"};
    private static final Locale ID = Locale.forLanguageTag("id-ID");

    private final List<NilaiMahasiswa> data = new ArrayList<>();

    @Override
    public int getRowCount() { return data.size(); }

    @Override
    public int getColumnCount() { return KOLOM.length; }

    @Override
    public String getColumnName(int kolom) { return KOLOM[kolom]; }

    @Override
    public Object getValueAt(int baris, int kolom) {
        NilaiMahasiswa m = data.get(baris);
        switch (kolom) {
            case 0: return m.getNpm();
            case 1: return m.getNama();
            case 2: return m.getTugas();
            case 3: return m.getUts();
            case 4: return m.getUas();
            case 5: return String.format(ID, "%.2f", m.getNilaiAkhir());
            case 6: return m.getHuruf();
            default: return null;
        }
    }

    public void tambah(NilaiMahasiswa m) {
        data.add(m);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    public boolean sudahAda(String npm) {
        for (NilaiMahasiswa m : data) {
            if (m.getNpm().equals(npm)) return true;
        }
        return false;
    }

    public int getJumlah() { return data.size(); }

    public double getRataRata() {
        if (data.isEmpty()) return 0;
        double total = 0;
        for (NilaiMahasiswa m : data) total += m.getNilaiAkhir();
        return total / data.size();
    }
}

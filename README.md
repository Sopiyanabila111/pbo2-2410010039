# P01 SCREENSHOOT Lingkungan Java, Maven, Git
<img width="1920" height="1080" alt="Screenshot (230)" src="https://github.com/user-attachments/assets/7f7db4aa-2f7b-431f-b340-e308ef6b1e70" />
<img width="1920" height="1080" alt="Screenshot (231)" src="https://github.com/user-attachments/assets/80ff49c3-0a91-4cb6-9feb-01fa45a88485" />
<img width="425" height="92" alt="Screenshot 2026-09-19 194815" src="https://github.com/user-attachments/assets/18b2060f-9fc3-42e3-a1cb-a20c9814cfa0" />


# P02 SCREENSHOOT Tinjau Ulang PBO1
<img width="638" height="271" alt="Screenshot 2026-10-13 150342" src="https://github.com/user-attachments/assets/aec1fed1-c130-492a-9ef7-4e601f056eb7" />

# Eksperimen P02
1.Error, karena constructor Koleksi tidak sesuai parameternya.

2.Ada @Override → error. Kalau dihapus → dianggap method baru.

3.Buku tetap dibuat, tapi judulnya kosong.

4.Melanggar enkapsulasi, karena status diubah langsung dari main
[Eksperimen P02.txt](https://github.com/user-attachments/files/33807403/Eksperimen.P02.txt)



# P03 SCREENSHOOT Komponen GUI Swing
<img width="791" height="479" alt="Screenshot 2026-10-02 210007" src="https://github.com/user-attachments/assets/f4c89c9d-772f-40be-9e63-28a2cf2da046" />

# Mode Terang
<img width="457" height="341" alt="Screenshot 2026-10-02 205824" src="https://github.com/user-attachments/assets/7f168c6c-97b0-4828-a3ab-907a38ad38b8" />

# Mode Gelap
<img width="571" height="392" alt="Screenshot 2026-10-02 205829" src="https://github.com/user-attachments/assets/91ae0238-c498-40e4-aedd-6a964b35e78d" />
 
# Pertanyaan Refleksi P03
[G. Pertanyaan Refleksi.txt](https://github.com/user-attachments/files/33806997/G.Pertanyaan.Refleksi.txt)

1.Top-level container = wadah utama, contoh JFrame.
Intermediate container = wadah di dalamnya, contoh JPanel.
Atomic component = komponen yang langsung digunakan, contoh JButton.

2.Agar kedua JRadioButton hanya bisa dipilih satu pada satu waktu.

3.JComboBox dipilih jika pilihan banyak dan ingin menghemat tempat.

4.Karena initComponents() dibuat otomatis oleh NetBeans. Kode tambahan ditulis di constructor setelah initComponents().

5.Agar FlatLaf aktif terlebih dahulu sebelum tampilan form dibuat.

# P04 SCREENSHOOT Layout Manager
<img width="1920" height="1080" alt="Screenshot (236)" src="https://github.com/user-attachments/assets/cb8399ed-1a9a-4448-bc45-e949ee41c0fd" />
<img width="1920" height="1080" alt="Screenshot (237)" src="https://github.com/user-attachments/assets/5abdc006-8191-4151-b310-0be9fa0aea61" />
<img width="1920" height="1080" alt="Screenshot (238)" src="https://github.com/user-attachments/assets/5ade7210-b1a2-4460-ade3-fd51aa0048b7" />

# Eksperimen Praktikum 2 P04
[Eksperimen Praktikum 2.txt](https://github.com/user-attachments/files/33807151/Eksperimen.Praktikum.2.txt)
1. flowPanel: Alignment = Center, jendela dikecilkan
Dengan alignment Center, komponen di setiap baris diposisikan di tengah panel, bukan rata kiri (default LEADING/LEFT) atau rata kanan.
Saat jendela dikecilkan, FlowLayout melakukan wrap: komponen yang tidak muat pindah ke baris baru. Tiap baris tetap terpusat secara horizontal, sehingga sisa ruang kosong terbagi rata di kiri dan kanan.

2. pada GridLayout(rows, cols), jika rows = 0, layout manager membebaskan jumlah baris dan hanya memegang jumlah kolom. Jika kedua nilai diisi bukan nol, nilai cols diabaikan dan jumlah kolom dihitung dari rows, jadi isi Rows = 0 diperlukan agar Columns = 2 berlaku. Barisnya bertambah mengikuti banyaknya komponen yang ditambahkan.

3. BoxLayout menghormati maximumSize. Dengan Y_AXIS (tombol bertumpuk vertikal), lebar tombol secara default hanya sebesar preferred size-nya, sehingga tombol-tombol itu memiliki lebar berbeda-beda sesuai teksnya.
Setelah maximumSize lebar diisi 32767 (praktis tak terbatas), tombol boleh melebar sampai selebar panel, sehingga semua tombol melebar mengisi lebar panel dan menjadi sama lebar, serta ikut menyesuaikan saat jendela diubah ukurannya.
Tinggi tetap sama dengan tinggi tombol, jadi tombol tidak ikut memanjang secara vertikal.

# Eksperimen Praktikum 4 P04
[Eksperimen Praktikum 4.txt](https://github.com/user-attachments/files/33807180/Eksperimen.Praktikum.4.txt)
1. Weight X namaField = 0.0, lalu jendela dilebarkan
Weight X menentukan siapa yang mendapat sisa ruang horizontal saat jendela melebar. Dengan nilai 0.0, namaField tidak mendapat bagian tambahan, jadi lebarnya tetap seperti ukuran awal (preferred size) dan tidak ikut memanjang. Ruang kosong akan dibiarkan di samping, atau diberikan ke komponen lain yang weight X-nya lebih dari 0. Sebelumnya (misalnya 1.0), isian ikut melebar mengikuti jendela.

2. Direction formPanel dari North menjadi Center, lalu jendela ditinggikan
North: formPanel hanya setinggi isinya dan menempel di bagian atas. Saat jendela ditinggikan, tinggi formPanel tidak berubah. Sisa ruang di bawahnya kosong.
Center: formPanel mengambil seluruh sisa ruang, jadi ikut meninggi. Di dalamnya, GridBagLayout akan membagi ruang tambahan tersebut. Baris yang weight Y-nya 0 tetap rapat di tengah, sedangkan komponen dengan weight Y lebih dari 0 ikut memanjang ke bawah.
Perbedaan utamanya: North membuat form tidak melar secara vertikal, Center membuatnya mengisi tinggi jendela.

3. Menghapus setMinimumSize(getSize()), lalu jendela dikecilkan sekecil mungkin
Tanpa batas ukuran minimum, jendela bisa dikecilkan melebihi ruang yang dibutuhkan isinya. Yang rusak lebih dulu biasanya isian dan label yang paling lebar: teks mulai terpotong (muncul “...” pada label atau tombol), JTextField menyusut menjadi sangat sempit, dan komponen di baris bawah mulai tertutup atau hilang karena layout kehabisan ruang. Pada akhirnya jendela bisa menyusut sampai hanya tersisa title bar. Baris setMinimumSize(getSize()) mencegah semua itu dengan mengunci ukuran terkecil sebesar ukuran awal jendela.

# Pertanyaan Refleksi P04
[G. Pertanyaan Refleksi P4.txt](https://github.com/user-attachments/files/33807065/G.Pertanyaan.Refleksi.P4.txt)

1. Mengapa Null Layout dan Absolute Layout dihindari?
Posisi dan ukuran komponen ditulis manual dalam piksel (setBounds), sehingga tidak menyesuaikan saat jendela diubah ukurannya. Tampilan juga bisa rusak di layar dengan resolusi atau DPI berbeda, saat font berubah, atau saat teks diganti bahasa lain. Kode pun sulit dirawat karena menambah satu komponen berarti menggeser koordinat semua yang lain.

2. Perbedaan FlowLayout dan GridLayout saat jendela dilebarkan
FlowLayout: komponen mempertahankan ukuran aslinya (preferred size) dan hanya berpindah posisi. Bila ruang cukup, lebih banyak komponen muat dalam satu baris, dan bila sempit, komponen turun ke baris berikutnya.
GridLayout: ruang dibagi rata ke sel-sel grid dengan jumlah baris dan kolom tetap. Setiap komponen ikut melebar (dan meninggi) sama besar mengikuti ukuran jendela.

3. Fungsi Weight X dan Fill pada GridBagLayout
Weight X menentukan pembagian sisa ruang horizontal. Komponen dengan weight lebih besar mendapat bagian lebih banyak, sedangkan 0.0 berarti tidak mendapat tambahan.
Fill menentukan apakah komponen memenuhi sel yang tersedia (NONE, HORIZONTAL, VERTICAL, BOTH). Weight hanya memperbesar sel, sedangkan fill yang membuat komponen benar-benar mengisi sel itu. Biasanya keduanya dipakai bersama agar JTextField ikut memanjang saat jendela dilebarkan.

4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?
Jika formPanel langsung diletakkan di Center, form akan dipaksa mengisi seluruh area sehingga isiannya melar dan jaraknya renggang saat jendela ditinggikan. Dengan isiPanel ber-BorderLayout dan formPanel di North, form hanya setinggi isinya dan menempel di atas, sedangkan sisa ruang kosong di bawah. Bungkus ini juga memberi tempat untuk padding atau komponen lain, misalnya panel tombol di South.

5. Dua prinsip desain dan buktinya
Konsistensi (alignment dan susunan seragam): semua label rata kiri dalam satu kolom dan semua isian sejajar di kolom kedua. Bukti: pada GridBagLayout, label memakai gridx = 0 dan field memakai gridx = 1 dengan anchor yang sama, serta insets seragam untuk setiap baris.
Responsif (menyesuaikan ukuran jendela): isian ikut memanjang saat jendela dilebarkan. Bukti: weightx = 1.0 dan fill = HORIZONTAL pada field, serta setMinimumSize(getSize()) agar jendela tidak mengecil sampai komponen rusak.

# Deklarasi Penggunaan AI
[Deklarasi Penggunaan AI.txt](https://github.com/user-attachments/files/33807285/Deklarasi.Penggunaan.AI.txt)

Alat yang digunakan: Claude (Anthropic).

1.Menjelaskan konsep layout manager (BorderLayout, FlowLayout, GridLayout, dll.).

2.Membantu merancang struktur tata letak antarmuka (GUI).

3.Membantu menelusuri dan memperbaiki error (debugging) pada kode.

4.Membantu menyusun dokumentasi atau README.

5.Mengatur jarak dan margin antar komponen, misalnya insets.

# Tahap 1: Sketsa
<img width="934" height="1280" alt="Foto sketsa" src="https://github.com/user-attachments/assets/6f59da2e-6329-45e8-9e13-4d9eaee68920" />

# Tahap 2: Tabel Rancangan
<img width="409" height="215" alt="Screenshot 2026-10-13 174220" src="https://github.com/user-attachments/assets/2382b271-0e62-4f64-a740-fc0eb48a746f" />

# Tahap 4: Saling Menilai (dinilai oleh Akbar Ihsan Nugraha)
<img width="498" height="151" alt="Screenshot 2026-10-13 173511" src="https://github.com/user-attachments/assets/8fa21738-cd75-4fc6-9abf-c539fa66f5ac" />


 # P05 SCREENSHOOT Event Handling
<img width="295" height="346" alt="Screenshot 2026-10-20 153157" src="https://github.com/user-attachments/assets/ff150a30-b840-41c7-b0ab-da6ed5149cb4" />

<img width="296" height="325" alt="Screenshot 2026-10-20 153212" src="https://github.com/user-attachments/assets/5eb7e794-5e08-4f86-9b63-09ca784ba0ec" />

<img width="288" height="444" alt="Screenshot 2026-10-20 160652" src="https://github.com/user-attachments/assets/b5f07a03-87cf-4d70-8540-69088c3f9448" />

# Eksperimen Praktikum 3 Konversi Suhu
[Eksperimen Praktikum 3 Konversi Suhu.txt](https://github.com/user-attachments/files/33706902/Eksperimen.Praktikum.3.Konversi.Suhu.txt)
1. Pesan tercetak berapa kali?
Dua kali setiap pilihan diganti. ItemEvent dipicu satu kali untuk item lama yang berubah menjadi DESELECTED, dan satu kali lagi untuk item baru yang menjadi SELECTED. Pemeriksaan getStateChange() == SELECTED tadinya menyaring agar hanya satu yang diproses.

2. Mengapa terlambat satu karakter?
keyPressed terpicu saat tombol ditekan, sebelum karakter dimasukkan ke dalam isian. Jadi getText() masih mengembalikan teks lama, tanpa karakter yang baru diketik. keyReleased terpicu setelah karakter masuk, sehingga teksnya sudah lengkap.

3. Apa yang muncul di Output?
Muncul NumberFormatException (misalnya java.lang.NumberFormatException: For input string: "a") beserta stack trace. Ini terjadi karena Double.parseDouble() gagal mengubah huruf menjadi angka dan tidak ada catch yang menangkapnya. Program tidak berhenti, tetapi konversi tidak berjalan dan hasil tidak diperbarui.

# Eksperimen Praktikum 4 Kalkulator Sederhana
[Eksperimen Praktikum 4 Kalkulator Sederhana.txt](https://github.com/user-attachments/files/33706930/Eksperimen.Praktikum.4.Kalkulator.Sederhana.txt)

1. Berapa kali pesan tercetak?
Dua kali setiap tombol ditekan, karena ada dua listener terdaftar pada tombol yang sama dan keduanya dijalankan. Satu tombol sebaiknya hanya memakai satu cara agar perilakunya tidak ganda (perhitungan atau pesan berulang), mudah dilacak, dan tidak membingungkan saat kode diubah, karena kode di Events (bagian yang dihasilkan editor) dan lambda di konstruktor tersebar di dua tempat.

2. Tombol %: apa yang diubah?
Tab Design: tambahkan JButton baru, beri nama variabel (misalnya modButton) dan teks %, lalu atur posisinya di tata letak.
Tab Source: tambahkan penanganan klik untuk tombol itu (lambda atau event actionPerformed) yang menghitung a % b, dan tampilkan hasilnya di isian hasil.

3. Mengapa kursor langsung di isian pertama?
Karena method Hapus memanggil requestFocus() pada isian pertama setelah mengosongkan semua isian, sehingga pengguna bisa langsung mengetik data baru tanpa mengklik isian itu dulu. 


# SCREENSHOOT Validasi Input

# Tangkapan layar (screenshot) form dengan pesan kesalahan
<img width="349" height="417" alt="Screenshot 2026-10-31 164118" src="https://github.com/user-attachments/assets/b46dfcc1-b38e-4d98-92a4-27204d853d21" />

# Tangkapan layar (screenshot) jendela Navigator yang memperlihatkan label pesan
<img width="224" height="419" alt="Screenshot 2026-10-31 164838" src="https://github.com/user-attachments/assets/3edc5dbc-2ccd-4922-9b7b-16ebceb370a4" />
<img width="194" height="293" alt="Screenshot 2026-10-31 164846" src="https://github.com/user-attachments/assets/ea5ff292-3706-4377-8d07-8e7f587f3da5" />

# Eksperimen praktikum 4 P06
[EKSPERIMEN PRAKTIKUM 4 P06.txt](https://github.com/user-attachments/files/34213230/EKSPERIMEN.PRAKTIKUM.4.P06.txt)
EKSPERIMEN PRAKTIKUM 4 P06

1. Mengetik huruf pada isian NPM
Huruf yang diketik tidak muncul di isian NPM karena ditolak. Penyebabnya baris di npmFieldKeyTyped yang memanggil evt.consume(), biasanya di dalam if yang memeriksa apakah karakter bukan angka (misalnya if (!Character.isDigit(c)) { evt.consume(); }). Consume membuang event sehingga karakter tidak masuk ke field.

2. Email diisi siti@ lalu tekan Tab
Pesan kesalahan muncul saat isian email kehilangan fokus (focusLost), yaitu tepat ketika Tab ditekan dan fokus pindah ke komponen berikutnya. Di saat itu validasi dijalankan dan format email yang tidak lengkap (siti@) terdeteksi tidak valid.

3. Klik isian Nama tanpa mengetik, lalu Tab
Tidak ada pesan kesalahan karena validasi hanya berjalan jika isian sudah diubah atau diisi (misalnya dicek dengan flag "sudah disentuh" atau hanya memvalidasi saat teks tidak kosong). Isian yang hanya mendapat fokus lalu ditinggalkan tanpa input dianggap belum dimulai, sehingga tidak dianggap salah. Validasi isian kosong baru dilakukan saat tombol Daftar diklik.

4. Centang persetujuan, klik Daftar dengan form kosong
Fokus pindah ke isian pertama yang tidak valid, yaitu isian paling atas yang kosong (biasanya NPM atau Nama). Ini terjadi karena method validasi memanggil requestFocus() pada isian pertama yang gagal diperiksa, lalu berhenti.

5. Alt + N
Fokus pindah ke isian Nama. Yang mengaturnya adalah properti displayedMnemonic pada label Nama (diisi huruf N), bersama properti labelFor yang menunjuk ke isian Nama. Saat Alt+N ditekan, label meneruskan fokus ke komponen yang ditunjuk labelFor.

6. Isi beberapa isian, klik Batal, pilih No
Ya, data tetap ada. Dialog konfirmasi (JOptionPane) hanya melanjutkan pengosongan form jika memilih Yes. Jika memilih No, method langsung selesai tanpa mengubah isian apa pun.

# Deklarasi penggunaan AI
[Deklarasi Penggunaan AI P06.txt](https://github.com/user-attachments/files/34213355/Deklarasi.Penggunaan.AI.P06.txt)
Deklarasi Penggunaan AI P06

1.Alat yang dipakai: Claude (Anthropic).

2.Keperluan: membantu memahami konsep pada modul praktikum, seperti event handling dan validasi input pada Swing.

3.Keperluan: menjelaskan kemungkinan hasil dari setiap eksperimen sebagai bahan pembanding.

4.Keperluan: merapikan penulisan jawaban agar singkat dan jelas.

5.Seluruh eksperimen tetap saya jalankan sendiri dan hasilnya saya verifikasi sebelum dilaporkan.


# Tautan video Demo Mini Proyek P07

# Eksperimen Praktikum 5 P07
[EKSPERIMEN PRAKTIKUM 5 P07.txt](https://github.com/user-attachments/files/34213296/EKSPERIMEN.PRAKTIKUM.5.P07.txt)
EKSPERIMEN PRAKTIKUM 5 P07

1. Komentar fireTableRowsInserted(baris, baris);
Tabel tidak langsung berubah. Data memang masuk ke list model, tetapi JTable tidak diberi tahu ada baris baru, sehingga tampilan baru ter-update setelah di-refresh (misalnya saat filter/pencarian atau aplikasi dibuka ulang). Method ini yang memberi sinyal ke JTable agar menggambar ulang.

2. return kontakTable.getSelectedRow();
Yang muncul di dialog konfirmasi adalah nama kontak yang salah, bukan Ahmad Fauzi. Saat hasil pencarian difilter ("ah"), indeks baris di tampilan (view) berbeda dengan indeks di model. getSelectedRow() mengembalikan indeks view tanpa dikonversi dengan convertRowIndexToModel(), sehingga yang terambil adalah kontak lain pada indeks model yang sama. Akibatnya kontak yang salah bisa ikut terhapus.

3. super(pemilik, judul, false)
Dialog menjadi non-modal. Jendela utama tetap bisa diklik dan digunakan selagi dialog terbuka. Kontak yang ditambahkan tetap masuk ke tabel, tetapi pengguna bisa membuka dialog berkali-kali atau mengubah data lain secara bersamaan, sehingga alurnya tidak terkontrol.

4. Ctrl+E dan Ctrl+D tidak bekerja tanpa baris dipilih
Karena aksi Edit dan Hapus membutuhkan baris target. Jika tidak ada baris dipilih, baris bernilai -1 dan method menolak melanjutkan (aksi dinonaktifkan atau dicek dengan if (baris < 0) return;). Ctrl+N tetap jalan karena tambah kontak tidak bergantung pada pilihan baris.

5. Accelerator hapusItem diubah menjadi Delete tanpa Ctrl
Baris yang berubah di initComponents() adalah yang memanggil hapusItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0)); Nilai modifier java.awt.event.InputEvent.CTRL_DOWN_MASK diganti menjadi 0.

6. private KontakTableModel model; lalu model = new KontakTableModel(); setelah initComponents()
Akan muncul NullPointerException. Di dalam initComponents(), komponen (misalnya kontakTable) dibuat dan memakai model, tetapi saat itu model masih null karena baru diisi setelahnya. Urutan inisialisasi harus benar: model dibuat dulu (atau lewat deklarasi = new KontakTableModel()), baru initComponents() dipanggil.

# Deklarasi penggunaan AI
[Deklarasi Penggunaan AI P07.txt](https://github.com/user-attachments/files/34213331/Deklarasi.Penggunaan.AI.P07.txt)
Deklarasi Penggunaan AI P07

1.Alat yang dipakai: Claude (Anthropic).
2.Keperluan: membantu memahami konsep pada modul praktikum, seperti TableModel, dialog, dan pintasan keyboard pada Swing.
3.Keperluan: menjelaskan kemungkinan hasil dari setiap eksperimen sebagai bahan pembanding.
4.Keperluan: merapikan penulisan jawaban agar singkat dan jelas.
5.Seluruh eksperimen tetap saya jalankan sendiri dan hasilnya saya verifikasi sebelum dilaporkan.

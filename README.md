[Eksperimen P02.txt](https://github.com/user-attachments/files/33806892/Eksperimen.P02.txt)[Eksperimen Praktikum 4 Kalkulator Sederhana.txt](https://github.com/user-attachments/files/33706858/Eksperimen.Praktikum.4.Kalkulator.Sederhana.txt)# pbo2-2410010039

# P01 SCREENSHOOT Lingkungan Java, Maven, Git
<img width="1920" height="1080" alt="Screenshot (230)" src="https://github.com/user-attachments/assets/7f7db4aa-2f7b-431f-b340-e308ef6b1e70" />
<img width="1920" height="1080" alt="Screenshot (231)" src="https://github.com/user-attachments/assets/80ff49c3-0a91-4cb6-9feb-01fa45a88485" />
<img width="425" height="92" alt="Screenshot 2026-09-19 194815" src="https://github.com/user-attachments/assets/18b2060f-9fc3-42e3-a1cb-a20c9814cfa0" />


# P02 SCREENSHOOT Tinjau Ulang PBO1
<img width="638" height="271" alt="Screenshot 2026-10-13 150342" src="https://github.com/user-attachments/assets/aec1fed1-c130-492a-9ef7-4e601f056eb7" />

# Eksperimen P02
[Upload1.Error, karena constructor Koleksi tidak sesuai parameternya.

2.Ada @Override → error. Kalau dihapus → dianggap method baru.

3.Buku tetap dibuat, tapi judulnya kosong.

4.Melanggar enkapsulasi, karena status diubah langsung dari maining Eksperimen P02.txt…]()


# P03 SCREENSHOOT Komponen GUI Swing
<img width="791" height="479" alt="Screenshot 2026-10-02 210007" src="https://github.com/user-attachments/assets/f4c89c9d-772f-40be-9e63-28a2cf2da046" />

# Mode Terang
<img width="457" height="341" alt="Screenshot 2026-10-02 205824" src="https://github.com/user-attachments/assets/7f168c6c-97b0-4828-a3ab-907a38ad38b8" />

# Mode Gelap
<img width="571" height="392" alt="Screenshot 2026-10-02 205829" src="https://github.com/user-attachments/assets/91ae0238-c498-40e4-aedd-6a964b35e78d" />
 
# Pertanyaan Refleksi P03
https://github.com/Sopiyanabila111/pbo2-2410010039/blob/main/p03-komponen-gui/G.%20Pertanyaan%20Refleksi.txt


# P04 SCREENSHOOT Layout Manager
<img width="1920" height="1080" alt="Screenshot (236)" src="https://github.com/user-attachments/assets/cb8399ed-1a9a-4448-bc45-e949ee41c0fd" />
<img width="1920" height="1080" alt="Screenshot (237)" src="https://github.com/user-attachments/assets/5abdc006-8191-4151-b310-0be9fa0aea61" />
<img width="1920" height="1080" alt="Screenshot (238)" src="https://github.com/user-attachments/assets/5ade7210-b1a2-4460-ade3-fd51aa0048b7" />

# Eksperimen Praktikum 2 P04
https://github.com/Sopiyanabila111/pbo2-2410010039/blob/main/p04-layout-manager/Eksperimen%20Praktikum%202.txt

# Eksperimen Praktikum 4 P04
https://github.com/Sopiyanabila111/pbo2-2410010039/blob/main/p04-layout-manager/Eksperimen%20Praktikum%204.txt

# Pertanyaan Refleksi P04
https://github.com/Sopiyanabila111/pbo2-2410010039/blob/main/p04-layout-manager/G.%20Pertanyaan%20Refleksi%20P4.txt

# Deklarasi Penggunaan AI
https://github.com/Sopiyanabila111/pbo2-2410010039/blob/main/p04-layout-manager/Deklarasi%20Penggunaan%20AI.txt

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
1. Berapa kali pesan tercetak?
Dua kali setiap tombol ditekan, karena ada dua listener terdaftar pada tombol yang sama dan keduanya dijalankan. Satu tombol sebaiknya hanya memakai satu cara agar perilakunya tidak ganda (perhitungan atau pesan berulang), mudah dilacak, dan tidak membingungkan saat kode diubah, karena kode di Events (bagian yang dihasilkan editor) dan lambda di konstruktor tersebar di dua tempat.

2. Tombol %: apa yang diubah?
Tab Design: tambahkan JButton baru, beri nama variabel (misalnya modButton) dan teks %, lalu atur posisinya di tata letak.
Tab Source: tambahkan penanganan klik untuk tombol itu (lambda atau event actionPerformed) yang menghitung a % b, dan tampilkan hasilnya di isian hasil.

3. Mengapa kursor langsung di isian pertama?
Karena method Hapus memanggil requestFocus() pada isian pertama setelah mengosongkan semua isian, sehingga pengguna bisa langsung mengetik data baru tanpa mengklik isian itu dulu. Kalkulator Sederhana
[Eksperimen Praktikum 4 Kalkulator Sederhana.txt](https://github.com/user-attachments/files/33706930/Eksperimen.Praktikum.4.Kalkulator.Sederhana.txt)



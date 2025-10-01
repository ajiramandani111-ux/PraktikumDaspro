pertanyaan percobaan 1

1.Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan 
operator relasional?
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka 
terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi 
program tersebut dengan menambahkan struktur ELSE!
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi 
Percobaan 1

jawab

1. karena variabel sudah bertipe boolean
2. output hanya menampilkan pertanyaan, tanpa pesan verifikasi/cetak KRS.
3. ✅
4. ✅



Pertanyaan percobaan 2

1. Apa fungsi dari sintaks break?
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil 
transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah 
dibuat ke dalam bentuk IF-ELSE IF-ELSE.
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi 
Percobaan 2”

jawab

1. menghentikan case agar tidak terus berjalan
2. saat tidak ada case yang dipilih, maka akan menampilkan default
3. ✅
4. ✅

   Pertanyaan percobaan 3

1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
2. Jelaskan maksud dari potongan kode berikut!
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara 
runtut untuk semua kondisi!

jawab

1. langsung menampilkan else yang setara, yaitu "Gagal! Mahasiswa masih memiliki tanggungan kompen."
2. jika P1 lebih dari atau sama dengan 8 dan p2 lebih dari atau sama dengan 4 maka akan meneruskan ke kondisi kedua(jika ada),
3. mahasiswa akan ditanya apakah sudah bebas kompen,
   • jika belum maka pesan gagal karena memiliki kompen akan muncul
   • jika sudah maka akan memasuki kondisi kedua
   apakah mahasiswa sudah memenuhi log bimbingan sesuai kedua syarat
   • jika belum(salah satu atau keduanya) maka tidak bisa mengikuti ujian skripsi
   • jika keduaya sudah terpenuhi maka dianggap lolos

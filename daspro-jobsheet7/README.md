2.1.3 Pertanyaan
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa 
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). 
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi 
dan terendah!
5. Commit dan push kode program ke Github

   jawab

1. int i = 1; i <= 10; i++
2. jika dibalik maka nilai tertinggi hanya akan menampilkan nilai diatas 100, sedangkan untuk terendah hanya akan menampilkan nilai yang lebih rendah dari 0
3. jika nilai lebih dari tertinggi yaitu "0" maka S.O.P akan menampilkan nilai tersebut (yang diinput)
   jika nilai kurang dari terendah yaitu "100" maka S.O.P akan menampilkan nilai yang lebih rendah lagi
4. (file modifikasi ModifikasiSiakadFor.java
5. done

2.2.3 Pertanyaan
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
a. nilai < 0 || nilai > 100
b. continue
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya 
dituliskan di awal perulangan WHILE?
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE 
akan berjalan?
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, 
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
5. Commit dan push kode program ke Github

   jawab
   
1.
a.membatasi nilai yang diinput agar tidak kurang dari 0 atau lebih dari 100

b.continue digunakan untuk men skip nilai atau melewati nilai yang diinginkan untuk tidak ditampilkan, dan akan menampilkan nilai selanjutnya

2.jika i++ ditaruh dipaling atas, maka akan langsung menamplkan nilai ke 2 karena akan terupdate terlebih dahulu sebelum dapat menampilkan nilai pertama
3. sesuai nilai yang diinputkan, yaitu 19 kali

4. (file ModifikasiWhile.java)
5. done

2.3.3 Pertanyaan
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali 
adalah “batal”, maka berapa kali perulangan dilakukan?
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen 
inisialisasi dan update?

jawab

1.hanya sekali, karena terdapat break yang akan menghentikan proses ketika menginpit 'batal'

2.break; akan menjadi kondisi berhenti jika sesuai syarat

3.true digunakan agar proses tetap terus berjalan dengan 'batal' sebagai tanda berhenti

4.karena tidak menggunakan nilai yang perlu diurutkan

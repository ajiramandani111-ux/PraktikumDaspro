Pertanyaan
percobaan 1
1. Apa yang dimaksud dengan fungsi rekursif? 
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi 
faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan 
fungsi rekursif dan fungsi iteratif!

percobaan 2
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, 
pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() 
secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan 
dijalankan! 
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: 
hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32

percbaan 3
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” 
dan “recursion call”! 
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika 
diberikan nilai hitungLaba(100000,3)

jawab
percobaan 1
1. fungsi yang memanggil  dirinya sendiri 
2. sama saja, perbedaannya hanya pada alurnya
percobaan 2
1. saat y==0
2. sudah
percobaan 3
1. base case >> tahun ==0, recursion call >> return 1.11 = hitungLaba (saldo, tahun - 1)
2.  • trace face ekspansi 
hitungLaba(100000, 3)
= 1.11 * hitungLaba(100000, 2)
= 1.11 * (1.11 * hitungLaba(100000, 1))
= 1.11 * (1.11 * (1.11 * hitungLaba(100000, 0)))

• fase substitusi 
  hitungLaba(100000, 0) = 100000

hitungLaba(100000, 1) = 1.11 * 100000 = 111000
hitungLaba(100000, 2) = 1.11 * 111000 = 123210
hitungLaba(100000, 3) = 1.11 * 123210 = 136763.1

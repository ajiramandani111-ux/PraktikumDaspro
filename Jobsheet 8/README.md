Pertanyaan percobaan 1
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? 
Mengapa bisa demikian? 
2. Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa 
bisa demikian? 
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa 
bisa demikian? 

jawab
1. maka perhitungannya dimmulai dari 0, bukan 1. karena inisialisasi berarti mengawali suatu urutan angka yang diinput.
2. tidak ada yang bisa di output, karena setelah dimulai langsung bernilai false
3. output berupa * tak hingga, karena - selalu lebih kecil dari 5 (bernilai true).

Pertanyaan percobaan 2

1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi 
iOuter=0, apa yang akibatnya? Mengapa bisa demikian? 
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan 
perulangan dalam, Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang 
akibatnya? Mengapa bisa demikian? 
3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang 
berada didalamnya? 
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan 
dalam? Apa akibatnya jika sintaks tersebut dihilangkan? 
5. Silakan commit dan push ke repository Anda.

jawab

1. output *baris* akan menjadi 1 lebih banyak dari N, karena N sendiri <= lalu hitungan dimulai dari 0 ke N, bukan 1 ke N. 
2. output *kolom* akan menjadi 1 lebih banyak dari N, karena N sendiri <= lalu hitungan dimulai dari 0 ke N, bukan 1 ke N. 
3. perulangan luar mengatur baris dan dalam mengatur kolom.
4. berfungsi sebagai *enter* agar setelah perulangan dalam selesai akan mengisi kolom selanjutnya, jika dihilangkan hanya akan menampilkan output (*) yang sebaris.
5. done

Pertanyaan percobaan 3

1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan tampilan 
berikut? 
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan
setiap bagian yang perlu diperbaiki/ditambahkan. 
3. Silakan commit dan push ke repository Anda.

   jawab

1.tidak, namun malah akan menampilkan segitiga siku-siku dengan 6 baris, karena i=0; i <= 5. 
2.agar sesuai dengan nilai N, maka ganti "<=" menjadi "<" atau i= 0 menjadi i = 1 (pilih salah satu). 
3.done






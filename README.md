============================================================
        PROJECT UAS ALGORITMA PEMROGRAMAN
   Implementasi Huffman Coding & Algoritma Dijkstra
                    (Java)
============================================================

KELOMPOK PENGERJA
1. Maulana Rayhan Zulkarnaen        (202410370110170)
2. Danishwara Eka Putra Widiyanto  (202410370110181)
3. Muhammad Syakish Al Hanif       (202410370110189)
4. Rofi Naufal Farid               (202410370110214)

------------------------------------------------------------

DESKRIPSI PROYEK
Proyek ini merupakan tugas Ujian Akhir Semester (UAS) mata kuliah
Algoritma Pemrograman yang bertujuan untuk mengimplementasikan dan
memahami cara kerja algoritma dalam pemrograman nyata menggunakan
bahasa Java.

Pada proyek ini diimplementasikan dua algoritma utama, yaitu:

1. Huffman Coding
   Algoritma ini digunakan untuk melakukan kompresi data teks dengan
   cara membangun pohon biner berdasarkan frekuensi kemunculan setiap
   karakter. Karakter yang sering muncul akan memiliki kode biner
   yang lebih pendek, sehingga ukuran data dapat diperkecil.

2. Algoritma Dijkstra
   Algoritma ini digunakan untuk mencari jarak terpendek dari satu
   node ke node lainnya pada graf berbobot. Algoritma ini banyak
   digunakan dalam kasus pencarian rute terpendek, seperti pada
   sistem navigasi dan jaringan komputer.

Program dibuat berbasis console dan bersifat interaktif, sehingga
pengguna dapat memasukkan data secara langsung melalui terminal.

------------------------------------------------------------

BAHASA DAN TEKNOLOGI
- Bahasa Pemrograman : Java
- Tipe Aplikasi     : Console Application
- Struktur Data     : Map, PriorityQueue, Graph

------------------------------------------------------------

STRUKTUR FILE PROGRAM
src/
- ProjectUASAlgoritma.java   -> Menu utama & pengendali program
- HuffmanCoding.java        -> Implementasi algoritma Huffman Coding
- HuffmanNode.java          -> Struktur node untuk pohon Huffman
- DijkstraAlgorithm.java    -> Implementasi algoritma Dijkstra
- Edge.java                 -> Representasi edge pada graf

------------------------------------------------------------

CARA MENJALANKAN PROGRAM
1. Buka project menggunakan IDE Java (IntelliJ IDEA / NetBeans / Eclipse)
2. Pastikan seluruh file berada dalam satu package
3. Jalankan file ProjectUASAlgoritma.java
4. Pilih menu sesuai algoritma yang ingin dijalankan

------------------------------------------------------------

MENU UTAMA PROGRAM
1. Huffman Coding
2. Algoritma Dijkstra
3. Keluar

------------------------------------------------------------

CONTOH PENGGUNAAN PROGRAM

=====================
1. HUFFMAN CODING
=====================

Input:
Pilih: 1
Masukkan teks:
informatika

Output:
Kode Huffman:
i : 00
n : 010
f : 011
o : 100
r : 101
m : 1100
a : 1101
t : 111

Hasil Enkripsi:
0010011010111001101...

------------------------------------------------------------

=====================
2. ALGORITMA DIJKSTRA
=====================

Input:
Pilih: 2
Jumlah node: 2
Nama node:
A
Nama node:
B
Jumlah edge: 1
Node asal:
A
Node tujuan:
B
Bobot:
5
Node awal:
A

Output:
Jarak terpendek dari node A:
A -> 0
B -> 5

------------------------------------------------------------

HANDLING DAN VALIDASI
Program ini dilengkapi dengan beberapa penanganan kesalahan, antara lain:
- Validasi input kosong pada Huffman Coding
- Penanganan kasus satu karakter pada Huffman Coding
- Pengamanan nilai null pada proses encoding
- Perbaikan pembacaan input Scanner agar tidak terjadi kesalahan input

------------------------------------------------------------

KESIMPULAN
Dengan adanya proyek ini, mahasiswa dapat memahami cara kerja
algoritma Huffman Coding dan Algoritma Dijkstra serta penerapannya
dalam pemrograman Java. Program ini telah diuji dan berjalan dengan
baik sesuai dengan ketentuan tugas UAS.

------------------------------------------------------------

STATUS PROYEK
✔ Selesai
✔ Berjalan dengan baik
✔ Interaktif
✔ Siap dikumpulkan
============================================================

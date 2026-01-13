# PROJECT UAS ALGORITMA PEMROGRAMAN
## Implementasi Huffman Coding dan Algoritma Dijkstra (Java)

------------------------------------------------------------

INFORMASI UMUM
Mata Kuliah : Algoritma Pemrograman
Bahasa      : Java
Jenis       : Aplikasi Console (Interaktif)

------------------------------------------------------------

DESKRIPSI PROYEK
Proyek ini dibuat untuk memenuhi tugas Ujian Akhir Semester (UAS)
mata kuliah Algoritma Pemrograman. Program mengimplementasikan dua
algoritma utama, yaitu Huffman Coding dan Algoritma Dijkstra.

Huffman Coding digunakan untuk melakukan kompresi data teks dengan
membangun pohon biner berdasarkan frekuensi karakter.

Algoritma Dijkstra digunakan untuk menentukan jarak terpendek dari
suatu node ke node lainnya pada graf berbobot.

------------------------------------------------------------

STRUKTUR FILE
src/
- ProjectUASAlgoritma.java  (Main & Menu)
- HuffmanCoding.java       (Algoritma Huffman)
- HuffmanNode.java         (Node Huffman)
- DijkstraAlgorithm.java   (Algoritma Dijkstra)
- Edge.java                (Edge Graf)

------------------------------------------------------------

CARA MENJALANKAN PROGRAM
1. Buka project menggunakan IntelliJ / NetBeans / Eclipse
2. Pastikan seluruh file berada pada satu package
3. Jalankan file ProjectUASAlgoritma.java
4. Program akan menampilkan menu utama

------------------------------------------------------------

MENU UTAMA
1. Huffman Coding
2. Dijkstra
3. Keluar

------------------------------------------------------------

CONTOH INPUT & OUTPUT

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
- Validasi input kosong pada Huffman Coding
- Penanganan kasus satu karakter pada Huffman Coding
- Pengamanan nilai null pada proses encoding
- Perbaikan input Scanner agar tidak terjadi kesalahan pembacaan

------------------------------------------------------------

KESIMPULAN
Program ini berhasil mengimplementasikan algoritma Huffman Coding
dan Algoritma Dijkstra secara interaktif menggunakan bahasa Java.
Program berjalan dengan baik dan sesuai dengan ketentuan tugas UAS.

------------------------------------------------------------

STATUS PROYEK
Program selesai dan siap dikumpulkan.

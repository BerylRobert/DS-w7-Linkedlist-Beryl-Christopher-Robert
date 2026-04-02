Analysis Question

Part A - Concept Check
1. Why does a linked list need a head variable?
   > Karena Head berfungsi sebagai titik awal Linkedlist. Tanpa head, kita tidak tahu di mana elemen pertama berada.
2. Why does each node store a next reference?
   > Karena elemen-elemen linked list tidak disimpan secara berurutan dan referensi next berfungsi sebagai penguhubung yang menyimpan alamat memory dari node selanjutnya. Jadi referensi next digunakan untuk menghubungkan antar node karena letak node-node yang tidak berurutan.
3. Why is insertion at the beginning easier in linked list than in array?
   > Karena pada linked list kita tidak perlu repot menggeser elemen-elemen lain ke belakang seperti pada array.

Part B - Code Reading
4. In insertAtBeginning(), why do we write those codes in that order?
   > Agar data list yang lama tidak terputus/hilang. Jadi kita harus mengaitkan node baru ke list lama dulu (newNode.next = head), baru setelah itu head digeser ke node baru.
5. In display(), what would happen if we accidentally wrote while (current.next != null)?
   > Data di node paling akhir tidak akan ikut tercetak. Selain itu, program akan error kalau listnya kosong.

Part C - Comparison with Array
6. Which structure is better for fast random access?
   > Array, karena bisa langsung diakses lewat indeks
7. Which structure is better for frequent insertion at the beginning?
   > Linked List, karena tidak memakan waktu untuk menggeser elemen lama.
8. Why does linked list use more memory than array?
   > Karena selain menyimpan isi "data", setiap node juga harus menyediakan ruang memori tambahan untuk menyimpan alamat/pointer (next).

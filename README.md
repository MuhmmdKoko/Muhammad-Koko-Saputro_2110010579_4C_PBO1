# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Merek dan Kode pada Ban, dan memberikan output berupa petunjuk detail dari Kode tersebut seperti lebar ban, tinggi ban, diameter velg, beban maksimum ban, dan kecepatan maksimum ban.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `kodeBan`, `bacaKodeBan`, dan `kodeBanJalan` adalah contoh dari class.

```bash
public class kodeBan{
    ...
}

public class bacaKodeBan extends kodeBan{
    ...
}

public class kodeBanJalan {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ban[i] = new bacaKodeBan(merek, kode);` adalah contoh pembuatan object.

```bash
ban[i] = new bacaKodeBan(merek, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merekBan` dan `kodeBan` adalah contoh atribut.

```bash
String merekBan;
String kodeBan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `kodeBan` dan `bacaKodeBan`.

```bash
public kodeBan(String merekBan, String kodeBan) {
    this.merekBan = merekBan;
    this.kodeBan = kodeBan;
}

public bacaKodeBan(String merek, String kode) {
    super(merek, kode);
}

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerekBan` dan `setKodeBan` adalah contoh method mutator.

```bash
public void setMerekBan(String merek) {
    this.merekBan = merek;
}

public void setKodeBan(String kode) {
    this.kode = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerekBan`, `getKodeBan`, `getLebarBan`, `getTinggiBan`, `getDiameterVelg`, `getKecepatanMaksimum`, dan `getBebanMaksimum` adalah contoh method accessor.

```bash
public String getMerekBan() {
    return merek;
}

public String getKodeBan() {
    return kode;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merekban` dan `kodeBan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merekBan;
private String kodeBan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `bacaKodeBan` mewarisi `kodeBan` dengan sintaks `extends`.

```bash
public class bacaKodeBan extends kodeBan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `kodeBan` merupakan overloading method `displayInfo` dan `displayInfo` di `bacaKodeBan` merupakan override dari method `displayInfo` di `kodeBan`.

```bash
public String displayInfo(String harga){
    return displayInfo() + "\nHarga Ban: "+harga;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getKecepatanMaksimum` dan seleksi `switch` dalam method `getBebanMaksimum`.

```bash
public String getKecepatanMaksimum(){
    String kecMaks = getKodeBan().substring(11);
    switch(kecMaks){
		case "P":
			return "150";
		case "Q":
            return "160";
        case "R":
            return "170";
        case "S":
            return "180";
        case "T":
            return "190";
        case "H":
            return "210";
        case "V":
            return "240";
        case "W":
            return "270";
        case "Y":
            return ">300";    
        default:
            return "Kode Tidak Ditemukan";
       }

public String getBebanMaksimum(){
    String bebanMaks = getKodeBan().substring(9, 11);
        switch(bebanMaks){
           case "62":
               return "265";
           case "63":
               return "272";
           case "64":
               return "280";
           case "65":
               return "290";
           case "66":
               return "300";
           case "67":
               return "307";
           case "68":
               return "315";
           case "69":
               return "325";
           case "70":
               return "335";
           case "71":
               return "345";
           case "72":
               return "355";
           case "73":
               return "365";
           case "74":
               return "375";
           case "75":
               return "387";
           case "76":
               return "400";
           case "77":
               return "412";
           case "78":
               return "425";
           case "79":
               return "437";
           case "80":
               return "450";
           case "81":
               return "462";
           case "82":
               return "475";
           default:
               return "Kode Tidak Ditemukan";
        }
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<ban.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("Masukkan Kode Ban "+(i+1)+": ");
String kode = scanner.nextLine();

System.out.println("Data Profil Ban: ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
bacaKodeBan[] ban = new bacaKodeBan[1];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan Format Kode Pada Ban: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Koko Saputro
NPM: 2110010579

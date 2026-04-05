//Nama : Muh. Fahmi Ashar
//NIM : 13020240333
//Hari / Tanggal :Minggu, 05 April 2025
//Jam : 13.05 WITA
public class kode15 {
    public static void main(String[] args) {
     int i = 0;
     int j = 0;
     
     char c = 8; char d = 10;
     int e = ((int) c> (int)d) ? c: d;
     int k = ((i>j)? i: j);

     System.out.print("Nilai e = " + e);
     System.out.println("\nNilai k ="+ k);

     i = 2;
     j = 3;
     k = ((i++>j++)? i: j);
        System.out.print("\nNilai k = " + k);
    }
}

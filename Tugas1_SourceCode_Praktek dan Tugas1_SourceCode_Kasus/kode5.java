//Nama : Muh. Fahmi Ashar
//NIM : 13020240333
//Hari / Tanggal :Minggu, 05 April 2025
//Jam : 09.10 WITA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class kode5 {
    public static void main(String[] args)throws IOException {
        char cc; int bil;
        InputStreamReader isr = new 
        InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);

        System.out.print("hello\n");
        System.out.print("baca 1 karakter : ");

        cc = dataIn.readLine(). charAt(0);
        System.out.print("baca 1 bilangan : ");

        bil = Integer.parseInt(dataIn.readLine());

        System.out.print (cc +"\n" +bil+"\n");
        System.out.print ("bye\n");


    }



    
}
//Nama : Muh. Fahmi Ashar
//NIM : 13020240333
//Hari / Tanggal :Minggu, 05 April 2025
//Jam : 13.30 WITA
public class kode16 {
 
public static void main(String[] args) { 
    boolean Bool1, Bool2, TF ;  
    int i,j, hsl ; 
    float x,y,res;


    Bool1 = true; Bool2 = false; 
    TF = Bool1 && Bool2;
    TF = Bool1 || Bool2;
    TF = ! Bool1;
    TF = Bool1 ^ Bool2;

    
    i = 5; j = 2;
    hsl = i + j;
    hsl = i - j;
    hsl = i / j;
    hsl = i * j;
    hsl = i /j;
    hsl = i % j;

    x = 5; y = 5;
    res = x + y;
    res = x - y;
    res = x / y;
    res = x * y;

    TF = (i==j);  
    TF = (i!=j); 
    TF = (i < j);  
    TF = (i > j);  
    TF = (i <= j);  
    TF = (i >= j); 

    TF = (x != y);
    TF = (x < y);
    TF = (x > y);
    TF = (x <= y);
    TF = (x >= y);

    System.out.println("\noperasi logika");
    System.out.println( Bool1 && Bool2);
    System.out.println( Bool1 || Bool2);
    System.out.println( ! Bool1);
    System.out.println( Bool1 ^ Bool2);


    System.out.println("\noperasi numerik");
    System.out.println( i+j);
    System.out.println( i-j);
    System.out.println( i/j);
    System.out.println( i*j);
    System.out.println( i%j);

     System.out.println("\noperasi numerik");
    System.out.println( x+y);
    System.out.println( x-y);
    System.out.println( x/y);
    System.out.println( x*y);

    System.out.println("\noperasi relasional numerik");
    System.out.println( i==j);
    System.out.println( i!=j);
    System.out.println( i<j);
    System.out.println( i>j);
    System.out.println( i<=j);
    System.out.println( i>=j);

    System.out.println("\noperasi relasional numerik");
    System.out.println( x!=y);
    System.out.println( x<y);
    System.out.println( x>y);
    System.out.println( x<=y);
    System.out.println( x>=y);




 }

}
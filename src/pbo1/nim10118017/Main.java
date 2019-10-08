package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Mengubah kalimat yang dimasukkan menjadi huruf besar dan huruf kecil.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";
    
    //Deklarasi variabel
    private static String kalimat;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputKalimat();
        formatKalimat(kalimat);
        
        System.out.println(FOOTER);
    }
    
    //Method untuk memasukkan kalimat yang akan diformat
    public static void inputKalimat() {
        Scanner scanner = new Scanner (System.in);
        
        //Memasukkan nilai.
        System.out.print("Masukkan Kalimat : ");
        kalimat = scanner.nextLine();
    }
    
    public static void formatKalimat(String kalimat) {
        //Menampilkan hasil.
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
    }
    
}

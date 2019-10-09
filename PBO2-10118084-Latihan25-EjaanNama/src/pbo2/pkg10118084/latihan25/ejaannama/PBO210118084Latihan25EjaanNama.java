/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author Freza
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan ejaan nama

 */
public class PBO210118084Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama; 
        Scanner Scanner = new Scanner (System.in);
        System.out.print("Masukkan nama depan anda untuk di eja :");
        nama=Scanner.nextLine();
        System.out.println(nama.length());
        for(int i = 0; i < nama.length();i++){
            String karakter = nama.substring(i, i + 1)+"";
            System.out.println("Huruf ke-"+(i+1)+" :"+karakter);
        }
        
    }
    
}

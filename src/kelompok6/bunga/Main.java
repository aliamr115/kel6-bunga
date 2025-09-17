/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok6.bunga;

/**
 *
 * @author user
 */
public class Main {
     
    public static void main(String[] args) {
       aliaTulip at = new aliaTulip();
       
       at.setnama("Tulip");
       at.setwarna("Merah Muda");
       at.setjenis("Single Early Tulip");
       at.setharga("Rp. 20.000");
               
       System.out.println("Nama : "+at.getnama());
       System.out.println("Warna : "+at.getnama());
       System.out.println("Jenis : "+at.getnama());
       System.out.println("Harga : "+at.getnama());
    
    }
}

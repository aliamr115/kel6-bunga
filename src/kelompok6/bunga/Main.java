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
        
       //Bunga Tulip - Alia  
       aliaTulip at = new aliaTulip();
       
       at.setnama("Tulip");
       at.setwarna("Merah Muda");
       at.setjenis("Single Early Tulip");
       at.setharga("Rp. 20.000");
               
       System.out.println("\n\t\t\tTulip");
       System.out.println("Nama   : "+at.getnama());
       System.out.println("Warna  : "+at.getwarna());
       System.out.println("Jenis  : "+at.getjenis());
       System.out.println("Harga  : "+at.getharga());
       
       
       //Bunga Anggrek - Rama
        ramaAnggrek pp = new ramaAnggrek();
        
        pp.setnama("Anggrek");
        pp.setwarna("Putih, Ungu, Pink");
        pp.setjenis("Phalaenopsis");
        pp.setharga("Rp. 40.000");
        
        System.out.println("\n\t\t\tAnggrek");
        System.out.println("Anggrek : " + pp.getnama());
        System.out.println("Warna   : " + pp.getwarna());
        System.out.println("Jenis   : " + pp.getjenis());
        System.out.println("Harga   : " + pp.getharga());
        
        
        //Bunga Mawar - Ainiha
        
        
        
        //Bunga Melati - Talitha
        
        
        //Bunga lilY - Burhan
        
        
        //Bungan Turi - Muzakky
        
        
        
     
        
        
        
    } 
    }


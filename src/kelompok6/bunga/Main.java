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
       
       at.setnama("Bunga Tulip");
       at.setwarna("Merah Muda");
       at.setjenis("Single Early Tulip");
       at.setharga("Rp.20000");
               
       System.out.println("\n\t\t\tTulip");
       System.out.println("Nama   : "+at.getnama());
       System.out.println("Warna  : "+at.getwarna());
       System.out.println("Jenis  : "+at.getjenis());
       System.out.println("Harga  : "+at.getharga());
       
       
       //Bunga Anggrek - Rama
        ramaAnggrek pp = new ramaAnggrek();
        
        pp.setnama("Bunga Anggrek");
        pp.setwarna("Putih, Ungu, Pink");
        pp.setjenis("Phalaenopsis");
        pp.setharga("Rp.40000");
        
        System.out.println("\n\t\t\tAnggrek");
        System.out.println("Nama    : " + pp.getnama());
        System.out.println("Warna   : " + pp.getwarna());
        System.out.println("Jenis   : " + pp.getjenis());
        System.out.println("Harga   : " + pp.getharga());
        
        
        //Bunga Lily - Burhan
        burhanLily bl = new burhanLily();
        
        bl.setnama("Bunga Lily");
        bl.setwarna("Merah, Putih, Pink, Kuning, Biru");
        bl.setjenis("Rosa luciae");
        bl.setharga("Rp.25000");
        
        System.out.println("\n\t\t\tLIly");
        System.out.println("Nama    : " + bl.getnama());
        System.out.println("Warna   : " + bl.getwarna());
        System.out.println("Jenis   : " + bl.getjenis());
        System.out.println("Harga   : " + bl.getharga());
    
      //Bunga Mawar - Ainiha 
        ainihaMawar ai = new ainihaMawar();
        
        ai.setnama("Bunga Mawar");
        ai.setwarna("Merah, Putih, Pink, Kuning, Biru");
        ai.setjenis("Rosa luciae");
        ai.setharga("Rp.25000");
        
        System.out.println("\n\t\t\tMawar");
        System.out.println("Nama    : " + ai.getnama());
        System.out.println("Warna   : " + ai.getwarna());
        System.out.println("Jenis   : " + ai.getjenis());
        System.out.println("Harga   : " + ai.getharga());
        
        //Bunga Turi - Zakky
        zakkyTuri zt = new zakkyTuri();
        
        zt.setNama("Kembang Turi");
        zt.setWarna("Putih, Pink, Merah");
        zt.setJenis("Sesbania grandiflora");
        zt.setHarga("Rp.8000 per kg");
        
        System.out.println("\n\t\t\tTuri");
        System.out.println("Nama    : "+zt.getNama());
        System.out.println("Jenis   : "+zt.getJenis());
        System.out.println("Warna   : "+zt.getWarna());
        System.out.println("Harga   : "+zt.getHarga());
 
        
       
        
        
       
        
        
        
     
        
        
        
    } 
    }


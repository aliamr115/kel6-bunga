
package kelompok6.bunga;

public class Kelompok6Bunga {
    public static void main(String[] args) {
        // TODO code application logic here

        //Bunga Tulip - Alia
        aliaTulip at = new aliaTulip();
       
        at.setnama("Bunga Tulip");
        at.setwarna("Merah Muda");
        at.setjenis("Bunga Tulip");
        at.setharga("Rp. 20000");
        

        System.out.println("\t\tKELOMPOK 6 BUNGA");
        System.out.println("\t\tBunga Tulip");
        System.out.println("Nama  : "+at.getnama());
        System.out.println("Warna : "+at.getwarna());
        System.out.println("Jenis : "+at.getjenis());
        System.out.println("Harga : "+at.getharga());
        
        //Bunga Mawar - Ainiha
        ainihaMawar am = new ainihaMawar();

        am.setnama_bunga("Bunga Mawar");
        am.setwarna("Merah Muda");
        am.setjenis("Bunga Mawar");
        am.setharga("Rp. 20000");
        
        System.out.println("\t\tBunga Mawar");
        System.out.println("Nama  : "+am.getnama_bunga());
        System.out.println("Warna : "+am.getwarna());
        System.out.println("Jenis : "+am.getjenis());
        System.out.println("Harga : "+am.getharga());
        
        //Bunga Teratai - Talitha
        talithaTeratai2 tr = new talithaTeratai2();
       
        tr.setnama("Bunga Teratai");
        tr.setwarna("Merah Muda");
        tr.setjenis("Bunga Tulip");
        tr.setharga("Rp. 20000");
        
        System.out.println("\t\tBunga Teratai");
        System.out.println("Nama  : "+tr.getnama());
        System.out.println("Warna : "+tr.getwarna());
        System.out.println("Jenis : "+tr.getjenis());
        System.out.println("Harga : "+tr.getharga());
        
        //Bunga Anggrek - Rama
        ramaAnggrek pp = new ramaAnggrek();
        
        pp.setnama("Anggrek");
        pp.setwarna("Putih, Ungu, Pink");
        pp.setjenis("Phalaenopsis");
        pp.setharga("Rp. 40.000");
        
        System.out.println("Anggrek : " + pp.getnama());
        System.out.println("Warna   : " + pp.getwarna());
        System.out.println("Jenis   : " + pp.getjenis());
        System.out.println("Harga   : " + pp.getharga());
        
        //Bunga Turi - Muzakky
        
    }

    }
    


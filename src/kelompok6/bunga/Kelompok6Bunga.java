
package kelompok6.bunga;

public class Kelompok6Bunga {
    public static void main(String[] args) {
        // TODO code application logic here

        //Bunga Tulip - Alia
        aliaTulip at = new aliaTulip();
       
        at.setNama("Bunga Tulip");
        at.setWarna("Merah Muda, Putih, Ungu");
        at.setJenis("Tulip Single Early");
        at.setHarga("Rp.45000");
        

        System.out.println("==========KELOMPOK 6 BUNGA==========");
        System.out.println("\t---Bunga Tulip---");
        System.out.println("Nama         : "+at.getNama());
        System.out.println("Warna        : "+at.getWarna());
        System.out.println("Jenis        : "+at.getJenis());
        System.out.println("Harga        : "+at.getHarga());
        
        //Bunga Mawar - Ainiha
        ainihaMawar am = new ainihaMawar();

        am.setnama_bunga("Bunga Mawar");
        am.setwarna("Merah, Putih, Pink, Kuning, Biru");
        am.setjenis("Rosa luciae");
        am.setharga("Rp.25000");
        
        System.out.println("\t---Bunga Mawar---");
        System.out.println("Nama         : "+am.getnama_bunga());
        System.out.println("Warna        : "+am.getwarna());
        System.out.println("Jenis        : "+am.getjenis());
        System.out.println("Harga        : "+am.getharga());
        
        //Bunga Teratai - Talitha
        talithaTeratai2 tr = new talithaTeratai2();
       
        tr.setNama("Bunga Teratai");
        tr.setWarna("Putih, Pink, Ungu, Biru");
        tr.setJenis("Victoria amazonica");
        tr.setHarga("Rp.75000");
        
        System.out.println("\t---Bunga Teratai---");
        System.out.println("Nama         : "+tr.getNama());
        System.out.println("Warna        : "+tr.getWarna());
        System.out.println("Jenis        : "+tr.getJenis());
        System.out.println("Harga        : "+tr.getHarga());
        
        //Bunga Anggrek - Rama
        ramaAnggrek pp = new ramaAnggrek();
        
        pp.setNama("Bunga Anggrek");
        pp.setWarna("Putih, Ungu, Pink");
        pp.setJenis("Phalaenopsis");
        pp.setHarga("Rp.40000");
        
        System.out.println("\t---Bunga Anggrek---");
        System.out.println("Nama         : " + pp.getNama());
        System.out.println("Warna        : " + pp.getWarna());
        System.out.println("Jenis        : " + pp.getJenis());
        System.out.println("Harga        : " + pp.getHarga());
        
        //Bunga Turi - Muzakky
        zakkyTuri zt = new zakkyTuri();
        
        zt.setNama("Bunga Turi");
        zt.setWarna("Putih, Merah Muda, Merah");
        zt.setJenis("Sesbania grandiflora");
        zt.setHarga("Rp.8000");
        
        System.out.println("\t---Bunga Turi---");
        System.out.println("Nama         : " + zt.getNama());
        System.out.println("Warna        : " + zt.getWarna());
        System.out.println("Jenis        : " + zt.getJenis());
        System.out.println("Harga        : " + zt.getHarga());
        
        
        //Bunga Lily - Burhan
        burhanLily bl = new burhanLily();
        
        bl.setNama("Bunga Lily");
        bl.setWarna("Jingga");
        bl.setJenis("Bulbiferum");
        bl.setHarga("Rp.30000");
        
        System.out.println("\t---Bunga Lily---");
        System.out.println("Nama         : " + bl.getNama());
        System.out.println("Warna        : " + bl.getWarna());
        System.out.println("Jenis        : " + bl.getJenis());
        System.out.println("Harga        : " + bl.getHarga());
        

       
    }
}
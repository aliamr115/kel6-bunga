
package kelompok6.bunga;

public class Kelompok6Bunga {
    public static void main(String[] args) {
        // TODO code application logic here
        zakkyTuri zt = new zakkyTuri();
        
        zt.setNama("Kembang Turi");
        zt.setWarna("Putih, Pink, Merah");
        zt.setJenis("Sesbania grandiflora");
        zt.setHarga("Rp.8000 per kg");
        
        System.out.println("Nama : "+zt.getNama());
        System.out.println("Jenis : "+zt.getJenis());
        System.out.println("Warna : "+zt.getWarna());
        System.out.println("Harga : "+zt.getHarga());
    }
    
}


package kelompok6.bunga;

public class Kelompok6Bunga {
    public static void main(String[] args) {
        // TODO code application logic here
        zakkyTuri pp = new zakkyTuri();
        
        pp.setNama("Kembang Turi");
        pp.setWarna("Putih, Pink, Merah");
        pp.setJenis("Sesbania grandiflora");
        pp.setHarga("Rp.8000 per kg");
        
        System.out.println("Nama : "+pp.getNama());
        System.out.println("Jenis : "+pp.getJenis());
        System.out.println("Warna : "+pp.getWarna());
        System.out.println("Harga : "+pp.getHarga());
    }
    
}

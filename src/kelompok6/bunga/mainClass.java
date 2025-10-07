/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok6.bunga;

/**
 *
 * @author user
 */
public class mainClass {
    public static void main(String[] args) {
        
        tulip bt = new tulip();
        System.out.println("---Bunga Tulip---");
        bt.setWarna("Merah Muda");
        bt.setCiri_ciri("Berbatang");
        bt.setKelopak("Mekar");
        bt.setNegaraAsal("Rusia");
        bt.setJenis("Tulip Single Early");
        bt.setPajak(2000);
        bt.setBeracun(false);
        bt.TampilData();
        
                
    }
   
}

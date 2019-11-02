/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan49.biayaemaskawin;

/**
 *
 * @author LENOVO
 */
class Mahar {
    private String nama;
    private double maharEmas;
    private double hargaEmas;

    public String getNama() {
        return nama;
    }

    public double getMaharEmas() {
        return maharEmas;
    }

    public double getHargaEmas() {
        return hargaEmas;
    }
    public Mahar(String nama,double maharEmas,double hargaEmas){
        this.nama=nama;
        this.maharEmas=maharEmas;
        this.hargaEmas=hargaEmas;
    }
    public void hitungMaharKawin(String nama,double maharEmas,double hargaEmas){
        double hitung = maharEmas*hargaEmas;
        System.out.println("Total Uang yang harus dipersiapkan oleh "+nama+" sebanyak "+hitung);
    }
    
    
    
}

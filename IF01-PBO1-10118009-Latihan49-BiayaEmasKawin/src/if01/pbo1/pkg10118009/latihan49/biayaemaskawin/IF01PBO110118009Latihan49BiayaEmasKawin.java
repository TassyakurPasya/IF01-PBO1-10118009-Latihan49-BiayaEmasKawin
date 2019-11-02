/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan49.biayaemaskawin;

import java.util.Scanner;

/**
 *Nama = Tassyakur Pasya
 * Kelas = IF01
 * NIM = 10118009
 * Deskripsi Program = Emas Kawin
 * @author LENOVO
 */
public class IF01PBO110118009Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("====Rincian Emas Kawin====");
        System.out.print("Nama : ");
        String nama=input.nextLine();
        System.out.print("Berat Emas Kawin : ");
        double mahar=input.nextDouble();
        System.out.print("Harga Emas Bulan Oktober :Rp. ");
        double harga=input.nextDouble();
        Mahar ME=new Mahar(nama,mahar,harga);
        ME.hitungMaharKawin(ME.getNama(), ME.getMaharEmas(), ME.getHargaEmas());
    }
    
}

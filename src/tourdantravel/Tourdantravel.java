/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tourdantravel;

/**
 *
 * @author ACER
 */
public class Tourdantravel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pengunjung obj = new Pengunjung ();
        
        obj.setNama("Wardah");
        obj.setAlamat("Bjm");
        obj.setTelp("084527856354");
        
        System.out.println("Nama : "+obj.getNama());
        System.out.println("Alamat : "+ obj.getAlamat());
        System.out.println("Telp : "+obj.getTelp());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tourdantravel;

/**
 *
 * @author ACER
 */
public class jadwalkeberangkatan {
    private String id_book, nama, tgl_keb, status, ubah_jadwal, batal;
    
    public jadwalkeberangkatan (){}
    
    public void setId_book(String id_book){
        this.id_book = id_book;
    }
    
    public String getId_Book (){
        return this.id_book;
    }
     public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama (){
        return this.nama;
    }
    
     public void setTgl_keb(String tgl_keb){
        this.tgl_keb = tgl_keb;
    }
    
    public String getTgl_keb (){
        return this.tgl_keb;
    }
    
     public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus (){
        return this.status;
    }
    
     public void setUbah_jadwal(String ubah_jadwal){
        this.ubah_jadwal = ubah_jadwal;
    }
    
    public String getUbah_jadwal (){
        return this.ubah_jadwal;
    }
    
    public void setBatal(String batal){
        this.batal = batal;
    }
    
    public String getBatal (){
        return this.batal;
    }
    
}

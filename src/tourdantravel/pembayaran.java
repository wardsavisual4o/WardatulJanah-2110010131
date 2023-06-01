/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tourdantravel;

/**
 *
 * @author ACER
 */
public class pembayaran {
    private String id, status, upload, lihat, batal;
    
    public pembayaran (){}
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId (){
        return this.id;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus (){
        return this.status;
    }
    
    public void setUpload(String upload){
        this.upload = upload;
    }
    
    public String getUpload (){
        return this.upload;
    }
    
    public void setLihat(String lihat){
        this.lihat = lihat;
    }
    
    public String getLihat (){
        return this.lihat;
    }
    
    public void setBatal(String batal){
        this.batal = batal;
    }
    
    public String getNoid (){
        return this.batal;
    }
}

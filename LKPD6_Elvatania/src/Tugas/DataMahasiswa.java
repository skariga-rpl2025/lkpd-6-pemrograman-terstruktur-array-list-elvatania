/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.ArrayList;

/**
 *
 * 
 */
public class DataMahasiswa {
    private ArrayList<Mahasiswa> dataM = new ArrayList<>();
    
    public int jumlahMahasiswa(){
        return dataM.size();
    }
    
    public void tambahMahasiswa(String npm, String nama, String alamat){
        dataM.add(new Mahasiswa(npm, nama, alamat));
    }
    
    public void gantiMahasiswa(int index, String npm, String nama, String alamat){
        dataM.set(index, new Mahasiswa(npm, nama, alamat));
    }
    
    public void gantiMahasiswa(int index, Mahasiswa baru){
        dataM.set(index, baru);
    }
    
    public void hapusMahasiswa(int index){
        dataM.remove(index);
    }
    
    public Mahasiswa LihatMahasiswa(int index){
        return dataM.get(index);
    }
    
    public Mahasiswa cariMahasiswa(String npm){
        for(Mahasiswa mahas : dataM){
            if(dataM.get(0).getNpm().contains(npm)){
                return mahas;
            }
        }
        return null;
    }
    
    public int cariIndexMahasiswa(Mahasiswa mahas){
        for(int i = 0; i < dataM.size(); i++){
            if(dataM.get(i).equals(mahas)){
                return i;
            }
        }
        return -1;
    }
}

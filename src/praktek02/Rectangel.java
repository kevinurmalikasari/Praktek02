/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek02;

/**
 *
 * @author kelompok34
 */
public class Rectangel {
    double panjang;
    double lebar;
    
    void cetakInfo(){
        System.out.println("======================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar   : "+lebar);
        
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
}

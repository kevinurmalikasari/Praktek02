/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek02;

/**
 *
 * @author kelompok34
 */
public class RectangelAksi {
    public static void main(String[] args) {
        Rectangel r1 = new Rectangel();
        r1.panjang = 9;
        r1.lebar = 3;
        
        r1.cetakInfo();
        System.out.println("Luas Rectangel = "+r1.hitungLuas());
        
    }
}

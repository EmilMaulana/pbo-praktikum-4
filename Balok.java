/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_4;

/**
 *
 * @author ASUS
 */
public class Balok extends BangunRuang{
    double panjang,lebar,tinggi;
    
    //Konstruktor
    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    double hitungLuasPermukaan(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi );
    }
}

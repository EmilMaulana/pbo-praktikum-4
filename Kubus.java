/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_4;

/**
 *
 * @author ASUS
 */
public class Kubus extends BangunRuang{
    double sisi;
    
    //Konstruktor
    Kubus(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    double hitungVolume() {
        return Math.pow(sisi, 3);
    }
    
    @Override 
    double hitungLuasPermukaan(){
        return 6 * Math.pow(sisi, 2);
    }
}

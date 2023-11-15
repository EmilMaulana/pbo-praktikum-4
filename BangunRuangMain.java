/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_4;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class BangunRuangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Input for rectangular box (balok)
        System.out.println("Input for Balok:");
        System.out.print("Panjang: ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Lebar: ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Tinggi: ");
        double tinggiBalok = scanner.nextDouble();

        // Input for cube (kubus)
        System.out.println("\nInput for Kubus:");
        System.out.print("Sisi: ");
        double sisiKubus = scanner.nextDouble();

        // Create objects using polymorphism
        BangunRuang objBalok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        BangunRuang objKubus = new Kubus(sisiKubus);

        // Calculate and display results
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Volume Balok: " + objBalok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + objBalok.hitungLuasPermukaan());
        System.out.println("\nVolume Kubus: " + objKubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + objKubus.hitungLuasPermukaan());

        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
}

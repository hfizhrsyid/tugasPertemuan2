/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fff.com.tugaspertemuan2;

/**
 *
 * @author User
 */

public class tugasKedua {
    public static void main(String[] args) {
        System.out.println("Apakah pasangan Anda sedang ada kelas?");
        boolean answer = true;
        
        System.out.println("Berapa banyak uang yang Anda punya?");
        int money = 11000;
        
        boolean membeli = (answer == true && money > 10000);
        System.out.println("Anda akan membeli Mie Gacoan? " + membeli);
    }
}

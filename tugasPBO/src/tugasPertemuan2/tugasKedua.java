/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPertemuan2;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class tugasKedua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Apakah pasangan Anda sedang ada kelas?");
        boolean answer = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println("Berapa banyak uang yang Anda punya?");
        int money = Integer.parseInt(scanner.nextLine());
        
        boolean membeli = (answer == true && money > 10000);
        System.out.println("Anda akan membeli Mie Gacoan? " + membeli);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fff.com.tugaspertemuan2;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class tugasPertama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama!");
        int firstValue = scanner.nextInt();
        System.out.println("Masukkan angka kedua!");
        int secondValue = scanner.nextInt();
        System.out.println("Masukkan angka ketiga!");
        int thirdValue = scanner.nextInt();
        
        System.out.println("Penjumlahan: " + (firstValue + secondValue + thirdValue));
        System.out.println("Perkalian: " + (firstValue * secondValue * thirdValue));
        System.out.println("Pengurangan: " + (firstValue - secondValue - thirdValue));
        System.out.println("Pembagian: " + (firstValue / secondValue / thirdValue));
    }
}

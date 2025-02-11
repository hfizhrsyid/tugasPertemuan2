/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
        
        System.out.println("Masukkan angka!");
        
        float firstValue = 0, secondValue = 0, thirdValue = 0;
        
        while (true) {
            firstValue = Float.parseFloat(scanner.nextLine());
            if (firstValue < 0) {
                break;
            } else {
                System.out.println("Coba lagi!");
            }
        }
        
        while (true) {
            secondValue = Float.parseFloat(scanner.nextLine());
            if (secondValue < 0) {
                break;
            } else {
                System.out.println("Coba lagi!");
            }
        }
        
        while (true) {
            thirdValue = Float.parseFloat(scanner.nextLine());
            if (thirdValue < 0){
                break;
            } else {
                System.out.println("Coba lagi!");
            }
        }
        
        System.out.println("Pertambahan: " + (firstValue + secondValue + thirdValue));
        System.out.println("Perkalian: " + (firstValue * secondValue * thirdValue));
        System.out.println("Pengurangan: " + (firstValue - secondValue - thirdValue));
        System.out.println("Pembagian: " + (firstValue / secondValue / thirdValue));
    }
}

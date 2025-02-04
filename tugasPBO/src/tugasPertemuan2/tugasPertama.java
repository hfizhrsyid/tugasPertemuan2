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

public class tugasPertama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstValue = Integer.parseInt(scanner.nextLine());
        int secondValue = Integer.parseInt(scanner.nextLine());
        int thirdValue = Integer.parseInt(scanner.nextLine());
        
        System.out.println((firstValue + secondValue + thirdValue));
        System.out.println((firstValue * secondValue * thirdValue));
        System.out.println((firstValue - secondValue - thirdValue));
        System.out.println((firstValue / secondValue / thirdValue));
    }
}

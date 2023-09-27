/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Input01;

/**
 *
 * @author MSI
 */
import java.util.Scanner;

public class Input07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.print("nilai\t: ");
        nilai = input.nextInt();
        
        System.out.print("\n ");
        
        if(nilai >= 60 && nilai <= 100){ //setelah angka 60 bisa langsung tutup kurung dan tetap jalan
            System.out.println("Anda Lulus");
        } else if(nilai >= 0 && nilai <= 60){
            System.out.println("Anda Tidak Lulus");
        } else {
            System.out.println("What wrong with you?"); //wth   
        }   
        }
    }


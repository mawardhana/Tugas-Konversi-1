/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class main {
   static double suhuAwal;
    static int choose;
    
    public static void main (String[] args) {
        Konversisuhu suhu = new Konversisuhu();
        double Celcius,Fahrenheit,Reamur,Kelvin;
        boolean condition = false;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("+-------------------------+");
        System.out.println("|PROGRAM KONVERSI SUHU AIR|");
        System.out.println("+-------------------------+");
        System.out.println("Input Data");
        System.out.println("---------------");
        System.out.print("Suhu dalam Celcius = ");
        suhuAwal=input.nextDouble();
        
        while (condition!=true){
            System.out.println("Opsi");
            System.out.println("-------");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            choose = input.nextInt();
            
            switch(choose){
                case 1 :
                if(suhuAwal<=0) {
                    Celcius = suhu.Celcius();
                    Fahrenheit = suhu.rumusFahrenheit();
                    Reamur = suhu.rumusReamur();
                    Kelvin = suhu.rumusKelvin();
                    
                    System.out.println("Suhu Dalam Celcius\t: "+Celcius+"°C");
                    System.out.println("Celcius ke Farenheit\t: "+Fahrenheit+"°F");
                    System.out.println("Celcius ke Reamur\t: "+Reamur+"°R");
                    System.out.println("Celcius ke Kelvin\t: "+Kelvin+"°K");
                    System.out.println("Kondisi Air Beku");
                }
                else if (suhuAwal<100){
                    Celcius = suhu.Celcius();
                    Fahrenheit = suhu.rumusFahrenheit();
                    Reamur = suhu.rumusReamur();
                    Kelvin = suhu.rumusKelvin();
                    
                    System.out.println("Suhu Dalam Celcius\t: "+Celcius+"°C");
                    System.out.println("Celcius ke Farenheit\t: "+Fahrenheit+"°F");
                    System.out.println("Celcius ke Reamur\t: "+Reamur+"°R");
                    System.out.println("Celcius ke Kelvin\t: "+Kelvin+"°K");
                    System.out.println("Kondisi Air Normal");
                }
                else if (suhuAwal>=100){
                    Celcius = suhu.Celcius();
                    Fahrenheit = suhu.rumusFahrenheit();
                    Reamur = suhu.rumusReamur();
                    Kelvin = suhu.rumusKelvin();
                    
                    System.out.println("Suhu Dalam Celcius\t: "+Celcius+"°C");
                    System.out.println("Celcius ke Farenheit\t: "+Fahrenheit+"°F");
                    System.out.println("Celcius ke Reamur\t: "+Reamur+"°R");
                    System.out.println("Celcius ke Kelvin\t: "+Kelvin+"°K");
                    System.out.println("Kondisi Air Mendidih"); 
                }

                break;
                case 2 :
                  System.out.println("\nInput Data");
                    System.out.println("----------");
                    System.out.print("Masukkan suhu celcius = ");
                    suhuAwal= input.nextDouble();
                    break;
                case 3 :
                    condition = true ;
                    break;
                default :
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        }
        
    }

}

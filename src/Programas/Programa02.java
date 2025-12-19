/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;


import java.util.Scanner;

public class Programa02 {
    
    public static void main(String args[]) {
        
        String empleado;
        double ht, th, sb, d, sn;

        
        Scanner lectura = new Scanner(System.in);

        
        System.out.print("Nombre de empleado: ");
        empleado = lectura.next();

        System.out.print("Horas trabajadas: ");
        ht = lectura.nextDouble();

        System.out.print("Tarifa por hora: ");
        th = lectura.nextDouble();

        
        sb = ht * th;
        d = sb * 0.13;
        sn = sb - d;

       
        System.out.println("Sueldo bruto: " + sb);
        System.out.println("Descuento: " + d);
        System.out.println("Sueldo Neto: " + sn);
    } 
} 

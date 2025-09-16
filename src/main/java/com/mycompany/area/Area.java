/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area;
import java.util.Scanner;
/**
 *
 * @author loren
 */
public class Area {
    
    Scanner in  = new Scanner (System.in);
    
    private double base;
    private double altura;
    private double area;
    
    public void setBase(){
        System.out.println("ingrse la base del triangulo: ");
        base = in.nextDouble();
    }
    
     public void setAltura(){
        System.out.println("ingrse la altura del triangulo: ");
        altura = in.nextDouble();
    }
     
     public void calcular (){
         
         area = (base * altura) / 2;
     }
     
     public double getArea (){
         return (area);
     }

    public static void main(String[] args) {
        
       Area area1 = new Area();
       
       area1.setBase();
       area1.setAltura();
       area1.calcular();
        System.out.println("el area es: " + area1.getArea());
    }
}

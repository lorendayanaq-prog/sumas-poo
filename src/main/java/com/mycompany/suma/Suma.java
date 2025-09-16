/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma;
import java.util.Scanner;
/**
 *
 * @author loren
 */
public class Suma {
    Scanner in = new Scanner (System.in);
    private int num1;
    private int num2;
    private int suma;
    public void setnum1(){
        System.out.println("ingrese el número 1: ");
        num1 = in.nextInt();
 }
    public void setnum2(){
        System.out.println("ingrese el número 2: ");
        num2 = in.nextInt();
 }
    public void suma (){
        suma = num1 + num2;
 }
    public int getsuma (){
        return (suma);
 }
    public static void main(String[] args) {
        Suma sum1 = new Suma();
        sum1.setnum1();
        sum1.setnum2();
        sum1.suma();
        System.out.println("la suma es: " + sum1.suma);
    }
}

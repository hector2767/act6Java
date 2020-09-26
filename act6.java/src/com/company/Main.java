package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int numero = 5;
        int [] calificaciones = new int[numero];

        System.out.println("Inrese su nombre:");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese las calificaciones 0-100");
        for (int i = 0; i < numero; i++) {
            int calificacion;
         do {
            System.out.println("Calificacion "+ ( i + 1) + ": ");
            calificacion = sc.nextInt();
        }while (!(calificacion >=0 && calificacion <=100));
         calificaciones[i] = calificacion;

    }
        System.out.println("Promedio: "+ sacarPromedio(calificaciones));
}
public static float sacarPromedio (int[] array){
    float resultado = 0;
        for (int calificacion: array){
        resultado += calificacion;
        }
        float prom = (resultado/ array.length);
        if (prom >= 91 && prom <=100){
            System.out.println("Calificacion: A");
        }else if(prom >= 81 && prom <=90){
            System.out.println("Calificacion: B");
        }else if(prom >= 71 && prom <=80){
            System.out.println("Calificacion: C");
        }else if(prom >= 61 && prom <=70){
            System.out.println("Calificacion: D");
        }else if(prom >= 51 && prom <=60){
            System.out.println("Calificacion: E");
        }else if(prom <= 50){
            System.out.println("Calificacion: F");
        }

    return (prom);
    }
}

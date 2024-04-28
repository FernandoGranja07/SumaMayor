//Fernando Granja Grupo; 1M1-S; 2024-1359U.


import java.util.Scanner;

public class App {
    public static int num1;
    public static int num2;
    public static int num3;
    public static void main(String[] args) throws Exception {

    
     Scanner leer = new Scanner(System.in);

     do {

         try {
             System.out.println("Ingrese tres numeros enteros diferentes");
             num1 = leer.nextInt();
             num2 = leer.nextInt();
             num3 = leer.nextInt();
            
         } catch (Exception e) {
             System.out.println(e);
             System.out.println("Ingrese valores correctos");
             leer.nextLine();
         }

        } while (num1 == num2 || num1 == num3 || num2 == num3);
       
        int suma = 0;
        int diferencia = 0;
        int mayor = 0;

        if (num1 < num2 && num1 < num3) {
            suma = num1 + num2;
            if (num2 > num3) {
                diferencia = num2 - num3;
                mayor = num2;
            } else {
                diferencia = num3 - num2;
                mayor = num3;
            }
        } else if (num2 < num1 && num2 < num3) {
            suma = num2 + num1;
            if (num1 > num3) {
                diferencia = num1 - num3;
                mayor = num1;
            } else {
                diferencia = num3 - num1;
                mayor = num3;
            }
        } else {
            suma = num3 + num1;
            if (num1 > num2) {
                diferencia = num1 - num2;
                mayor = num1;
            } else {
                diferencia = num2 - num1;
                mayor = num2;
            }
        }

        System.out.println("La suma de los dos números más pequeños es: " + suma);
        System.out.println("La diferencia de los dos números más grandes es: " + diferencia);
        System.out.println("El número más grande es: " + mayor);

        leer.close();

    }
}
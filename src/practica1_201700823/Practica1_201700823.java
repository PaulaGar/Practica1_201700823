/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201700823;

/**
 *
 * @author paula garcía 201700823
 */
import java.util.Scanner;
public class Practica1_201700823 {
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
int opcion=0;
Scanner S= new Scanner(System.in);
     do{
         System.out.println("----Menu principal---- ");
     System.out.println("1.Datos de prueba");
         System.out.println("2.Traslados de bodega");
         System.out.println("3.Reabastecimiento");
         System.out.println("4.Salida de productos");
         System.out.println("5.Kardex");
         System.out.println("6.Reportes");
         System.out.println("7.Mostrar bodegas");
         System.out.println("8. salir");
         System.out.println("Escoga una opción");
         
         opcion=S.nextInt();

    switch (opcion) {
        case 1: //INICIO DATOS PRUEBA
         int a=0;
            do{
            System.out.println("---Datos prueba--- \n1.Ingresar parámetros \n2. Limpiar bodegas \n3. regresar");
         Scanner Sc= new Scanner(System.in);
         a=Sc.nextInt();
           
           switch(a){
                case 1:
                    int numerobo=0, numeropro=0;
                    System.out.println("Ingrese el número de bodega: ");
                    numerobo=S.nextInt();
                    System.out.println(numerobo);
                    System.out.println("Ingrese el número de productos: ");
                    numeropro=S.nextInt();
                    System.out.println(numeropro);
                    break;
                case 2:
                    System.out.println("Ingrese el número de bodega a vaciar: ");
                    break;
           }
 }while(a!=3);
            
            break;
         case 2: //INICIO TRASLADO DE BODEGA
         System.out.println("adios");
            break;
         case 3:
         System.out.println("por");
            break;
         case 4:
         System.out.println("favor");
            break;
         case 5:
             System.out.println("a");
            break;
         case 6:
             System.out.println("b");
            break;
         case 7:
             System.out.println("c");
             break;
         case 8:
             break;
    }
    
     }while(opcion!=8);
   
    
    } //hasta aqui
        }

    
    


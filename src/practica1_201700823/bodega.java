/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201700823;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class bodega {
 
   /* public void bodegon(){
        Scanner S= new Scanner(System.in);
    int[][]bodegas = new int[5][20];
    for (int i = 0; i < bodegas.length; i++) {
        System.out.println(";");
            for (int j = 0; j < bodegas[0].length; j++) {
                System.out.println("A= ["+i+"]["+j+"]");
                bodegas[i][j]= S.nextInt();
                       }
                                 }
        }*/

  Scanner S= new Scanner(System.in);
       public int[] b1 =new int[5];
       public int[] b2 =new int[5];
       public int[] b3 =new int[5];
       public int[] b4 =new int[5];
       public int[] b5 =new int[5];
       public int[] b6 =new int[5];
    
       public void mostrar (){
           int ensenar;
           System.out.println("Ingrese el numero de bodega: ");
           ensenar=S.nextInt();
       switch (ensenar){
           case 1:
               System.out.println("---Bodega 1---");
               System.out.println("Producto 1: "+b1[0]);
               System.out.println("Producto 1: "+b1[1]);
               System.out.println("Producto 1: "+b1[2]);
               System.out.println("Producto 1: "+b1[3]);
               System.out.println("Producto 1: "+b1[4]);
               break;
       case 2:
               System.out.println("---Bodega 2---");
               System.out.println("Producto 1: "+b2[0]);
               System.out.println("Producto 1: "+b2[1]);
               System.out.println("Producto 1: "+b2[2]);
               System.out.println("Producto 1: "+b2[3]);
               System.out.println("Producto 1: "+b2[4]);
               break;
               case 3:
               System.out.println("---Bodega 3---");
               System.out.println("Producto 1: "+b3[0]);
               System.out.println("Producto 1: "+b3[1]);
               System.out.println("Producto 1: "+b3[2]);
               System.out.println("Producto 1: "+b3[3]);
               System.out.println("Producto 1: "+b3[4]);
               break;
               case 4:
               System.out.println("---Bodega 4---");
               System.out.println("Producto 1: "+b4[0]);
               System.out.println("Producto 1: "+b4[1]);
               System.out.println("Producto 1: "+b4[2]);
               System.out.println("Producto 1: "+b4[3]);
               System.out.println("Producto 1: "+b4[4]);
               break;
               case 5:
               System.out.println("---Bodega 5---");
               System.out.println("Producto 1: "+b5[0]);
               System.out.println("Producto 1: "+b5[1]);
               System.out.println("Producto 1: "+b5[2]);
               System.out.println("Producto 1: "+b5[3]);
               System.out.println("Producto 1: "+b5[4]);
               break;
               case 6:
               System.out.println("---Bodega 6---");
               System.out.println("Producto 1: "+b6[0]);
               System.out.println("Producto 1: "+b6[1]);
               System.out.println("Producto 1: "+b6[2]);
               System.out.println("Producto 1: "+b6[3]);
               System.out.println("Producto 1: "+b6[4]);
               break;
       
       }
       
       
       }
       
       public void hola(){
           System.out.println("hola");}
       
    }



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chess;
import java.util.Scanner;

/**
 *
 * @author an976
 */
public class Chess {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        char culumna;
        int fila;
        
        System.out.println("TABLERO DE AJEDREZ\n");
        
        System.out.println("DIGITE LA COLUMNA: ");
        culumna = sc.next().charAt(0);
        
        System.out.println("DIGITE LA FILA: ");
        fila =  sc.nextInt();
        
        
        ObtenerCass(culumna, fila);
    }
    
    public static  void ObtenerCass(char columna, int fila){
        
        switch (columna) {
            case 'A','a':
            case 'C','c':
            case 'E','e':
            case 'G','g':
                if(fila%2==0){
                    System.out.println("CASILLA BLANCA");
                }
                else{
                    System.out.println("CASILLA NEGRA");
                }
                break;
                
            case 'B','b':
            case 'D','d':
            case 'F','f':
            case 'H','h':
              if(fila%2==0){
                    System.out.println("CASILLA NEGRA");
                }
                else{
                    System.out.println("CASILLA BLANCA");
                }
                break;
                default:
                    System.out.println("FILAS O COLUNMAS INVALIDAS");
                    break;
           
        }
          
    }
    
}
            
        
    
    
    
    


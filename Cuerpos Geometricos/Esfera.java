/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatuas;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Priscila
 */
public class Estatuas {

    public static void main(String[] args) {
        //Scanner y entrada de datos, creacion del arreglo y datos de resultados
    Scanner sc = new Scanner(System.in);
    System.out.println("De el tamaño del arreglo:");
    int tam = sc.nextInt();
    int[] tamaños = new int[tam];
    System.out.println("De los tamaños de las estatuas");
    for (int i=0 ; i<tam ; i++){ //Lectura de datos de arreglo
        int x;
        x= sc.nextInt();
        tamaños[i] = x;
       }
    Arrays.sort(tamaños); //Se ordena el arreglo para que sea más facil el proceso
    Estatuas.faltantes(tamaños,tam); //Manda llamar el metodo que arroja estatuas faltantes
    }
    
   public static void faltantes(int[] tamaños, int tam){ //Firma del metodo
       int total = 0;
       for (int i = 0; i < tam-1; i++){
           if(tamaños[i] != tamaños[i+1]-1) {
           do{
               total++;
           }while(tamaños[i]+total != tamaños[i+1]-1);
           }
       }
       System.out.println("Faltan "+total+ " estatuas");
}
}
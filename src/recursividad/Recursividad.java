/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Christian Guerrero
 */
public class Recursividad {

    /**
     * @param n
     * @return Trabajo autonomo en casa //1
     */
    
    /*Ejercicio 1 Suma de n numeros naturales*/
    public static int sumaNaturales(int n){
        if(n==1)    //El cero no es natural                
            return 1;
        return n+ sumaNaturales(n-1);   /*
        n=2
        */      
    }
    
    /*
    Ejercicio 2 Factorial de un numer
    */
    public static int factorial(int n){
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    /*
    Ejercicio 3 Recorre un arreglo de forma recursiva
    */
    
    public static void recorrerArreglo(int[] a,int indice){
        if(a.length-1==indice){
            System.out.println(a[indice]);   
        }else{
            System.out.println(a[indice]);
            recorrerArreglo(a,indice+1);
        }
    }
       public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
   
    
    
    
}

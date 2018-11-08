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
public class main {
    public static void main(String[] args){
        System.out.println("La suma de de tu numero es: "+Recursividad.sumaNaturales(5));
        System.out.println("El factorial es: "+Recursividad.factorial(5));
        int a[]={1,2,3,4,5};
        System.out.println("Mi arreglo recursivo");
        Recursividad.recorrerArreglo(a, 0);
        Recursividad.decBin(2);

        
    }
}

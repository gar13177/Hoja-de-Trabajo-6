/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaCollectionFramework;

import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class SetFactory {
    public static void main(String[] args){
        int _opcionFactory;
        int _opcionMenu = 0;
        Scanner in  = new Scanner(System.in);
        
        System.out.println("Seleccione la implementacion del SET");
        System.out.println(" 1. HashSet");
        System.out.println(" 2. TreeSet");
        System.out.println(" 3. LinkedHashSet");
       
        _opcionFactory = in.nextInt();
        
        while (_opcionMenu != 8){
            System.out.println("Seleccione una opcion");
            System.out.println(" 1. Agregar una persona");
            System.out.println(" 2. Desarrolladores con experiencia en Java, web y celulares");
            System.out.println(" 3. Desarrolladores con experiencia en Java pero no en web");
            System.out.println(" 4. Desarrolladores con experiencia web y celulares, pero que no tengan experiencia en Java");
            System.out.println(" 5. Desarrolladores con experiencia web o celulares, pero que no tengan experiencia en Java");
            System.out.println(" 6. Indicar si el conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web");
            System.out.println(" 7. El conjunto que tenga la cantidad más grande de desarrolladores");
            System.out.println(" 8. Desplegar integrantes del conjunto en 7");
        }
        
        
    }
}

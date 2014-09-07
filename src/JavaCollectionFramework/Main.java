package JavaCollectionFramework;

import java.util.Scanner;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        FactorySet setFactory = new FactorySet<>();
        String _opcionFactory;
        String _opcionMenu = "0";
        Scanner in  = new Scanner(System.in);
        
        System.out.println("Seleccione la implementacion del SET");
        System.out.println(" 1. HashSet");
        System.out.println(" 2. TreeSet");
        System.out.println(" 3. LinkedHashSet");
        _opcionFactory = in.nextLine();
        
        Set<String> _java = setFactory.getSet(_opcionFactory);
        Set<String> _web = setFactory.getSet(_opcionFactory);
        Set<String> _celulares = setFactory.getSet(_opcionFactory);
        
        while (!_opcionMenu.equals("9")){
            System.out.println("Seleccione una opcion");
            System.out.println(" 1. Agregar una persona");
            System.out.println(" 2. Desarrolladores con experiencia en Java, web y celulares");
            System.out.println(" 3. Desarrolladores con experiencia en Java pero no en web");
            System.out.println(" 4. Desarrolladores con experiencia web y celulares, pero que no tengan experiencia en Java");
            System.out.println(" 5. Desarrolladores con experiencia web o celulares, pero que no tengan experiencia en Java");
            System.out.println(" 6. Indicar si el conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web");
            System.out.println(" 7. El conjunto que tenga la cantidad más grande de desarrolladores");
            System.out.println(" 8. Desplegar integrantes del conjunto en 7");
            System.out.println(" 9. Salir");
            _opcionMenu = in.nextLine();

            switch (_opcionMenu){
                case "1":
                    System.out.println("Ingrese el nombre de la persona:");
                  
                    String nombre = in.nextLine();
                    
                    nombre = nombre.toUpperCase();
                   
                    System.out.println("Ingrece la experiencia que posee (Java, web y/o celulares, ingresar en una sola cadena con espacios)");
                   
                    String experiencia = in.nextLine();
                    experiencia = experiencia.toUpperCase();
                   
                    
                    if (experiencia.contains("JAVA")){
                        _java.add(nombre);
                    }
                    if (experiencia.contains("WEB")){
                        _web.add(nombre);  
                    }
                    if (experiencia.contains("CELULARES")){
                        _celulares.add(nombre);
                    }
                    break;
                case "2":
                    for (String persona: _java){
                        if (_web.contains(persona) && _celulares.contains(persona)){
                            System.out.println(persona);
                        }
                    }
                    break;
                case "3":
                    for (String persona: _java){
                        if (!_web.contains(persona)){
                            System.out.println(persona);
                        }
                    }
                    break;
                case "4":
                    for (String persona: _web){
                        if (_celulares.contains(persona) && !_java.contains(persona)){
                            System.out.println(persona);
                        }
                    }
                    break;
                case "5":
                    for (String persona: _web){
                        if (!_java.contains(persona)){
                            System.out.println(persona);
                        }
                    }
                    for (String persona: _celulares){
                        if (!_web.contains(persona) && !_java.contains(persona)){
                            System.out.println(persona);
                        }
                    }
                    break;
                case "6":
                    if (_web.containsAll(_java)){
                        System.out.println("Si es subconjunto");
                    }else{
                        System.out.println("No es subconjunto");
                    }
                    break;
                case "7":
                    int _javaSize = _java.size();
                    int _webSize = _web.size();
                    int _celularesSize = _celulares.size();
                    
                    if (_javaSize >= _webSize && _javaSize >= _celularesSize){
                        System.out.println("El mayor tamaño Java con: "+_javaSize);
                    }else if (_webSize >= _javaSize && _webSize >= _celularesSize){
                        System.out.println("El mayor tamaño Web con: "+_webSize);
                    }else if (_celularesSize >= _javaSize && _celularesSize >= _webSize){
                        System.out.println("El mayor tamaño Celulares con: "+_celularesSize);
                    }
                    break;
                case "8":
                    _javaSize = _java.size();
                    _webSize = _web.size();
                    _celularesSize = _celulares.size();
                    
                    if (_javaSize >= _webSize && _javaSize >= _celularesSize){
                        List sorted = new ArrayList(_java);
                        Collections.sort(sorted);
                        System.out.println(sorted);
                        
                    }else if (_webSize >= _javaSize && _webSize >= _celularesSize){
                        List sorted = new ArrayList(_web);
                        Collections.sort(sorted);
                        System.out.println(sorted);
                    }else if (_celularesSize >= _javaSize && _celularesSize >= _webSize){
                        List sorted = new ArrayList(_celulares);
                        Collections.sort(sorted);
                        System.out.println(sorted);
                    }
                    break;    
            }
        }  
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class EjemploIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear un ArraList
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        frutas.add("Mango");
        
        //Crear un iterador para recorrer la lista
        Iterator<String> it = frutas.iterator();
        
        System.out.println("Elemento de la lista");
        while(it.hasNext()){
            String fruta=it.next();
            System.out.println(fruta);
        }
    }
    
}

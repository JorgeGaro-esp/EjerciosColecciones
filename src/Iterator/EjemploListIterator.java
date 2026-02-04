/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class EjemploListIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        
        ListIterator<String> it = lista.listIterator();
        
        System.out.println("Recorrido hacia adelante:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Recorrido hacia atras");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        //Modificar elementos
        it= lista.listIterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("B")){
                it.set("BB");
            }
        }
        System.out.println("Lista modificada: " + lista);
    }
    
}

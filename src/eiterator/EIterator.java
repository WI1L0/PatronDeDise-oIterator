/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eiterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author MAWIL
 */
public class EIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        ListaInt listaInt = new ListaInt();
        ListaString listaString = new ListaString();
        Iterador iterador;
        
        listaInt.agregar(2050);
        listaInt.agregar(2040);
        listaInt.agregar(2030);
        listaInt.agregar(2020);
        listaInt.agregar(2010);
        
        listaString.agregar("Juan");
        listaString.agregar("Daniel");
        listaString.agregar("David");
        listaString.agregar("Jose");
        listaString.agregar("Paul");
        
        iterador = listaInt.iterador();
        while (iterador.tieneSiguiente()){
            System.out.println(iterador.siguiente());
        }
        
        /*iterador = listaString.iterador();
        while (iterador.tieneSiguiente()){
            System.out.println(iterador.siguiente());
        }*/
    }
    
}

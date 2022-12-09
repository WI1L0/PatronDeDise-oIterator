/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiterator;

import java.util.ArrayList;

/**
 *
 * @author MAWIL
 */
public class ListaString {
    private ArrayList<String> listaNombre = new ArrayList<>();
    
    public ListaString(){
    }
    
    public void agregar(String p){
        listaNombre.add(p);
    }
    
    public ListaStringIterador iterador(){
        return new ListaStringIterador(listaNombre);
    }
}

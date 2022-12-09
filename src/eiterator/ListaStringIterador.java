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
public class ListaStringIterador implements Iterador{
    private ArrayList<String> listaNombre = new ArrayList<>();
    private int posicion;
    
    public ListaStringIterador(ArrayList list){
        this.listaNombre = list;
        posicion = 0;
    }
    
    @Override
    public Object siguiente(){
        return listaNombre.get(posicion);
    }
    
    @Override
    public boolean tieneSiguiente(){
        if (posicion < listaNombre.size()){
            return true;
        } else {
            return false;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiterator;

/**
 *
 * @author MAWIL
 */
public class ListaIntIterador implements Iterador{
    private int year[];
    private int posicion;
    
    public ListaIntIterador(int ced[]){
        this.year = ced;
        this.posicion = 0;
    }
    
    @Override
    public Object siguiente(){
        return year[posicion++];
    }
    
    @Override
    public boolean tieneSiguiente(){
        if (posicion < year.length && year[posicion] != 0){
            return true;
        } else {
            return false;
        }
    }
}
